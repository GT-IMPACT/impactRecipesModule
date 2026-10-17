package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2CoreAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NetherQuartz,
                    count = 1,
                ),
                AE2Items.PureFluixCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.VanadiumSteel,
                    count = 2,
                ),
                AE2Items.LogicProcessor.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.AnnihilationCore.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.NetherQuartz,
                    count = 1,
                ),
                AE2Items.PureFluixCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Iridium,
                    count = 1,
                ),
                AE2Items.LogicProcessor.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = AE2Items.AnnihilationCore.get(amount = 2),
            ticks = 100,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.NetherQuartz,
                    count = 1,
                ),
                AE2Items.PureFluixCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Duranium,
                    count = 1,
                ),
                AE2Items.LogicProcessor.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = AE2Items.AnnihilationCore.get(amount = 4),
            ticks = 50,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.NetherQuartz,
                    count = 1,
                ),
                AE2Items.PureFluixCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 1,
                ),
                AE2Items.LogicProcessor.get(),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = AE2Items.AnnihilationCore.get(amount = 16),
            ticks = 20,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CertusQuartz,
                    count = 1,
                ),
                AE2Items.PureFluixCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.VanadiumSteel,
                    count = 2,
                ),
                AE2Items.LogicProcessor.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.FormationCore.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.CertusQuartz,
                    count = 1,
                ),
                AE2Items.PureFluixCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Iridium,
                    count = 1,
                ),
                AE2Items.LogicProcessor.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = AE2Items.FormationCore.get(amount = 2),
            ticks = 100,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 1,
                ),
                AE2Items.PureFluixCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Duranium,
                    count = 1,
                ),
                AE2Items.LogicProcessor.get(),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = AE2Items.FormationCore.get(amount = 4),
            ticks = 50,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 1,
                ),
                AE2Items.PureFluixCrystal.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 1,
                ),
                AE2Items.LogicProcessor.get(),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = AE2Items.FormationCore.get(amount = 16),
            ticks = 20,
            eu = 500000,
        )

        MachineRecipes.assembler(
            input = AE2Items.LogicProcessor.get(),
            secondaryInput = ImpactItems.GoldCoreChip.get(),
            output = ImpactItems.LogicProcessorItemGoldCore.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.assembler(
            input = AE2Items.EngineeringProcessor.get(),
            secondaryInput = ImpactItems.DiamondCoreChip.get(),
            output = ImpactItems.EngineeringProcessorItemDiamondCore.get(),
            ticks = 100,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = AE2Items.EngineeringProcessor.get(),
            secondaryInput = ImpactItems.EmeraldAdvancedCoreChip.get(),
            output = ImpactItems.EngineeringProcessorItemEmeraldCore.get(),
            ticks = 100,
            eu = 4092,
        )

        MachineRecipes.assembler(
            input = AE2Items.EngineeringProcessor.get(),
            secondaryInput = ImpactItems.EmeraldHighAdvancedCoreChip.get(),
            output = ImpactItems.EngineeringProcessorItemAdvEmeraldCore.get(),
            ticks = 100,
            eu = 30720,
        )

        MachineRecipes.assembler(
            input = AE2Items.EngineeringProcessor.get(),
            secondaryInput = ImpactItems.GoldFluidCoreChip.get(),
            output = ImpactItems.EngineeringProcessorFluidGoldCore.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.assembler(
            input = AE2Items.EngineeringProcessor.get(),
            secondaryInput = ImpactItems.DiamondFluidCoreChip.get(),
            output = ImpactItems.EngineeringProcessorFluidDiamondCore.get(),
            ticks = 100,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = AE2Items.EngineeringProcessor.get(),
            secondaryInput = ImpactItems.EmeraldAdvancedFluidCoreChip.get(),
            output = ImpactItems.EngineeringProcessorFluidEmeraldCore.get(),
            ticks = 100,
            eu = 4092,
        )

        MachineRecipes.assembler(
            input = AE2Items.EngineeringProcessor.get(),
            secondaryInput = ImpactItems.PulsatingSpatialCoreChip.get(),
            output = ImpactItems.EngineeringProcessorSpatialPulsatingCore.get(),
            ticks = 100,
            eu = 4092,
        )
    }
}
