package com.impactrecipes.recipes.undergroundbiomes

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.UndergroundBiomesItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class UndergroundBiomesCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Cobblestone.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BB",
                "BB",
                'B',
                "cobblestone",
            ),
        )

        for (i in 0 until 8) {
            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousStoneBrickHalfSlab,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sB",
                    'B',
                    ModItemVariant(
                        item = UndergroundBiomesItems.IgneousStoneBrick,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicStoneBrickHalfSlab,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sB",
                    'B',
                    ModItemVariant(
                        item = UndergroundBiomesItems.MetamorphicStoneBrick,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousStoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sB",
                    'B',
                    ModItemVariant(
                        item = UndergroundBiomesItems.IgneousStone,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicStoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sB",
                    'B',
                    ModItemVariant(
                        item = UndergroundBiomesItems.MetamorphicStone,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousCobblestoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sB",
                    'B',
                    ModItemVariant(
                        item = UndergroundBiomesItems.IgneousCobblestone,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicCobblestoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sB",
                    'B',
                    ModItemVariant(
                        item = UndergroundBiomesItems.MetamorphicCobblestone,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = UndergroundBiomesItems.SedimentaryStoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "sB",
                    'B',
                    ModItemVariant(
                        item = UndergroundBiomesItems.SedimentaryStone,
                        meta = i,
                    ).get(),
                ),
            )

            for (j in 0 until 8) {
                CraftingRecipes.shapedWithFlags(
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    flags = craftingFlags,
                    recipe = arrayOf<Any?>(
                        "sB",
                        'B',
                        ModItemVariant(
                            item = UndergroundBiomesItems.MetamorphicStoneHalfSlab,
                            meta = i,
                        ).get(),
                    ),
                )
            }

            for (j in 8 until 16) {
                CraftingRecipes.shapedWithFlags(
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    flags = craftingFlags,
                    recipe = arrayOf<Any?>(
                        "sB",
                        'B',
                        ModItemVariant(
                            item = UndergroundBiomesItems.MetamorphicCobblestoneHalfSlab,
                            meta = i,
                        ).get(),
                    ),
                )
            }

            for (j in 24 until 32) {
                CraftingRecipes.shapedWithFlags(
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    flags = craftingFlags,
                    recipe = arrayOf<Any?>(
                        "sB",
                        'B',
                        ModItemVariant(
                            item = UndergroundBiomesItems.IgneousStoneHalfSlab,
                            meta = i,
                        ).get(),
                    ),
                )
            }

            for (j in 32 until 40) {
                CraftingRecipes.shapedWithFlags(
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    flags = craftingFlags,
                    recipe = arrayOf<Any?>(
                        "sB",
                        'B',
                        ModItemVariant(
                            item = UndergroundBiomesItems.IgneousCobblestoneHalfSlab,
                            meta = i,
                        ).get(),
                    ),
                )
            }

            for (j in 48 until 56) {
                CraftingRecipes.shapedWithFlags(
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    flags = craftingFlags,
                    recipe = arrayOf<Any?>(
                        "sB",
                        'B',
                        ModItemVariant(
                            item = UndergroundBiomesItems.SedimentaryStoneHalfSlab,
                            meta = i,
                        ).get(),
                    ),
                )
            }
        }
    }
}
