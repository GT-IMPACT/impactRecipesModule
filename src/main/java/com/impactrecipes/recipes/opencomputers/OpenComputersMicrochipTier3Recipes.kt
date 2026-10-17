package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersMicrochipTier3Recipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlueAlloy,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(amount = 2),
            ticks = 600,
            eu = 1024,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlueAlloy,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(amount = 2),
            ticks = 600,
            eu = 1024,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlueAlloy,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(amount = 2),
            ticks = 300,
            eu = 1024,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Platinum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(amount = 4),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Platinum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(amount = 4),
            ticks = 600,
            eu = 1920,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Platinum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard3.get(amount = 4),
            ticks = 300,
            eu = 1920,
        )
    }
}
