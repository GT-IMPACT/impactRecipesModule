package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpacePlutoCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Plutoblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIcePluto",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Thorium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                300,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Plutoblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIcePluto",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Thorium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                300,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Plutoblocks2.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIcePluto",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Thorium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                300,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Plutoblocks3.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIcePluto",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Thorium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                300,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Plutoblocks4.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIcePluto",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Thorium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                300,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Plutoblocks5.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustPluto",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uranium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Plutonium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.BlackPlutonium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                200,
            ),
            ticks = 400,
            eu = 1920,
        )
    }
}
