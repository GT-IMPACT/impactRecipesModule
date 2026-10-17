package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactBlastFurnaceRecipes {

    internal fun register() {
        MachineRecipes.blastFurnace(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.HastelloyC276,
                count = 1,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.ingotHot,
                material = Materials.HastelloyC276,
                count = 1,
            ),
            secondaryOutput = null,
            ticks = 60 * 20,
            eu = 1920,
            temperature = 3601,
        )

        MachineRecipes.blastFurnace(
            input = ImpactItems.YSZdust.get(amount = 16),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = null,
            fluidOutput = null,
            output = ImpactItems.YSZCeramic.get(),
            secondaryOutput = null,
            ticks = 20 * 300,
            eu = 480,
            temperature = 3200,
        )

        MachineRecipes.blastFurnace(
            input = ImpactItems.GDCdust.get(amount = 16),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = null,
            fluidOutput = null,
            output = ImpactItems.GDCCeramic.get(),
            secondaryOutput = null,
            ticks = 20 * 300,
            eu = 1920,
            temperature = 4200,
        )

        MachineRecipes.blastFurnace(
            input = ImpactItems.LSCFdust.get(amount = 16),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = null,
            fluidOutput = null,
            output = ImpactItems.LSFCCeramic.get(),
            secondaryOutput = null,
            ticks = 20 * 300,
            eu = 7680,
            temperature = 4200,
        )
    }
}
