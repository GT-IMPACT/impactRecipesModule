package com.impactrecipes.recipes.jabba

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.JabbaItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility

internal class JabbaStorageUpgradeRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = JabbaItems.Barrel.get(),
            secondaryInput = VanillaItems.Piston.get(),
            output = JabbaItems.StorageUpgrade.get(),
            ticks = 600,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = JabbaItems.Barrel.get(amount = 2),
            secondaryInput = ImpactItems.ULVPiston.get(),
            output = JabbaItems.StorageUpgrade.get(amount = 2),
            ticks = 400,
            eu = 20,
        )

        MachineRecipes.assembler(
            input = JabbaItems.Barrel.get(amount = 4),
            secondaryInput = GregTechItems.ElectricPistonLV.get(),
            output = JabbaItems.StorageUpgrade.get(amount = 4),
            ticks = 200,
            eu = 24,
        )

        MachineRecipes.assembler(
            input = JabbaItems.Barrel.get(amount = 8),
            secondaryInput = GregTechItems.ElectricPistonMV.get(),
            output = JabbaItems.StorageUpgrade.get(amount = 8),
            ticks = 100,
            eu = 28,
        )

        MachineRecipes.assembler(
            input = JabbaItems.Barrel.get(amount = 16),
            secondaryInput = GregTechItems.ElectricPistonHV.get(),
            output = JabbaItems.StorageUpgrade.get(amount = 16),
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade.get(amount = 3),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = JabbaItems.StorageUpgrade3x.get(),
            ticks = 600,
            eu = 24,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade.get(),
            secondaryInput = ImpactItems.ULVPiston.get(),
            output = JabbaItems.StorageUpgrade3x.get(),
            ticks = 300,
            eu = 24,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade3x.get(amount = 3),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = JabbaItems.StorageUpgrade9x.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade.get(),
            secondaryInput = GregTechItems.ElectricPistonLV.get(),
            output = JabbaItems.StorageUpgrade9x.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade9x.get(amount = 3),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = JabbaItems.StorageUpgrade27x.get(),
            ticks = 600,
            eu = 64,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade.get(),
            secondaryInput = GregTechItems.ElectricPistonMV.get(),
            output = JabbaItems.StorageUpgrade27x.get(),
            ticks = 300,
            eu = 64,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade27x.get(amount = 3),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = JabbaItems.StorageUpgrade81x.get(),
            ticks = 600,
            eu = 96,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade.get(),
            secondaryInput = GregTechItems.ElectricPistonHV.get(),
            output = JabbaItems.StorageUpgrade81x.get(),
            ticks = 300,
            eu = 96,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade81x.get(amount = 3),
            secondaryInput = GT_Utility.getIntegratedCircuit(3),
            output = JabbaItems.StorageUpgrade243x.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = JabbaItems.StorageUpgrade.get(),
            secondaryInput = GregTechItems.ElectricPistonEV.get(),
            output = JabbaItems.StorageUpgrade243x.get(),
            ticks = 300,
            eu = 120,
        )
    }
}
