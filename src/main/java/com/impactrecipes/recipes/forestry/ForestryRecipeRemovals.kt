package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.util.CraftingRecipes

internal class ForestryRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.ApiaristBag.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.LepidopteristBag.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.MinerBag.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.DiggerBag.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.ForesterBag.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.HunterBag.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.AdventurerBag.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.BuilderBag.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.BronzePickaxe.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.BronzeShovel.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ForestryItems.Wrench.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )
    }
}
