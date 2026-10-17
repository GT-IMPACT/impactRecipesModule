package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class CarpentersFrameCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FSF",
                "SdS",
                "FSF",
                'F',
                OrePrefixes.frameGt.get(Materials.Wood),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FSF",
                "FdF",
                "FSF",
                'F',
                OrePrefixes.frameGt.get(Materials.Wood),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 12),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FSF",
                "FdF",
                "FSF",
                'F',
                OrePrefixes.frameGt.get(Materials.Wood),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 16),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FSF",
                "FdF",
                "FSF",
                'F',
                OrePrefixes.frameGt.get(Materials.Wood),
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 20),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FSF",
                "FdF",
                "FSF",
                'F',
                OrePrefixes.frameGt.get(Materials.Wood),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 24),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FSF",
                "FdF",
                "FSF",
                'F',
                OrePrefixes.frameGt.get(Materials.Wood),
                'S',
                OrePrefixes.screw.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "WWW",
                "SBS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'W',
                GregTechItems.PlankOak.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "WWW",
                "SBS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'W',
                GregTechItems.PlankSpruce.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "WWW",
                "SBS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'W',
                GregTechItems.PlankBirch.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "WWW",
                "SBS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'W',
                GregTechItems.PlankJungle.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "WWW",
                "SBS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'W',
                GregTechItems.PlankAcacia.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "WWW",
                "SBS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'W',
                GregTechItems.PlankDarkOak.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )
    }
}
