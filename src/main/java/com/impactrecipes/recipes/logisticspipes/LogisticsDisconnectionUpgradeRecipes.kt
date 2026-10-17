package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class LogisticsDisconnectionUpgradeRecipes {

    internal fun register() {
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
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade11.get(amount = 2),
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
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade12.get(amount = 2),
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
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade13.get(amount = 2),
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
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade14.get(amount = 2),
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
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade15.get(amount = 2),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 4),
                LogisticsPipesItems.ItemItemModule600.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade22.get(amount = 4),
            ticks = 120,
            eu = 30,
        )
    }
}
