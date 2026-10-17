package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class MalisisWoodTrapdoorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab4.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = MalisisDoorsItems.TrapdoorAcacia.get(amount = 2),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab4.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.TrapdoorAcacia.get(amount = 4),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab4.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.TrapdoorAcacia.get(amount = 6),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab2.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = MalisisDoorsItems.TrapdoorBirch.get(amount = 2),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab2.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.TrapdoorBirch.get(amount = 4),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab2.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.TrapdoorBirch.get(amount = 6),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab5.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = MalisisDoorsItems.TrapdoorDarkOak.get(amount = 2),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab5.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.TrapdoorDarkOak.get(amount = 4),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab5.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.TrapdoorDarkOak.get(amount = 6),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab3.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = MalisisDoorsItems.TrapdoorJungle.get(amount = 2),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab3.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.TrapdoorJungle.get(amount = 4),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab3.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.TrapdoorJungle.get(amount = 6),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab1.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = MalisisDoorsItems.TrapdoorSpruce.get(amount = 2),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab1.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = MalisisDoorsItems.TrapdoorSpruce.get(amount = 4),
            ticks = 600,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.WoodenSlab1.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = MalisisDoorsItems.TrapdoorSpruce.get(amount = 6),
            ticks = 600,
            eu = 4,
        )
    }
}
