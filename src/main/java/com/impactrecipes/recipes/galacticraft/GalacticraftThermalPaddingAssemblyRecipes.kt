package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility

internal class GalacticraftThermalPaddingAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(amount = 5),
            secondaryInput = GT_Utility.getIntegratedCircuit(5),
            output = GalacticraftMarsItems.ItemThermalPadding.get(),
            ticks = 750,
            eu = 1024,
        )

        MachineRecipes.assembler(
            input = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(amount = 8),
            secondaryInput = GT_Utility.getIntegratedCircuit(8),
            output = GalacticraftMarsItems.ItemThermalPadding1.get(),
            ticks = 1200,
            eu = 1024,
        )

        MachineRecipes.assembler(
            input = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(amount = 7),
            secondaryInput = GT_Utility.getIntegratedCircuit(7),
            output = GalacticraftMarsItems.ItemThermalPadding2.get(),
            ticks = 1050,
            eu = 1024,
        )

        MachineRecipes.assembler(
            input = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(amount = 4),
            secondaryInput = GT_Utility.getIntegratedCircuit(4),
            output = GalacticraftMarsItems.ItemThermalPadding3.get(),
            ticks = 600,
            eu = 1024,
        )
    }
}
