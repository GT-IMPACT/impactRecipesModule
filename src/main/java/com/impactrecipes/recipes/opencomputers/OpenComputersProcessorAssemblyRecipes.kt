package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersProcessorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 4),
                OpenComputersItems.ControlUnitCU.get(),
                OpenComputersItems.MicrochipTier1.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.CentralProcessingUnitCPUTier1.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 6),
                OpenComputersItems.ControlUnitCU.get(amount = 2),
                OpenComputersItems.MicrochipTier2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.CentralProcessingUnitCPUTier2.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 8),
                OpenComputersItems.ControlUnitCU.get(amount = 4),
                OpenComputersItems.MicrochipTier3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.CentralProcessingUnitCPUTier3.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 2),
                OpenComputersItems.ControlUnitCU.get(),
                OpenComputersItems.MicrochipTier1.get(),
                OpenComputersItems.MemoryTier1.get(),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.GraphicsCardTier1.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 4),
                OpenComputersItems.ControlUnitCU.get(amount = 2),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.MemoryTier2.get(),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.GraphicsCardTier2.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 8),
                OpenComputersItems.ControlUnitCU.get(amount = 4),
                OpenComputersItems.MicrochipTier3.get(),
                OpenComputersItems.MemoryTier3.get(),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.GraphicsCardTier3.get(),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.WirelessNetworkCardTier2.get(),
                OpenComputersItems.Interweb.get(),
                OpenComputersItems.MicrochipTier3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                ImpactItems.RedstoneRedChipset.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.InternetCard.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 8),
                OpenComputersItems.ControlUnitCU.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.AcceleratedProcessingUnitAPUTier2.get(),
            ticks = 200,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                OpenComputersItems.ArithmeticLogicUnitALU.get(amount = 16),
                OpenComputersItems.ControlUnitCU.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144),
            output = OpenComputersItems.APUTier3.get(),
            ticks = 200,
            eu = 480,
        )
    }
}
