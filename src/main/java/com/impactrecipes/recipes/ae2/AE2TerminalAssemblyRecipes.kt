package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class AE2TerminalAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.StorageMonitor.get(),
                AE2Items.FormationCore.get(),
                AE2Items.AnnihilationCore.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NetherQuartz,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.MEConversionMonitor.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.METerminal.get(),
                AE2Items.EngineeringProcessor.get(),
                GregTechItems.CoverCrafting.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NetherQuartz,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.MECraftingTerminal.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.METerminal.get(),
                AE2Items.EngineeringProcessor.get(),
                AE2Items.InterfacePart.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NetherQuartz,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.MEInterfaceTerminal.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.METerminal.get(),
                AE2Items.EngineeringProcessor.get(),
                AE2Items.BlankPattern.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NetherQuartz,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.MEPatternTerminal.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.IlluminatedPanel.get(),
                AE2Items.LevelEmitter.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NetherQuartz,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.StorageMonitor.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.IlluminatedPanel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CertusQuartz,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.NetherQuartz,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Quartzite,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.METerminal.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Glowstone,
                    count = 1,
                ),
                AE2Items.QuartzGlass.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.VanadiumSteel,
                    count = 1,
                ),
                AE2Items.FluixDust.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2Items.IlluminatedPanel.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.WirelessTerminal.get(),
                AE2Items.MEInterfaceTerminal.get(),
            ),
            fluid = null,
            output = AE2FCItems.WirelessInterfaceTerminal.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.METerminal.get(),
                AE2Items.EngineeringProcessor.get(),
                AE2FCItems.MELevelMaintainer.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NetherQuartz,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CertusQuartz,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = AE2FCItems.LevelTerminal.get(),
            ticks = 200,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                AE2Items.WirelessReceiver.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.ItemItemMultiPart16.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Vanadium,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = Materials.Titanium.getMolten(36),
            output = AE2Items.MEWirelessAccessPoint.get(),
            ticks = 50,
            eu = 12,
        )
    }
}
