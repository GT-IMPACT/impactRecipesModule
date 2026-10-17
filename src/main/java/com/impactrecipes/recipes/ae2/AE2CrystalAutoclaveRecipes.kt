package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.util.GT_ModHandler

internal class AE2CrystalAutoclaveRecipes {

    internal fun register() {
        MachineRecipes.autoclave(
            input = ImpactItems.ChargedQuartzDust.get(),
            fluidInput = Materials.Water.getFluid(200),
            output = AE2Items.ChargedCertusQuartzCrystal.get(),
            chance = 7000,
            ticks = 2000,
            eu = 24,
        )

        MachineRecipes.autoclave(
            input = ImpactItems.ChargedQuartzDust.get(),
            fluidInput = GT_ModHandler.getDistilledWater(1000),
            output = AE2Items.ChargedCertusQuartzCrystal.get(),
            chance = 9000,
            ticks = 1500,
            eu = 24,
        )
    }
}
