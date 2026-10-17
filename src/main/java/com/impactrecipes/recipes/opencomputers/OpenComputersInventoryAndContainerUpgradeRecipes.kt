package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersInventoryAndContainerUpgradeRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                VanillaItems.Chest.get(),
                OpenComputersItems.MicrochipTier1.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Silver,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.InventoryUpgrade.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.InventoryUpgrade.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                OpenComputersItems.MicrochipTier2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.InventoryControllerUpgrade.get(),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                GregTechItems.LargeFluidCellSteel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Silver,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.TankUpgrade.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.TankUpgrade.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                OpenComputersItems.MicrochipTier2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.TankControllerUpgrade.get(),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                VanillaItems.Chest.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.CardContainerTier1.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                VanillaItems.Chest.get(),
                OpenComputersItems.MicrochipTier2.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.CardContainerTier2.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 2,
                ),
                VanillaItems.Chest.get(),
                OpenComputersItems.MicrochipTier3.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.CardContainerTier3.get(),
            ticks = 250,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                VanillaItems.Chest.get(),
                OpenComputersItems.MicrochipTier1.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.StainlessSteel,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.UpgradeContainerTier1.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 2,
                ),
                VanillaItems.Chest.get(),
                OpenComputersItems.MicrochipTier2.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Titanium,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.UpgradeContainerTier2.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
                VanillaItems.Chest.get(),
                OpenComputersItems.MicrochipTier3.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.UpgradeContainerTier3.get(),
            ticks = 250,
            eu = 480,
        )
    }
}
