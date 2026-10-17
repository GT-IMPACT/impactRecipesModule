package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes

internal class GalacticraftExtrusionRecipes {

    internal fun register() {
        MachineRecipes.extruder(
            input = IC2Items.ReinforcedGlass.get(),
            mold = GregTechItems.ShapeExtruderPipeSmall.get(amount = 0),
            output = GalacticraftCoreItems.TileOxygenPipe.get(amount = 2),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.extruder(
            input = GalacticraftCoreItems.ItemBasicItem7.get(amount = 2),
            mold = GregTechItems.ShapeExtruderCell.get(amount = 0),
            output = GalacticraftCoreItems.ItemCanister.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.extruder(
            input = GalacticraftCoreItems.ItemBasicItem6.get(amount = 2),
            mold = GregTechItems.ShapeExtruderCell.get(amount = 0),
            output = GalacticraftCoreItems.ItemCanister1.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.extruder(
            input = GalacticraftCoreItems.ItemBasicItem9.get(amount = 2),
            mold = GregTechItems.ShapeExtruderBolt.get(amount = 0),
            output = GalacticraftCoreItems.ItemSteelPole.get(),
            ticks = 600,
            eu = 30,
        )
    }
}
