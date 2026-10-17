package com.impactrecipes.recipes.backpack

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility

internal class BackpackLeatherRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Leather.get(amount = 2),
                VanillaItems.String.get(amount = 3),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = BackpackItems.BoundLeather.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.dryingRack(
            input = BackpackItems.BoundLeather.get(),
            ticks = 4000,
            output = BackpackItems.TannedLeather.get(),
        )

        MachineRecipes.dryingOven(
            input = BackpackItems.BoundLeather.get(),
            outputs = arrayOf(
                BackpackItems.TannedLeather.get(),
            ),
            ticks = 400,
            eu = 16,
        )
    }
}
