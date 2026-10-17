package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class VanillaFenceAssemblyRecipes {

    internal fun register() {
        for (i in 0 until 6) {
            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.stick,
                        material = Materials.Wood,
                        count = 2,
                    ),
                    GT_Utility.getIntegratedCircuit(10),
                ),
                fluid = null,
                output = VanillaItems.Fence.get(),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.stick,
                        material = Materials.Wood,
                        count = 2,
                    ),
                    GT_Utility.getIntegratedCircuit(11),
                ),
                fluid = Materials.Iron.getMolten(16),
                output = VanillaItems.Fence.get(amount = 2),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = VanillaItems.Planks,
                        meta = i,
                    ).get(amount = 2),
                    RecipeItems.ore(
                        prefix = OrePrefixes.stick,
                        material = Materials.Wood,
                        count = 2,
                    ),
                    GT_Utility.getIntegratedCircuit(11),
                ),
                fluid = Materials.Steel.getMolten(16),
                output = VanillaItems.Fence.get(amount = 4),
                ticks = 300,
                eu = 8,
            )
        }
    }
}
