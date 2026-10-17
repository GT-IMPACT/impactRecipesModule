package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials

internal class AE2CraftingUnitAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = ImpactItems.Processorx1.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = AE2Items.CraftingCoProcessingUnit.get(),
            ticks = 800,
            eu = 1020,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = ImpactItems.Processorx4.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(1152),
            output = AE2Items.QuadCoreCoProcessingUnit.get(),
            ticks = 1000,
            eu = 4090,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = ImpactItems.Processorx16.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(2304),
            output = AE2Items.Item16CoreCoProcessingUnit.get(),
            ticks = 1200,
            eu = 16350,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = ImpactItems.Processorx64.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(4608),
            output = AE2Items.Item64CoreCoProcessingUnit.get(),
            ticks = 1400,
            eu = 60570,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = ImpactItems.Processorx256.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(9216),
            output = AE2Items.AdvancedCraftingUnit.get(),
            ticks = 1600,
            eu = 240630,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = ImpactItems.Processorx1024.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(18432),
            output = AE2Items.Item1024CoreCoProcessingUnit.get(),
            ticks = 1800,
            eu = 1034200,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = ImpactItems.Processorx4096.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(36864),
            output = AE2Items.Item4096CoreCoProcessingUnit.get(),
            ticks = 2000,
            eu = 4156390,
        )

        MachineRecipes.assembler(
            input = AE2Items.CraftingUnit.get(),
            secondaryInput = AE2Items.StorageMonitor.get(),
            fluidInput = Materials.SolderingAlloy.getMolten(576),
            output = AE2Items.CraftingMonitor.get(),
            ticks = 200,
            eu = 480,
        )
    }
}
