package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class VanillaFenceCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        for (i in 0 until 6) {
            CraftingRecipes.shapedWithFlags(
                output = VanillaItems.Fence.get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "SPS",
                    "SPS",
                    "SPS",
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'P',
                    ModItemVariant(
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = VanillaItems.Fence.get(),
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
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = VanillaItems.Fence.get(amount = 2),
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
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = VanillaItems.Fence.get(amount = 4),
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
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )
        }

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.FenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.FenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.FenceGate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.FenceGate.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )
    }
}
