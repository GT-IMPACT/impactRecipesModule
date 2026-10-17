package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2CoreAndPatternCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.Item2SpatialStorageCell.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.Item2SpatialStorageCell.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.Item16SpatialStorageCell.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.Item16SpatialStorageCell.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.Item128SpatialStorageCell.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.Item128SpatialStorageCell.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.IlluminatedPanel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hVd",
                "SGS",
                "DPD",
                'P',
                OrePrefixes.plate.get(Materials.Glowstone),
                'V',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'G',
                AE2Items.QuartzGlass.get(),
                'D',
                "dustFluix",
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.IlluminatedPanel.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.BrightIlluminatedPanel.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.IlluminatedPanel.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.DarkIlluminatedPanel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.BlankPattern.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WWW",
                "PCP",
                "PQP",
                'P',
                OrePrefixes.plate.get(Materials.Plastic),
                'W',
                OrePrefixes.wireFine.get(Materials.Tin),
                'Q',
                OrePrefixes.gem.get(Materials.CertusQuartz),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.BlankPattern.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WWW",
                "PCP",
                "PQP",
                'P',
                OrePrefixes.plate.get(Materials.Plastic),
                'W',
                OrePrefixes.wireFine.get(Materials.Electrum),
                'Q',
                OrePrefixes.gem.get(Materials.CertusQuartz),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.BlankPattern.get(amount = 16),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WWW",
                "PCP",
                "PQP",
                'P',
                OrePrefixes.plate.get(Materials.Plastic),
                'W',
                OrePrefixes.wireFine.get(Materials.Platinum),
                'Q',
                OrePrefixes.gem.get(Materials.CertusQuartz),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.EnergyCell.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BPB",
                "PLP",
                "BPB",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'B',
                AE2Items.FluixBlock.get(),
                'L',
                GregTechItems.CircuitPartsCrystalChipMaster.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.DenseEnergyCell.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BPB",
                "PLP",
                "BPB",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumGallium),
                'B',
                AE2Items.EnergyCell.get(),
                'L',
                OrePrefixes.circuit.get(Materials.Elite),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.AnnihilationCore.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SFh",
                "PCG",
                "SFd",
                'P',
                OrePrefixes.plate.get(Materials.NetherQuartz),
                'F',
                OrePrefixes.foil.get(Materials.VanadiumSteel),
                'S',
                OrePrefixes.screw.get(Materials.Quartzite),
                'C',
                AE2Items.FluixCrystal.get(),
                'G',
                AE2Items.LogicProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.FormationCore.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SFh",
                "PCG",
                "SFd",
                'P',
                OrePrefixes.plate.get(Materials.CertusQuartz),
                'F',
                OrePrefixes.foil.get(Materials.VanadiumSteel),
                'S',
                OrePrefixes.screw.get(Materials.Quartzite),
                'C',
                AE2Items.FluixCrystal.get(),
                'G',
                AE2Items.LogicProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MEWirelessAccessPoint.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SIS",
                "PCP",
                "dAw",
                'P',
                OrePrefixes.plate.get(Materials.Vanadium),
                'S',
                OrePrefixes.screw.get(Materials.Titanium),
                'I',
                AE2Items.WirelessReceiver.get(),
                'C',
                AE2Items.CalculationProcessor.get(),
                'A',
                AE2Items.ItemItemMultiPart16.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.WirelessReceiver.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "EOE",
                "PIP",
                "PCP",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'I',
                OrePrefixes.stick.get(Materials.Grisium),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'E',
                AE2Items.QuartzFiber.get(),
                'O',
                AE2Items.FluixPearl.get(),
            ),
        )
    }
}
