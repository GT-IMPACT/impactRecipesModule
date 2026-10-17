package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class VanillaStairCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        val stairs2 = arrayOf(
            VanillaItems.OakStairs.get(amount = 2),
            VanillaItems.SpruceStairs.get(amount = 2),
            VanillaItems.BirchStairs.get(amount = 2),
            VanillaItems.JungleStairs.get(amount = 2),
            VanillaItems.AcaciaStairs.get(amount = 2),
            VanillaItems.DarkOakStairs.get(amount = 2),
        )

        val stairs4 = arrayOf(
            VanillaItems.OakStairs.get(amount = 4),
            VanillaItems.SpruceStairs.get(amount = 4),
            VanillaItems.BirchStairs.get(amount = 4),
            VanillaItems.JungleStairs.get(amount = 4),
            VanillaItems.AcaciaStairs.get(amount = 4),
            VanillaItems.DarkOakStairs.get(amount = 4),
        )

        for (i in 0 until 6) {
            CraftingRecipes.shapedWithFlags(
                output = stairs2[i],
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sP",
                    "PP",
                    'P',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = stairs4[i],
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sP",
                    "PP",
                    'P',
                    ModItemVariant(
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )
        }
    }
}
