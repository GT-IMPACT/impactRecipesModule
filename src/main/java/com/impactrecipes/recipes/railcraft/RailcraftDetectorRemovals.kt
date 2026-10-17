package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.CraftingRecipes

internal class RailcraftDetectorRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorItem.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorAny.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorEmpty.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorMob.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorPowered.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorPlayer.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorExplosive.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorAnimal.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorTank.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorAdvanced.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorEnergy.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorAge.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorTrain.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorSheep.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorVillager.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorLocomotive.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = RailcraftItems.DetectorRouting.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
