package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Dyes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ProjectRedDyeBathRecipes {

    internal fun register() {
        for (i in 0 until 16) {
            for (j in 0 until Dyes.VALUES[i].getSizeOfFluidList()) {
                MachineRecipes.chemicalBath(
                    input = RecipeItems.ore(
                        prefix = OrePrefixes.dust,
                        material = Materials.Glowstone,
                        count = 2,
                    ),
                    fluid = Dyes.VALUES[i].getFluidDye(
                        j,
                        36,
                    ),
                    output = ModItemVariant(
                        item = ProjectRedItems.ProjectredCorePart,
                        meta = 34 - i,
                    ).get(),
                    secondaryOutput = GT_Values.NI,
                    output3 = GT_Values.NI,
                    chances = null,
                    ticks = 64,
                    eu = 2,
                )
            }
        }
    }
}
