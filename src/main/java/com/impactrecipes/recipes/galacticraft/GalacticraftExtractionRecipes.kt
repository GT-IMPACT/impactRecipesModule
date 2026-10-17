package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.util.MachineRecipes

internal class GalacticraftExtractionRecipes {

    internal fun register() {
        MachineRecipes.extractor(
            input = GalacticraftMarsItems.ItemThermalPadding.get(),
            output = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(amount = 5),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.extractor(
            input = GalacticraftMarsItems.ItemThermalPadding1.get(),
            output = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(amount = 8),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.extractor(
            input = GalacticraftMarsItems.ItemThermalPadding2.get(),
            output = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(amount = 7),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.extractor(
            input = GalacticraftMarsItems.ItemThermalPadding3.get(),
            output = GalacticraftMarsItems.ItemItemBasicAsteroids7.get(amount = 4),
            ticks = 300,
            eu = 2,
        )
    }
}
