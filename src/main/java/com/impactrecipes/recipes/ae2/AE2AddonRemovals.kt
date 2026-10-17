package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2StuffItems
import com.impactrecipes.items.AE2WirelessCraftingTerminalItems
import com.impactrecipes.util.CraftingRecipes

internal class AE2AddonRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = AE2StuffItems.WirelessConnector.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = AE2StuffItems.WirelessKit.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = AE2StuffItems.NetworkVisualiser.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = AE2StuffItems.PatternEncoder.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = AE2StuffItems.Grower.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = AE2StuffItems.Inscriber.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = AE2WirelessCraftingTerminalItems.WirelessCraftingTerminal.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = AE2WirelessCraftingTerminalItems.MagnetCard.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = true,
        )
    }
}
