package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class GalaxySpaceComponentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.Glass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Desh,
                count = 8,
            ),
            output = GalaxySpaceItems.Futureglass.get(),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalacticraftCoreItems.ItemBasicItem9.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Steel,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = GalaxySpaceItems.ItemBasicItems.get(),
            ticks = 50,
            eu = 16,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GalaxySpaceItems.ItemBasicItems.get(),
                GalaxySpaceItems.ItemCompressedPlates4.get(amount = 2),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.HSLA.getMolten(72),
            output = GalaxySpaceItems.ItemModules3.get(),
            ticks = 100,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = GalaxySpaceItems.ItemOxygentankT410800.get(),
            secondaryInput = GalacticraftCoreItems.ItemOxygenConcentrator.get(),
            output = GalaxySpaceItems.ItemOxygentankEppT110800.get(),
            ticks = 600,
            eu = 4092,
        )
    }
}
