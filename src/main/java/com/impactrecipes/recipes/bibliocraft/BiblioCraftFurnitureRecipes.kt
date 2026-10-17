package com.impactrecipes.recipes.bibliocraft

import com.impactrecipes.items.BiblioCraftItems
import com.impactrecipes.items.GregsLightingItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BiblioCraftFurnitureRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Lantern.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PDP",
                "GTG",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Gold),
                'D',
                OrePrefixes.dust.get(Materials.Glowstone),
                'G',
                VanillaItems.GlassPane.get(),
                'T',
                VanillaItems.Torch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.IronLantern.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PDP",
                "GTG",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'D',
                OrePrefixes.dust.get(Materials.Glowstone),
                'G',
                VanillaItems.GlassPane.get(),
                'T',
                VanillaItems.Torch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Lamp.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PBP",
                " S ",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Gold),
                'S',
                OrePrefixes.stick.get(Materials.Gold),
                'B',
                GregsLightingItems.GlowstoneBulb.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.IronLamp.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PBP",
                " S ",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'B',
                GregsLightingItems.GlowstoneBulb.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.ArmorStand.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BSB",
                "hSs",
                "PMP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'B',
                OrePrefixes.bolt.get(Materials.Iron),
                'M',
                VanillaItems.StonePressurePlate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Bell.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " B ",
                " P ",
                "PhP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                VanillaItems.StoneButton.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Stuffs.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "G G",
                "GGG",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Stuffs2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "P P",
                " P ",
                'P',
                OrePrefixes.plate.get(Materials.NetherQuartz),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Clock6.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "SIS",
                "SPS",
                'S',
                BiblioCraftItems.FramingSheet.get(),
                'C',
                VanillaItems.Clock.get(),
                'I',
                VanillaItems.Stick.get(),
                'P',
                OrePrefixes.plate.get(Materials.Gold),
            ),
        )
    }
}
