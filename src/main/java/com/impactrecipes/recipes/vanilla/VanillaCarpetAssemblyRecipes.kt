package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Dyes

internal class VanillaCarpetAssemblyRecipes {

    internal fun register() {
        for (i in 0 until 16) {
            for (j in 0 until Dyes.VALUES[i].getSizeOfFluidList()) {
                MachineRecipes.assembler(
                    input = VanillaItems.String.get(amount = 3),
                    secondaryInput = ModItemVariant(
                        item = GregTechItems.CircuitIntegrated,
                        meta = 3,
                    ).get(amount = 0),
                    fluidInput = Dyes.VALUES[i].getFluidDye(
                        j,
                        24,
                    ),
                    output = ModItemVariant(
                        item = VanillaItems.Carpet,
                        meta = 15 - i,
                    ).get(amount = 2),
                    ticks = 128,
                    eu = 5,
                )
            }
        }
    }
}
