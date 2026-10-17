package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class LogisticsSneakyUpgradeRecipes {

    internal fun register() {
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
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade1.get(amount = 2),
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
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade2.get(amount = 2),
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
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade3.get(amount = 2),
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
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade4.get(amount = 2),
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
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade5.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 2),
                GregTechItems.RobotArmLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Steel,
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
            output = LogisticsPipesItems.ItemItemUpgrade10.get(amount = 2),
            ticks = 120,
            eu = 30,
        )
    }
}
