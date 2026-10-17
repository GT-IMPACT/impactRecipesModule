package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.ChickenChunksItems
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersMobilityAndBatteryUpgradeRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                ExtraUtilitiesItems.AngelBlock.get(),
                OpenComputersItems.MicrochipTier2.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.AngelUpgrade.get(),
            ticks = 250,
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
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                GregTechItems.ElectricMotorMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.HoverUpgradeTier1.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.StainlessSteel,
                    count = 8,
                ),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                GregTechItems.ElectricMotorHV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.HoverUpgradeTier2.get(),
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
                OpenComputersItems.Capacitor.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.BatteryUpgradeTier1.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                OpenComputersItems.Capacitor.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.RedAlloy,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.BatteryUpgradeTier1.get(),
            ticks = 250,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 2,
                ),
                OpenComputersItems.Capacitor.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Silver,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.BatteryUpgradeTier2.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 2,
                ),
                OpenComputersItems.Capacitor.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Silver,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.BatteryUpgradeTier2.get(),
            ticks = 250,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
                OpenComputersItems.Capacitor.get(amount = 4),
                GregTechItems.CircuitPartsTransistor.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.BatteryUpgradeTier3.get(),
            ticks = 250,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
                OpenComputersItems.Capacitor.get(amount = 4),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.BatteryUpgradeTier3.get(),
            ticks = 250,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
                OpenComputersItems.Capacitor.get(amount = 4),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.BatteryUpgradeTier3.get(),
            ticks = 125,
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
                ChickenChunksItems.ChunkLoader.get(),
                OpenComputersItems.MicrochipTier3.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.SolderingAlloy.getMolten(72),
            output = OpenComputersItems.ChunkloaderUpgrade.get(),
            ticks = 250,
            eu = 250,
        )
    }
}
