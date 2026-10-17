package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftControlTrackCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackControl.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SRS",
                "ITI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                OrePrefixes.stick.get(Materials.RedAlloy),
                'I',
                RailcraftItems.RailAdvanced.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackLocking.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                OrePrefixes.stick.get(Materials.RedAlloy),
                'P',
                VanillaItems.StonePressurePlate.get(),
                'I',
                RailcraftItems.RailAdvanced.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackDisembark.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                OrePrefixes.stick.get(Materials.RedAlloy),
                'P',
                RailcraftItems.DetectorAdvanced.get(),
                'I',
                RailcraftItems.RailAdvanced.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackEmbarking.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SRS",
                "ITI",
                "dPh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                OrePrefixes.stick.get(Materials.RedAlloy),
                'P',
                RailcraftItems.DetectorAdvanced.get(),
                'I',
                RailcraftItems.RailAdvanced.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackCoupler.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SCS",
                "ITI",
                "dCh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'C',
                RailcraftItems.CrowbarReinforced.get(),
                'I',
                RailcraftItems.RailAdvanced.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackWhistle.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SWS",
                "ITI",
                "dOh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'W',
                RailcraftItems.WhistleTuner.get(),
                'O',
                GregTechItems.CasingStripesA.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackLocomotive.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SOS",
                "ITI",
                "dOh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'O',
                RailcraftItems.SignalBlockSignal.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackLimiter.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dDh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'D',
                RailcraftItems.DetectorAny.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackRouting.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dDh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'D',
                RailcraftItems.Ticket.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackRouting.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dDh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'D',
                RailcraftItems.TicketGold.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackBufferStop.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dBh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'B',
                OrePrefixes.block.get(Materials.Iron),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackOneway.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                VanillaItems.StonePressurePlate.get(),
                'R',
                VanillaItems.Piston.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackDetectorDirection.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SPS",
                "ITI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'R',
                RailcraftItems.DetectorAdvanced.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackGatedOneway.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SRS",
                "ITI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                VanillaItems.Fence.get(),
                'I',
                RailcraftItems.RailAdvanced.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackGated.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SRS",
                "ITI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                VanillaItems.Fence.get(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
                'T',
                RailcraftItems.RailbedWood.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackSuspended.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SRS",
                "IRI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                RailcraftItems.TieWood.recipeObject(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackDisposal.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SRS",
                "IPI",
                "dRh",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'R',
                RailcraftItems.TieWood.recipeObject(),
                'I',
                RailcraftItems.RailStandard.recipeObject(),
            ),
        )
    }
}
