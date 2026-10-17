package com.impactrecipes.recipes.bibliocraft

import com.impactrecipes.items.BiblioCraftItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BiblioCraftPanelerRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Paneler.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PsP",
                "WGW",
                "LLL",
                'G',
                GregTechItems.PlankOak.get(),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                VanillaItems.WoodenSlab.get(),
                'L',
                VanillaItems.Planks.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Paneler1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PsP",
                "WGW",
                "LLL",
                'G',
                GregTechItems.PlankSpruce.get(),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                VanillaItems.WoodenSlab1.get(),
                'L',
                VanillaItems.Planks1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Paneler2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PsP",
                "WGW",
                "LLL",
                'G',
                GregTechItems.PlankBirch.get(),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                VanillaItems.WoodenSlab2.get(),
                'L',
                VanillaItems.Planks2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Paneler3.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PsP",
                "WGW",
                "LLL",
                'G',
                GregTechItems.PlankJungle.get(),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                VanillaItems.WoodenSlab3.get(),
                'L',
                VanillaItems.Planks3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Paneler4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PsP",
                "WGW",
                "LLL",
                'G',
                GregTechItems.PlankAcacia.get(),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                VanillaItems.WoodenSlab4.get(),
                'L',
                VanillaItems.Planks4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Paneler5.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PsP",
                "WGW",
                "LLL",
                'G',
                GregTechItems.PlankDarkOak.get(),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                VanillaItems.WoodenSlab5.get(),
                'L',
                VanillaItems.Planks5.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Paneler6.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PsP",
                "WLW",
                "LLL",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                BiblioCraftItems.FramingBoard.get(),
                'L',
                BiblioCraftItems.FramingSheet.get(),
            ),
        )
    }
}
