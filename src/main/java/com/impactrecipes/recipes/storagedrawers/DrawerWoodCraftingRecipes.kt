package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.StorageDrawersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class DrawerWoodCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        for (i in 0 until 6) {
            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = StorageDrawersItems.FullDrawer,
                    meta = i,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "PPP",
                    "SCS",
                    "PPP",
                    'P',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    'S',
                    OrePrefixes.screw.get(Materials.Wood),
                    'C',
                    "chestWood",
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = StorageDrawersItems.FullDoubleDrawer,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "PCP",
                    "SPS",
                    "PCP",
                    'P',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    'S',
                    OrePrefixes.screw.get(Materials.Wood),
                    'C',
                    "chestWood",
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = StorageDrawersItems.FullQuadDrawer,
                    meta = i,
                ).get(amount = 4),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "CPC",
                    "SPS",
                    "CPC",
                    'P',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    'S',
                    OrePrefixes.screw.get(Materials.Wood),
                    'C',
                    "chestWood",
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = StorageDrawersItems.HalfDoubleDrawer,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "PPP",
                    "CSC",
                    "PPP",
                    'P',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    'S',
                    OrePrefixes.screw.get(Materials.Wood),
                    'C',
                    "chestWood",
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = StorageDrawersItems.HalfQuadDrawer,
                    meta = i,
                ).get(amount = 4),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "PCP",
                    "CSC",
                    "PCP",
                    'P',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    'S',
                    OrePrefixes.screw.get(Materials.Wood),
                    'C',
                    "chestWood",
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = StorageDrawersItems.Trim,
                    meta = i,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "SPS",
                    "PPP",
                    "SPS",
                    'P',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    'S',
                    OrePrefixes.screw.get(Materials.Wood),
                ),
            )
        }
    }
}
