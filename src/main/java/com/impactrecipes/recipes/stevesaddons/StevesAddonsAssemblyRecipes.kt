package com.impactrecipes.recipes.stevesaddons

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.StevesAddonsItems
import com.impactrecipes.items.StevesFactoryManagerItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class StevesAddonsAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                EnderIOItems.PowerConduit.get(),
                // Circuit 1 collides with Advanced Cable Cluster during GregTech's registration check.
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Redstone.getMolten(288),
            output = StevesAddonsItems.RFNode.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ToolScanner.get(),
                GregTechItems.ToolDataStick.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(144),
            output = StevesAddonsItems.ManagerDuplicator.get(),
            ticks = 150,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.LargeScreen.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Redstone.getMolten(144),
            output = StevesAddonsItems.FactoryLabeler.get(),
            ticks = 150,
            eu = 480,
        )
    }
}
