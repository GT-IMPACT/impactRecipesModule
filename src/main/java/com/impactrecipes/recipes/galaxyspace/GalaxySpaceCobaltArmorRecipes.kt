package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalaxySpaceCobaltArmorRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemCobaltBoots.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "P P",
                "ChC",
                "C C",
                'P',
                OrePrefixes.plate.get(Materials.Desh),
                'C',
                GalaxySpaceItems.ItemCompressedPlates.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemCobaltPlate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ChC",
                "CPC",
                "C C",
                'P',
                OrePrefixes.plate.get(Materials.Desh),
                'C',
                GalaxySpaceItems.ItemCompressedPlates.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemCobaltHelmet.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "ChC",
                "P P",
                'P',
                OrePrefixes.plate.get(Materials.Desh),
                'C',
                GalaxySpaceItems.ItemCompressedPlates.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalaxySpaceItems.ItemCobaltLeg.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "CPC",
                "ChC",
                'P',
                OrePrefixes.plate.get(Materials.Desh),
                'C',
                GalaxySpaceItems.ItemCompressedPlates.get(),
            ),
        )
    }
}
