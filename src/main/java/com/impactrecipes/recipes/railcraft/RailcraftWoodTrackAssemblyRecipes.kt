package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class RailcraftWoodTrackAssemblyRecipes {

    internal fun register() {
        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailWood.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlow.get(amount = 8),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailWood.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlow.get(amount = 16),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(1),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailWood.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlow.get(amount = 32),
            ticks = 600,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(5),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailAdvanced.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlowBooster.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(5),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailAdvanced.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlowBooster.get(amount = 8),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(5),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailAdvanced.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlowBooster.get(amount = 16),
            ticks = 600,
            eu = 12,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(10),
                RailcraftItems.TrackSlow.get(),
                RailcraftItems.RailWood.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Iron,
                    count = 1,
                ),
            ),
            output = RailcraftItems.TrackSlowSwitch.get(amount = 2),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(15),
                RailcraftItems.TrackSlow.get(),
                RailcraftItems.RailWood.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Iron,
                    count = 1,
                ),
            ),
            output = RailcraftItems.TrackSlowWye.get(amount = 2),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(20),
                RailcraftItems.RailbedWood.get(),
                RailcraftItems.RailWood.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Iron,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlowJunction.get(amount = 4),
            ticks = 200,
            eu = 6,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(20),
                RailcraftItems.RailbedStone.get(),
                RailcraftItems.RailWood.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlowJunction.get(amount = 8),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.trackAssembler(
            inputs = arrayOf(
                GT_Utility.getIntegratedCircuit(20),
                ImpactItems.ConcreteRailbed.get(),
                RailcraftItems.RailWood.get(amount = 10),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            output = RailcraftItems.TrackSlowJunction.get(amount = 16),
            ticks = 600,
            eu = 12,
        )
    }
}
