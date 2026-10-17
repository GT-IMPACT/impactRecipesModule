package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials

internal class EnderIOQuartzBathRecipes {

    internal fun register() {
        MachineRecipes.chemicalBath(
            input = EnderIOItems.FusedQuartz.get(),
            fluid = Materials.Glowstone.getMolten(576),
            output = EnderIOItems.FusedQuartz2.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = null,
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.chemicalBath(
            input = EnderIOItems.FusedQuartz1.get(),
            fluid = Materials.Glowstone.getMolten(576),
            output = EnderIOItems.FusedQuartz3.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = null,
            ticks = 100,
            eu = 4,
        )

        MachineRecipes.chemicalBath(
            input = VanillaItems.Glass.get(),
            fluid = Materials.Chlorine.getGas(50),
            output = EnderIOItems.FusedQuartz1.get(),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            chances = null,
            ticks = 400,
            eu = 2,
        )
    }
}
