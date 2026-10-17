package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2ThoriumFuelCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedThorium1.get(),
            outputs = arrayOf(
                IC2Items.Uran238.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Thorium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lutetium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
                5000,
                5000,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedThorium2.get(),
            outputs = arrayOf(
                IC2Items.Uran238.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Thorium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lutetium,
                    count = 2,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
                5000,
                5000,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedThorium4.get(),
            outputs = arrayOf(
                IC2Items.Uran238.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Zirconium,
                    count = 7,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Thorium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium235,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lutetium,
                    count = 4,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
                5000,
                5000,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedMThCell1.get(),
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
                    material = Materials.Lutetium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
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
                10000,
                8000,
                5000,
                100,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedMThCell2.get(),
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
                    material = Materials.Lutetium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
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
                10000,
                8000,
                5000,
                100,
            ),
            ticks = 200,
            eu = 500,
        )

        MachineRecipes.thermalCentrifuge(
            input = GregTechItems.DepletedMThCell4.get(),
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
                    material = Materials.Lutetium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
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
                10000,
                8000,
                5000,
                100,
            ),
            ticks = 200,
            eu = 500,
        )
    }
}
