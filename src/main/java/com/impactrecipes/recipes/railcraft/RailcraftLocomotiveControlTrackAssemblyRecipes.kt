package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftLocomotiveControlTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailAdvanced.get(amount = 2),
                RailcraftItems.CrowbarReinforced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackCoupler.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailAdvanced.get(amount = 4),
                RailcraftItems.CrowbarReinforced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackCoupler.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailAdvanced.get(amount = 6),
                RailcraftItems.CrowbarReinforced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackCoupler.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailAdvanced.get(amount = 2),
                RailcraftItems.WhistleTuner.get(),
                GregTechItems.CasingStripesA.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackWhistle.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailAdvanced.get(amount = 4),
                RailcraftItems.WhistleTuner.get(),
                GregTechItems.CasingStripesA.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackWhistle.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailAdvanced.get(amount = 6),
                RailcraftItems.WhistleTuner.get(),
                GregTechItems.CasingStripesA.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackWhistle.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                RailcraftItems.SignalBlockSignal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLocomotive.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                RailcraftItems.SignalBlockSignal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLocomotive.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                RailcraftItems.SignalBlockSignal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLocomotive.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                RailcraftItems.DetectorAny.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLimiter.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                RailcraftItems.DetectorAny.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLimiter.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                RailcraftItems.DetectorAny.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLimiter.get(amount = 16),
            ticks = 400,
            eu = 12,
        )
    }
}
