package com.impactrecipes.recipes.bibliocraft

import com.impactrecipes.items.BiblioCraftItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BiblioCraftToolRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        for (i in 0 until 6) {
            CraftingRecipes.shapedWithFlags(
                output = BiblioCraftItems.FramingSheet.get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "Gs",
                    'G',
                    ModItemVariant(
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BiblioCraftItems.Clock,
                    meta = i,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "SCS",
                    "SIS",
                    "SPS",
                    'S',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    'C',
                    VanillaItems.Clock.get(),
                    'I',
                    VanillaItems.Stick.get(),
                    'P',
                    OrePrefixes.plate.get(Materials.Gold),
                ),
            )
        }

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.FramingBoard.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "Gs",
                'G',
                BiblioCraftItems.FramingSheet.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.MapTool.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IWI",
                "IIf",
                "IWd",
                'I',
                OrePrefixes.stick.get(Materials.Iron),
                'W',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.WayPointCompass.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IRf",
                "WCW",
                "dRI",
                'I',
                OrePrefixes.stick.get(Materials.Gold),
                'W',
                OrePrefixes.screw.get(Materials.Gold),
                'R',
                OrePrefixes.ring.get(Materials.Gold),
                'C',
                VanillaItems.Compass.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Glasses.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IWI",
                "RBR",
                "LdL",
                'I',
                OrePrefixes.stick.get(Materials.Iron),
                'W',
                OrePrefixes.screw.get(Materials.Iron),
                'B',
                OrePrefixes.bolt.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'L',
                OrePrefixes.lens.get(Materials.Glass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Glasses2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RWW",
                "LrW",
                " W ",
                'W',
                OrePrefixes.wireFine.get(Materials.Gold),
                'R',
                OrePrefixes.ring.get(Materials.Gold),
                'L',
                OrePrefixes.lens.get(Materials.Glass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.PlumbLine.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WWW",
                "PrW",
                "R W",
                'W',
                OrePrefixes.wireFine.get(Materials.Steel),
                'R',
                OrePrefixes.round.get(Materials.Lead),
                'P',
                OrePrefixes.plate.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Drill.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IBd",
                "GRG",
                "PEP",
                'I',
                OrePrefixes.screw.get(Materials.Iron),
                'B',
                OrePrefixes.bolt.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Iron),
                'R',
                IC2Items.SmallPowerUnit.get(),
                'E',
                IC2Items.RechargeableBattery.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.Tape.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WWW",
                "WYW",
                "WWW",
                'W',
                OrePrefixes.wireFine.get(Materials.Iron),
                'B',
                "dyeYellow",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BiblioCraftItems.TapeMeasure.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "TTT",
                "SSS",
                'T',
                BiblioCraftItems.Tape.get(),
                'S',
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )

        for (i in 0 until 6) {
            CraftingRecipes.shapedWithFlags(
                output = BiblioCraftItems.Clipboard.get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "ERE",
                    "dGs",
                    "PPP",
                    'E',
                    OrePrefixes.screw.get(Materials.Iron),
                    'R',
                    OrePrefixes.springSmall.get(Materials.Iron),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(),
                    'P',
                    VanillaItems.Paper.get(),
                ),
            )
        }
    }
}
