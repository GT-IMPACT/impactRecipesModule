package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ProjectRedDustMixingRecipes {

    internal fun register() {
        for (i in 0 until 16) {
            MachineRecipes.mixer(
                input = RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Glowstone,
                    count = 2,
                ),
                secondaryInput = GregTechItems.dyes[15 - i].get(amount = 2),
                input3 = GT_Utility.getIntegratedCircuit(1),
                input4 = null,
                fluidInput = null,
                fluidOutput = null,
                output = ModItemVariant(
                    item = ProjectRedItems.ProjectredCorePart,
                    meta = 19 + i,
                ).get(),
                ticks = 50,
                eu = 8,
            )
        }

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Electrum,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Redstone,
                count = 1,
            ),
            input3 = GT_Utility.getIntegratedCircuit(1),
            input4 = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Electrotine,
                count = 1,
            ),
            ticks = 200,
            eu = 8,
        )
    }
}
