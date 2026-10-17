package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class NuclearControlDeviceCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shaped(
            output = NuclearControlItems.ThermalMonitor.get(),
            recipe = arrayOf(
                "AAA",
                "BCB",
                "DED",
                'A',
                "glassReinforced",
                'B',
                OrePrefixes.plateDense.get(Materials.Lead),
                'C',
                GregTechItems.CoverScreen.get(),
                'D',
                OrePrefixes.circuit.get(Materials.Advanced),
                'E',
                GregTechItems.CoverActivityDetector.get(),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.IndustrialAlarm.get(),
            recipe = arrayOf(
                "ABA",
                "CDC",
                "EFE",
                'A',
                "glassReinforced",
                'B',
                NuclearControlItems.WhiteLamp.get(),
                'C',
                VanillaItems.Repeater.get(),
                'D',
                NuclearControlItems.HowlerAlarm.get(),
                'E',
                OrePrefixes.cableGt01.get(Materials.Gold),
                'F',
                GregTechItems.HullBronze.get(),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.HowlerAlarm.get(),
            recipe = arrayOf(
                "ABA",
                "CDC",
                "EFE",
                'A',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                VanillaItems.Noteblock.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'D',
                IC2Items.Coil.get(),
                'E',
                OrePrefixes.cableGt01.get(Materials.RedAlloy),
                'F',
                IC2Items.MachineCasing.get(),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.RemoteThermalMonitor.get(),
            recipe = arrayOf(
                "ABC",
                "DED",
                "FGF",
                'A',
                GregTechItems.SensorLV.get(),
                'B',
                "glassReinforced",
                'C',
                GregTechItems.EmitterLV.get(),
                'D',
                GregTechItems.CoverScreen.get(),
                'E',
                GregTechItems.CasingSolidSteel.get(),
                'F',
                OrePrefixes.circuit.get(Materials.Basic),
                'G',
                NuclearControlItems.ThermalMonitor.get(),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.EnergyCounter.get(),
            recipe = arrayOf(
                "ABA",
                "CDC",
                "AEA",
                'A',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                GregTechItems.CoverScreen.get(),
                'C',
                OrePrefixes.cableGt01.get(Materials.Platinum),
                'D',
                GregTechItems.TransformerIVEV.get(),
                'E',
                OrePrefixes.circuit.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.AverageCounter.get(),
            recipe = arrayOf(
                "ABA",
                "CDC",
                "AEA",
                'A',
                OrePrefixes.plate.get(Materials.Lead),
                'B',
                GregTechItems.CoverScreen.get(),
                'C',
                OrePrefixes.cableGt01.get(Materials.Platinum),
                'D',
                GregTechItems.TransformerIVEV.get(),
                'E',
                OrePrefixes.circuit.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.RangeTrigger.get(),
            recipe = arrayOf(
                "ABA",
                "CDC",
                "EFE",
                'A',
                OrePrefixes.plate.get(Materials.Steel),
                'B',
                GregTechItems.CoverScreen.get(),
                'C',
                OrePrefixes.cableGt01.get(Materials.Platinum),
                'D',
                GregTechItems.HullHV.get(),
                'E',
                OrePrefixes.circuit.get(Materials.Advanced),
                'F',
                IC2Items.FrequencyTransmitter.get(),
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.WhiteLamp.get(),
            recipe = arrayOf(
                "AAA",
                "ABA",
                "ACA",
                'A',
                "paneGlassWhite",
                'B',
                VanillaItems.RedstoneLamp.get(),
                'C',
                "wireGt01RedAlloy",
            ),
        )
    }
}
