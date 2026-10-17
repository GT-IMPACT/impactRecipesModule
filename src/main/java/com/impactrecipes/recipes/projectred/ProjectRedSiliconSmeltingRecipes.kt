package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ProjectRedSiliconSmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Silicon,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Redstone,
                count = 8,
            ),
            output = ProjectRedItems.ProjectredCorePart42.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.alloySmelter(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Silicon,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glowstone,
                count = 8,
            ),
            output = ProjectRedItems.ProjectredCorePart43.get(),
            ticks = 400,
            eu = 30,
        )
    }
}
