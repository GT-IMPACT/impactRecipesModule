package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersMemoryAssemblyRecipes {

    internal fun register() {
        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipRam.get(amount = 4),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Copper,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.MemoryTier1.get(),
            ticks = 250,
            eu = 60,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipRam.get(amount = 8),
                OpenComputersItems.MicrochipTier1.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silver,
                    count = 12,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.MemoryTier15.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipRam.get(amount = 12),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Gold,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.MemoryTier2.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipRam.get(amount = 16),
                GregTechItems.CircuitChipNAND.get(amount = 8),
                OpenComputersItems.MicrochipTier2.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.MemoryTier25.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitChipRam.get(amount = 24),
                GregTechItems.CircuitChipNAND.get(amount = 12),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.BlueAlloy,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.MemoryTier3.get(),
            ticks = 250,
            eu = 368,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitChipRam.get(amount = 32),
                GregTechItems.CircuitChipNAND.get(amount = 16),
                OpenComputersItems.MicrochipTier3.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Platinum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.MemoryTier35.get(),
            ticks = 250,
            eu = 480,
        )
    }
}
