package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ForestryToolCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.NaturalistHelmet.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SRS",
                "L L",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'L',
                OrePrefixes.lens.get(Materials.Glass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ForestryItems.GrafterProven.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " I ",
                "fI ",
                "PNh",
                'I',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'N',
                OrePrefixes.ingot.get(Materials.Steel),
            ),
        )
    }
}
