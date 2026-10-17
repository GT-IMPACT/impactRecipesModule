package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersLogicAssemblyRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipILC.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.ALUBoard.get(),
            ticks = 400,
            eu = 60,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipILC.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.ALUBoard.get(),
            ticks = 400,
            eu = 60,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipILC.get(amount = 2),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.ALUBoard.get(),
            ticks = 400,
            eu = 60,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.CUBoard.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.CUBoard.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(amount = 2),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.CUBoard.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.ToolScanner.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                GregTechItems.SensorMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.Analyzer.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.ToolScanner.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                GregTechItems.SensorMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.Analyzer.get(),
            ticks = 300,
            eu = 120,
        )
    }
}
