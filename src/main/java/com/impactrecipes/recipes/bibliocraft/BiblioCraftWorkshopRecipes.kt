package com.impactrecipes.recipes.bibliocraft

import com.impactrecipes.items.BiblioCraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BiblioCraftWorkshopRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.TesterItem.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sD ",
                "Sh ",
                'S',
                VanillaItems.Book.get(),
                'D',
                VanillaItems.Diamond.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Chase.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "S S",
                "SSS",
                'S',
                OrePrefixes.stick.get(Materials.WoodSealed),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.TypesettingMachine.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "WFW",
                "WWW",
                'W',
                OrePrefixes.plate.get(Materials.WoodSealed),
                'F',
                OrePrefixes.frameGt.get(Materials.WoodSealed),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'C',
                BiblioCraftItems.Chase.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.FramedChest.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FFF",
                "SLS",
                "FFF",
                'F',
                BiblioCraftItems.FramingSheet.get(),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'L',
                BiblioCraftItems.Label6.get(),
            ),
        )
    }
}
