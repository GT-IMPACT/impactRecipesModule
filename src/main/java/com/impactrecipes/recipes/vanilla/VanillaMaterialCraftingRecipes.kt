package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class VanillaMaterialCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Lead.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SBS",
                "SSS",
                'S',
                VanillaItems.String.get(),
                'B',
                "slimeball",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Lead.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SBS",
                "SSS",
                'S',
                VanillaItems.String.get(),
                'B',
                IC2Items.Resin.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = VanillaItems.Book.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                "platePaper",
                "platePaper",
                "platePaper",
                VanillaItems.String.get(),
                ImpactItems.BlankPattern.get(),
                ImpactItems.BlankPattern.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = VanillaItems.Flint.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                VanillaItems.Gravel.get(),
                VanillaItems.Gravel.get(),
                VanillaItems.Gravel.get(),
            ),
        )
    }
}
