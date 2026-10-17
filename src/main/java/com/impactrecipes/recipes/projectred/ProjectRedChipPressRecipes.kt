package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.util.MachineRecipes

internal class ProjectRedChipPressRecipes {

    internal fun register() {
        MachineRecipes.formingPress(
            input = ProjectRedItems.ProjectredCorePart.get(),
            secondaryInput = ProjectRedItems.ProjectredCorePart13.get(),
            output = ProjectRedItems.ProjectredCorePart7.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = ProjectRedItems.ProjectredCorePart42.get(),
            secondaryInput = GregTechItems.ShapeMoldBall.get(amount = 0),
            output = ProjectRedItems.ProjectredCorePart13.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = ProjectRedItems.ProjectredCorePart.get(),
            secondaryInput = ProjectRedItems.ProjectredCorePart14.get(),
            output = ProjectRedItems.ProjectredCorePart8.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.formingPress(
            input = ProjectRedItems.ProjectredCorePart43.get(),
            secondaryInput = GregTechItems.ShapeMoldBall.get(amount = 0),
            output = ProjectRedItems.ProjectredCorePart14.get(),
            ticks = 600,
            eu = 30,
        )
    }
}
