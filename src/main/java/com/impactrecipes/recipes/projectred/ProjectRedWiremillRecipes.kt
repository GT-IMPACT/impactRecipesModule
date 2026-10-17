package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ProjectRedTransmissionItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ProjectRedWiremillRecipes {

    internal fun register() {
        MachineRecipes.wiremill(
            input = RecipeItems.ore(
                prefix = OrePrefixes.wireGt02,
                material = Materials.RedAlloy,
                count = 1,
            ),
            output = ProjectRedTransmissionItems.RedAlloyWire.get(amount = 4),
            ticks = 400,
            eu = 2,
        )
    }
}
