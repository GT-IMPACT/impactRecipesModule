package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class LogisticsUpgradeAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardCoated.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Gold,
                    count = 4,
                ),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemItemModule.get(amount = 4),
            ticks = 80,
            eu = 10,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPhenolic.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Electrum,
                    count = 4,
                ),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemItemModule.get(amount = 16),
            ticks = 100,
            eu = 20,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlastic.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.EnergeticAlloy,
                    count = 4,
                ),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemItemModule.get(amount = 64),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = LogisticsPipesItems.ItemItemModule3.get(),
            secondaryInput = ImpactItems.RedstoneGoldChipset.get(),
            output = LogisticsPipesItems.ItemItemModule7.get(),
            ticks = 140,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = LogisticsPipesItems.ItemItemUpgrade30.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.wireGt01,
                material = Materials.Tin,
                count = 2,
            ),
            output = LogisticsPipesItems.ItemItemUpgrade33.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = LogisticsPipesItems.ItemItemUpgrade30.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.wireGt02,
                material = Materials.Copper,
                count = 2,
            ),
            output = LogisticsPipesItems.ItemItemUpgrade34.get(),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = LogisticsPipesItems.ItemItemUpgrade30.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.wireGt04,
                material = Materials.Electrum,
                count = 2,
            ),
            output = LogisticsPipesItems.ItemItemUpgrade35.get(),
            ticks = 140,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = LogisticsPipesItems.ItemItemUpgrade30.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.wireGt08,
                material = Materials.Aluminium,
                count = 2,
            ),
            output = LogisticsPipesItems.ItemItemUpgrade36.get(),
            ticks = 160,
            eu = 120,
        )
    }
}
