package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class IC2CoalBallMixingRecipes {

    internal fun register() {
        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Coal,
                count = 8,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Flint,
                count = 1,
            ),
            input3 = GT_Utility.getIntegratedCircuit(1),
            input4 = null,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = IC2Items.CoalBall.get(),
            ticks = 100,
            eu = 12,
        )
    }
}
