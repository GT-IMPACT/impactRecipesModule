package com.impactrecipes.util

import org.apache.logging.log4j.LogManager
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter

/** Diagnostics used by the shared helpers; recipes do not need wrappers. */
public object RecipeDiagnostics {

    private val logger = LogManager.getLogger("ImpactRecipes")
    private var report: File? = null
    private var stackTraces = false

    public fun start(
        reportFile: File,
        enabled: Boolean,
        includeStackTraces: Boolean,
    ): Unit {
        report = reportFile.takeIf {
            enabled
        }
        stackTraces = includeStackTraces
        write(
            text = "IMPACT Recipes - errors from this run\n\n",
            append = false,
        )
    }

    public fun failure(
        id: String,
        reason: String,
        error: Exception? = null,
    ): Unit {
        val source = (error?.stackTrace ?: Throwable().stackTrace)
            .firstOrNull {
                it.className.startsWith("com.impactrecipes.recipes.")
            }
        val trace = if (stackTraces && error != null) {
            val text = StringWriter()
            error.printStackTrace(PrintWriter(text))
            "\n$text"
        } else {
            ""
        }
        logger.error(
            "Recipe error {}: {}",
            id,
            reason,
        )
        write(text = "Recipe/item: $id\nReason: $reason\nSource: ${source ?: "recipe helper"}\n$trace\n")
    }

    /** Handles rejection by the recipe API inside the helper, without throwing. */
    public fun attempt(
        id: String,
        rejectedReason: String,
        action: () -> Boolean,
    ): Boolean {
        return try {
            action().also {
                if (!it) {
                    failure(
                        id = id,
                        reason = rejectedReason,
                    )
                }
            }
        } catch (error: Exception) {
            failure(
                id = id,
                reason = "${error.javaClass.simpleName}: ${error.message}",
                error = error,
            )
            false
        }
    }

    @Synchronized
    private fun write(
        text: String,
        append: Boolean = true,
    ): Unit {
        val file = report ?: return
        try {
            file.parentFile?.mkdirs()
            if (append) {
                file.appendText(
                    text = text,
                    charset = Charsets.UTF_8,
                )
            } else {
                file.writeText(
                    text = text,
                    charset = Charsets.UTF_8,
                )
            }
        } catch (error: Exception) {
            logger.error(
                "Cannot write recipe report: ${file.absolutePath}",
                error,
            )
        }
    }
}
