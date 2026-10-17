package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ExtraUtilitiesGlassAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            fluidInput = null,
            output = ExtraUtilitiesItems.EtchedGlass.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(4),
            fluidInput = null,
            output = ExtraUtilitiesItems.GlassBricks.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(5),
            fluidInput = null,
            output = ExtraUtilitiesItems.SwirlingGlass.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(2),
            fluidInput = null,
            output = ExtraUtilitiesItems.SquaredGlass.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.ThickenedGlass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DarkAsh,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.DarkGlass.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.DarkGlass.get(),
            secondaryInput = GregTechItems.GtMetaitem012804.get(amount = 4),
            fluidInput = null,
            output = ExtraUtilitiesItems.ReinforcedDarkGlass.get(),
            ticks = 400,
            eu = 30,
        )
    }
}
