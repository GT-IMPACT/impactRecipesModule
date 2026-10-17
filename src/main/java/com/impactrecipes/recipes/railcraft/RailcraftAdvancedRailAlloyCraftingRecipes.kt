package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftAdvancedRailAlloyCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AdvancedMixIngot.get(),
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
                OrePrefixes.plate.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AdvancedMixIngot.get(),
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
                OrePrefixes.plate.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AdvancedMixIngot.get(amount = 2),
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
                OrePrefixes.plate.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AdvancedMixIngot.get(amount = 2),
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
                OrePrefixes.plate.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AdvancedMixIngot.get(amount = 3),
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
                OrePrefixes.plate.get(Materials.Electrum),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AdvancedMixIngot.get(amount = 3),
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
                OrePrefixes.plate.get(Materials.Electrum),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AdvancedMixIngot.get(amount = 4),
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
                OrePrefixes.plate.get(Materials.Electrum),
            ),
        )
    }
}
