package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class MalisisCurtainCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainPurple.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet10.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainYellow.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet4.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainMagenta.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet2.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainPink.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet6.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainWhite.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainBlue.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet11.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainGray.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet7.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainCyan.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet9.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainRed.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet14.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainBrown.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet12.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainLime.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet5.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainOrange.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet1.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainSilver.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet8.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainGreen.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet13.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainLightBlue.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet3.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemCurtainBlack.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C C",
                "CSC",
                "C C",
                'C',
                VanillaItems.Carpet15.get(),
                'S',
                VanillaItems.String.get(),
            ),
        )
    }
}
