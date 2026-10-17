package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials

internal class AE2CraftingStorageAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.Item1kMEStorageComponent.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = AE2Items.Item1kCraftingStorage.get(),
            ticks = 1200,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.Item4kMEStorageComponent.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = AE2Items.Item4kCraftingStorage.get(),
            ticks = 1200,
            eu = 250,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.Item16kMEStorageComponent.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(2304),
            output = AE2Items.Item16kCraftingStorage.get(),
            ticks = 1200,
            eu = 1020,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.Item64kMEStorageComponent.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(9216),
            output = AE2Items.Item64kCraftingStorage.get(),
            ticks = 1200,
            eu = 4090,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.Item256kMEStorageComponent.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(9216),
            output = AE2Items.Item256kCraftingStorage.get(),
            ticks = 1200,
            eu = 16350,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.Item1024kMEStorageComponent.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(18432),
            output = AE2Items.Item1024kCraftingStorage.get(),
            ticks = 1200,
            eu = 60570,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.Item4096kMEStorageComponent.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(36864),
            output = AE2Items.Item4096kCraftingStorage.get(),
            ticks = 1200,
            eu = 240630,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.StorageComponent16384k.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(36864),
            output = AE2Items.Item16384kCraftingStorage.get(),
            ticks = 1200,
            eu = 1034200,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.SingularityStorageCell.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(73728),
            output = AE2Items.SingularityCraftingStorage.get(),
            ticks = 6400,
            eu = 4136800,
        )
    }
}
