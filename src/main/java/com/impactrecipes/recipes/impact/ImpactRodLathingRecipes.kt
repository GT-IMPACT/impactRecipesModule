package com.impactrecipes.recipes.impact

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ForgeMicroblockItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes

internal class ImpactRodLathingRecipes {

    internal fun register() {
        MachineRecipes.lathe(
            input = VanillaItems.Cobblestone.get(),
            output = ImpactItems.CobblestoneRod.get(amount = 2),
            secondaryOutput = null,
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.lathe(
            input = VanillaItems.Sandstone.get(),
            output = ImpactItems.SandstoneRod.get(amount = 2),
            secondaryOutput = null,
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.lathe(
            input = AE2Items.FluixBlock.get(),
            output = ImpactItems.FlawedFluixCrystal.get(),
            secondaryOutput = AE2Items.FluixDust.get(amount = 3),
            ticks = 2400,
            eu = 30,
        )

        MachineRecipes.lathe(
            input = VanillaItems.Stone.get(),
            output = ForgeMicroblockItems.StoneRod.get(amount = 2),
            secondaryOutput = null,
            ticks = 100,
            eu = 12,
        )
    }
}
