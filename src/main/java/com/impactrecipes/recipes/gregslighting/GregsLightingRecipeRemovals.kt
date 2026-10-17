package com.impactrecipes.recipes.gregslighting

import com.impactrecipes.items.GregsLightingItems
import com.impactrecipes.util.CraftingRecipes

internal class GregsLightingRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(GregsLightingItems.BonemealAndCharcoal.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(GregsLightingItems.Ic2FilamentAssembly.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(GregsLightingItems.GlowstoneBulb.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(GregsLightingItems.Ic2ElectricFloodlight.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(GregsLightingItems.Floodlight.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(GregsLightingItems.GlowingIngot.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(GregsLightingItems.CarbideFloodlight.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(GregsLightingItems.GasNozzle.get())
    }
}
