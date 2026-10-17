package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactFluidExtractionRecipes {

    internal fun register() {
        MachineRecipes.fluidExtractor(
            input = ImpactItems.ClearGlassDust.get(),
            remains = null,
            fluidOutput = Materials.Glass.getMolten(144),
            chance = 10000,
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.fluidExtractor(
            input = ImpactItems.PetCokeGem.get(),
            remains = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAshes,
                count = 1,
            ),
            fluidOutput = Materials.Tar.getFluid(100),
            chance = 2000,
            ticks = 30,
            eu = 12,
        )
    }
}
