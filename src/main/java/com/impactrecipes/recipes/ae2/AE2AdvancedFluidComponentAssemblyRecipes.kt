package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2AdvancedFluidComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                AE2FCItems.Item64kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 4),
                ImpactItems.EngineeringProcessorFluidEmeraldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item256kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item64kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 3),
                ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item256kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item64kMEFluidStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC2.get(),
                ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2FCItems.Item256kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item64kMEFluidStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC3.get(),
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = AE2FCItems.Item256kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item256kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 4),
                ImpactItems.EngineeringProcessorFluidEmeraldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item1024kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item256kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 3),
                ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item1024kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item256kMEFluidStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC2.get(),
                ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2FCItems.Item1024kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item256kMEFluidStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC3.get(),
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = AE2FCItems.Item1024kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item1024kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 4),
                ImpactItems.EngineeringProcessorFluidEmeraldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item4096kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item1024kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 3),
                ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item4096kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item1024kMEFluidStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC3.get(),
                ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = AE2FCItems.Item4096kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item1024kMEFluidStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC4.get(),
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Phoenixite.getMolten(36),
            output = AE2FCItems.Item4096kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item4096kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNAND.get(amount = 4),
                ImpactItems.EngineeringProcessorFluidEmeraldCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item16384kMEFluidStorageComponent.get(),
            ticks = 240,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 3,
                ),
                AE2FCItems.Item4096kMEFluidStorageComponent.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 3),
                ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2FCItems.Item16384kMEFluidStorageComponent.get(),
            ticks = 320,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 3,
                ),
                AE2FCItems.Item4096kMEFluidStorageComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC3.get(),
                ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Neutronium.getMolten(36),
            output = AE2FCItems.Item16384kMEFluidStorageComponent.get(),
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
                AE2FCItems.Item4096kMEFluidStorageComponent.get(amount = 2),
                GregTechItems.CircuitChipSoC4.get(),
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Phoenixite.getMolten(36),
            output = AE2FCItems.Item16384kMEFluidStorageComponent.get(),
            ticks = 30,
            eu = 2000000,
        )
    }
}
