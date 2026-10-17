package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ForestryChipsetRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Tin,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Tin,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tin,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = ForestryItems.Chipsets.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Bronze,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Bronze,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Bronze,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = ForestryItems.Chipsets1.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Steel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Steel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = ForestryItems.Chipsets2.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitIntegratedGood.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Electrum,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Electrum,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = ForestryItems.Chipsets3.get(),
            ticks = 200,
            eu = 30,
        )
    }
}
