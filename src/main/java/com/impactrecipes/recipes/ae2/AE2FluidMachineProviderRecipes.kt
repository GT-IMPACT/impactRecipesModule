package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.AE2StuffItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2FluidMachineProviderRecipes {

    internal fun register() {
        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 1,
                ),
                GregTechItems.ElectricPumpEV.get(),
                AE2Items.StorageBus.get(amount = 2),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.FluidDiscretizer.get(),
            ticks = 40 * 20,
            eu = 7680,
            particles = 1000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2StuffItems.PatternEncoder.get(),
                GregTechItems.MachineHVAssembler.get(),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lapis,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.FluidPatternEncoder.get(),
            ticks = 40 * 20,
            eu = 7680,
            particles = 2000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.CellWorkbench.get(),
                GregTechItems.MachineHVDisassembler.get(),
                AE2Items.EngineeringProcessor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lapis,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.MEFluidPacketDecoder.get(),
            ticks = 40 * 20,
            eu = 7680,
            particles = 1000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ElectricPumpHV.get(),
                ImpactItems.EngineeringProcessorFluidGoldCore.get(amount = 2),
                AE2Items.InterfaceBlock.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.DualInterface.get(),
            ticks = 100,
            eu = 1920,
            particles = 500,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ElectricPumpEV.get(),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(amount = 2),
                AE2Items.InterfaceBlock.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.DualInterface.get(amount = 2),
            ticks = 200,
            eu = 7680,
            particles = 1000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                GregTechItems.ElectricPumpIV.get(),
                ImpactItems.EngineeringProcessorFluidEmeraldCore.get(amount = 2),
                AE2Items.InterfaceBlock.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.DualInterface.get(amount = 4),
            ticks = 300,
            eu = 30720,
            particles = 2000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 1,
                ),
                AE2Items.CellWorkbench.get(),
                GregTechItems.ElectricPumpEV.get(amount = 2),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.IngredientBuffer.get(),
            ticks = 30 * 20,
            eu = 1920,
            particles = 1000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.TungstenSteel,
                    count = 1,
                ),
                AE2FCItems.IngredientBuffer.get(),
                GregTechItems.ElectricPumpIV.get(amount = 2),
                ImpactItems.EngineeringProcessorFluidEmeraldCore.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.LargeIngredientBuffer.get(),
            ticks = 60 * 20,
            eu = 7680,
            particles = 4000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.MaragingSteel300,
                    count = 1,
                ),
                AE2FCItems.IngredientBuffer.get(),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(amount = 2),
            ),
            output = AE2FCItems.MEFluidBuffer.get(),
            ticks = 40 * 20,
            eu = 3750,
            particles = 2000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
                AE2Items.BlankPattern.get(),
                GregTechItems.ElectricPumpEV.get(),
                RecipeItems.ore("oc:circuitChip3"),
                RecipeItems.ore(
                    name = "oc:cable",
                    count = 2,
                ),
                AE2Items.CalculationProcessor.get(),
            ),
            output = AE2FCItems.OCPatternEditor.get(),
            ticks = 30 * 20,
            eu = 1920,
            particles = 8000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.MEPatternTerminal.get(),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(),
                AE2Items.CalculationProcessor.get(),
                GregTechItems.ElectricPumpEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.PartFluidPatternTerminal.get(),
            ticks = 20 * 20,
            eu = 1920,
            particles = 400,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.MEProcessingPatternTerminal.get(),
                ImpactItems.EngineeringProcessorFluidEmeraldCore.get(),
                AE2Items.CalculationProcessor.get(),
                GregTechItems.ElectricPumpIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.MaragingSteel300,
                    count = 4,
                ),
            ),
            output = AE2FCItems.PartFluidPatternTerminalEx.get(),
            ticks = 40 * 20,
            eu = 7680,
            particles = 800,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.CraftingCoProcessingUnit.get(),
                AE2Items.AnnihilationCore.get(),
                ImpactItems.EngineeringProcessorFluidDiamondCore.get(),
                AE2Items.CraftingCard.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Vanadium,
                    count = 4,
                ),
            ),
            output = AE2FCItems.MELevelMaintainer.get(),
            ticks = 30 * 20,
            eu = 1920,
            particles = 800,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.MEAdvancedStorageHousing.get(),
                GregTechItems.QuantumChestHV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                AE2Items.StorageComponent16384k.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Neutronium,
                    count = 8,
                ),
            ),
            output = AE2Items.QuantumMEStorageCell.get(),
            ticks = 120 * 20,
            eu = 500000,
            particles = 20000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2Items.MEAdvancedStorageHousing.get(),
                GregTechItems.QuantumChestIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Nano,
                    count = 4,
                ),
                AE2Items.StorageComponent16384k.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.InfinityCatalyst,
                    count = 8,
                ),
            ),
            output = AE2Items.SingularityStorageCell.get(),
            ticks = 360 * 20,
            eu = 8000000,
            particles = 80000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2FCItems.MEAdvancedFluidStorageHousing.get(),
                GregTechItems.QuantumTankHV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                AE2FCItems.Item16384kMEFluidStorageComponent.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Neutronium,
                    count = 8,
                ),
            ),
            output = AE2FCItems.MEFluidQuantumStorageCell.get(),
            ticks = 120 * 20,
            eu = 500000,
            particles = 20000,
        )

        MachineRecipes.meSystemProvider(
            inputs = arrayOf(
                AE2FCItems.MEAdvancedFluidStorageHousing.get(),
                GregTechItems.QuantumTankIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Nano,
                    count = 4,
                ),
                AE2FCItems.Item16384kMEFluidStorageComponent.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.InfinityCatalyst,
                    count = 8,
                ),
            ),
            output = AE2FCItems.SingularityFluidStorageCell.get(),
            ticks = 360 * 20,
            eu = 8000000,
            particles = 80000,
        )
    }
}
