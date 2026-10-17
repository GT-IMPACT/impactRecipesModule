package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2BasicCellAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.gem,
                material = Materials.CertusQuartz,
                count = 1,
            ),
            output = AE2Items.ViewCell.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = ExtraUtilitiesItems.TrashCan.get(),
            output = AE2Items.VoidMEStorageCell.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = AE2Items.Item1kMEStorageComponent.get(),
            output = AE2Items.Item1kMEStorageCell.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = AE2Items.Item4kMEStorageComponent.get(),
            output = AE2Items.Item4kMEStorageCell.get(),
            ticks = 100,
            eu = 250,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = AE2Items.Item16kMEStorageComponent.get(),
            output = AE2Items.Item16kMEStorageCell.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = AE2Items.Item64kMEStorageComponent.get(),
            output = AE2Items.Item64kMEStorageCell.get(),
            ticks = 100,
            eu = 1020,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = AE2Items.Item2SpatialComponent.get(),
            output = AE2Items.Item2SpatialStorageCell.get(),
            ticks = 200,
            eu = 4092,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = AE2Items.Item16SpatialComponent.get(),
            output = AE2Items.Item16SpatialStorageCell.get(),
            ticks = 300,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = AE2Items.MEStorageHousing.get(),
            secondaryInput = AE2Items.SpatialComponent128.get(),
            output = AE2Items.Item128SpatialStorageCell.get(),
            ticks = 400,
            eu = 16350,
        )
    }
}
