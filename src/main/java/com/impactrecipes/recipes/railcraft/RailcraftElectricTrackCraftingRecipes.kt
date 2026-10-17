package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftElectricTrackCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackElectric.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "S S",
                "ITI",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'I',
                RailcraftItems.RailElectric.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackElectricSwitch.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "BTC",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'B',
                OrePrefixes.bolt.get(Materials.Steel),
                'C',
                OrePrefixes.stick.get(Materials.Steel),
                'I',
                RailcraftItems.RailElectric.recipeObject(),
                'T',
                RailcraftItems.TrackElectric.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackElectricWye.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "BTC",
                "dIh",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'B',
                OrePrefixes.bolt.get(Materials.Steel),
                'C',
                OrePrefixes.stick.get(Materials.Steel),
                'I',
                RailcraftItems.RailElectric.recipeObject(),
                'T',
                RailcraftItems.TrackElectric.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackElectricJunction.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "ITI",
                "dIh",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'I',
                RailcraftItems.RailElectric.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )
    }
}
