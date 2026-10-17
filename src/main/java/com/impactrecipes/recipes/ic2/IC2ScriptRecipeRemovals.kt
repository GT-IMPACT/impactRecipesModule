package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values

internal class IC2ScriptRecipeRemovals {

    internal fun register() {
        val tools = arrayOf(
            IC2Items.MiningDrill,
            IC2Items.DiamondDrill,
            IC2Items.IridiumDrill,
            IC2Items.Chainsaw,
        )

        for (tool in tools) {
            CraftingRecipes.removeMatchingCraftingRecipesByOutput(
                ModItemVariant(
                    item = tool,
                    meta = GT_Values.W.toInt(),
                ).get(),
            )
        }

        CraftingRecipes.removeMatchingCraftingRecipesByOutput(
            ModItemVariant(
                item = IC2Items.ReactorCondensator,
                meta = 1,
            ).get(),
        )
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(
            ModItemVariant(
                item = IC2Items.ReactorCondensatorLap,
                meta = 1,
            ).get(),
        )
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(IC2Items.MfsuUpgradeKit.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(IC2Items.ElectricWrench.get())
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(IC2Items.UraniumBlock.get())
    }
}
