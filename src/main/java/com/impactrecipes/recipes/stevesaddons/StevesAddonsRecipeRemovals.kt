package com.impactrecipes.recipes.stevesaddons

import com.impactrecipes.items.StevesAddonsItems
import com.impactrecipes.util.CraftingRecipes

internal class StevesAddonsRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = StevesAddonsItems.RFNode.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = StevesAddonsItems.ManagerDuplicator.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = StevesAddonsItems.FactoryLabeler.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
