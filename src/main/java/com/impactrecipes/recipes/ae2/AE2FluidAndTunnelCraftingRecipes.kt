package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2FluidAndTunnelCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.PartFluidTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PAP",
                "FTY",
                "PAP",
                'P',
                OrePrefixes.plate.get(Materials.Lapis),
                'A',
                AE2Items.ItemItemMultiPart16.get(),
                'F',
                AE2Items.FormationCore.get(),
                'Y',
                AE2Items.AnnihilationCore.get(),
                'T',
                AE2Items.METerminal.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.LevelTerminal.get(),
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
                AE2FCItems.MELevelMaintainer.get(),
                'C',
                AE2Items.EngineeringProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.PortableCell.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " A ",
                "SBS",
                "dIw",
                'S',
                OrePrefixes.screw.get(Materials.VanadiumSteel),
                'A',
                AE2Items.Item1kMEStorageComponent.get(),
                'B',
                AE2Items.Chest.get(),
                'I',
                AE2Items.MEStorageHousing.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.BlockContainerMEStorageCell.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " A ",
                "SBS",
                "dIw",
                'S',
                OrePrefixes.screw.get(Materials.VanadiumSteel),
                'A',
                AE2Items.Item1kMEStorageComponent.get(),
                'B',
                AE2Items.Chest.get(),
                'I',
                AE2Items.MEAdvancedStorageHousing.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.PortableFluidCell.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " A ",
                "SBS",
                "dIw",
                'S',
                OrePrefixes.screw.get(Materials.VanadiumSteel),
                'A',
                AE2FCItems.FluidStorageComponent1k.get(),
                'B',
                AE2Items.Chest.get(),
                'I',
                AE2Items.EnergyCell.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.CertusQuartzWrench.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "QwQ",
                "QQQ",
                " Q ",
                'Q',
                "gemCertusQuartz",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.NetherQuartzWrench.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "QwQ",
                "QQQ",
                " Q ",
                'Q',
                "gemNetherQuartz",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.P2PTunnelGTEU.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "d  ",
                " O ",
                "   ",
                'O',
                AE2Items.P2PTunnelME.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.P2PTunnelItem.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " d ",
                " O ",
                "   ",
                'O',
                AE2Items.P2PTunnelME.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.P2PTunnelLight.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "  d",
                " O ",
                "   ",
                'O',
                AE2Items.P2PTunnelME.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.P2PTunnelFluid.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "   ",
                " Od",
                "   ",
                'O',
                AE2Items.P2PTunnelME.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.P2PTunnelRedstone.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "   ",
                " O ",
                "  d",
                'O',
                AE2Items.P2PTunnelME.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.P2PTunnelOpenComputers.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "   ",
                " O ",
                " d ",
                'O',
                AE2Items.P2PTunnelME.get(),
            ),
        )
    }
}
