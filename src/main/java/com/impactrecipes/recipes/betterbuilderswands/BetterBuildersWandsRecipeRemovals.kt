package com.impactrecipes.recipes.betterbuilderswands

import com.impactrecipes.items.BetterBuildersWandsItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values

internal class BetterBuildersWandsRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(BetterBuildersWandsItems.StoneWand.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(BetterBuildersWandsItems.IronWand.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(BetterBuildersWandsItems.DiamondWand.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(
            ModItemVariant(
                item = BetterBuildersWandsItems.UnbreakableWandIII,
                meta = GT_Values.W.toInt(),
            ).get(),
        )
    }
}
