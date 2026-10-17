package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.OpenSecurityItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersSecurityCardAndTurretRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.EmitterMV.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 4),
                OpenComputersItems.Cable.get(amount = 4),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.EnergyTurret.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.EmitterMV.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 4),
                OpenComputersItems.Cable.get(amount = 4),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.EnergyTurret.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Keyboard.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Iron,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.Keypad.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.Keyboard.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Iron,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.Keypad.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.Glass,
                    count = 4,
                ),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.BiometricReader.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.Glass,
                    count = 4,
                ),
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.MicrochipTier1.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.BiometricReader.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Paper,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.IronMagnetic,
                    count = 2,
                ),
                GregTechItems.CircuitPartsTransistor.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Glue.getMolten(144),
            output = OpenSecurityItems.MagneticStripCard.get(amount = 2),
            ticks = 150,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Paper,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.IronMagnetic,
                    count = 1,
                ),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Glue.getMolten(144),
            output = OpenSecurityItems.MagneticStripCard.get(amount = 2),
            ticks = 75,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Paper,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.IronMagnetic,
                    count = 2,
                ),
                OpenComputersItems.MicrochipTier1.get(),
                GregTechItems.CircuitPartsTransistor.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Glue.getMolten(144),
            output = OpenSecurityItems.RFIDCard.get(amount = 2),
            ticks = 150,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Paper,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.IronMagnetic,
                    count = 1,
                ),
                OpenComputersItems.MicrochipTier1.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Glue.getMolten(144),
            output = OpenSecurityItems.RFIDCard.get(amount = 4),
            ticks = 75,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.CardBase.get(),
                OpenComputersItems.WirelessNetworkCardTier2.get(),
                OpenComputersItems.MicrochipTier2.get(amount = 2),
                OpenComputersItems.MemoryTier1.get(),
                OpenComputersItems.ControlUnitCU.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.RFIDReaderCard.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                OpenComputersItems.NetworkCard.get(),
                OpenComputersItems.Cable.get(amount = 2),
                OpenComputersItems.MicrochipTier3.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Plastic.getMolten(72),
            output = OpenSecurityItems.SecureNetworkCard.get(),
            ticks = 300,
            eu = 256,
        )
    }
}
