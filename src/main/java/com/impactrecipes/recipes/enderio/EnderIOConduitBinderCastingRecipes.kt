package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials

internal class EnderIOConduitBinderCastingRecipes {

    internal fun register() {
        MachineRecipes.fluidSolidifier(
            mold = GregTechItems.ShapeMoldBall.get(amount = 0),
            fluidInput = Materials.Concrete.getMolten(36),
            output = EnderIOItems.Material1.get(),
            ticks = 20,
            eu = 4,
        )
    }
}
