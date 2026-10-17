package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes

internal class ForestryWaxSmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = ForestryItems.Beeswax.get(amount = 9),
            secondaryInput = GregTechItems.ShapeMoldBlock.get(amount = 0),
            output = ForestryItems.WaxCast.get(),
            ticks = 200,
            eu = 16,
        )

        MachineRecipes.alloySmelter(
            input = ForestryItems.RefractoryWax.get(amount = 9),
            secondaryInput = GregTechItems.ShapeMoldBlock.get(amount = 0),
            output = ForestryItems.WaxCast.get(),
            ticks = 200,
            eu = 16,
        )
    }
}
