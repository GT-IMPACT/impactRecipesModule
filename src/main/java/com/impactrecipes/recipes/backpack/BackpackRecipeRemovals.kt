package com.impactrecipes.recipes.backpack

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values

internal class BackpackRecipeRemovals {

    internal fun register() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BackpackItems.WorkbenchBackpack,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BackpackItems.BoundLeather.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = BackpackItems.TannedLeather.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )

        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ModItemVariant(
                item = BackpackItems.SmallBackpack,
                meta = GT_Values.W.toInt(),
            ).get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }
}
