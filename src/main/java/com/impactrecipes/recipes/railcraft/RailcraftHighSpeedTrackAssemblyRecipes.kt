package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftHighSpeedTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailSpeed.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSpeed.get(amount = 8),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailSpeed.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSpeed.get(amount = 20),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(5),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailSpeed.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSpeedBoost.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(10),
                RailcraftItems.TrackSpeed.get(),
                RailcraftItems.RailSpeed.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
            output = RailcraftItems.TrackSpeedSwitch.get(amount = 2),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(15),
                RailcraftItems.TrackSpeed.get(),
                RailcraftItems.RailSpeed.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 1,
                ),
            ),
            output = RailcraftItems.TrackSpeedWye.get(amount = 2),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(20),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailSpeed.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSpeedTransition.get(amount = 4),
            ticks = 200,
            eu = 6,
        )
    }
}
