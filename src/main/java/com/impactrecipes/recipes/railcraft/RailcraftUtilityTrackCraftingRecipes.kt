package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.ComputeryItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftUtilityTrackCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSwitch.get(amount = 2),
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
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                VanillaItems.Rail.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackWye.get(amount = 2),
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
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                VanillaItems.Rail.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackJunction.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SIS",
                "ITI",
                "dIh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackPriming.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SDS",
                "ITI",
                "dMh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'D',
                VanillaItems.StonePressurePlate.get(),
                'M',
                VanillaItems.FlintAndSteel.get(),
                'I',
                RailcraftItems.RailReinforced.recipeObject(),
                'T',
                RailcraftItems.RailbedStone.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackLauncher.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "STS",
                "PNP",
                "dBh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'B',
                OrePrefixes.block.get(Materials.Steel),
                'N',
                VanillaItems.Piston.get(),
                'T',
                RailcraftItems.TrackReinforced.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Rail.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "S S",
                "ITI",
                "d h",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.GoldenRail.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                RailcraftItems.RailAdvanced.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.DetectorRail.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SDS",
                "ITI",
                "dAh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'A',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'D',
                VanillaItems.StonePressurePlate.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.ActivatorRail.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SDS",
                "ITI",
                "dAh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'A',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'D',
                VanillaItems.RedstoneTorch.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ComputeryItems.NfcTrack.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SDS",
                "ITI",
                "dAh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'A',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'D',
                ComputeryItems.MetaItem3.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )
    }
}
