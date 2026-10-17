package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftReinforcedTrackCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackReinforced.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "S S",
                "ITI",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Birmabright),
                'I',
                RailcraftItems.RailReinforced.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackReinforcedBooster.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Birmabright),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.RailReinforced.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackReinforcedSwitch.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "BTC",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Birmabright),
                'B',
                OrePrefixes.bolt.get(Materials.Birmabright),
                'C',
                OrePrefixes.stick.get(Materials.Birmabright),
                'I',
                RailcraftItems.RailReinforced.recipeObject(),
                'T',
                RailcraftItems.TrackReinforced.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackReinforcedWye.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "BTC",
                "dIh",
                'S',
                OrePrefixes.screw.get(Materials.Birmabright),
                'B',
                OrePrefixes.bolt.get(Materials.Birmabright),
                'C',
                OrePrefixes.stick.get(Materials.Birmabright),
                'I',
                RailcraftItems.RailReinforced.recipeObject(),
                'T',
                RailcraftItems.TrackReinforced.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackReinforcedJunction.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "ITI",
                "dIh",
                'S',
                OrePrefixes.screw.get(Materials.Birmabright),
                'I',
                RailcraftItems.RailReinforced.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )
    }
}
