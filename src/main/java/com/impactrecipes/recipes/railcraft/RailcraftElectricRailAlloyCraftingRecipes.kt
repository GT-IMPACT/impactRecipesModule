package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftElectricRailAlloyCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ElectricMixIngot.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                OrePrefixes.plate.get(Materials.Tin),
                'G',
                OrePrefixes.plate.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ElectricMixIngot.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                OrePrefixes.plate.get(Materials.Zinc),
                'G',
                OrePrefixes.plate.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ElectricMixIngot.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                OrePrefixes.plate.get(Materials.Tin),
                'G',
                OrePrefixes.plate.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ElectricMixIngot.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                OrePrefixes.plate.get(Materials.Zinc),
                'G',
                OrePrefixes.plate.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ElectricMixIngot.get(amount = 3),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                OrePrefixes.plate.get(Materials.Tin),
                'G',
                OrePrefixes.plate.get(Materials.AnnealedCopper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ElectricMixIngot.get(amount = 3),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                OrePrefixes.plate.get(Materials.Zinc),
                'G',
                OrePrefixes.plate.get(Materials.AnnealedCopper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ElectricMixIngot.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                OrePrefixes.plate.get(Materials.Aluminium),
                'G',
                OrePrefixes.plate.get(Materials.AnnealedCopper),
            ),
        )
    }
}
