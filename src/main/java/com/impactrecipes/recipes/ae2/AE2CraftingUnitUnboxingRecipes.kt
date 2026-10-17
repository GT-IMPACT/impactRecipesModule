package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes

internal class AE2CraftingUnitUnboxingRecipes {

    internal fun register() {
        MachineRecipes.unboxing(
            input = AE2Items.Item1kCraftingStorage.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = AE2Items.Item1kMEStorageComponent.get(),
            ticks = 50,
            eu = 15,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item4kCraftingStorage.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = AE2Items.Item4kMEStorageComponent.get(),
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item16kCraftingStorage.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = AE2Items.Item16kMEStorageComponent.get(),
            ticks = 50,
            eu = 48,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item64kCraftingStorage.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = AE2Items.Item64kMEStorageComponent.get(),
            ticks = 50,
            eu = 60,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item256kCraftingStorage.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = AE2Items.Item256kMEStorageComponent.get(),
            ticks = 50,
            eu = 96,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item1024kCraftingStorage.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = AE2Items.Item1024kMEStorageComponent.get(),
            ticks = 50,
            eu = 120,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item4096kCraftingStorage.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = AE2Items.Item4096kMEStorageComponent.get(),
            ticks = 50,
            eu = 192,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item16384kCraftingStorage.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = AE2Items.StorageComponent16384k.get(),
            ticks = 50,
            eu = 250,
        )

        MachineRecipes.unboxing(
            input = AE2Items.CraftingCoProcessingUnit.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = ImpactItems.Processorx1.get(),
            ticks = 50,
            eu = 15,
        )

        MachineRecipes.unboxing(
            input = AE2Items.QuadCoreCoProcessingUnit.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = ImpactItems.Processorx4.get(),
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item16CoreCoProcessingUnit.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = ImpactItems.Processorx16.get(),
            ticks = 50,
            eu = 48,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item64CoreCoProcessingUnit.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = ImpactItems.Processorx64.get(),
            ticks = 50,
            eu = 60,
        )

        MachineRecipes.unboxing(
            input = AE2Items.AdvancedCraftingUnit.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = ImpactItems.Processorx256.get(),
            ticks = 50,
            eu = 96,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item1024CoreCoProcessingUnit.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = ImpactItems.Processorx1024.get(),
            ticks = 50,
            eu = 120,
        )

        MachineRecipes.unboxing(
            input = AE2Items.Item4096CoreCoProcessingUnit.get(),
            output = AE2Items.CraftingUnit.get(),
            secondaryOutput = ImpactItems.Processorx4096.get(),
            ticks = 50,
            eu = 192,
        )
    }
}
