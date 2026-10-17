package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials

internal class GalaxySpaceCanisterFillingRecipes {

    internal fun register() {
        MachineRecipes.fluidCanner(
            input = GalaxySpaceItems.ItemOxygentankT410800.get(),
            output = GalaxySpaceItems.ItemOxygentankT4.get(),
            fluidInput = Materials.Oxygen.getGas(10800),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = GalaxySpaceItems.ItemOxygentankT512600.get(),
            output = GalaxySpaceItems.ItemOxygentankT5.get(),
            fluidInput = Materials.Oxygen.getGas(12600),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = GalaxySpaceItems.ItemOxygentankT614400.get(),
            output = GalaxySpaceItems.ItemOxygentankT6.get(),
            fluidInput = Materials.Oxygen.getGas(14400),
            fluidOutput = GT_Values.NF,
        )
    }
}
