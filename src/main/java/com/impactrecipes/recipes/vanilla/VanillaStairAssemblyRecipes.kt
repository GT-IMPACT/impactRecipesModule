package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.util.GT_Utility

internal class VanillaStairAssemblyRecipes {

    internal fun register() {
        val stairs2 = arrayOf(
            VanillaItems.OakStairs.get(amount = 2),
            VanillaItems.SpruceStairs.get(amount = 2),
            VanillaItems.BirchStairs.get(amount = 2),
            VanillaItems.JungleStairs.get(amount = 2),
            VanillaItems.AcaciaStairs.get(amount = 2),
            VanillaItems.DarkOakStairs.get(amount = 2),
        )

        val stairs4 = arrayOf(
            VanillaItems.OakStairs.get(amount = 4),
            VanillaItems.SpruceStairs.get(amount = 4),
            VanillaItems.BirchStairs.get(amount = 4),
            VanillaItems.JungleStairs.get(amount = 4),
            VanillaItems.AcaciaStairs.get(amount = 4),
            VanillaItems.DarkOakStairs.get(amount = 4),
        )

        for (i in 0 until 6) {
            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = VanillaItems.WoodenSlab,
                        meta = i,
                    ).get(amount = 3),
                    GT_Utility.getIntegratedCircuit(7),
                ),
                fluid = null,
                output = stairs2[i],
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(amount = 3),
                    GT_Utility.getIntegratedCircuit(7),
                ),
                fluid = null,
                output = stairs4[i],
                ticks = 300,
                eu = 8,
            )
        }
    }
}
