package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactDryingOvenRecipes {

    internal fun register() {
        MachineRecipes.dryingOven(
            input = ImpactItems.PGFoil.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Graphene,
                    count = 1,
                ),
            ),
            ticks = 800,
            eu = 12,
        )
    }
}
