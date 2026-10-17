package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.BuildCraftTransportItems
import com.impactrecipes.util.MachineRecipes

internal class BuildCraftPipeCuttingRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = BuildCraftTransportItems.ItemBuildcraftPipePipestructurecobblestone.get(),
            output = BuildCraftTransportItems.PipePlug.get(amount = 6),
            secondaryOutput = null,
            ticks = 100,
            eu = 30,
            cleanroom = false,
        )
    }
}
