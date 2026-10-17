package com.impactrecipes.recipes.stevesfactorymanager

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.StevesFactoryManagerItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class FactoryManagerNetworkRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                EnderIOItems.ItemConduit.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlueSteel,
                    count = 4,
                ),
            ),
            fluid = null,
            output = StevesFactoryManagerItems.InventoryCable.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                GregTechItems.RobotArmHV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(288),
            output = StevesFactoryManagerItems.BlockGate.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.BlockGate.get(),
                IC2Items.Painter.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(576),
            output = StevesFactoryManagerItems.SignUpdater.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(288),
            output = StevesFactoryManagerItems.CableCluster.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(amount = 8),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = StevesFactoryManagerItems.AdvancedCableCluster.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                GregTechItems.EmitterHV.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Electrum.getMolten(288),
            output = StevesFactoryManagerItems.RedstoneEmitter.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                GregTechItems.SensorHV.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Electrum.getMolten(288),
            output = StevesFactoryManagerItems.RedstoneReceiver.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                GregTechItems.CoverActivityDetector.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Redstone.getMolten(288),
            output = StevesFactoryManagerItems.InventoryRelay.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                GregTechItems.CoverItemDetector.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Redstone.getMolten(576),
            output = StevesFactoryManagerItems.AdvancedInventoryRelay.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                ExtraUtilitiesItems.BlockUpdateDetector.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.RedAlloy.getMolten(288),
            output = StevesFactoryManagerItems.BlockDetector.get(),
            ticks = 200,
            eu = 480,
        )
    }
}
