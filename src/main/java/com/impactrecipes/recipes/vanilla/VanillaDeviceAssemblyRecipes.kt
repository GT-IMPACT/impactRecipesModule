package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class VanillaDeviceAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.Planks.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Iron.getMolten(16),
            output = VanillaItems.WoodenDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Planks.get(amount = 6),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Copper.getMolten(16),
            output = VanillaItems.WoodenDoor.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 6,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(6),
            fluidInput = Materials.Steel.getMolten(16),
            output = VanillaItems.IronDoor.get(),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = VanillaItems.Trapdoor.get(amount = 2),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = VanillaItems.Trapdoor.get(amount = 4),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = VanillaItems.Trapdoor.get(amount = 6),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = VanillaItems.FenceGate.get(),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = VanillaItems.FenceGate.get(amount = 2),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = VanillaItems.FenceGate.get(amount = 4),
            ticks = 300,
            eu = 8,
        )
    }
}
