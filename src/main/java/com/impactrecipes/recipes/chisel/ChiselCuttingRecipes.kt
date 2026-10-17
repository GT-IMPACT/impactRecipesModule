package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class ChiselCuttingRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = VanillaItems.Carpet.get(),
            output = ChiselItems.RoadLine.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 8,
        )
    }
}
