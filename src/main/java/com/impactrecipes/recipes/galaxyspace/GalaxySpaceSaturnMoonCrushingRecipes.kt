package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceSaturnMoonCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Enceladusblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustIceEnceladus",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.MysteriousCrystal,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Chrome,
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
                400,
                500,
                300,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Enceladusblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustEnceladus",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Chrome,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Osmium,
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
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Titanblocks.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustTitan",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Nickel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Osmium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1100,
                800,
                500,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Titanblocks1.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustTitan",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Nickel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Osmium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1100,
                800,
                500,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Titanblocks2.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustTitan",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Nickel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Osmium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1100,
                800,
                500,
            ),
            ticks = 400,
            eu = 480,
        )
    }
}
