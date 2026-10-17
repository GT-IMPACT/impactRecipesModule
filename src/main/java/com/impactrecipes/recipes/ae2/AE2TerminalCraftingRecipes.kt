package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2TerminalCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = AE2Items.METerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RSR",
                "ICP",
                "RdR",
                'R',
                OrePrefixes.stick.get(Materials.NetherQuartz),
                'S',
                OrePrefixes.screw.get(Materials.Quartzite),
                'I',
                "itemIlluminatedPanel",
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'P',
                OrePrefixes.plate.get(Materials.CertusQuartz),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.METerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RdR",
                "ICP",
                "RSR",
                'R',
                OrePrefixes.stick.get(Materials.NetherQuartz),
                'S',
                OrePrefixes.screw.get(Materials.Quartzite),
                'I',
                "itemIlluminatedPanel",
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'P',
                OrePrefixes.plate.get(Materials.CertusQuartz),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MECraftingTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTh",
                "SOS",
                "PCP",
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'P',
                OrePrefixes.plate.get(Materials.NetherQuartz),
                'T',
                AE2Items.METerminal.get(),
                'O',
                GregTechItems.CoverCrafting.get(),
                'C',
                AE2Items.EngineeringProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MEInterfaceTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTh",
                "SOS",
                "PCP",
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'P',
                OrePrefixes.plate.get(Materials.NetherQuartz),
                'T',
                AE2Items.METerminal.get(),
                'O',
                AE2Items.InterfacePart.get(),
                'C',
                AE2Items.EngineeringProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MEPatternTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTh",
                "SOS",
                "PCP",
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'P',
                OrePrefixes.plate.get(Materials.NetherQuartz),
                'T',
                AE2Items.METerminal.get(),
                'O',
                AE2Items.BlankPattern.get(),
                'C',
                AE2Items.EngineeringProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.StorageMonitor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTh",
                "SOS",
                "PPP",
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'P',
                OrePrefixes.plate.get(Materials.NetherQuartz),
                'T',
                "itemIlluminatedPanel",
                'O',
                AE2Items.LevelEmitter.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.WirelessTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WTW",
                "PCP",
                "PEP",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'T',
                AE2Items.METerminal.get(),
                'W',
                AE2Items.WirelessReceiver.get(),
                'C',
                AE2Items.EngineeringProcessor.get(),
                'E',
                AE2Items.DenseEnergyCell.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.VibrantQuartzGlass.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DPD",
                "PGP",
                "DPD",
                'D',
                OrePrefixes.dust.get(Materials.Glowstone),
                'P',
                OrePrefixes.plate.get(Materials.Glowstone),
                'G',
                AE2Items.QuartzGlass.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.ChargedQuartzFixture.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                OrePrefixes.gem.get(Materials.CertusQuartz),
                OrePrefixes.stick.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.LightDetectingFixture.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.ChargedCertusQuartzCrystal.get(),
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )
    }
}
