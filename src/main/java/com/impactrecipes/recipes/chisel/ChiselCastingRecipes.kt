package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials

internal class ChiselCastingRecipes {

    internal fun register() {
        MachineRecipes.fluidSolidifier(
            mold = VanillaItems.Stone.get(amount = 8),
            fluidInput = Materials.Lava.getFluid(1000),
            output = ChiselItems.Lavastone.get(amount = 16),
            ticks = 200,
            eu = 2,
        )

        MachineRecipes.fluidSolidifier(
            mold = GregTechItems.LightConcrete.get(amount = 8),
            fluidInput = Materials.Lava.getFluid(1000),
            output = ChiselItems.Lavastone.get(amount = 32),
            ticks = 200,
            eu = 2,
        )

        MachineRecipes.fluidSolidifier(
            mold = VanillaItems.Stone.get(amount = 8),
            fluidInput = Materials.Water.getFluid(1000),
            output = ChiselItems.Waterstone.get(amount = 16),
            ticks = 200,
            eu = 2,
        )

        MachineRecipes.fluidSolidifier(
            mold = GregTechItems.LightConcrete.get(amount = 8),
            fluidInput = Materials.Water.getFluid(1000),
            output = ChiselItems.Waterstone.get(amount = 32),
            ticks = 200,
            eu = 2,
        )
    }
}
