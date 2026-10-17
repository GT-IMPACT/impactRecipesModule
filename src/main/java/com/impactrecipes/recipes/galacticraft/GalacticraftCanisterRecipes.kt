package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes

internal class GalacticraftCanisterRecipes {

    internal fun register() {
        MachineRecipes.canner(
            input = GalacticraftCoreItems.ItemCanister.get(),
            secondaryInput = VanillaItems.Apple.get(amount = 6),
            output = GalacticraftCoreItems.ItemBasicItem15.get(),
            secondaryOutput = null,
            ticks = 800,
            eu = 1,
        )

        MachineRecipes.canner(
            input = GalacticraftCoreItems.ItemCanister.get(),
            secondaryInput = VanillaItems.Carrot.get(amount = 8),
            output = GalacticraftCoreItems.ItemBasicItem16.get(),
            secondaryOutput = null,
            ticks = 800,
            eu = 1,
        )

        MachineRecipes.canner(
            input = GalacticraftCoreItems.ItemCanister.get(),
            secondaryInput = VanillaItems.Melon.get(amount = 8),
            output = GalacticraftCoreItems.ItemBasicItem17.get(),
            secondaryOutput = null,
            ticks = 800,
            eu = 1,
        )

        MachineRecipes.canner(
            input = GalacticraftCoreItems.ItemCanister.get(),
            secondaryInput = VanillaItems.Potato.get(amount = 16),
            output = GalacticraftCoreItems.ItemBasicItem18.get(),
            secondaryOutput = null,
            ticks = 800,
            eu = 1,
        )
    }
}
