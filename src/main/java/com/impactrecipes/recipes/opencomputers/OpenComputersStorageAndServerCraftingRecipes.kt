package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersStorageAndServerCraftingRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                OpenComputersItems.Item19.get(),
                OpenComputersItems.MicrochipTier1.get(),
                OpenComputersItems.MemoryTier1.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = OpenComputersItems.HardDiskDriveTier14MB.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                OpenComputersItems.Item19.get(amount = 2),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.MemoryTier2.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = OpenComputersItems.HardDiskDriveTier28MB.get(),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 2,
                ),
                OpenComputersItems.Item19.get(amount = 4),
                OpenComputersItems.MicrochipTier3.get(),
                OpenComputersItems.MemoryTier3.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = OpenComputersItems.HardDiskDriveTier316MB.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.DiskDrive.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                ModItemVariant(
                    item = IC2Items.AdvancedHeatVent,
                    meta = 1,
                ).get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenComputersItems.DiskDriveMeta109.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeTiny,
                    material = Materials.Plastic,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(36),
            output = OpenComputersItems.InkCartridgeEmpty.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Plastic,
                    count = 1,
                ),
                GregTechItems.CircuitPartsGlassFiber.get(amount = 4),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = OpenComputersItems.Interweb.get(),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.WirelessNetworkCardTier2.get(amount = 2),
                OpenComputersItems.ControlUnitCU.get(amount = 2),
                OpenComputersItems.MicrochipTier3.get(),
                OpenComputersItems.Interweb.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.EnderEye.getMolten(288),
            output = OpenComputersItems.LinkedCard.get(amount = 2),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Book.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Glue.getFluid(144),
            output = OpenComputersItems.OpenComputersManual.get(),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Capacitor.get(),
                OpenComputersItems.MemoryTier2.get(amount = 2),
                OpenComputersItems.WirelessNetworkCardTier2.get(),
                OpenComputersItems.CentralProcessingUnitCPUTier2.get(amount = 2),
                OpenComputersItems.Grog.get(),
                OpenComputersItems.Chamelium.get(amount = 9),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = OpenComputersItems.Nanomachines.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                OpenComputersItems.ComputerCaseTier1.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.MemoryTier25.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = OpenComputersItems.ServerTier1.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.ComputerCaseTier2.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.MicrochipTier3.get(),
                OpenComputersItems.MemoryTier3.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = OpenComputersItems.ServerTier2.get(),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                OpenComputersItems.CaseTier3.get(),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                OpenComputersItems.MemoryTier35.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = OpenComputersItems.ServerTier3.get(),
            ticks = 400,
            eu = 1024,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.ScreenTier2.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.ComponentBusTier1.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 4,
                ),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenComputersItems.TabletCaseTier1.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.ScreenTier2.get(),
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                OpenComputersItems.MicrochipTier3.get(),
                OpenComputersItems.ComponentBusTier3.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Electrum,
                    count = 4,
                ),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenComputersItems.TabletCaseTier2.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.LargeScreen.get(),
                OpenComputersItems.WirelessNetworkCardTier2.get(),
                OpenComputersItems.MicrochipTier3.get(amount = 2),
                OpenComputersItems.Keyboard.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = OpenComputersItems.RemoteTerminal.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                OpenComputersItems.WirelessNetworkCardTier2.get(amount = 3),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Electrum,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(144),
            output = OpenComputersItems.TerminalServer.get(),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.compressor(
            input = OpenComputersItems.Chamelium.get(amount = 9),
            output = OpenComputersItems.BlockOfChamelium.get(),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.mixer(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Redstone,
                count = 4,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Silicon,
                count = 4,
            ),
            input3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Coal,
                count = 1,
            ),
            input4 = GT_Values.NI,
            input5 = GT_Values.NI,
            input6 = GT_Utility.getIntegratedCircuit(3),
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            output = OpenComputersItems.Chamelium.get(amount = 9),
            ticks = 200,
            eu = 120,
        )
    }
}
