package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.util.MachineRecipes

internal class AE2AdvancedCellAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = AE2Items.MEAdvancedStorageHousing.get(),
            secondaryInput = AE2Items.Item256kMEStorageComponent.get(),
            output = AE2Items.Item256kMEStorageCell.get(),
            ticks = 100,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEAdvancedStorageHousing.get(),
            secondaryInput = AE2Items.Item1024kMEStorageComponent.get(),
            output = AE2Items.Item1024kMEStorageCell.get(),
            ticks = 100,
            eu = 16324,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEAdvancedStorageHousing.get(),
            secondaryInput = AE2Items.Item4096kMEStorageComponent.get(),
            output = AE2Items.Item4096kMEStorageCell.get(),
            ticks = 100,
            eu = 30720,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEAdvancedStorageHousing.get(),
            secondaryInput = AE2Items.StorageComponent16384k.get(),
            output = AE2Items.Item16384kMEStorageCell.get(),
            ticks = 100,
            eu = 65524,
        )
    }
}
