package com.impactrecipes.recipes.stevesfactorymanager

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.StevesFactoryManagerItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class FactoryManagerCableUpgradeRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                GregTechItems.CoverScreen.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.RedAlloy.getMolten(288),
            output = StevesFactoryManagerItems.CableCamouflage.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.CableCamouflage.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.RedAlloy.getMolten(576),
            output = StevesFactoryManagerItems.DoubleSidedCableCamouflage.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.DoubleSidedCableCamouflage.get(),
                GregTechItems.FieldGeneratorLV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.RedAlloy.getMolten(864),
            output = StevesFactoryManagerItems.TransformingCableCamouflage.get(),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.InventoryCable.get(),
                VanillaItems.Hopper.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.RedAlloy.getMolten(288),
            output = StevesFactoryManagerItems.ItemValve.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                StevesFactoryManagerItems.ItemValve.get(),
                GregTechItems.ConveyorModuleHV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.RedAlloy.getMolten(576),
            output = StevesFactoryManagerItems.RapidItemValve.get(),
            ticks = 300,
            eu = 480,
        )
    }
}
