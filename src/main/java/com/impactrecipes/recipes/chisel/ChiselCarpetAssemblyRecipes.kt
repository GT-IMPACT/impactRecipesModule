package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility

internal class ChiselCarpetAssemblyRecipes {

    internal fun register() {
        for (i in 0 until 16) {
            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = VanillaItems.Wool,
                        meta = i,
                    ).get(amount = 8),
                    VanillaItems.String.get(),
                    GT_Utility.getIntegratedCircuit(8),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = ChiselItems.CarpetBlock,
                    meta = i,
                ).get(amount = 16),
                ticks = 100,
                eu = 8,
            )
        }
    }
}
