package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import mods.railcraft.common.blocks.tracks.EnumTrack

internal class RailcraftHighSpeedTrackCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSpeed.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "S S",
                "ITI",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'I',
                RailcraftItems.RailSpeed.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSpeedBoost.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.RailSpeed.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSpeedTransition.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "IPI",
                "STS",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.RailSpeed.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSpeedSwitch.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "BTC",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'B',
                OrePrefixes.bolt.get(Materials.Steel),
                'C',
                OrePrefixes.stick.get(Materials.Steel),
                'I',
                RailcraftItems.RailSpeed.recipeObject(),
                'T',
                EnumTrack.SPEED,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSpeedWye.get(amount = 2),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "BTC",
                "dIh",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'B',
                OrePrefixes.bolt.get(Materials.Steel),
                'C',
                OrePrefixes.stick.get(Materials.Steel),
                'I',
                RailcraftItems.RailSpeed.recipeObject(),
                'T',
                EnumTrack.SPEED,
            ),
        )
    }
}
