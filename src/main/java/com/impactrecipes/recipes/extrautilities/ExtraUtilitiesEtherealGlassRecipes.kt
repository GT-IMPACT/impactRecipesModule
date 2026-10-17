package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ExtraUtilitiesEtherealGlassRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.EtherealGlass.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(2),
            fluidInput = null,
            output = ExtraUtilitiesItems.IneffableGlass.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.EtherealGlass.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = null,
            output = ExtraUtilitiesItems.EtherealGlassInverted.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.IneffableGlass.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = null,
            output = ExtraUtilitiesItems.IneffableGlassInverted.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.IneffableGlass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAsh,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.DarkEtherealGlass.get(),
            ticks = 200,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.DarkEtherealGlass.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = null,
            output = ExtraUtilitiesItems.DarkEtherealGlassInverted.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.chemicalReactor(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.EnderPearl,
                count = 1,
            ),
            fluidInput = null,
            fluidOutput = null,
            output = ExtraUtilitiesItems.EtherealGlass.get(),
            ticks = 100,
        )

        MachineRecipes.chemicalReactor(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.gem,
                material = Materials.EnderPearl,
                count = 1,
            ),
            fluidInput = null,
            fluidOutput = null,
            output = ExtraUtilitiesItems.EtherealGlass.get(),
            ticks = 100,
        )
    }
}
