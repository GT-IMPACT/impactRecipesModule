package com.impactrecipes.recipes.forestry

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ForestryWoodAssemblyRecipes {

    internal fun register() {
        for (i in 0 until 29) {
            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.Planks,
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
                output = ModItemVariant(
                    item = ForestryItems.Fences,
                    meta = i,
                ).get(),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.Planks,
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
                output = ModItemVariant(
                    item = ForestryItems.Fences,
                    meta = i,
                ).get(amount = 2),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.Planks,
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
                output = ModItemVariant(
                    item = ForestryItems.Fences,
                    meta = i,
                ).get(amount = 4),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
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
                output = ModItemVariant(
                    item = ForestryItems.FencesFireproof,
                    meta = i,
                ).get(),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
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
                output = ModItemVariant(
                    item = ForestryItems.FencesFireproof,
                    meta = i,
                ).get(amount = 2),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
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
                output = ModItemVariant(
                    item = ForestryItems.FencesFireproof,
                    meta = i,
                ).get(amount = 4),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.Slabs,
                        meta = i,
                    ).get(amount = 3),
                    GT_Utility.getIntegratedCircuit(7),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = ForestryItems.Stairs,
                    meta = i,
                ).get(amount = 2),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.Planks,
                        meta = i,
                    ).get(amount = 3),
                    GT_Utility.getIntegratedCircuit(7),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = ForestryItems.Stairs,
                    meta = i,
                ).get(amount = 4),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.SlabsFireproof,
                        meta = i,
                    ).get(amount = 3),
                    GT_Utility.getIntegratedCircuit(7),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = ForestryItems.StairsFireproof,
                    meta = i,
                ).get(amount = 2),
                ticks = 300,
                eu = 8,
            )

            MachineRecipes.assembler(
                inputs = arrayOf(
                    ModItemVariant(
                        item = ForestryItems.PlanksFireproof,
                        meta = i,
                    ).get(amount = 3),
                    GT_Utility.getIntegratedCircuit(7),
                ),
                fluid = null,
                output = ModItemVariant(
                    item = ForestryItems.StairsFireproof,
                    meta = i,
                ).get(amount = 4),
                ticks = 300,
                eu = 8,
            )
        }
    }
}
