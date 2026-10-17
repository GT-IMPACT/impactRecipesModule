package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.util.MachineRecipes

internal class GalacticraftCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = GalacticraftCoreItems.TileFallenMeteor.get(),
            outputs = arrayOf(
                GalacticraftCoreItems.ItemMeteoricIronRaw.get(amount = 2),
            ),
            chances = intArrayOf(
                10000,
            ),
            ticks = 300,
            eu = 2,
        )
    }
}
