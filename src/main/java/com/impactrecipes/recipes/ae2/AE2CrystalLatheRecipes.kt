package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes

internal class AE2CrystalLatheRecipes {

    internal fun register() {
        MachineRecipes.lathe(
            input = AE2Items.ChargedCertusQuartzCrystal.get(),
            output = ImpactItems.ChargedQuartzRod.get(),
            secondaryOutput = ImpactItems.ChargedQuartzDust.get(),
            chances = intArrayOf(
                10000,
                5000,
            ),
            ticks = 480,
            eu = 16,
        )
    }
}
