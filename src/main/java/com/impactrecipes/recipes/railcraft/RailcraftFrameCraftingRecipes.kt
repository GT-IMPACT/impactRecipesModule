package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftFrameCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.WireSupportFrame.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "RPR",
                "IwI",
                "III",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'R',
                OrePrefixes.plate.get(Materials.Rubber),
                'I',
                RailcraftItems.RebarRegistry.get(),
            ),
        )
    }
}
