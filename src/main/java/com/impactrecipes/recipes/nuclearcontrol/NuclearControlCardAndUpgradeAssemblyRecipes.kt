package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.recipes.ore.CraftingLens
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.util.GT_Utility

internal class NuclearControlCardAndUpgradeAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(CraftingLens.Red.oreDictName),
                RecipeItems.ore(CraftingLens.Green.oreDictName),
                RecipeItems.ore(CraftingLens.Blue.oreDictName),
                GregTechItems.EmitterMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = NuclearControlItems.ColorUpgrade.get(amount = 8),
            ticks = 1600,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Clock.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.TimeCard.get(),
            ticks = 1600,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = GregTechItems.SensorLV.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.RangeUpgrade.get(),
            ticks = 1600,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverScreen.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.TextCard.get(),
            ticks = 1600,
            eu = 2,
        )
    }
}
