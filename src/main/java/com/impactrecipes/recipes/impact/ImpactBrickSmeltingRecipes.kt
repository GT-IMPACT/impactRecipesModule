package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes

internal class ImpactBrickSmeltingRecipes {

    internal fun register() {
        CraftingRecipes.smelting(
            input = ImpactItems.UnfiredClayBrick.get(),
            output = VanillaItems.Brick.get(),
        )

        CraftingRecipes.smelting(
            input = ImpactItems.UnfiredCokeOvenBrick.get(),
            output = ImpactItems.CokeOvenBrick.get(),
        )
    }
}
