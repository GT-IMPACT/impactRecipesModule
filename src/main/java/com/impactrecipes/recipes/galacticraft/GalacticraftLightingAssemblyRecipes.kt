package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalacticraftLightingAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.EmitterHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.ReinforcedGlass,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.DarkSteel,
                    count = 4,
                ),
            ),
            fluid = null,
            output = GalacticraftCoreItems.TileArclamp.get(amount = 4),
            ticks = 200,
            eu = 60,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.EmitterEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.Diamond,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Vanadium,
                    count = 8,
                ),
            ),
            fluid = null,
            output = GalacticraftCoreItems.TileArclamp.get(amount = 16),
            ticks = 300,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.EmitterIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
                GalacticraftCoreItems.ItemSensorLens.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Desh,
                    count = 16,
                ),
            ),
            fluid = null,
            output = GalacticraftCoreItems.TileArclamp.get(amount = 64),
            ticks = 400,
            eu = 1024,
        )
    }
}
