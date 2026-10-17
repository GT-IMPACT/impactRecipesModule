package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactBrickAndAshCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.centrifuge(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Electrotine,
                count = 8,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Redstone,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Electrum,
                count = 1,
            ),
            output3 = GT_Values.NI,
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.centrifuge(
            input = ImpactItems.CokeOvenBrickDust.get(amount = 4),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Clay,
                count = 2,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.SiliconDioxide,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Brick,
                count = 1,
            ),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                9000,
                7500,
            ),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.centrifuge(
            input = ImpactItems.SearedBrickDust.get(amount = 4),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Brick,
                count = 2,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Stone,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.SiliconDioxide,
                count = 1,
            ),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                7500,
                2000,
            ),
            ticks = 400,
            eu = 30,
        )
    }
}
