package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.centrifuge(
            input = GalaxySpaceItems.ItemGlowstoneDusts.get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glowstone,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.MeteoricIron,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Beryllium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Platinum,
                count = 1,
            ),
            output5 = null,
            output6 = null,
            chances = intArrayOf(
                10000,
                1800,
                1500,
                1200,
            ),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.centrifuge(
            input = GalaxySpaceItems.ItemGlowstoneDusts1.get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glowstone,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Sulfur,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tantalite,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tungsten,
                count = 1,
            ),
            output5 = null,
            output6 = null,
            chances = intArrayOf(
                10000,
                1800,
                1500,
                1200,
            ),
            ticks = 500,
            eu = 250,
        )
    }
}
