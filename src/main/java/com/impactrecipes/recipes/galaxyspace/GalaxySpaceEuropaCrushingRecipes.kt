package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceEuropaCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Europablocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustEuropa",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.SiliconDioxide,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iron,
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
            input = GalaxySpaceItems.Europablocks2.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIceEuropa",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Ledox,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lapis,
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
            input = GalaxySpaceItems.Europaunderwatergeyser.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIceEuropa",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Ledox,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lapis,
                    count = 2,
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
            input = GalaxySpaceItems.Europablocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustEuropa",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.SiliconDioxide,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iron,
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
            input = GalaxySpaceItems.Europageyser.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustEuropa",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.SiliconDioxide,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                800,
            ),
            ticks = 400,
            eu = 120,
        )
    }
}
