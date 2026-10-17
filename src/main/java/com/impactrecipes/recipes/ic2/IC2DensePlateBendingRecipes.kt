package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2DensePlateBendingRecipes {

    internal fun register() {
        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Obsidian,
                count = 9,
            ),
            output = IC2Items.Denseplateobsidian.get(),
            ticks = 3600,
            eu = 96,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Lapis,
                count = 9,
            ),
            output = IC2Items.Denseplatelapi.get(),
            ticks = 3600,
            eu = 96,
        )
    }
}
