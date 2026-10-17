package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.OpenSecurityItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class OpenComputersSecureDoorAndUpgradeRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.IronDoor.get(),
                OpenComputersItems.Cable.get(amount = 2),
                OpenComputersItems.MicrochipTier2.get(),
                GregTechItems.CircuitPartsTransistor.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Obsidian,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = OpenSecurityItems.SecurityDoor.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.IronDoor.get(),
                OpenComputersItems.Cable.get(),
                OpenComputersItems.MicrochipTier2.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Obsidian,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = GT_Values.NF,
            output = OpenSecurityItems.SecurityDoor.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.IronDoor.get(),
                OpenComputersItems.Cable.get(amount = 2),
                OpenComputersItems.MicrochipTier2.get(),
                GregTechItems.CircuitPartsTransistor.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Obsidian,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = GT_Values.NF,
            output = OpenSecurityItems.PrivateSecurityDoor.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.IronDoor.get(),
                OpenComputersItems.Cable.get(),
                OpenComputersItems.MicrochipTier2.get(),
                GregTechItems.CircuitPartsTransistorSMD.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Obsidian,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = GT_Values.NF,
            output = OpenSecurityItems.PrivateSecurityDoor.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                VanillaItems.Tnt.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(72),
            output = OpenSecurityItems.DamageUpgrade.get(),
            ticks = 300,
            eu = 256,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                ModItemVariant(
                    item = IC2Items.ReactorCoolantSimple,
                    meta = 1,
                ).get(),
                OpenComputersItems.MicrochipTier1.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(72),
            output = OpenSecurityItems.CooldownUpgrade.get(),
            ticks = 300,
            eu = 256,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                OpenComputersItems.BatteryUpgradeTier1.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(72),
            output = OpenSecurityItems.EnergyUpgrade.get(),
            ticks = 300,
            eu = 256,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.ElectricPistonMV.get(),
                OpenComputersItems.MicrochipTier1.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(72),
            output = OpenSecurityItems.MovementUpgrade.get(),
            ticks = 300,
            eu = 256,
        )
    }
}
