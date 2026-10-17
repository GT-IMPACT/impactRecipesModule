package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ChiselPlatingAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Carbon,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.HexPlating.get(amount = 8),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Carbon,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.HexPlating.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Silicon,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.HexPlating.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Silicon,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.HexPlating.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Rubber,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.HexPlating.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Rubber,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.HexPlating.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.WroughtIron,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Rebel.get(amount = 8),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.WroughtIron,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Rebel.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nickel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Rebel.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nickel,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Rebel.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nicrofer,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Rebel.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Nicrofer,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Rebel.get(amount = 64),
            ticks = 100,
            eu = 8,
        )
    }
}
