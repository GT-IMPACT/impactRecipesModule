package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalacticraftUtilityCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemParachute.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "W W",
                "WWW",
                'C',
                GalacticraftCoreItems.ItemCanvas.get(),
                'W',
                OrePrefixes.wireFine.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.SlabGCHalf.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                GalacticraftCoreItems.TileGcBlockCore4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.SlabGCHalf1.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                GalacticraftCoreItems.TileGcBlockCore3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.SlabGCHalf2.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                GalacticraftCoreItems.TileMoonBlock4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.SlabGCHalf3.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                GalacticraftCoreItems.TileMoonBlock14.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.SlabGCHalf4.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                GalacticraftMarsItems.TileMars4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.SlabGCHalf5.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                GalacticraftMarsItems.TileMars7.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = GalacticraftCoreItems.ItemBattery100.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                GregTechItems.BatteryHullLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemBasicItem20.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CVC",
                "BSB",
                "AOA",
                'B',
                GalacticraftCoreItems.ItemBasicItem10.get(),
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
                'O',
                IC2Items.CopperBoiler.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
            ),
        )
    }
}
