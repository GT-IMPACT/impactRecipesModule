package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_OreDictUnificator

internal class ImpactFilterMaterialCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.centrifuge(
            input = GT_OreDictUnificator.get(
                OrePrefixes.dust.get(Materials.Orichalcum),
                4,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Trinium,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Trinium,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Trinium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Oriharukon,
                count = 1,
            ),
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 300,
            eu = 122880,
        )

        MachineRecipes.centrifuge(
            input = GT_OreDictUnificator.get(
                OrePrefixes.dust.get(Materials.Mytryl),
                6,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lead,
                count = 3,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Platinum,
                count = 2,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Draconium,
                count = 1,
            ),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
                5000,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.centrifuge(
            input = ImpactItems.PetcokeDust.get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAsh,
                count = 1,
            ),
            secondaryOutput = GT_Values.NI,
            output3 = GT_Values.NI,
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                1000,
            ),
            ticks = 200,
            eu = 5,
        )
    }
}
