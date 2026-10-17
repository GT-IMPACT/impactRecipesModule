package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeUtils

internal class VanillaSlabCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StoneSlab.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TB",
                'T',
                "craftingToolSaw",
                'B',
                RecipeUtils.ordictItemStack("stone"),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StoneSlab1.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TB",
                'T',
                "craftingToolSaw",
                'B',
                RecipeUtils.ordictItemStack("sandstone"),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StoneSlab3.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TB",
                'T',
                "craftingToolSaw",
                'B',
                RecipeUtils.ordictItemStack("cobblestone"),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StoneSlab4.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TB",
                'T',
                "craftingToolSaw",
                'B',
                VanillaItems.BrickBlock.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StoneSlab5.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TB",
                'T',
                "craftingToolSaw",
                'B',
                RecipeUtils.ordictItemStack("stoneBricks"),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StoneSlab6.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TB",
                'T',
                "craftingToolSaw",
                'B',
                RecipeUtils.ordictItemStack("stoneNetherBrick"),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.StoneSlab7.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TB",
                'T',
                "craftingToolSaw",
                'B',
                RecipeUtils.ordictItemStack("blockQuartz"),
            ),
        )

        for (i in 0 until 6) {
            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = VanillaItems.WoodenSlab,
                    meta = i,
                ).get(amount = 2),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "TB",
                    'T',
                    "craftingToolSaw",
                    'B',
                    ModItemVariant(
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )
        }
    }
}
