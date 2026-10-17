package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceInnerPlanetCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Venusblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustVenus",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tetrahedrite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Scheelite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1100,
                600,
                400,
            ),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Venusblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustVenus",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tetrahedrite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Scheelite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1100,
                600,
                400,
            ),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Mercuryblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustMercuryP",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Ilmenite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tungsten,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Mithril,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                800,
                500,
                300,
            ),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Mercuryblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustMercuryP",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Ilmenite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tungsten,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Mithril,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                800,
                500,
                300,
            ),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Mercuryblocks2.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustMercuryP",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Ilmenite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tungsten,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Mithril,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                800,
                500,
                300,
            ),
            ticks = 400,
            eu = 250,
        )
    }
}
