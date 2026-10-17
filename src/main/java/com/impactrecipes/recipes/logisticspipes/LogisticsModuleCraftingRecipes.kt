package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class LogisticsModuleCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneIronChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.RedAlloy),
                'F',
                OrePrefixes.foil.get(Materials.Copper),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneIronChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.RedAlloy),
                'F',
                OrePrefixes.foil.get(Materials.Gold),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule3.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneIronChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.RedAlloy),
                'F',
                OrePrefixes.foil.get(Materials.Electrum),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneRedChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.Gold),
                'F',
                OrePrefixes.foil.get(Materials.Copper),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule5.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneGoldChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.Silver),
                'F',
                OrePrefixes.foil.get(Materials.Gold),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule6.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneRedChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.RedAlloy),
                'F',
                OrePrefixes.foil.get(Materials.Iron),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule500.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneGoldChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.RedAlloy),
                'F',
                OrePrefixes.foil.get(Materials.Silver),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule300.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WCA",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneIronChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.Electrum),
                'F',
                OrePrefixes.foil.get(Materials.Silver),
                'I',
                OrePrefixes.circuit.get(Materials.Good),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
                'W',
                OrePrefixes.wireGt02.get(Materials.Copper),
                'A',
                GregTechItems.BatteryRELVLithium.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule301.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ACA",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneIronChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.Electrum),
                'F',
                OrePrefixes.foil.get(Materials.Silver),
                'I',
                OrePrefixes.circuit.get(Materials.Good),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
                'A',
                GregTechItems.BatteryREMVLithium.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule13.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneGoldChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.Gold),
                'F',
                OrePrefixes.foil.get(Materials.AnnealedCopper),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule12.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule600.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneIronChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.Iron),
                'F',
                OrePrefixes.foil.get(Materials.Gold),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemModule502.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ImpactItems.RedstoneRedChipset.get(),
                'B',
                OrePrefixes.bolt.get(Materials.RedAlloy),
                'F',
                OrePrefixes.foil.get(Materials.Gold),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemLogisticsItemCard.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " C ",
                "BMB",
                "FIF",
                'C',
                ExtraUtilitiesItems.MiniChest.get(),
                'B',
                OrePrefixes.bolt.get(Materials.RedAlloy),
                'F',
                OrePrefixes.foil.get(Materials.Gold),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'M',
                LogisticsPipesItems.ItemItemModule.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemItemDisk.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "PDP",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Carbon),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'D',
                OpenComputersItems.Item19.get(),
            ),
        )

        for (i in 0 until 6) {
            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "T  ",
                    " B ",
                    "   ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade1.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    " T ",
                    " B ",
                    "   ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade2.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "  T",
                    " B ",
                    "   ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade3.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "   ",
                    " BT",
                    "   ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade4.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "   ",
                    " B ",
                    "  T",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade5.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "   ",
                    " B ",
                    " T ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade10.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "T  ",
                    " B ",
                    "   ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = 10 + i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade11.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    " T ",
                    " B ",
                    "   ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = 10 + i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade12.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "  T",
                    " B ",
                    "   ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = 10 + i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade13.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "   ",
                    " BT",
                    "   ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = 10 + i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade14.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "   ",
                    " B ",
                    "  T",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = 10 + i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = LogisticsPipesItems.ItemItemUpgrade15.get(),
                flags = 0L,
                recipe = arrayOf<Any?>(
                    "   ",
                    " B ",
                    " T ",
                    'T',
                    "craftingToolScrewdriver",
                    'B',
                    ModItemVariant(
                        item = LogisticsPipesItems.ItemItemUpgrade,
                        meta = 10 + i,
                    ).get(),
                ),
            )
        }
    }
}
