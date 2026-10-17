package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.util.MachineRecipes

internal class LogisticsModulePressRecipes {

    internal fun register() {
        MachineRecipes.formingPress(
            input = LogisticsPipesItems.ItemItemModule3.get(),
            secondaryInput = LogisticsPipesItems.ItemLogisticsParts5.get(),
            output = LogisticsPipesItems.ItemItemModule103.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = LogisticsPipesItems.ItemItemModule7.get(),
            secondaryInput = LogisticsPipesItems.ItemLogisticsParts5.get(),
            output = LogisticsPipesItems.ItemItemModule107.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = LogisticsPipesItems.ItemItemModule3.get(),
            secondaryInput = LogisticsPipesItems.ItemLogisticsParts6.get(),
            output = LogisticsPipesItems.ItemItemModule203.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = LogisticsPipesItems.ItemItemModule7.get(),
            secondaryInput = LogisticsPipesItems.ItemLogisticsParts6.get(),
            output = LogisticsPipesItems.ItemItemModule207.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = LogisticsPipesItems.ItemItemModule500.get(),
            secondaryInput = LogisticsPipesItems.ItemLogisticsParts6.get(),
            output = LogisticsPipesItems.ItemItemModule501.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = LogisticsPipesItems.ItemItemModule1.get(),
            secondaryInput = LogisticsPipesItems.ItemLogisticsParts5.get(),
            output = LogisticsPipesItems.ItemItemModule12.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = LogisticsPipesItems.ItemItemModule600.get(amount = 2),
            secondaryInput = LogisticsPipesItems.ItemLogisticsParts7.get(),
            output = LogisticsPipesItems.ItemItemModule601.get(amount = 2),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.formingPress(
            input = LogisticsPipesItems.ItemItemModule601.get(amount = 2),
            secondaryInput = LogisticsPipesItems.ItemLogisticsParts8.get(),
            output = LogisticsPipesItems.ItemItemModule602.get(amount = 2),
            ticks = 300,
            eu = 480,
        )
    }
}
