package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility

internal class RailcraftRailbedAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RailcraftItems.TieWood.get(amount = 4),
            secondaryInput = ModItemVariant(
                item = GregTechItems.CircuitIntegrated,
                meta = 4,
            ).get(amount = 0),
            output = RailcraftItems.RailbedWood.get(),
            ticks = 100,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = RailcraftItems.TieStone.get(amount = 4),
            secondaryInput = ModItemVariant(
                item = GregTechItems.CircuitIntegrated,
                meta = 4,
            ).get(amount = 0),
            output = RailcraftItems.RailbedStone.get(),
            ticks = 100,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.ConcreteTie.get(amount = 4),
                ImpactItems.UtilityBlock.get(),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = ImpactItems.ConcreteRailbed.get(),
            ticks = 200,
            eu = 8,
        )
    }
}
