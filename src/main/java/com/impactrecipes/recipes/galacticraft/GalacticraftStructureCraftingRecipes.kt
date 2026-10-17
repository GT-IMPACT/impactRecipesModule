package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalacticraftStructureCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileGcBlockCore4.get(amount = 5),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hP ",
                "PSP",
                " Pw",
                'P',
                GalacticraftCoreItems.ItemBasicItem7.get(),
                'S',
                "stone",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileGcBlockCore3.get(amount = 5),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " Ph",
                "PSP",
                "wP ",
                'P',
                GalacticraftCoreItems.ItemBasicItem7.get(),
                'S',
                "stone",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileAirLockFrame.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DSD",
                "VdV",
                "ASA",
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'D',
                GalacticraftCoreItems.ItemMeteoricIronIngot1.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileAirLockFrame1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "VAV",
                "WRW",
                'P',
                OrePrefixes.plate.get(Materials.MeteoricSteel),
                'R',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'W',
                OrePrefixes.circuit.get(Materials.Advanced),
                'A',
                GalacticraftCoreItems.TileAirLockFrame.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = GalacticraftCoreItems.TileAluminumWire.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                OrePrefixes.cableGt01.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileAluminumWire1.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "AAA",
                "WWW",
                "AAA",
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'W',
                GalacticraftCoreItems.TileAluminumWire.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileSpinThruster.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "TTT",
                "CWC",
                "EPE",
                'T',
                GalacticraftCoreItems.ItemBasicItem6.get(),
                'W',
                OrePrefixes.circuit.get(Materials.Advanced),
                'P',
                GalacticraftCoreItems.ItemHeavyPlating.get(),
                'E',
                GalacticraftCoreItems.ItemEngine.get(),
                'C',
                GalacticraftCoreItems.ItemFuelCanisterPartial1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileTelemetry.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "MPE",
                "WPW",
                "PCP",
                'P',
                GalacticraftCoreItems.ItemBasicItem7.get(),
                'W',
                OrePrefixes.circuit.get(Materials.Advanced),
                'C',
                GalacticraftCoreItems.ItemBasicItem6.get(),
                'M',
                GalacticraftCoreItems.ItemBasicItem19.get(),
                'E',
                GregTechItems.EmitterHV.get(),
            ),
        )
    }
}
