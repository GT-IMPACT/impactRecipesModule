package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2NaquadahFuelCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedNaquadah1.get(),
            outputs = arrayOf(
                ImpactItems.Naquadah.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.TungstenSteel,
                    count = 9,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.NaquadahEnriched,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium241,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                1000,
                1000,
            ),
            ticks = 500,
            eu = 2000,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedNaquadah2.get(),
            outputs = arrayOf(
                ImpactItems.Naquadah.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.TungstenSteel,
                    count = 20,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.NaquadahEnriched,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium241,
                    count = 2,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                1000,
                1000,
            ),
            ticks = 500,
            eu = 2000,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedNaquadah4.get(),
            outputs = arrayOf(
                ImpactItems.Naquadah.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.TungstenSteel,
                    count = 42,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.NaquadahEnriched,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium241,
                    count = 4,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                1000,
                1000,
            ),
            ticks = 500,
            eu = 2000,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedMNq1.get(),
            outputs = arrayOf(
                ImpactItems.NaquadahE.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.TungstenSteel,
                    count = 9,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.NaquadahEnriched,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadah,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Californium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadria,
                    count = 2,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                9500,
                2000,
                1000,
                1000,
                500,
            ),
            ticks = 500,
            eu = 2000,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedMNq2.get(),
            outputs = arrayOf(
                ImpactItems.NaquadahE.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.TungstenSteel,
                    count = 20,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.NaquadahEnriched,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadah,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Californium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadria,
                    count = 4,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                9500,
                2000,
                1000,
                1000,
                500,
            ),
            ticks = 500,
            eu = 2000,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedMNq4.get(),
            outputs = arrayOf(
                ImpactItems.NaquadahE.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.TungstenSteel,
                    count = 42,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.NaquadahEnriched,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadah,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Californium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadria,
                    count = 8,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                9500,
                2000,
                1000,
                1000,
                500,
            ),
            ticks = 500,
            eu = 2000,
        )
    }
}
