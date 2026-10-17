package com.impactrecipes.recipes.openblocks

import com.impactrecipes.items.OpenBlocksItems
import com.impactrecipes.util.CraftingRecipes

internal class OpenBlocksRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = OpenBlocksItems.Elevator.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = OpenBlocksItems.DevNull.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = OpenBlocksItems.EnhancedBuildingGuide.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = OpenBlocksItems.RotatingElevator.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = OpenBlocksItems.BuildingGuide.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = OpenBlocksItems.HangGlider.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = OpenBlocksItems.GliderWing.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = OpenBlocksItems.GliderWing.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
