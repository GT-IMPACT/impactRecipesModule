package com.impactrecipes.recipes.backpack

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Dyes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BackpackColorRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        for (i in 0 until 16) {
            CraftingRecipes.shapelessWithFlags(
                output = ModItemVariant(
                    item = BackpackItems.SmallBackpack,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                ingredients = arrayOf(
                    Dyes.VALUES[i],
                    BackpackItems.SmallBackpack.get(),
                ),
            )

            CraftingRecipes.shapelessWithFlags(
                output = ModItemVariant(
                    item = BackpackItems.MediumBackpack,
                    meta = i + 101,
                ).get(),
                flags = craftingFlags,
                ingredients = arrayOf(
                    Dyes.VALUES[i],
                    BackpackItems.MediumBackpack.get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BackpackItems.MediumBackpack,
                    meta = i + 101,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf(
                    "RLR",
                    "LBL",
                    "RLR",
                    'R',
                    OrePrefixes.ring.get(Materials.WroughtIron),
                    'L',
                    BackpackItems.TannedLeather.get(),
                    'B',
                    ModItemVariant(
                        item = BackpackItems.SmallBackpack,
                        meta = i + 1,
                    ).get(),
                ),
            )

            CraftingRecipes.shapelessWithFlags(
                output = ModItemVariant(
                    item = BackpackItems.LargeBackpack,
                    meta = i + 201,
                ).get(),
                flags = craftingFlags,
                ingredients = arrayOf(
                    Dyes.VALUES[i],
                    BackpackItems.LargeBackpack.get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BackpackItems.LargeBackpack,
                    meta = i + 201,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf(
                    "RLR",
                    "LBL",
                    "RLR",
                    'R',
                    OrePrefixes.ring.get(Materials.Steel),
                    'L',
                    VanillaItems.Wool.get(),
                    'B',
                    ModItemVariant(
                        item = BackpackItems.MediumBackpack,
                        meta = i + 101,
                    ).get(),
                ),
            )
        }
    }
}
