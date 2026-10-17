package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftReinforcedTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailReinforced.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Birmabright,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackReinforced.get(amount = 8),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailReinforced.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackReinforced.get(amount = 20),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(5),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailReinforced.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Birmabright,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackReinforcedBooster.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(5),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailReinforced.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackReinforcedBooster.get(amount = 10),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(10),
                RailcraftItems.TrackReinforced.get(),
                RailcraftItems.RailReinforced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Birmabright,
                    count = 1,
                ),
            ),
            output = RailcraftItems.TrackReinforcedSwitch.get(amount = 2),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(15),
                RailcraftItems.TrackReinforced.get(),
                RailcraftItems.RailReinforced.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Birmabright,
                    count = 1,
                ),
            ),
            output = RailcraftItems.TrackReinforcedWye.get(amount = 2),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(20),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailReinforced.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Birmabright,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackReinforcedJunction.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(20),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailReinforced.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackReinforcedJunction.get(amount = 10),
            ticks = 300,
            eu = 8,
        )
    }
}
