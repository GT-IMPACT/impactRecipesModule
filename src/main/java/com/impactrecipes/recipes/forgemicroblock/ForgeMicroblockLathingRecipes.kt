package com.impactrecipes.recipes.forgemicroblock

import com.impactrecipes.items.ForgeMicroblockItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes

internal class ForgeMicroblockLathingRecipes {

    internal fun register() {
        MachineRecipes.lathe(
            input = VanillaItems.Stone.get(),
            output = ForgeMicroblockItems.StoneRod.get(amount = 2),
            secondaryOutput = null,
            ticks = 100,
            eu = 12,
        )
    }
}
