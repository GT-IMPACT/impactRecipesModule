package com.impactrecipes.recipes.stevesfactorymanager

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.StevesFactoryManagerItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class FactoryManagerCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = StevesFactoryManagerItems.Manager.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "PTP",
                "RDR",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'T',
                ImpactItems.LargeScreen.get(),
                'D',
                GregTechItems.CasingProcessor.get(),
                'C',
                StevesFactoryManagerItems.InventoryCable.get(),
            ),
        )
    }
}
