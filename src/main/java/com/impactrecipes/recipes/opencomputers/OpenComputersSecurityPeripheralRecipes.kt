package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.OpenSecurityItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersSecurityPeripheralRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.Cable.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.MagneticCardReader.get(),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.Cable.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.MagneticCardReader.get(),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenSecurityItems.RFIDReaderCard.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.Cable.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.RFIDReader.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.MemoryTier1.get(),
                OpenComputersItems.ControlUnitCU.get(),
                OpenComputersItems.Cable.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.CardWriter.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Noteblock.get(),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.Cable.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.Alarm.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.MemoryTier1.get(),
                OpenComputersItems.ControlUnitCU.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.EntityDetector.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.ControlUnitCU.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Obsidian,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.DoorController.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.ControlUnitCU.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Obsidian,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.DoorController.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.DataCardTier1.get(),
                OpenComputersItems.MicrochipTier2.get(),
                OpenComputersItems.Cable.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.DataBlock.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Relay.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.Cable.get(amount = 4),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.SwitchableHub.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Relay.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.Cable.get(amount = 4),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.SwitchableHub.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Relay.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.Cable.get(amount = 4),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.KVMSwitch.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Relay.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.Cable.get(amount = 4),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.KVMSwitch.get(),
            ticks = 300,
            eu = 120,
        )
    }
}
