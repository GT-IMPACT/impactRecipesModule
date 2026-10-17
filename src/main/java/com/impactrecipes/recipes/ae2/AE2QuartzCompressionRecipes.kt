package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.util.MachineRecipes

internal class AE2QuartzCompressionRecipes {

    internal fun register() {
        MachineRecipes.compressor(
            input = AE2Items.FluixCrystal.get(amount = 4),
            output = AE2Items.FluixBlock.get(),
            ticks = 200,
            eu = 8,
        )
    }
}
