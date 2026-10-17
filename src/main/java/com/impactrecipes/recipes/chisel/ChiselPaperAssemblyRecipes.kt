package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ChiselPaperAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Paper.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChiselItems.Paperwall.get(amount = 8),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Paper.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(11),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = ChiselItems.Paperwall.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Paper.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(11),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = ChiselItems.Paperwall.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Paper.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.WoodSealed,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(10),
            ),
            fluid = null,
            output = ChiselItems.Paperwall.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Paper.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.WoodSealed,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(11),
            ),
            fluid = Materials.Iron.getMolten(16),
            output = ChiselItems.Paperwall.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Paper.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.WoodSealed,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(11),
            ),
            fluid = Materials.Steel.getMolten(16),
            output = ChiselItems.Paperwall.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ModItemVariant(
                    item = ChiselItems.Paperwall,
                    meta = GT_Values.W.toInt(),
                ).get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Wood,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.PaperwallBlock.get(amount = 8),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ModItemVariant(
                    item = ChiselItems.Paperwall,
                    meta = GT_Values.W.toInt(),
                ).get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.WoodSealed,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.PaperwallBlock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )
    }
}
