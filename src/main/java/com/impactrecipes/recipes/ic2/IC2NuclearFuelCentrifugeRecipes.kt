package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2NuclearFuelCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.thermalCentrifuge(
            input = IC2Items.ReactorDepletedUraniumSimple.get(),
            outputs = arrayOf(
                IC2Items.Uran238.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                1000,
                1000,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = IC2Items.ReactorDepletedUraniumDual.get(),
            outputs = arrayOf(
                IC2Items.Uran238.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 2,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                1000,
                1000,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = IC2Items.ReactorDepletedUraniumQuad.get(),
            outputs = arrayOf(
                IC2Items.Uran238.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 7,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 4,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                1000,
                1000,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = IC2Items.ReactorDepletedMOXSimple.get(),
            outputs = arrayOf(
                IC2Items.Plutonium.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Californium,
                    count = 1,
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
                9500,
                2000,
                1000,
                1000,
                500,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = IC2Items.ReactorDepletedMOXDual.get(),
            outputs = arrayOf(
                IC2Items.Plutonium.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Californium,
                    count = 2,
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
                9500,
                2000,
                1000,
                1000,
                500,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = IC2Items.ReactorDepletedMOXQuad.get(),
            outputs = arrayOf(
                IC2Items.Plutonium.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 7,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Californium,
                    count = 4,
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
                9500,
                2000,
                1000,
                1000,
                500,
            ),
            ticks = 200,
            eu = 500,
        )
    }
}
