package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class ForestryHoneyCastingRecipes {

    internal fun register() {
        MachineRecipes.fluidSolidifier(
            mold = GregTechItems.ShapeMoldNugget.get(),
            fluidInput = FluidStack(
                FluidRegistry.getFluid("for.honey"),
                200,
            ),
            output = ForestryItems.HoneyDrop.get(),
            ticks = 400,
            eu = 8,
        )
    }
}
