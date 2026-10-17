package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechCastingRecipes {

    internal fun register() {
        MachineRecipes.fluidSolidifier(
            mold = GregTechItems.ShapeMoldBall.get(amount = 0),
            fluidInput = Materials.Sunnarium.getMolten(144L),
            output = ImpactItems.SunnariumPiece.get(),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.fluidSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = Materials.DraconiumPlasma.getFluid(144L),
            output = Materials.Draconium.item(OrePrefixes.ingotHot).get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.fluidSolidifier(
            mold = GregTechItems.ShapeMoldIngot.get(amount = 0),
            fluidInput = Materials.DraconiumAwakenedPlasma.getFluid(144L),
            output = Materials.DraconiumAwakened.item(OrePrefixes.ingotHot).get(),
            ticks = 400,
            eu = 500000,
        )

        MachineRecipes.fluidSolidifier(
            mold = VanillaItems.Glass.get(),
            fluidInput = Materials.BorosilicateGlass.getMolten(144L),
            output = ImpactItems.IndustrialGlass0.get(),
            ticks = 200,
            eu = 2,
        )
    }
}
