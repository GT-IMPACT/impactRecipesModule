package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility

internal class AE2CableAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = AE2Items.IlluminatedPanel.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(2),
            output = AE2Items.DarkIlluminatedPanel.get(),
            ticks = 100,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = AE2Items.CalculationProcessor.get(),
            secondaryInput = VanillaItems.RedstoneTorch.get(),
            output = AE2Items.LevelEmitter.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = AE2Items.IlluminatedPanel.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = AE2Items.BrightIlluminatedPanel.get(),
            ticks = 100,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = AE2Items.QuartzFiber.get(amount = 2),
            secondaryInput = AE2Items.FluixDust.get(amount = 3),
            output = AE2Items.ItemItemMultiPart16.get(amount = 2),
            ticks = 200,
            eu = 96,
        )
    }
}
