package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceCanisterRecyclingRecipes {

    internal fun register() {
        MachineRecipes.arcFurnace(
            input = ModItemVariant(
                item = GalaxySpaceItems.ItemOxygentankT4,
                meta = GT_Values.W.toInt(),
            ).get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Draconium,
                    count = 21,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Chrome,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.arcFurnace(
            input = ModItemVariant(
                item = GalaxySpaceItems.ItemOxygentankT5,
                meta = GT_Values.W.toInt(),
            ).get(),
            outputs = arrayOf(
                ImpactItems.MysteriousCrystalIngot.get(amount = 21),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Iridium,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 1100,
            eu = 4092,
        )

        MachineRecipes.arcFurnace(
            input = ModItemVariant(
                item = GalaxySpaceItems.ItemOxygentankT6,
                meta = GT_Values.W.toInt(),
            ).get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Quantium,
                    count = 21,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Osmium,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 1200,
            eu = 7680,
        )
    }
}
