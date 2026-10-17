package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes

internal class AE2QuartzCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = AE2Items.FluixBlock.get(),
            outputs = arrayOf(
                AE2Items.FluixCrystal.get(amount = 4),
            ),
            chances = intArrayOf(
                10000,
            ),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = AE2Items.ChargedCertusQuartzCrystal.get(),
            outputs = arrayOf(
                ImpactItems.ChargedQuartzDust.get(),
            ),
            chances = intArrayOf(
                10000,
            ),
            ticks = 300,
            eu = 2,
        )
    }
}
