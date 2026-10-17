package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class EnderIOConduitAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Electrum,
                    count = 4,
                ),
                EnderIOItems.Material1.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = EnderIOItems.ItemConduit.get(amount = 4),
            ticks = 120,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Platinum,
                    count = 4,
                ),
                EnderIOItems.Material1.get(amount = 16),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = EnderIOItems.ItemConduit.get(amount = 16),
            ticks = 160,
            eu = 48,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ConveyorModuleHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Osmium,
                    count = 4,
                ),
                EnderIOItems.Material1.get(amount = 64),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = EnderIOItems.ItemConduit.get(amount = 64),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ElectricPumpLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Steel,
                    count = 4,
                ),
                EnderIOItems.Material1.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = EnderIOItems.LiquidConduit.get(amount = 4),
            ticks = 120,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ElectricPumpMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                EnderIOItems.Material1.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = EnderIOItems.LiquidConduit1.get(amount = 4),
            ticks = 160,
            eu = 48,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ElectricPumpHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Titanium,
                    count = 4,
                ),
                EnderIOItems.Material1.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = EnderIOItems.LiquidConduit2.get(amount = 4),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ElectricPumpEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                EnderIOItems.Material1.get(amount = 16),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = EnderIOItems.LiquidConduit2.get(amount = 16),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.ElectricPumpIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.NiobiumTitanium,
                    count = 4,
                ),
                EnderIOItems.Material1.get(amount = 64),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = EnderIOItems.LiquidConduit2.get(amount = 64),
            ticks = 400,
            eu = 1920,
        )
    }
}
