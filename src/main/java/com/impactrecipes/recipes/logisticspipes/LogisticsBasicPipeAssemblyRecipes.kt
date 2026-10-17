package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class LogisticsBasicPipeAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.GlassPane.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Birmabright,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 8),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.GlassPane.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.StainlessSteel,
                    count = 6,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 16),
            ticks = 120,
            eu = 48,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsBasicTransport.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Electrum,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsBasicLogistics.get(),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsBasicLogistics.get(amount = 4),
            ticks = 120,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.PolyvinylChloride,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsBasicLogistics.get(amount = 16),
            ticks = 140,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Platinum,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsBasicLogistics.get(amount = 64),
            ticks = 160,
            eu = 180,
        )
    }
}
