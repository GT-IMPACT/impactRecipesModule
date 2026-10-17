package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ForestryWoodCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        for (i in 0 until 29) {
            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.Fences,
                    meta = i,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "SPS",
                    "SPS",
                    "SPS",
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = ForestryItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.Fences,
                    meta = i,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WdW",
                    "SPS",
                    "SPS",
                    'W',
                    OrePrefixes.screw.get(Materials.Wood),
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = ForestryItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.Fences,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WdW",
                    "SPS",
                    "SPS",
                    'W',
                    OrePrefixes.screw.get(Materials.Iron),
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = ForestryItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.Fences,
                    meta = i,
                ).get(amount = 4),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WdW",
                    "SPS",
                    "SPS",
                    'W',
                    OrePrefixes.screw.get(Materials.Steel),
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = ForestryItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.FencesFireproof,
                    meta = i,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "SPS",
                    "SPS",
                    "SPS",
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.FencesFireproof,
                    meta = i,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WdW",
                    "SPS",
                    "SPS",
                    'W',
                    OrePrefixes.screw.get(Materials.Wood),
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.FencesFireproof,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WdW",
                    "SPS",
                    "SPS",
                    'W',
                    OrePrefixes.screw.get(Materials.Iron),
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.FencesFireproof,
                    meta = i,
                ).get(amount = 4),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WdW",
                    "SPS",
                    "SPS",
                    'W',
                    OrePrefixes.screw.get(Materials.Steel),
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.Stairs,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sP",
                    "PP",
                    'P',
                    ModItemVariant(
                        item = ForestryItems.Slabs,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.Stairs,
                    meta = i,
                ).get(amount = 4),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sP",
                    "PP",
                    'P',
                    ModItemVariant(
                        item = ForestryItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.StairsFireproof,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sP",
                    "PP",
                    'P',
                    ModItemVariant(
                        item = ForestryItems.SlabsFireproof,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = ForestryItems.StairsFireproof,
                    meta = i,
                ).get(amount = 4),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sP",
                    "PP",
                    'P',
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
                        meta = i,
                    ).get(),
                ),
            )
        }
    }
}
