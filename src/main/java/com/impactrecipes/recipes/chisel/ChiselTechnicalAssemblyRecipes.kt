package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ChiselTechnicalAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iron,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ChiselItems.Technical.get(amount = 8),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iron,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ChiselItems.Technical.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ChiselItems.Technical.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ChiselItems.Technical.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ChiselItems.Technical.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ChiselItems.Technical.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iron,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ChiselItems.Tyrian.get(amount = 8),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iron,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ChiselItems.Tyrian.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ChiselItems.Tyrian.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ChiselItems.Tyrian.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ChiselItems.Tyrian.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ChiselItems.Tyrian.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                VanillaItems.Sign.get(),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.WarningSign.get(amount = 8),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                VanillaItems.Sign.get(),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.WarningSign.get(amount = 16),
            ticks = 100,
            eu = 8,
        )
    }
}
