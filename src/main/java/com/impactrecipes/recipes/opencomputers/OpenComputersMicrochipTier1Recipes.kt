package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersMicrochipTier1Recipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
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
            output = ImpactItems.MicrochipBoard1.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
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
            output = ImpactItems.MicrochipBoard1.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPhenolicGood.get(amount = 2),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = ImpactItems.MicrochipBoard1.get(amount = 2),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
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
            output = ImpactItems.MicrochipBoard1.get(amount = 4),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
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
            output = ImpactItems.MicrochipBoard1.get(amount = 4),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(amount = 2),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlueAlloy,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = ImpactItems.MicrochipBoard1.get(amount = 8),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
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
            output = ImpactItems.MicrochipBoard1.get(amount = 16),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
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
            output = ImpactItems.MicrochipBoard1.get(amount = 16),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(amount = 2),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Platinum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = ImpactItems.MicrochipBoard1.get(amount = 32),
            ticks = 400,
            eu = 480,
        )
    }
}
