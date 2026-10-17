package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftWoodTrackCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSlow.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "S S",
                "ITI",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                RailcraftItems.RailWood.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSlowBooster.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.RailAdvanced.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSlowSwitch.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "BTC",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'B',
                OrePrefixes.bolt.get(Materials.Iron),
                'C',
                OrePrefixes.stick.get(Materials.Iron),
                'I',
                RailcraftItems.RailWood.recipeObject(),
                'T',
                RailcraftItems.TrackSlow.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSlowWye.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "BTC",
                "dIh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'B',
                OrePrefixes.bolt.get(Materials.Iron),
                'C',
                OrePrefixes.stick.get(Materials.Iron),
                'I',
                RailcraftItems.RailWood.recipeObject(),
                'T',
                RailcraftItems.TrackSlow.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSlowJunction.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "ITI",
                "dIh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                RailcraftItems.RailWood.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )
    }
}
