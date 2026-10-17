package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class ImpactDrillHeadCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        var drill = ImpactItems.IronDrillHead.get()

        CraftingRecipes.shapedWithFlags(
            output = drill,
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PFP",
                "PhP",
                'P',
                "plateDoubleIron",
                'F',
                "frameGtIron",
            ),
        )

        drill = ImpactItems.SteelDrillHead.get()

        CraftingRecipes.shapedWithFlags(
            output = drill,
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PFP",
                "PhP",
                'P',
                "plateDoubleSteel",
                'F',
                "frameGtSteel",
            ),
        )
    }
}
