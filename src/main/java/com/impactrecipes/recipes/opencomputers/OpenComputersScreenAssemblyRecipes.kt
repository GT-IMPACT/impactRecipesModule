package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersScreenAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingMV.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ScreenTier1.get(),
            ticks = 240,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingMV.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ScreenTier1.get(),
            ticks = 240,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingHV.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ScreenTier2.get(),
            ticks = 240,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingHV.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ScreenTier2.get(),
            ticks = 240,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingEV.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                GregTechItems.CircuitPartsTransistor.get(amount = 8),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.ScreenTier3.get(),
            ticks = 240,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingEV.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.ScreenTier3.get(),
            ticks = 240,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CasingEV.get(),
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.ScreenTier3.get(),
            ticks = 120,
            eu = 250,
        )
    }
}
