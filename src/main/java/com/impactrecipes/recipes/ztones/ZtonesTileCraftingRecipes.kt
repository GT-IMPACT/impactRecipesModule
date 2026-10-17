package com.impactrecipes.recipes.ztones

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.ZtonesItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ZtonesTileCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Korp.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Obsidian),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Tank.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Sols.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Brass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Ztyl.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Vect.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Carbon),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Jelt.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Reed.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Vena.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Cobalt),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Ofanix.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hSC",
                "SGS",
                "fSs",
                'C',
                VanillaItems.CraftingTable.get(),
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'G',
                OrePrefixes.gem.get(Materials.Diamond),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Kryp.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                ChiselItems.Concrete.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ZtonesItems.Mint.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LLL",
                "LSL",
                "LLL",
                'L',
                ZtonesItems.StoneTile.get(),
                'S',
                OrePrefixes.plate.get(Materials.Rubber),
            ),
        )
    }
}
