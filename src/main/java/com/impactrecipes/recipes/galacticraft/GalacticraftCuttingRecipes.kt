package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class GalacticraftCuttingRecipes {

    internal fun register() {
        MachineRecipes.cutter(
            input = GalacticraftCoreItems.TileGcBlockCore4.get(),
            output = GalacticraftCoreItems.SlabGCHalf.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = GalacticraftCoreItems.TileGcBlockCore3.get(),
            output = GalacticraftCoreItems.SlabGCHalf1.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = GalacticraftCoreItems.TileMoonBlock4.get(),
            output = GalacticraftCoreItems.SlabGCHalf2.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = GalacticraftCoreItems.TileMoonBlock14.get(),
            output = GalacticraftCoreItems.SlabGCHalf3.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = GalacticraftMarsItems.TileMars4.get(),
            output = GalacticraftCoreItems.SlabGCHalf4.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 8,
        )

        MachineRecipes.cutter(
            input = GalacticraftMarsItems.TileMars7.get(),
            output = GalacticraftCoreItems.SlabGCHalf5.get(amount = 2),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 8,
        )
    }
}
