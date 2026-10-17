package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ChiselIndustrialAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iron,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Factoryblock.get(amount = 8),
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
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Factoryblock.get(amount = 16),
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
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Factoryblock.get(amount = 16),
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
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Factoryblock.get(amount = 32),
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
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Factoryblock.get(amount = 32),
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
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Factoryblock.get(amount = 64),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Gold,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Fantasyblock.get(amount = 8),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Gold,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Fantasyblock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Electrum,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Fantasyblock.get(amount = 16),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Electrum,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Fantasyblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.Stone.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.RoseGold,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Fantasyblock.get(amount = 32),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.LightConcrete.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.RoseGold,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(8),
            ),
            fluid = null,
            output = ChiselItems.Fantasyblock.get(amount = 64),
            ticks = 100,
            eu = 8,
        )
    }
}
