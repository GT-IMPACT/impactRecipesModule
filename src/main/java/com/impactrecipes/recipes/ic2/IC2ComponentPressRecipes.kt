package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2ComponentPressRecipes {

    internal fun register() {
        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateAlloy,
                material = Materials.Advanced,
                count = 4,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plateDouble,
                material = Materials.Lead,
                count = 1,
            ),
            output = IC2Items.ReactorPlating.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateDense,
                material = Materials.Copper,
                count = 1,
            ),
            secondaryInput = IC2Items.ReactorPlating.get(),
            output = IC2Items.HeatCapacityReactorPlating.get(),
            ticks = 220,
            eu = 480,
        )

        MachineRecipes.formingPress(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateAlloy,
                material = Materials.Advanced,
                count = 8,
            ),
            secondaryInput = IC2Items.ReactorPlating.get(),
            output = IC2Items.ReactorPlatingExplosive.get(),
            ticks = 220,
            eu = 480,
        )
    }
}
