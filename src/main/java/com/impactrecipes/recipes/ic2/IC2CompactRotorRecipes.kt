package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.CompactKineticGeneratorsItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class IC2CompactRotorRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = CompactKineticGeneratorsItems.IridiumRotor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dBS",
                "BAB",
                "SBw",
                'S',
                OrePrefixes.screw.get(Materials.Lafium),
                'B',
                CompactKineticGeneratorsItems.IridiumBlade.get(),
                'A',
                IC2Items.Steelshaft.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CompactKineticGeneratorsItems.IridiumBlade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "PRP",
                "PPP",
                'R',
                OrePrefixes.ring.get(Materials.Lafium),
                'P',
                IC2Items.IridiumPlate.get(),
            ),
        )
    }
}
