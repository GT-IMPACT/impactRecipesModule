package com.impactrecipes.recipes.jabba

import com.impactrecipes.items.JabbaItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class JabbaAutomationUpgradeRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.RedstoneUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "TBT",
                "PTP",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'B',
                OrePrefixes.block.get(Materials.Redstone),
                'T',
                VanillaItems.Piston.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.HopperUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "TBT",
                "PTP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                VanillaItems.Hopper.get(),
                'T',
                VanillaItems.Piston.get(),
            ),
        )
    }
}
