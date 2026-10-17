package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftUtilityTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailAdvanced.get(amount = 2),
                VanillaItems.Fence.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackGatedOneway.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailAdvanced.get(amount = 4),
                VanillaItems.Fence.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackGatedOneway.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailAdvanced.get(amount = 6),
                VanillaItems.Fence.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackGatedOneway.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailStandard.get(amount = 2),
                VanillaItems.Fence.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackGated.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailStandard.get(amount = 4),
                VanillaItems.Fence.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackGated.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailStandard.get(amount = 6),
                VanillaItems.Fence.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackGated.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.TieWood.get(amount = 3),
                RailcraftItems.RailStandard.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSuspended.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.TieStone.get(amount = 3),
                RailcraftItems.RailStandard.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSuspended.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(8),
                RailcraftItems.TieWood.get(amount = 2),
                RailcraftItems.RailStandard.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackDisposal.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(8),
                RailcraftItems.TieStone.get(amount = 2),
                RailcraftItems.RailStandard.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackDisposal.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailReinforced.get(amount = 2),
                VanillaItems.FlintAndSteel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackPriming.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailReinforced.get(amount = 4),
                VanillaItems.FlintAndSteel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackPriming.get(amount = 10),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.TrackReinforced.get(),
                VanillaItems.Piston.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLauncher.get(amount = 4),
            ticks = 200,
            eu = 6,
        )
    }
}
