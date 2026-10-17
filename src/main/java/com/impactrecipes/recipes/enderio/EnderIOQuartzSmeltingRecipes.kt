package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class EnderIOQuartzSmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = VanillaItems.Quartz.get(amount = 4),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glass,
                count = 1,
            ),
            output = EnderIOItems.FusedQuartz.get(),
            ticks = 200,
            eu = 8,
        )
    }
}
