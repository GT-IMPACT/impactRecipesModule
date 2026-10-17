package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class VanillaLadderAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.slab,
                material = Materials.Wood,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.spring,
                material = Materials.Iron,
                count = 1,
            ),
            output = VanillaItems.WoodenPressurePlate.get(amount = 2),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            input = VanillaItems.StoneSlab.get(amount = 2),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.spring,
                material = Materials.Iron,
                count = 1,
            ),
            output = VanillaItems.StonePressurePlate.get(amount = 2),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = VanillaItems.Ladder.get(amount = 2),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = VanillaItems.Ladder.get(amount = 4),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = VanillaItems.Ladder.get(amount = 8),
            ticks = 200,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluid = Materials.Aluminium.getMolten(16),
            output = VanillaItems.Ladder.get(amount = 32),
            ticks = 100,
            eu = 30,
        )
    }
}
