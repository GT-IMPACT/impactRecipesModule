package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2SpatialComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Niobium,
                    count = 4,
                ),
                AE2Items.FluixPearl.get(amount = 4),
                ImpactItems.EngineeringProcessorSpatialPulsatingCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item2SpatialComponent.get(),
            ticks = 160,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Niobium,
                    count = 3,
                ),
                AE2Items.FluixPearl.get(amount = 4),
                ImpactItems.PulsatingSpatialCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item2SpatialComponent.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                AE2Items.Item2SpatialComponent.get(amount = 4),
                ImpactItems.EngineeringProcessorSpatialPulsatingCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item16SpatialComponent.get(),
            ticks = 160,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 3,
                ),
                AE2Items.Item2SpatialComponent.get(amount = 4),
                ImpactItems.PulsatingSpatialCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.Item16SpatialComponent.get(),
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
                AE2Items.Item2SpatialComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC.get(),
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Europium.getMolten(36),
            output = AE2Items.Item16SpatialComponent.get(),
            ticks = 30,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                AE2Items.Item16SpatialComponent.get(amount = 4),
                ImpactItems.EngineeringProcessorSpatialPulsatingCore.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.SpatialComponent128.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 3,
                ),
                AE2Items.Item16SpatialComponent.get(amount = 4),
                ImpactItems.PulsatingSpatialCoreChip.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = AE2Items.SpatialComponent128.get(),
            ticks = 240,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 3,
                ),
                AE2Items.Item16SpatialComponent.get(amount = 3),
                GregTechItems.CircuitChipSoC.get(),
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Americium.getMolten(36),
            output = AE2Items.SpatialComponent128.get(),
            ticks = 30,
            eu = 122880,
        )
    }
}
