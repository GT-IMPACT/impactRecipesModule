package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes

internal class ForestryWaxPressRecipes {

    internal fun register() {
        MachineRecipes.formingPress(
            input = ForestryItems.Beeswax.get(amount = 9),
            secondaryInput = GregTechItems.ShapeMoldBlock.get(amount = 0),
            output = ForestryItems.WaxCast.get(),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = ForestryItems.RefractoryWax.get(amount = 9),
            secondaryInput = GregTechItems.ShapeMoldBlock.get(amount = 0),
            output = ForestryItems.WaxCast.get(),
            ticks = 100,
            eu = 30,
        )
    }
}
