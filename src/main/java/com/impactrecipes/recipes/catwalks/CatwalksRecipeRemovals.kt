package com.impactrecipes.recipes.catwalks

import com.impactrecipes.items.CatwalksItems
import com.impactrecipes.util.CraftingRecipes

internal class CatwalksRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.SupportColumn.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.SturdyRailPowered.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.CagedLadder.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.Scaffold.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.SturdyRailDetector.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.Catwalk.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.SturdyRail.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.SturdyRailActivator.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.RopeLight.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.Steelgrate.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = CatwalksItems.Blowtorch.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
