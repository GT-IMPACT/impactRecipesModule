package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2SeedMixingRecipes {

    internal fun register() {
        MachineRecipes.mixer(
            input = ImpactItems.ChargedQuartzDust.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Redstone,
                count = 1,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            input4 = GT_Values.NI,
            fluidInput = Materials.Water.getFluid(500),
            fluidOutput = GT_Values.NF,
            output = AE2Items.FluixDust.get(amount = 2),
            ticks = 20,
            eu = 16,
        )

        MachineRecipes.mixer(
            input = ImpactItems.ChargedQuartzDust.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Redstone,
                count = 1,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            input4 = GT_Values.NI,
            fluidInput = GT_ModHandler.getDistilledWater(500),
            fluidOutput = GT_Values.NF,
            output = AE2Items.FluixDust.get(amount = 2),
            ticks = 20,
            eu = 16,
        )
    }
}
