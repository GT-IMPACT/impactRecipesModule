package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class GregTechCuttingRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot10.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer10.get(amount = 64),
            secondaryOutput = GregTechItems.CircuitSiliconWafer10.get(amount = 64),
            ticks = 6400,
            eu = 122880,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot9.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer9.get(amount = 40),
            secondaryOutput = null,
            ticks = 1000,
            eu = 240,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot8.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer8.get(amount = 64),
            secondaryOutput = GregTechItems.CircuitSiliconWafer8.get(amount = 64),
            ticks = 3200,
            eu = 7680,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot7.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer7.get(amount = 64),
            secondaryOutput = GregTechItems.CircuitSiliconWafer7.get(amount = 32),
            ticks = 2400,
            eu = 1920,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot6.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer6.get(amount = 64),
            secondaryOutput = GregTechItems.CircuitSiliconWafer6.get(amount = 64),
            ticks = 4800,
            eu = 122880,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot5.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer5.get(amount = 64),
            secondaryOutput = null,
            ticks = 3700,
            eu = 7680,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot4.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer4.get(amount = 48),
            secondaryOutput = null,
            ticks = 1200,
            eu = 240,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot3.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer3.get(amount = 64),
            secondaryOutput = null,
            ticks = 1600,
            eu = 480,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot2.get(),
            circuit = GT_Values.NI,
            output = GregTechItems.CircuitSiliconWafer2.get(amount = 32),
            secondaryOutput = null,
            ticks = 800,
            eu = 120,
            cleanroom = true,
        )

        MachineRecipes.cutter(
            input = GregTechItems.CircuitSiliconIngot.get(),
            output = GregTechItems.CircuitSiliconWafer.get(amount = 16),
            secondaryOutput = null,
            ticks = 400,
            eu = 12,
        )

        // --- ULV Circuit
        MachineRecipes.cutter(
            input = ImpactItems.NANDArray.get(),
            output = GregTechItems.NandChip.get(amount = 16),
            secondaryOutput = null,
            ticks = 100,
            eu = 120,
        )
    }
}
