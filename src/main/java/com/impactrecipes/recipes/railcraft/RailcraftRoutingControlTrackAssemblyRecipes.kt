package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftRoutingControlTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                RailcraftItems.Ticket.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackRouting.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                RailcraftItems.TicketGold.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackRouting.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                RailcraftItems.Ticket.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackRouting.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                RailcraftItems.TicketGold.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackRouting.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                RailcraftItems.Ticket.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackRouting.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                RailcraftItems.TicketGold.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackRouting.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackBufferStop.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackBufferStop.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackBufferStop.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                VanillaItems.Piston.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackOneway.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                VanillaItems.Piston.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackOneway.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                VanillaItems.Piston.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackOneway.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackDetectorDirection.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackDetectorDirection.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackDetectorDirection.get(amount = 16),
            ticks = 400,
            eu = 12,
        )
    }
}
