package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftRailbedCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.RebarRegistry.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " h ",
                "IfI",
                'I',
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.StoneTie.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " R ",
                "SSS",
                " r ",
                'R',
                RailcraftItems.Rebar.get(),
                'S',
                VanillaItems.StoneSlab.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.WoodenRailbed.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TT",
                "TT",
                " r",
                'T',
                RailcraftItems.TieWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.StoneRailbed.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TT",
                "TT",
                " r",
                'T',
                RailcraftItems.TieStone.recipeObject(),
            ),
        )
    }
}
