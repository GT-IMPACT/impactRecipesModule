package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceCrystalGrowthRecipes {

    internal fun register() {
        MachineRecipes.spaceAutoclave(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.MysteriousCrystal,
                count = 9,
            ),
            fluid = Materials.EnrichedBacterialSludge.getFluid(1000),
            output = GalaxySpaceItems.ItemBasicItems10.get(),
            chance = 10000,
            ticks = 2000,
            eu = 7680,
            cleanroom = true,
        )
    }
}
