package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.BuildCraftFactoryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class LogisticsMachineCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.LogisticsSolidBlock1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GMG",
                "ECE",
                "IWI",
                'G',
                OrePrefixes.gearGt.get(Materials.Steel),
                'I',
                OrePrefixes.circuit.get(Materials.Good),
                'W',
                OrePrefixes.cableGt01.get(Materials.Copper),
                'E',
                GregTechItems.ElectricMotorMV.get(),
                'M',
                GregTechItems.CoverScreen.get(),
                'C',
                GregTechItems.HullMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.LogisticsSolidBlock2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RMR",
                "ICI",
                "SGS",
                'G',
                OrePrefixes.gearGt.get(Materials.Steel),
                'I',
                OrePrefixes.circuit.get(Materials.Good),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'S',
                OrePrefixes.plate.get(Materials.Steel),
                'M',
                GregTechItems.CoverScreen.get(),
                'C',
                GregTechItems.HullMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.LogisticsSolidBlock3.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RMR",
                "GCG",
                "PEP",
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'M',
                BuildCraftFactoryItems.AutoWorkbenchBlock.get(),
                'R',
                OrePrefixes.plate.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'E',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                GregTechItems.CasingLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.LogisticsSolidBlock4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RMR",
                "GCG",
                "PEP",
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Steel),
                'M',
                BuildCraftFactoryItems.AutoWorkbenchBlock.get(),
                'R',
                OrePrefixes.plate.get(Materials.Lapis),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'E',
                GregTechItems.ElectricMotorLV.get(),
                'C',
                GregTechItems.CasingLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.LogisticsSolidBlock5.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RMR",
                "SCE",
                "IGI",
                'G',
                OrePrefixes.gearGt.get(Materials.Steel),
                'I',
                OrePrefixes.circuit.get(Materials.Good),
                'R',
                OrePrefixes.plate.get(Materials.Steel),
                'M',
                GregTechItems.CoverScreen.get(),
                'S',
                GregTechItems.SensorMV.get(),
                'E',
                GregTechItems.EmitterMV.get(),
                'C',
                GregTechItems.HullMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.LogisticsSolidBlock12.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IMI",
                "LCL",
                "IBI",
                'I',
                OrePrefixes.circuit.get(Materials.Good),
                'M',
                GregTechItems.CoverScreen.get(),
                'L',
                GregTechItems.MVCoil.get(),
                'B',
                GregTechItems.BatteryREMVLithium.get(),
                'C',
                GregTechItems.HullMV.get(),
            ),
        )
    }
}
