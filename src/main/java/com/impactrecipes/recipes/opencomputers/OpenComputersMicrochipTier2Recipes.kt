package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersMicrochipTier2Recipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard2.get(),
            ticks = 500,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard2.get(),
            ticks = 500,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = ImpactItems.MicrochipBoard2.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
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
            output = ImpactItems.MicrochipBoard2.get(amount = 3),
            ticks = 500,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
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
            output = ImpactItems.MicrochipBoard2.get(amount = 3),
            ticks = 500,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
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
            output = ImpactItems.MicrochipBoard2.get(amount = 3),
            ticks = 250,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
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
            output = ImpactItems.MicrochipBoard2.get(amount = 9),
            ticks = 500,
            eu = 1024,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
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
            output = ImpactItems.MicrochipBoard2.get(amount = 9),
            ticks = 500,
            eu = 1024,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
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
            output = ImpactItems.MicrochipBoard2.get(amount = 9),
            ticks = 250,
            eu = 1024,
        )
    }
}
