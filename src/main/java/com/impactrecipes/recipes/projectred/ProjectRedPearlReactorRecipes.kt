package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.WirelessRedstoneCoreItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ProjectRedPearlReactorRecipes {

    internal fun register() {
        MachineRecipes.chemicalReactor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.gemFlawless,
                material = Materials.Diamond,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glowstone,
                count = 1,
            ),
            fluidInput = Materials.Redstone.getMolten(144),
            fluidOutput = null,
            output = WirelessRedstoneCoreItems.RetherPearl.get(),
            ticks = 1200,
        )
    }
}
