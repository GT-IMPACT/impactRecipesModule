package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.StorageDrawersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class DrawerTemplateAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ModItemVariant(
                item = StorageDrawersItems.Trim,
                meta = GT_Values.W.toInt(),
            ).get(),
            secondaryInput = VanillaItems.Piston.get(),
            output = StorageDrawersItems.UpgradeTemplate.get(),
            ticks = 600,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = ModItemVariant(
                item = StorageDrawersItems.Trim,
                meta = GT_Values.W.toInt(),
            ).get(amount = 2),
            secondaryInput = ImpactItems.ULVPiston.get(),
            output = StorageDrawersItems.UpgradeTemplate.get(amount = 2),
            ticks = 400,
            eu = 20,
        )

        MachineRecipes.assembler(
            input = ModItemVariant(
                item = StorageDrawersItems.Trim,
                meta = GT_Values.W.toInt(),
            ).get(amount = 4),
            secondaryInput = GregTechItems.ElectricPistonLV.get(),
            output = StorageDrawersItems.UpgradeTemplate.get(amount = 4),
            ticks = 200,
            eu = 24,
        )

        MachineRecipes.assembler(
            input = ModItemVariant(
                item = StorageDrawersItems.Trim,
                meta = GT_Values.W.toInt(),
            ).get(amount = 8),
            secondaryInput = GregTechItems.ElectricPistonMV.get(),
            output = StorageDrawersItems.UpgradeTemplate.get(amount = 8),
            ticks = 100,
            eu = 28,
        )

        MachineRecipes.assembler(
            input = ModItemVariant(
                item = StorageDrawersItems.Trim,
                meta = GT_Values.W.toInt(),
            ).get(amount = 16),
            secondaryInput = GregTechItems.ElectricPistonHV.get(),
            output = StorageDrawersItems.UpgradeTemplate.get(amount = 16),
            ticks = 50,
            eu = 30,
        )
    }
}
