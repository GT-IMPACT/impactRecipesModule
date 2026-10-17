package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class LogisticsComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.LargeScreen.get(),
                OpenComputersItems.Keyboard.get(),
                VanillaItems.Sign.get(amount = 16),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemItemPipeSignCreator.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.RedstoneGoldChipset.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(18),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemLogisticsParts5.get(amount = 4),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.RedstoneDiamondChipset.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.BlueSteel,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(18),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = LogisticsPipesItems.ItemLogisticsParts6.get(amount = 4),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts5.get(amount = 4),
                AE2Items.LogicProcessor.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedSteel,
                    count = 32,
                ),
                GT_Utility.getIntegratedCircuit(18),
            ),
            fluid = Materials.SolderingAlloy.getMolten(144),
            output = LogisticsPipesItems.ItemLogisticsParts7.get(amount = 4),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemLogisticsParts6.get(amount = 4),
                AE2Items.EngineeringProcessor.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.BlueSteel,
                    count = 32,
                ),
                GT_Utility.getIntegratedCircuit(18),
            ),
            fluid = Materials.SolderingAlloy.getMolten(144),
            output = LogisticsPipesItems.ItemLogisticsParts8.get(amount = 4),
            ticks = 400,
            eu = 480,
        )
    }
}
