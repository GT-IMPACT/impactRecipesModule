package com.impactrecipes.recipes.openblocks

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.OpenBlocksItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class OpenBlocksCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = OpenBlocksItems.Elevator.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "w h",
                "PHP",
                "GBG",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'B',
                OrePrefixes.frameGt.get(Materials.Steel),
                'H',
                VanillaItems.HeavyWeightedPressurePlate.get(),
            ),
        )
        CraftingRecipes.shapedWithFlags(
            output = OpenBlocksItems.DevNull.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "dCh",
                "SBS",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'B',
                OrePrefixes.frameGt.get(Materials.Iron),
                'C',
                ExtraUtilitiesItems.TrashCan.get(),
            ),
        )
        CraftingRecipes.shapedWithFlags(
            output = OpenBlocksItems.RotatingElevator.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                " S ",
                "GEG",
                "dSf",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'E',
                OpenBlocksItems.Elevator.get(),
            ),
        )
        CraftingRecipes.shapedWithFlags(
            output = OpenBlocksItems.RotatingElevator.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "dSf",
                "GEG",
                " S ",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'E',
                OpenBlocksItems.Elevator.get(),
            ),
        )
        CraftingRecipes.shapedWithFlags(
            output = OpenBlocksItems.BuildingGuide.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "PLP",
                "LEL",
                "PLP",
                'P',
                OrePrefixes.plate.get(Materials.Obsidian),
                'L',
                OrePrefixes.lens.get(Materials.Diamond),
                'E',
                IC2Items.Luminator.get(),
            ),
        )
        CraftingRecipes.shapedWithFlags(
            output = OpenBlocksItems.HangGlider.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SSS",
                "GPG",
                "wSd",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'G',
                OpenBlocksItems.GliderWing.get(),
            ),
        )
        CraftingRecipes.shapedWithFlags(
            output = OpenBlocksItems.GliderWing.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "hSL",
                "SBL",
                "LLL",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
                'L',
                VanillaItems.Leather.get(),
                'B',
                BackpackItems.TannedLeather.get(),
            ),
        )
    }
}
