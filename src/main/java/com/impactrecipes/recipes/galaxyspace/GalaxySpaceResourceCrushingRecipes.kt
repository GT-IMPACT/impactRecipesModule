package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceResourceCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Enceladuscrystal.get(),
            outputs = arrayOf(
                GalaxySpaceItems.ItemBasicItems10.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.MysteriousCrystal,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.MysteriousCrystal,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.MysteriousCrystal,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                3500,
                500,
                150,
            ),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Barnardaclog.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Wood,
                    count = 6,
                ),
                ImpactItems.BarnardaCBall.get(),
            ),
            chances = intArrayOf(
                10000,
                3300,
            ),
            ticks = 600,
            eu = 8,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Barnardacleaves.get(amount = 8),
            outputs = arrayOf(
                ImpactItems.BarnardaCBiochaff.get(),
                GalaxySpaceItems.Barnardacdandelions1.get(),
            ),
            chances = intArrayOf(
                10000,
                5000,
            ),
            ticks = 200,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = ImpactItems.BarnardaCBiochaff.get(),
            outputs = arrayOf(
                GalaxySpaceItems.Barnardacblocks.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.AlienOrganic,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                2000,
            ),
            ticks = 100,
            eu = 40,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Dungeonglowstone.get(),
            outputs = arrayOf(
                GalaxySpaceItems.ItemGlowstoneDusts.get(amount = 4),
            ),
            chances = intArrayOf(
                10000,
            ),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Dungeonglowstone1.get(),
            outputs = arrayOf(
                GalaxySpaceItems.ItemGlowstoneDusts1.get(amount = 4),
            ),
            chances = intArrayOf(
                10000,
            ),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = GalaxySpaceItems.Surfaceice.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Ledox,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.SiliconDioxide,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.MeteoricIron,
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
