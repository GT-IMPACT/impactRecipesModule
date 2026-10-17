package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes

internal class IC2DustPackagingRecipes {

    internal fun register() {
        MachineRecipes.boxing(
            input = ImpactItems.DustSmallFertilizer.get(amount = 4),
            schematic = GregTechItems.SchematicDust.get(amount = 0),
            output = IC2Items.Fertilizer.get(),
            ticks = 100,
            eu = 4,
        )

        MachineRecipes.boxing(
            input = ImpactItems.DustTinyFertilizer.get(amount = 9),
            schematic = GregTechItems.SchematicDust.get(amount = 0),
            output = IC2Items.Fertilizer.get(),
            ticks = 100,
            eu = 4,
        )
    }
}
