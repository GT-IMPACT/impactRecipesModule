package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftElectricTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailElectric.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Copper,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackElectric.get(amount = 8),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailElectric.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.AnnealedCopper,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackElectric.get(amount = 20),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(10),
                RailcraftItems.TrackElectric.get(),
                RailcraftItems.RailElectric.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
            output = RailcraftItems.TrackElectricSwitch.get(amount = 2),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(15),
                RailcraftItems.TrackElectric.get(),
                RailcraftItems.RailElectric.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
            output = RailcraftItems.TrackElectricWye.get(amount = 2),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(20),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailElectric.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Copper,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackElectricJunction.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(20),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailElectric.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.AnnealedCopper,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackElectricJunction.get(amount = 10),
            ticks = 300,
            eu = 8,
        )
    }
}
