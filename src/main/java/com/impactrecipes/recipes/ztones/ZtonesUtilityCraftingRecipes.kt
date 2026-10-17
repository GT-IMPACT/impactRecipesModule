package com.impactrecipes.recipes.ztones

import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.ZtonesItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class ZtonesUtilityCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.StoneTile.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                VanillaItems.StoneSlab.get(),
                'S',
                VanillaItems.Stone.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Minicharcoal.get(amount = 7),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "h",
                "C",
                'C',
                "gemCharcoal",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Minicoal.get(amount = 7),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "h",
                "C",
                'C',
                "gemCoal",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Aurora.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LLL",
                "LSL",
                'L',
                "blockGlass",
                'S',
                "dye",
            ),
        )
    }
}
