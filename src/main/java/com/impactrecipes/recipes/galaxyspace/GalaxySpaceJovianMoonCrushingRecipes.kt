package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceJovianMoonCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Ganymedeblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustGanymed",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Titanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Chromite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                900,
                200,
            ),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Ganymedeblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustGanymed",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Titanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Chromite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                900,
                200,
            ),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Callistoblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustCallisto",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Galena,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
            ),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Callistoblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIceCallisto",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Galena,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
            ),
            ticks = 400,
            eu = 120,
        )
    }
}
