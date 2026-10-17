package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class MalisisFenceGateAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plank,
                material = Materials.Wood,
                count = 3,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.springSmall,
                material = Materials.Iron,
                count = 1,
            ),
            output = MalisisDoorsItems.ItemSaloon.get(),
            ticks = 400,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks4.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = MalisisDoorsItems.AcaciaFenceGate.get(),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks4.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.AcaciaFenceGate.get(amount = 2),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks4.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.AcaciaFenceGate.get(amount = 4),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks2.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = MalisisDoorsItems.BirchFenceGate.get(),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks2.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.BirchFenceGate.get(amount = 2),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks2.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.BirchFenceGate.get(amount = 4),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks5.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = MalisisDoorsItems.DarkOakFenceGate.get(),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks5.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.DarkOakFenceGate.get(amount = 2),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks5.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.DarkOakFenceGate.get(amount = 4),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks3.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = MalisisDoorsItems.JungleFenceGate.get(),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks3.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.JungleFenceGate.get(amount = 2),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks3.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.JungleFenceGate.get(amount = 4),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks1.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = MalisisDoorsItems.SpruceFenceGate.get(),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks1.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.SpruceFenceGate.get(amount = 2),
            ticks = 300,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Planks1.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.SpruceFenceGate.get(amount = 4),
            ticks = 300,
            eu = 8,
        )
    }
}
