package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class CarpentersCuttingRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = CarpentersBlocksItems.PressurePlate.get(),
            output = CarpentersBlocksItems.Button.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = CarpentersBlocksItems.Slope.get(),
            output = CarpentersBlocksItems.Stairs.get(),
            secondaryOutput = GT_Values.NI,
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.cutter(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            output = CarpentersBlocksItems.Slope.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 100,
            eu = 30,
        )
    }
}
