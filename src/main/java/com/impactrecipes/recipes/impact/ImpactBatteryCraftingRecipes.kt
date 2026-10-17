package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ImpactBatteryCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapelessWithFlags(
            output = GregTechItems.EnergyCrystal.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                OrePrefixes.battery.get(Materials.Elite),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = GregTechItems.LapotronCrystal.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                OrePrefixes.battery.get(Materials.Master),
            ),
        )
    }
}
