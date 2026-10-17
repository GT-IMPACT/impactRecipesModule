package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class LogisticsModuleUpgradeRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts4.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 1,
                ),
                VanillaItems.Chest.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemItemUpgrade44.get(amount = 4),
            ticks = 120,
            eu = 30,
        )
    }
}
