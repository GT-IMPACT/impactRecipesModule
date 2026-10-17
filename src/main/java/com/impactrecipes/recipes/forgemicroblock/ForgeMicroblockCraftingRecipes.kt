package com.impactrecipes.recipes.forgemicroblock

import com.impactrecipes.items.ForgeMicroblockItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes

internal class ForgeMicroblockCraftingRecipes {

    internal fun register() {
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(ForgeMicroblockItems.StoneRod.get())
        CraftingRecipes.shaped(
            output = ForgeMicroblockItems.StoneRod.get(),
            recipe = arrayOf(
                "F ",
                " S",
                'F',
                "craftingToolFile",
                'S',
                VanillaItems.Stone.get(),
            ),
        )
    }
}
