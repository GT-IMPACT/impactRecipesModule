package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes

internal class ImpactHammeringRecipes {

    internal fun register() {
        MachineRecipes.forgeHammer(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            output = ImpactItems.ClearGlassDust.get(),
            ticks = 50,
            eu = 8,
        )
    }
}
