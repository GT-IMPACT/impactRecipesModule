package com.impactrecipes.recipes.ztones

import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.ZtonesItems
import com.impactrecipes.util.MachineRecipes

internal class ZtonesHammerRecipes {

    internal fun register() {
        MachineRecipes.forgeHammer(
            input = VanillaItems.Coal1.get(),
            output = ZtonesItems.Minicharcoal.get(amount = 9),
            ticks = 50,
            eu = 8,
        )

        MachineRecipes.forgeHammer(
            input = VanillaItems.Coal.get(),
            output = ZtonesItems.Minicoal.get(amount = 9),
            ticks = 50,
            eu = 8,
        )
    }
}
