package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class LogisticsControlCircuitRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Tin,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Copper,
                    count = 4,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemLogisticsParts4.get(amount = 4),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Tin,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade6.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade7.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade20.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade16.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade21.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade23.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade24.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Lapis,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade25.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.AnnealedCopper,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade30.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Bronze,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade41.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silver,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade42.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.CircuitChipSimpleSoC.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Silver,
                    count = 2,
                ),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade26.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.RobotArmLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Bronze,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade.get(amount = 2),
            ticks = 120,
            eu = 30,
        )
    }
}
