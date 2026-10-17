package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class VanillaClayAutoclaveRecipes {

    internal fun register() {
        MachineRecipes.autoclave(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Clay,
                count = 1,
            ),
            fluidInput = Materials.Water.getFluid(250),
            output = VanillaItems.ClayBall.get(),
            chance = 10000,
            ticks = 20,
            eu = 2,
        )
    }
}
