package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftRailComponentCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailWood.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "ITW",
                'I',
                OrePrefixes.stick.get(Materials.Iron),
                'W',
                OrePrefixes.stick.get(Materials.Wood),
                'T',
                RailcraftItems.TieWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailWood.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "ITW",
                "ITW",
                'I',
                OrePrefixes.stick.get(Materials.Iron),
                'W',
                OrePrefixes.stick.get(Materials.Wood),
                'T',
                RailcraftItems.TieWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailWood.get(amount = 6),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "ITW",
                "ITW",
                "ITW",
                'I',
                OrePrefixes.stick.get(Materials.Iron),
                'W',
                OrePrefixes.stick.get(Materials.Wood),
                'T',
                RailcraftItems.TieWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.ExtruderShapeRail.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "f",
                "P",
                "x",
                'P',
                GregTechItems.ShapeEmpty.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailStandard.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " I ",
                "hIf",
                " I ",
                'I',
                OrePrefixes.stickLong.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailStandard.get(amount = 5),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " I ",
                "hIf",
                " I ",
                'I',
                OrePrefixes.stickLong.get(Materials.WroughtIron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailStandard.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " I ",
                "hIf",
                " I ",
                'I',
                OrePrefixes.stickLong.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailAdvanced.get(amount = 6),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " I ",
                "hIf",
                " I ",
                'I',
                ImpactItems.AdvancedMixIngot.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailElectric.get(amount = 6),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " I ",
                "hIf",
                " I ",
                'I',
                ImpactItems.ElectricMixIngot.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailReinforced.get(amount = 6),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " I ",
                "hIf",
                " I ",
                'I',
                ImpactItems.ReinforcedMixIngot.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RailSpeed.get(amount = 6),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " I ",
                "hIf",
                " I ",
                'I',
                ImpactItems.HSMixIngot.get(),
            ),
        )
    }
}
