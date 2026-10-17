package com.impactrecipes.recipes.ztones

import com.impactrecipes.items.ProjectRedIlluminationItems
import com.impactrecipes.items.ZtonesItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class ZtonesLampCuttingRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = ProjectRedIlluminationItems.ProjectredIlluminationLamp16.get(),
            output = ZtonesItems.Lampf.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 200,
            eu = 4,
        )

        MachineRecipes.cutter(
            input = ProjectRedIlluminationItems.ProjectredIlluminationLamp24.get(),
            output = ZtonesItems.Lampt.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 200,
            eu = 4,
        )

        MachineRecipes.cutter(
            input = ProjectRedIlluminationItems.ProjectredIlluminationLamp23.get(),
            output = ZtonesItems.Lampb.get(amount = 4),
            secondaryOutput = GT_Values.NI,
            ticks = 200,
            eu = 4,
        )
    }
}
