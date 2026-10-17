package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2DeviceCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = AE2Items.CertusQuartzCuttingKnife.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "  S",
                " S ",
                "Gf ",
                'G',
                OrePrefixes.gem.get(Materials.CertusQuartz),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.NetherQuartzCuttingKnife.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "  S",
                " S ",
                "Gf ",
                'G',
                OrePrefixes.gem.get(Materials.NetherQuartz),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.Charger.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PEP",
                "Cw ",
                "PEP",
                'P',
                OrePrefixes.plateDouble.get(Materials.Vanadium),
                'E',
                GregTechItems.EmitterEV.get(),
                'C',
                OpenComputersItems.Charger.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MEStorageHousing.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hQS",
                "TGT",
                "SVd",
                'Q',
                OrePrefixes.plate.get(Materials.CertusQuartz),
                'T',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'V',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'S',
                OrePrefixes.screw.get(Materials.Quartzite),
                'G',
                "paneGlass",
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.InterfaceBlock.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.InterfacePart.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.InterfacePart.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.InterfaceBlock.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MEConversionMonitor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dAh",
                "SDS",
                "PEP",
                'P',
                OrePrefixes.plate.get(Materials.NetherQuartz),
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'A',
                AE2Items.StorageMonitor.get(),
                'D',
                AE2Items.FormationCore.get(),
                'E',
                AE2Items.AnnihilationCore.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.CellWorkbench.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CMC",
                "PEP",
                'P',
                OrePrefixes.plate.get(Materials.Vanadium),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'E',
                AE2Items.Chest.get(),
                'M',
                GregTechItems.CoverScreen.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.IOPort.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CMC",
                "ADA",
                "PEP",
                'P',
                OrePrefixes.plate.get(Materials.Vanadium),
                'C',
                AE2Items.CalculationProcessor.get(),
                'M',
                AE2Items.MEInterfaceTerminal.get(),
                'A',
                AE2Items.Item16kMEStorageComponent.get(),
                'D',
                AE2Items.MEDrive.get(),
                'E',
                AE2Items.ItemItemMultiPart76.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MatterCondenser.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FCF",
                "CMC",
                "FCF",
                'F',
                OrePrefixes.foil.get(Materials.VanadiumSteel),
                'C',
                AE2Items.AnnihilationCore.get(),
                'M',
                AE2Items.MolecularAssembler.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MESecurityTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PMP",
                "ACA",
                "POP",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'C',
                AE2Items.Chest.get(),
                'A',
                AE2Items.ItemItemMultiPart16.get(),
                'O',
                AE2Items.Item16kMEStorageComponent.get(),
                'M',
                AE2Items.MEInterfaceTerminal.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MeteoriteCompass.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dGS",
                "PRP",
                "SPh",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'R',
                OrePrefixes.stick.get(Materials.SteelMagnetic),
                'G',
                OrePrefixes.plate.get(Materials.Glass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MeteoriteCompass.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hGS",
                "PRP",
                "SPd",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.CertusQuartz),
                'R',
                OrePrefixes.stick.get(Materials.SteelMagnetic),
                'G',
                OrePrefixes.plate.get(Materials.Glass),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.NetworkTool.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WPC",
                "O  ",
                'W',
                EnderIOItems.YetaWrench.get(),
                'P',
                "itemIlluminatedPanel",
                'C',
                AE2Items.CalculationProcessor.get(),
                'O',
                VanillaItems.Chest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.FluixPearl.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "QPQ",
                "POP",
                "QPQ",
                'P',
                OrePrefixes.plate.get(Materials.Grisium),
                'Q',
                AE2Items.PureFluixCrystal.get(),
                'O',
                OrePrefixes.lens.get(Materials.EnderPearl),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.FluixPearl.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "QPQ",
                "POP",
                "QPQ",
                'P',
                OrePrefixes.plate.get(Materials.Grisium),
                'Q',
                AE2Items.FluixCrystal.get(),
                'O',
                OrePrefixes.lens.get(Materials.EnderPearl),
            ),
        )
    }
}
