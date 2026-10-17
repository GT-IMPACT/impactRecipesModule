package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.util.MachineRecipes

internal class AE2MultiFluidCellAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = AE2FCItems.MEMultiFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.FluidStorageComponent1k.get(),
            output = AE2FCItems.Item1kMEMultiFluidStorageCell.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEMultiFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item4kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item4kMEMultiFluidStorageCell.get(),
            ticks = 100,
            eu = 250,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEMultiFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item16kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item16kMEMultiFluidStorageCell.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEMultiFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item64kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item64kMEMultiFluidStorageCell.get(),
            ticks = 100,
            eu = 1020,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEAdvancedMultiFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item256kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item256kMEMultiFluidStorageCell.get(),
            ticks = 100,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEAdvancedMultiFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item1024kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item1024kMEMultiFluidStorageCell.get(),
            ticks = 100,
            eu = 16324,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEAdvancedMultiFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item4096kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item4096kMEMultiFluidStorageCell.get(),
            ticks = 100,
            eu = 30720,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEAdvancedMultiFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item16384kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item16384kMEMultiFluidStorageCell.get(),
            ticks = 100,
            eu = 65524,
        )
    }
}
