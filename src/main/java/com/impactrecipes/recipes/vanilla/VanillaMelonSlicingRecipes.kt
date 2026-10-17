package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes

internal class VanillaMelonSlicingRecipes {

    internal fun register() {
        MachineRecipes.slicer(
            input = VanillaItems.MelonBlock.get(),
            blade = GregTechItems.ShapeSlicerFlat.get(amount = 0),
            output = VanillaItems.Melon.get(amount = 8),
            ticks = 128,
            eu = 4,
        )
    }
}
