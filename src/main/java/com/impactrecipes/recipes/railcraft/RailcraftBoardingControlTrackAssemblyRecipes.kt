package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftBoardingControlTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailAdvanced.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackControl.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailAdvanced.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackControl.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailAdvanced.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackControl.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailAdvanced.get(amount = 2),
                VanillaItems.StonePressurePlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLocking.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailAdvanced.get(amount = 4),
                VanillaItems.StonePressurePlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLocking.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailAdvanced.get(amount = 6),
                VanillaItems.StonePressurePlate.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackLocking.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailAdvanced.get(amount = 2),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackDisembark.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailAdvanced.get(amount = 4),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackDisembark.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailAdvanced.get(amount = 6),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackDisembark.get(amount = 16),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(8),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailAdvanced.get(amount = 2),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackEmbarking.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailAdvanced.get(amount = 4),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackEmbarking.get(amount = 8),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(7),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailAdvanced.get(amount = 6),
                RailcraftItems.DetectorAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSLA,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackEmbarking.get(amount = 16),
            ticks = 400,
            eu = 12,
        )
    }
}
