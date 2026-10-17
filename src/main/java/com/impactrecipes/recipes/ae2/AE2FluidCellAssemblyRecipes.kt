package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.util.MachineRecipes

internal class AE2FluidCellAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = AE2FCItems.FluidStorageHousing.get(),
            secondaryInput = AE2FCItems.FluidStorageComponent1k.get(),
            output = AE2FCItems.Item1kMEFluidStorageCell.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.FluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item4kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item4kMEFluidStorageCell.get(),
            ticks = 100,
            eu = 250,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.FluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item16kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item16kMEFluidStorageCell.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.FluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item64kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item64kMEFluidStorageCell.get(),
            ticks = 100,
            eu = 1020,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEAdvancedFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item256kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item256kMEFluidStorageCell.get(),
            ticks = 100,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEAdvancedFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item1024kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item1024kMEFluidStorageCell.get(),
            ticks = 100,
            eu = 16324,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEAdvancedFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item4096kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item4096kMEFluidStorageCell.get(),
            ticks = 100,
            eu = 30720,
        )

        MachineRecipes.assembler(
            input = AE2FCItems.MEAdvancedFluidStorageHousing.get(),
            secondaryInput = AE2FCItems.Item16384kMEFluidStorageComponent.get(),
            output = AE2FCItems.Item16384kMEFluidStorageCell.get(),
            ticks = 100,
            eu = 65524,
        )
    }
}
