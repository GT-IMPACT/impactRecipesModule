package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ExtraUtilitiesStorageCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.MiniChest.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hPs",
                "P P",
                " P ",
                'P',
                OrePrefixes.plate.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.FilingCabinet.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PUP",
                "SCS",
                "PUP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'U',
                ExtraUtilitiesItems.ChestFull.get(),
                'C',
                ChestUpItems.SteelChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.AdvancedFilingCabinet.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PUP",
                "SUS",
                "PUP",
                'P',
                OrePrefixes.plateDouble.get(Materials.Gold),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'U',
                ExtraUtilitiesItems.FilingCabinet.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.TrashCan.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PhP",
                "PBP",
                "PSP",
                'S',
                "slimeball",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                VanillaItems.Bucket.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.TrashCan.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PhP",
                "PBP",
                "PSP",
                'S',
                IC2Items.Resin.get(),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                VanillaItems.Bucket.get(),
            ),
        )
    }
}
