package com.impactrecipes.util

import net.minecraft.item.ItemStack
import java.util.function.Consumer
import java.util.function.Predicate

/** Bind a mod ID once. Optional [find] is silent; [item] reports missing content. */
public class ModItems @JvmOverloads constructor(
    public val modId: String,
    private val accepts: Predicate<ItemStack> = Predicate {
        true
    },
) {

    @JvmOverloads
    public fun find(
        name: String,
        meta: Int = 0,
        count: Int = 1,
    ): ItemStack? {
        return RecipeItems.find(
            mod = modId,
            name = name,
            meta = meta,
            count = count,
        )?.takeIf {
            accepts.test(it)
        }
    }

    @JvmOverloads
    public fun item(
        name: String,
        meta: Int = 0,
        count: Int = 1,
    ): ItemStack? {
        return find(
            name = name,
            meta = meta,
            count = count,
        ).also {
            if (it == null) {
                RecipeDiagnostics.failure(
                    id = "$modId:$name@$meta x$count",
                    reason = "Item or meta ID not found. Check the mod version.",
                )
            }
        }
    }

    @JvmOverloads
    public fun withOutput(
        name: String,
        meta: Int = 0,
        count: Int = 1,
        recipe: Consumer<ItemStack>,
    ): Unit {
        val output = item(
            name = name,
            meta = meta,
            count = count,
        ) ?: return
        recipe.accept(output)
    }
}
