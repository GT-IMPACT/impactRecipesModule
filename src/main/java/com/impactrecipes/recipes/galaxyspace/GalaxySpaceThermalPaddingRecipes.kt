package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class GalaxySpaceThermalPaddingRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.MeteoricSteel,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Titanium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tungsten,
                    count = 4,
                ),
                GalacticraftMarsItems.ItemItemBasicAsteroids7.get(),
            ),
            fluid = Materials.Polycaprolactam.getMolten(576),
            output = GalaxySpaceItems.ItemThermalClothT2.get(),
            ticks = 200,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemThermalClothT2.get(amount = 5),
            secondaryInput = GT_Utility.getIntegratedCircuit(5),
            output = GalaxySpaceItems.ItemThermalPaddingT2.get(),
            ticks = 1500,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemThermalClothT2.get(amount = 8),
            secondaryInput = GT_Utility.getIntegratedCircuit(8),
            output = GalaxySpaceItems.ItemThermalPaddingT21.get(),
            ticks = 2400,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemThermalClothT2.get(amount = 7),
            secondaryInput = GT_Utility.getIntegratedCircuit(7),
            output = GalaxySpaceItems.ItemThermalPaddingT22.get(),
            ticks = 2100,
            eu = 7680,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemThermalClothT2.get(amount = 4),
            secondaryInput = GT_Utility.getIntegratedCircuit(4),
            output = GalaxySpaceItems.ItemThermalPaddingT23.get(),
            ticks = 1200,
            eu = 7680,
        )
    }
}
