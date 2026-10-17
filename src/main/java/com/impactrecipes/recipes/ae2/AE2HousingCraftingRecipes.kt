package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.AE2StuffItems
import com.impactrecipes.items.AE2WirelessCraftingTerminalItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2HousingCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = AE2WirelessCraftingTerminalItems.WirelessCraftingTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SAE",
                "PTP",
                "PBP",
                'P',
                OrePrefixes.plate.get(Materials.HastelloyN),
                'E',
                GregTechItems.EmitterIV.get(),
                'B',
                GregTechItems.BatteryHullIVFull.get(),
                'S',
                GregTechItems.SensorIV.get(),
                'T',
                AE2Items.MECraftingTerminal.get(),
                'A',
                AE2Items.WirelessReceiver.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2StuffItems.WirelessKit.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SWS",
                "PAP",
                "dIw",
                'S',
                OrePrefixes.screw.get(Materials.Titanium),
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'I',
                OrePrefixes.stick.get(Materials.Birmabright),
                'W',
                AE2Items.WirelessReceiver.get(),
                'A',
                AE2Items.NetworkTool.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2StuffItems.NetworkVisualiser.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "E S",
                "PMP",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'E',
                GregTechItems.EmitterEV.get(),
                'S',
                GregTechItems.SensorEV.get(),
                'M',
                OpenComputersItems.HologramProjectorTier2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2StuffItems.PatternEncoder.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "POP",
                "ACA",
                "PEP",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'O',
                AE2Items.MEPatternTerminal.get(),
                'A',
                AE2Items.CalculationProcessor.get(),
                'C',
                AE2Items.CraftingUnit.get(),
                'E',
                AE2Items.ItemItemMultiPart16.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MEAdvancedStorageHousing.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hGS",
                "TOT",
                "SVd",
                'O',
                AE2Items.MEStorageHousing.get(),
                'T',
                OrePrefixes.plate.get(Materials.Iridium),
                'V',
                OrePrefixes.plate.get(Materials.HastelloyC276),
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'G',
                OrePrefixes.plate.get(Materials.ReinforcedGlass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.FluidStorageHousing.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hQS",
                "TGT",
                "SVd",
                'Q',
                OrePrefixes.plate.get(Materials.CertusQuartz),
                'T',
                OrePrefixes.plate.get(Materials.RedSteel),
                'V',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'S',
                OrePrefixes.screw.get(Materials.NetherQuartz),
                'G',
                "paneGlass",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.MEAdvancedFluidStorageHousing.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hGS",
                "TOT",
                "SVd",
                'O',
                AE2FCItems.FluidStorageHousing.get(),
                'T',
                OrePrefixes.plate.get(Materials.Stellite),
                'V',
                OrePrefixes.plate.get(Materials.HastelloyC276),
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'G',
                OrePrefixes.plate.get(Materials.ReinforcedGlass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.MEMultiFluidStorageHousing.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hQS",
                "TGT",
                "SVd",
                'Q',
                OrePrefixes.plate.get(Materials.CertusQuartz),
                'T',
                OrePrefixes.plate.get(Materials.Birmabright),
                'V',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'S',
                OrePrefixes.screw.get(Materials.NetherQuartz),
                'G',
                "paneGlass",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.MEAdvancedMultiFluidStorageHousing.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hGS",
                "TOT",
                "SVd",
                'O',
                AE2FCItems.MEMultiFluidStorageHousing.get(),
                'T',
                OrePrefixes.plate.get(Materials.Grisium),
                'V',
                OrePrefixes.plate.get(Materials.HastelloyC276),
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'G',
                OrePrefixes.plate.get(Materials.ReinforcedGlass),
            ),
        )
    }
}
