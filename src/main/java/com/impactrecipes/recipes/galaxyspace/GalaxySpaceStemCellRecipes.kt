package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials

internal class GalaxySpaceStemCellRecipes {

    internal fun register() {
        MachineRecipes.chemicalReactor(
            input = GalaxySpaceItems.ItemBasicItems10.get(amount = 4),
            secondaryInput = Materials.Osmiridium.getDust(2),
            fluidInput = Materials.GrowthMediumSterilized.getFluid(1000),
            fluidOutput = Materials.BacterialSludge.getFluid(1000),
            output = GregTechItems.CircuitChipStemcell.get(amount = 64),
            secondaryOutput = GT_Values.NI,
            ticks = 600,
            eu = 30720,
        )
    }
}
