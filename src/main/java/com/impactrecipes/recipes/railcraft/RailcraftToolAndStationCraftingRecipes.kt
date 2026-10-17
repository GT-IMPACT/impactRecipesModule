package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ProjectRedIlluminationItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Dyes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftToolAndStationCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.Crowbar.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hDS",
                "DSD",
                "SDf",
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'D',
                Dyes.dyeRed,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.CrowbarReinforced.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "hDS",
                "DSD",
                "SDf",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
                'D',
                Dyes.dyeRed,
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.WhistleTuner.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SfS",
                "SSS",
                " Sh",
                'S',
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineAlphaTradeStation.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "SGS",
                "EDE",
                "SGS",
                'E',
                OrePrefixes.plate.get(Materials.Emerald),
                'S',
                OrePrefixes.plate.get(Materials.Steel),
                'G',
                VanillaItems.GlassPane32767.get(),
                'D',
                VanillaItems.Dispenser.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineAlphaSteamTrapManual.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PBP",
                "PDP",
                "PPP",
                'B',
                VanillaItems.IronBars.get(),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'D',
                VanillaItems.Dispenser.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineAlphaSteamTrapAuto.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                " h ",
                "SHS",
                "PDP",
                'S',
                OrePrefixes.stick.get(Materials.RedAlloy),
                'H',
                RailcraftItems.MachineAlphaSteamTrapManual.get(),
                'D',
                RailcraftItems.DetectorAny.get(),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MachineAlphaFeedStation.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PCP",
                "CSC",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Wood),
                'S',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                VanillaItems.GoldenCarrot.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.TrackmanSGoggles.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LBL",
                "RSR",
                "PCP",
                'L',
                OrePrefixes.lens.get(Materials.Glass),
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'B',
                OrePrefixes.bolt.get(Materials.Steel),
                'P',
                VanillaItems.Leather.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.MagnifyingGlass.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "  L",
                " R ",
                "S  ",
                'L',
                OrePrefixes.lens.get(Materials.Glass),
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'S',
                OrePrefixes.stick.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SignalLamp.get(amount = 8),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "GIP",
                "GOP",
                "GNP",
                'G',
                "paneGlass",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'I',
                ProjectRedIlluminationItems.InvertedGreenLamp.get(),
                'O',
                ProjectRedIlluminationItems.InvertedYellowLamp.get(),
                'N',
                ProjectRedIlluminationItems.InvertedRedLamp.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.LapotronLoaderUpgrade.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "PCP",
                "WLW",
                "PCP",
                'W',
                OrePrefixes.itemCasing.get(Materials.Aluminium),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'P',
                OrePrefixes.cableGt02.get(Materials.Platinum),
                'L',
                GregTechItems.LapotronCrystal.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.IronBoreHead.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "GPG",
                "PBP",
                "GPG",
                'B',
                OrePrefixes.block.get(Materials.Iron),
                'G',
                OrePrefixes.gearGt.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.SteelBoreHead.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "GPG",
                "PBP",
                "GPG",
                'B',
                OrePrefixes.block.get(Materials.Steel),
                'G',
                OrePrefixes.gearGt.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DiamondBoreHead.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "DD ",
                'D',
                GregTechItems.ComponentGrinderDiamond.get(),
            ),
        )
    }
}
