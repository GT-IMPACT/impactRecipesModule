package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2AdvancedStorageComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                AE2Items.Item64kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 4),
                ImpactItems.EngineeringProcessorItemEmeraldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item256kMEStorageComponent.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 3,
                ),
                AE2Items.Item64kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 3),
                ImpactItems.EmeraldAdvancedCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item256kMEStorageComponent.get(),
            ticks = 280,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 3,
                ),
                AE2Items.Item64kMEStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC2.get(),
                ImpactItems.EmeraldAdvancedCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2Items.Item256kMEStorageComponent.get(),
            ticks = 30,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
                AE2Items.Item64kMEStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC3.get(),
                ImpactItems.EngravedEnergyChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = AE2Items.Item256kMEStorageComponent.get(),
            ticks = 30,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                AE2Items.Item256kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 4),
                ImpactItems.EngineeringProcessorItemEmeraldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item1024kMEStorageComponent.get(),
            ticks = 220,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 3,
                ),
                AE2Items.Item256kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 3),
                ImpactItems.EmeraldAdvancedCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item1024kMEStorageComponent.get(),
            ticks = 300,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 3,
                ),
                AE2Items.Item256kMEStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC2.get(),
                ImpactItems.EmeraldAdvancedCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2Items.Item1024kMEStorageComponent.get(),
            ticks = 30,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 1,
                ),
                AE2Items.Item256kMEStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC3.get(),
                ImpactItems.EngravedEnergyChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = AE2Items.Item1024kMEStorageComponent.get(),
            ticks = 30,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                AE2Items.Item1024kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 4),
                ImpactItems.EngineeringProcessorItemAdvEmeraldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item4096kMEStorageComponent.get(),
            ticks = 240,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 3,
                ),
                AE2Items.Item1024kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 3),
                ImpactItems.EmeraldHighAdvancedCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item4096kMEStorageComponent.get(),
            ticks = 320,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 3,
                ),
                AE2Items.Item1024kMEStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC3.get(),
                ImpactItems.EmeraldHighAdvancedCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = AE2Items.Item4096kMEStorageComponent.get(),
            ticks = 30,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 1,
                ),
                AE2Items.Item1024kMEStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC4.get(),
                ImpactItems.EngravedQuantumChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Phoenixite.getMolten(36),
            output = AE2Items.Item4096kMEStorageComponent.get(),
            ticks = 30,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                AE2Items.Item4096kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 4),
                ImpactItems.EngineeringProcessorItemAdvEmeraldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.StorageComponent16384k.get(),
            ticks = 260,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 3,
                ),
                AE2Items.Item4096kMEStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 3),
                ImpactItems.EmeraldHighAdvancedCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.StorageComponent16384k.get(),
            ticks = 340,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 3,
                ),
                AE2Items.Item4096kMEStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC3.get(),
                ImpactItems.EmeraldHighAdvancedCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = AE2Items.StorageComponent16384k.get(),
            ticks = 30,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 1,
                ),
                AE2Items.Item4096kMEStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC4.get(),
                ImpactItems.EngravedQuantumChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Phoenixite.getMolten(36),
            output = AE2Items.StorageComponent16384k.get(),
            ticks = 30,
            eu = 2000000,
        )
    }
}
