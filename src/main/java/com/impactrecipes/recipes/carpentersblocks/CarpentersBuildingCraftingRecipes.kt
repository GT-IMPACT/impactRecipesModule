package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class CarpentersBuildingCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Button.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sC",
                'C',
                CarpentersBlocksItems.PressurePlate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Slope.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "Cs",
                'C',
                CarpentersBlocksItems.CarpentersBlock.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Stairs.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sC",
                'C',
                CarpentersBlocksItems.Slope.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = CarpentersBlocksItems.Tile.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                CarpentersBlocksItems.PressurePlate.get(),
                ToolDictNames.craftingToolRollingPin,
                "itemClay",
            ),
        )
    }
}
