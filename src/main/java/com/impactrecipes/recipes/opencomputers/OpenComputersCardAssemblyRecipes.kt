package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersCardAssemblyRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.Cable.get(amount = 2),
                OpenComputersItems.MicrochipTier1.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.NetworkCard.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.NetworkCard.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(),
                GregTechItems.EmitterLV.get(),
                GregTechItems.SensorLV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.WirelessNetworkCardTier1.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.NetworkCard.get(),
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                OpenComputersItems.MicrochipTier3.get(),
                GregTechItems.EmitterHV.get(),
                GregTechItems.SensorHV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.WirelessNetworkCardTier2.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(),
                GalacticraftCoreItems.ItemSensorLens.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.WorldSensorCard.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.MicrochipTier1.get(),
                OpenComputersItems.Cable.get(),
                GregTechItems.CircuitChipILC.get(amount = 2),
                VanillaItems.RedstoneTorch.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.RedstoneCardTier1.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.Cable.get(),
                GregTechItems.CircuitChipILC.get(amount = 8),
                VanillaItems.RedstoneTorch.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.RedstoneCardTier2.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.MicrochipTier1.get(),
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.DataCardTier1.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.CentralProcessingUnitCPUTier1.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.DataCardTier2.get(),
            ticks = 300,
            eu = 156,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.MicrochipTier3.get(),
                OpenComputersItems.CentralProcessingUnitCPUTier2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 32,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.DataCardTier3.get(),
            ticks = 300,
            eu = 480,
        )
    }
}
