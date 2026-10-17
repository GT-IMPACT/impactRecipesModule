package com.impactrecipes.recipes.openblocks

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.OpenBlocksItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Dyes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class OpenBlocksMachineRecipes {

    internal fun register() {
        enhancedBuildingGuide()
        elevatorColoring()
    }

    private fun enhancedBuildingGuide() {
        MachineRecipes.assembler(
            input = OpenBlocksItems.BuildingGuide.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.EnderEye,
                count = 1,
            ),
            fluidInput = Materials.Redstone.getMolten(288),
            output = OpenBlocksItems.EnhancedBuildingGuide.get(),
            ticks = 300,
            eu = 64,
        )
    }

    private fun elevatorColoring() {
        for (i in 0 until 16) {
            for (j in 0 until Dyes.VALUES[i].getSizeOfFluidList()) {
                MachineRecipes.chemicalBath(
                    input = ModItemVariant(
                        item = OpenBlocksItems.Elevator,
                        meta = GT_Values.W.toInt(),
                    ).get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        144L,
                    ),
                    output = ModItemVariant(
                        item = OpenBlocksItems.Elevator,
                        meta = 15 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 200,
                    eu = 2,
                )
                MachineRecipes.chemicalBath(
                    input = ModItemVariant(
                        item = OpenBlocksItems.RotatingElevator,
                        meta = GT_Values.W.toInt(),
                    ).get(),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        144L,
                    ),
                    output = ModItemVariant(
                        item = OpenBlocksItems.RotatingElevator,
                        meta = 15 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 200,
                    eu = 2,
                )
            }
        }
    }
}
