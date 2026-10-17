package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class EnderIOConduitUpgradeAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = EnderIOItems.RedstoneConduit2.get(),
            secondaryInput = VanillaItems.Lever.get(),
            output = EnderIOItems.RedstoneConduit1.get(),
            ticks = 50,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.RedstoneConduit.get(),
            secondaryInput = EnderIOItems.Material1.get(),
            output = EnderIOItems.RedstoneConduit2.get(),
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.wireGt01,
                material = Materials.RedAlloy,
                count = 1,
            ),
            secondaryInput = EnderIOItems.Material1.get(),
            output = EnderIOItems.RedstoneConduit.get(),
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.wireGt01,
                material = Materials.Copper,
                count = 1,
            ),
            secondaryInput = EnderIOItems.Material1.get(),
            fluidInput = Materials.ConductiveIron.getMolten(144),
            output = EnderIOItems.PowerConduit.get(),
            ticks = 50,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = AE2Items.ItemItemMultiPart16.get(),
            secondaryInput = EnderIOItems.Material1.get(amount = 4),
            output = EnderIOItems.MEConduit.get(),
            ticks = 50,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = AE2Items.ItemItemMultiPart76.get(),
            secondaryInput = EnderIOItems.Material1.get(amount = 4),
            output = EnderIOItems.MEConduit1.get(),
            ticks = 100,
            eu = 480,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.ExtractSpeedUpgrade.get(),
            secondaryInput = GT_Utility.getIntegratedCircuit(1),
            output = EnderIOItems.ExtractSpeedUpgrade1.get(),
            ticks = 50,
            eu = 30,
        )
    }
}
