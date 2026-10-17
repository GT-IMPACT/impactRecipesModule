package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.util.GT_ModHandler

internal class ChiselBlockCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Factoryblock.get(amount = 32),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SFS",
                "F F",
                "SFS",
                'S',
                "stone",
                'F',
                "frameGtIron",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Fantasyblock.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SFS",
                "SSS",
                'S',
                "stone",
                'F',
                "frameGtGold",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Tyrian.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SFS",
                "SSS",
                'S',
                "stone",
                'F',
                "frameGtIron",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.RoadLine.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "Cs",
                'C',
                VanillaItems.Carpet.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Technical.get(amount = 32),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SFS",
                "FSF",
                "SFS",
                'S',
                "stone",
                'F',
                "frameGtIron",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.HexPlating.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SFS",
                "SSS",
                'S',
                "stone",
                'F',
                "frameGtCarbon",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Holystone.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SDS",
                "SSS",
                'S',
                "stone",
                'D',
                "dustGlass",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Laboratoryblock.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SGS",
                "SSS",
                'S',
                "stone",
                'G',
                "craftingQuartz",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Rebel.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SFS",
                "SSS",
                'S',
                "stone",
                'F',
                "frameGtWroughtIron",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Voidstone.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SDS",
                "SSS",
                'S',
                "stone",
                'D',
                "dustObsidian",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.PaperwallBlock.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SFS",
                "SSS",
                'S',
                ModItemVariant(
                    item = ChiselItems.Paperwall,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'F',
                "frameGtWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.WarningSign.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "SFS",
                "SSS",
                'S',
                "stone",
                'F',
                VanillaItems.Sign.get(),
            ),
        )
    }
}
