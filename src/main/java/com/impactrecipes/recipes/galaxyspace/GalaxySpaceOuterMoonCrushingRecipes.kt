package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceOuterMoonCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Mirandablocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustMiranda",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tin,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tetrahedrite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                600,
                400,
                300,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Mirandablocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustMiranda",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tin,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tetrahedrite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                600,
                400,
                300,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Mirandablocks2.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustMiranda",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tin,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Tetrahedrite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                600,
                400,
                300,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Tritonblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustTriton",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Neodymium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.RareEarth,
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
            eu = 1020,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Tritonblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustTriton",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Neodymium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.RareEarth,
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
            eu = 1020,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Tritonblocks2.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustTriton",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Neodymium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.RareEarth,
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
            eu = 1020,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Tritonblocks3.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustTriton",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Neodymium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.RareEarth,
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
            eu = 1020,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Tritonblocks4.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustTriton",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Gold,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Neodymium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.RareEarth,
                    count = 2,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                300,
            ),
            ticks = 400,
            eu = 1020,
        )
    }
}
