package com.impactrecipes.recipes.bibliocraft

import com.impactrecipes.items.BiblioCraftItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OreDictNames
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BiblioCraftUtilityRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.AtlasBook.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PBP",
                "PMP",
                'P',
                OrePrefixes.plate.get(Materials.Paper),
                'B',
                OreDictNames.craftingBook,
                'M',
                "paperMap",
                'T',
                BiblioCraftItems.MapTool.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.PaintPressBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPB",
                "R  ",
                "BIB",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                OrePrefixes.bolt.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'I',
                OrePrefixes.block.get(Materials.Iron),
            ),
        )
    }
}
