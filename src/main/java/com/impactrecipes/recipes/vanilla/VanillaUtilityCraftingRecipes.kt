package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Dyes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class VanillaUtilityCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.ItemFrame.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IRI",
                "SLS",
                "SSS",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'I',
                VanillaItems.String.get(),
                'L',
                VanillaItems.Leather.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Comparator.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "STS",
                "TPT",
                "LdL",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.NetherQuartz),
                'T',
                VanillaItems.RedstoneTorch.get(),
                'L',
                VanillaItems.StoneSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Comparator.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "STS",
                "TPT",
                "LdL",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Quartzite),
                'T',
                VanillaItems.RedstoneTorch.get(),
                'L',
                VanillaItems.StoneSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Comparator.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "STS",
                "TPT",
                "LdL",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.CertusQuartz),
                'T',
                VanillaItems.RedstoneTorch.get(),
                'L',
                VanillaItems.StoneSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Repeater.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "S S",
                "TdT",
                "LIL",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                OrePrefixes.stick.get(Materials.RedAlloy),
                'T',
                VanillaItems.RedstoneTorch.get(),
                'L',
                VanillaItems.StoneSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Bed.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WWW",
                "FPF",
                'P',
                OrePrefixes.plank.get(Materials.Wood),
                'F',
                VanillaItems.Fence.get(),
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.FishingRod.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "  S",
                " SI",
                "SxR",
                'S',
                OrePrefixes.stickLong.get(Materials.Wood),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'I',
                VanillaItems.String.get(),
            ),
        )

        for (i in 0 until 16) {
            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = VanillaItems.Carpet,
                    meta = i,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WW",
                    'W',
                    ModItemVariant(
                        item = VanillaItems.Wool,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = VanillaItems.Carpet,
                    meta = i,
                ).get(amount = 3),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WWs",
                    'W',
                    ModItemVariant(
                        item = VanillaItems.Wool,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapelessWithFlags(
                output = ModItemVariant(
                    item = VanillaItems.Carpet,
                    meta = 15 - i,
                ).get(),
                flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
                ingredients = arrayOf<Any?>(
                    VanillaItems.Carpet.get(),
                    Dyes.VALUES[i],
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = VanillaItems.StainedGlassPane,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sW",
                    'W',
                    ModItemVariant(
                        item = VanillaItems.StainedGlass,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = VanillaItems.StainedGlassPane,
                    meta = 15 - i,
                ).get(amount = 8),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "WWW",
                    "WDW",
                    "WWW",
                    'W',
                    VanillaItems.GlassPane.get(),
                    'D',
                    Dyes.VALUES[i],
                ),
            )

            CraftingRecipes.shapelessWithFlags(
                output = ModItemVariant(
                    item = VanillaItems.StainedGlassPane,
                    meta = 15 - i,
                ).get(),
                flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
                ingredients = arrayOf<Any?>(
                    VanillaItems.GlassPane.get(),
                    Dyes.VALUES[i],
                ),
            )

            CraftingRecipes.shapelessWithFlags(
                output = GregTechItems.dyes[i].get(amount = 1),
                flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
                ingredients = arrayOf<Any?>(
                    Dyes.VALUES[i],
                ),
            )
        }

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.String.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "Wk",
                'W',
                "blockWool",
            ),
        )
    }
}
