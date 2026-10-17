package com.impactrecipes.recipes.catwalks

import com.impactrecipes.items.CatwalksItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class CatwalksAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 3,
                ),
                CatwalksItems.Steelgrate.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = CatwalksItems.SupportColumn.get(amount = 2),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Birmabright,
                    count = 3,
                ),
                CatwalksItems.Steelgrate.get(amount = 4),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = CatwalksItems.SupportColumn.get(amount = 4),
            ticks = 150,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.StainlessSteel,
                    count = 3,
                ),
                CatwalksItems.Steelgrate.get(amount = 8),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = CatwalksItems.SupportColumn.get(amount = 8),
            ticks = 150,
            eu = 48,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.HSLA,
                    count = 3,
                ),
                CatwalksItems.Steelgrate.get(amount = 16),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = CatwalksItems.SupportColumn.get(amount = 16),
            ticks = 150,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.MaragingSteel300,
                    count = 3,
                ),
                CatwalksItems.Steelgrate.get(amount = 32),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = CatwalksItems.SupportColumn.get(amount = 32),
            ticks = 150,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 2,
                ),
                CatwalksItems.Steelgrate.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = CatwalksItems.Scaffold.get(amount = 2),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Birmabright,
                    count = 2,
                ),
                CatwalksItems.Steelgrate.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = CatwalksItems.Scaffold.get(amount = 4),
            ticks = 120,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                CatwalksItems.Steelgrate.get(amount = 4),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = CatwalksItems.Scaffold.get(amount = 8),
            ticks = 140,
            eu = 48,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.HSLA,
                    count = 2,
                ),
                CatwalksItems.Steelgrate.get(amount = 8),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = CatwalksItems.Scaffold.get(amount = 16),
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.MaragingSteel300,
                    count = 2,
                ),
                CatwalksItems.Steelgrate.get(amount = 16),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = CatwalksItems.Scaffold.get(amount = 32),
            ticks = 180,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                CatwalksItems.Steelgrate.get(amount = 4),
                VanillaItems.Ladder.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = CatwalksItems.CagedLadder.get(amount = 6),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.wireFine,
                material = Materials.Steel,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Glowstone,
                count = 1,
            ),
            output = CatwalksItems.RopeLight.get(amount = 8),
            ticks = 100,
            eu = 16,
        )
    }
}
