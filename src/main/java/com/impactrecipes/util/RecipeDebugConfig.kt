package com.impactrecipes.util

import net.minecraftforge.common.config.Configuration
import org.apache.logging.log4j.LogManager
import java.io.File

public object RecipeDebugConfig {

    public fun load(configDirectory: File): Unit {
        var enabled = true
        var stackTraces = false
        try {
            val config = Configuration(
                File(
                    configDirectory,
                    "impact-recipes-debug.cfg",
                ),
            )
            config.load()
            enabled = config.getBoolean(
                "logBrokenRecipes",
                "debug",
                true,
                "Write missing ingredients and rejected recipes to logs/impact-recipes-broken-recipes.log. " +
                    "Never stops the game.",
            )
            stackTraces = config.getBoolean(
                "includeStackTraces",
                "debug",
                false,
                "Include full stack traces for registration exceptions in the report.",
            )
            if (config.hasChanged()) {
                config.save()
            }
        } catch (error: Exception) {
            LogManager.getLogger("ImpactRecipes").error(
                "Cannot read recipe debug config",
                error,
            )
        }
        RecipeDiagnostics.start(
            reportFile = File(
                configDirectory.parentFile,
                "logs/impact-recipes-broken-recipes.log",
            ),
            enabled = enabled,
            includeStackTraces = stackTraces,
        )
    }
}
