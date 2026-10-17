package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes

internal class IC2UraniumSmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = IC2Items.Uran235.get(),
            secondaryInput = GregTechItems.ShapeMoldNugget.get(amount = 0),
            output = IC2Items.SmallUran235.get(amount = 9),
            ticks = 100,
            eu = 120,
        )
    }
}
