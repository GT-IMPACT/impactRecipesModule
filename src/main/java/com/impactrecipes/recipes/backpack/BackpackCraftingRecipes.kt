package com.impactrecipes.recipes.backpack

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BackpackCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BackpackItems.BoundLeather.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SLS",
                "LSL",
                "SLS",
                'S',
                VanillaItems.String.get(),
                'L',
                VanillaItems.Leather.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BackpackItems.SmallBackpack.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "WRW",
                "LWL",
                "LLL",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'L',
                BackpackItems.BoundLeather.get(),
                'W',
                VanillaItems.Wool.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BackpackItems.MediumBackpack.get(),
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
                BackpackItems.SmallBackpack.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BackpackItems.LargeBackpack.get(),
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
                BackpackItems.MediumBackpack.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BackpackItems.WorkbenchBackpack.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "WRW",
                "LWL",
                "LBL",
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'L',
                BackpackItems.BoundLeather.get(),
                'W',
                VanillaItems.Wool.get(),
                'B',
                VanillaItems.CraftingTable.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BackpackItems.LargeWorkbenchBackpack.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "RLR",
                "LBL",
                "RCR",
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'L',
                VanillaItems.Wool.get(),
                'B',
                BackpackItems.MediumBackpack.get(),
                'C',
                VanillaItems.CraftingTable.get(),
            ),
        )
    }
}
