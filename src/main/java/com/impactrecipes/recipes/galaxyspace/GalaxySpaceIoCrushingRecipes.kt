package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceIoCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Ioblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIo",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Sulfur,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tantalite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tungsten,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                400,
            ),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Ioblocks7.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIo",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Sulfur,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tantalite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tungsten,
                    count = 2,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                900,
                600,
            ),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Ioblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIo",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Ash,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Sulfur,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tantalite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                800,
                500,
            ),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Ioblocks8.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIo",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Ash,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Sulfur,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tantalite,
                    count = 2,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                1000,
                700,
            ),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Ioblocks2.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIo",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Sulfur,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tantalite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tungsten,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                400,
            ),
            ticks = 400,
            eu = 250,
        )
    }
}
