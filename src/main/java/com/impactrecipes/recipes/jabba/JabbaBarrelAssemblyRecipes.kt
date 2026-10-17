package com.impactrecipes.recipes.jabba

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.JabbaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class JabbaBarrelAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Wood,
                    count = 1,
                ),
                ExtraUtilitiesItems.ChestFull.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = JabbaItems.Barrel.get(),
            ticks = 100,
            eu = 8,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iron,
                    count = 1,
                ),
                ExtraUtilitiesItems.ChestFull.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = JabbaItems.Barrel.get(amount = 2),
            ticks = 100,
            eu = 10,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Bronze,
                    count = 1,
                ),
                ExtraUtilitiesItems.ChestFull.get(amount = 2),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = JabbaItems.Barrel.get(amount = 2),
            ticks = 100,
            eu = 10,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 1,
                ),
                ExtraUtilitiesItems.ChestFull.get(amount = 4),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = JabbaItems.Barrel.get(amount = 4),
            ticks = 100,
            eu = 12,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                ExtraUtilitiesItems.ChestFull.get(amount = 8),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = JabbaItems.Barrel.get(amount = 8),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                ExtraUtilitiesItems.ChestFull.get(amount = 16),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = JabbaItems.Barrel.get(amount = 16),
            ticks = 100,
            eu = 24,
        )
    }
}
