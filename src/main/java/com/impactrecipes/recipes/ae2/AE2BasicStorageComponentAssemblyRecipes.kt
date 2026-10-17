package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2BasicStorageComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitChipRam.get(amount = 4),
                ImpactItems.ChargedQuartzDust.get(amount = 4),
                ImpactItems.LogicProcessorItemGoldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item1kMEStorageComponent.get(),
            ticks = 120,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitChipNAND.get(amount = 3),
                ImpactItems.ChargedQuartzDust.get(amount = 4),
                ImpactItems.GoldCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item1kMEStorageComponent.get(),
            ticks = 160,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 4,
                ),
                AE2Items.Item1kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 4),
                ImpactItems.LogicProcessorItemGoldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item4kMEStorageComponent.get(),
            ticks = 160,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 3,
                ),
                AE2Items.Item1kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 3),
                ImpactItems.GoldCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item4kMEStorageComponent.get(),
            ticks = 240,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                AE2Items.Item4kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 4),
                ImpactItems.EngineeringProcessorItemDiamondCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item16kMEStorageComponent.get(),
            ticks = 180,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 3,
                ),
                AE2Items.Item4kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 3),
                ImpactItems.DiamondCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item16kMEStorageComponent.get(),
            ticks = 260,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitChipRam.get(amount = 32),
                AE2Items.FluixDust.get(amount = 32),
                GregTechItems.CircuitChipSoC.get(),
                ImpactItems.DiamondCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Europium.getMolten(36),
            output = AE2Items.Item16kMEStorageComponent.get(),
            ticks = 30,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitChipNAND.get(amount = 16),
                AE2Items.FluixDust.get(amount = 16),
                GregTechItems.CircuitChipSoC2.get(),
                ImpactItems.EngravedDiamondCrystalChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2Items.Item16kMEStorageComponent.get(),
            ticks = 30,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                AE2Items.Item16kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 4),
                ImpactItems.EngineeringProcessorItemDiamondCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item64kMEStorageComponent.get(),
            ticks = 200,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 3,
                ),
                AE2Items.Item16kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 3),
                ImpactItems.DiamondCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item64kMEStorageComponent.get(),
            ticks = 280,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 3,
                ),
                AE2Items.Item16kMEStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC.get(),
                ImpactItems.DiamondCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Europium.getMolten(36),
            output = AE2Items.Item64kMEStorageComponent.get(),
            ticks = 30,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                AE2Items.Item16kMEStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC2.get(),
                ImpactItems.EngravedDiamondCrystalChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2Items.Item64kMEStorageComponent.get(),
            ticks = 30,
            eu = 122880,
        )
    }
}
