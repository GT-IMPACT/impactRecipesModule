package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftHighSpeedRailAlloyCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HSMixIngot.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                OrePrefixes.plate.get(Materials.Silver),
                'G',
                OrePrefixes.plate.get(Materials.Bronze),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HSMixIngot.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                OrePrefixes.plate.get(Materials.Silver),
                'G',
                OrePrefixes.plate.get(Materials.Brass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HSMixIngot.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.BlackSteel),
                'T',
                OrePrefixes.plate.get(Materials.Silver),
                'G',
                OrePrefixes.plate.get(Materials.Bronze),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HSMixIngot.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.BlackSteel),
                'T',
                OrePrefixes.plate.get(Materials.Silver),
                'G',
                OrePrefixes.plate.get(Materials.Brass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HSMixIngot.get(amount = 3),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.BlackSteel),
                'T',
                OrePrefixes.plate.get(Materials.Silver),
                'G',
                OrePrefixes.plate.get(Materials.ConductiveIron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.HSMixIngot.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "I",
                "T",
                "G",
                'I',
                OrePrefixes.plate.get(Materials.BlackSteel),
                'T',
                OrePrefixes.plate.get(Materials.Silver),
                'G',
                OrePrefixes.plate.get(Materials.EnergeticAlloy),
            ),
        )
    }
}
