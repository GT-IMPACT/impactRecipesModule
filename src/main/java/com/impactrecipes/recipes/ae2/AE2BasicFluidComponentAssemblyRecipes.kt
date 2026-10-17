package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2BasicFluidComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitChipRam.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lapis,
                    count = 4,
                ),
                ImpactItems.EngineeringProcessorFluidGoldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.FluidStorageComponent1k.get(),
            ticks = 120,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitChipNAND.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lapis,
                    count = 4,
                ),
                ImpactItems.GoldFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.FluidStorageComponent1k.get(),
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
                AE2FCItems.FluidStorageComponent1k.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 4),
                ImpactItems.EngineeringProcessorFluidGoldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item4kMEFluidStorageComponent.get(),
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
                AE2FCItems.FluidStorageComponent1k.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 3),
                ImpactItems.GoldFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item4kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item4kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 4),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item16kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item4kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 3),
                ImpactItems.DiamondFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item16kMEFluidStorageComponent.get(),
            ticks = 260,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitChipRam.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lapis,
                    count = 32,
                ),
                GregTechItems.CircuitChipSoC.get(),
                ImpactItems.DiamondFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Europium.getMolten(36),
            output = AE2FCItems.Item16kMEFluidStorageComponent.get(),
            ticks = 30,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitChipNAND.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Lapis,
                    count = 16,
                ),
                GregTechItems.CircuitChipSoC2.get(),
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2FCItems.Item16kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item16kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 4),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item64kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item16kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 3),
                ImpactItems.DiamondFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item64kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item16kMEFluidStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC.get(),
                ImpactItems.DiamondFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Europium.getMolten(36),
            output = AE2FCItems.Item64kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item16kMEFluidStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC2.get(),
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2FCItems.Item64kMEFluidStorageComponent.get(),
            ticks = 30,
            eu = 122880,
        )
    }
}
