package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class CarpentersToolCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Chisel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTs",
                "SIS",
                "BIB",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'T',
                "plateIron",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Hammer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTs",
                "SIS",
                "BIB",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'T',
                OrePrefixes.toolHeadHammer.get(Materials.Iron),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )
    }
}
