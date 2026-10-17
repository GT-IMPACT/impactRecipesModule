package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class IC2HazmatCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = IC2Items.HazmatHelmet.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " D ",
                "PGP",
                "PBP",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'G',
                OrePrefixes.block.get(Materials.Glass),
                'D',
                "dyeOrange",
                'B',
                VanillaItems.IronBars.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.HazmatHelmet.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "PBP",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'G',
                ModItemVariant(
                    item = IC2Items.HazmatHelmet,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'B',
                ToolDictNames.craftingToolSoftHammer,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.HazmatChestplate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PDP",
                "PPP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'D',
                "dyeOrange",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.HazmatChestplate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PBP",
                "PGP",
                "P P",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'G',
                ModItemVariant(
                    item = IC2Items.HazmatChestplate,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'B',
                ToolDictNames.craftingToolSoftHammer,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.HazmatLeggings.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "PDP",
                "P P",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'D',
                "dyeOrange",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.HazmatLeggings.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "PBP",
                "P P",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'G',
                ModItemVariant(
                    item = IC2Items.HazmatLeggings,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'B',
                ToolDictNames.craftingToolSoftHammer,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.HazmatBoots.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "P P",
                "P P",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'W',
                "blockWool",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.HazmatBoots.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "PBP",
                "P P",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'G',
                ModItemVariant(
                    item = IC2Items.HazmatBoots,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'B',
                ToolDictNames.craftingToolSoftHammer,
            ),
        )
    }
}
