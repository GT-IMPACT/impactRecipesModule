package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes

internal class GalaxySpaceGlowstoneCompressionRecipes {

    internal fun register() {
        MachineRecipes.compressor(
            input = GalaxySpaceItems.ItemGlowstoneDusts.get(amount = 4),
            output = GalaxySpaceItems.Dungeonglowstone.get(),
            ticks = 200,
            eu = 8,
        )

        MachineRecipes.compressor(
            input = GalaxySpaceItems.ItemGlowstoneDusts1.get(amount = 4),
            output = GalaxySpaceItems.Dungeonglowstone1.get(),
            ticks = 200,
            eu = 8,
        )
    }
}
