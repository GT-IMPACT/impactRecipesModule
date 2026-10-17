package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2ToolAndSlabCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = AE2Items.MemoryCard.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CPP",
                "GAG",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'G',
                OrePrefixes.plate.get(Materials.Gold),
                'A',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'C',
                AE2Items.CalculationProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.ColorApplicatorEmpty.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WAW",
                "TES",
                " I ",
                'W',
                OrePrefixes.wireGt01.get(Materials.Aluminium),
                'I',
                OrePrefixes.stick.get(Materials.Aluminium),
                'S',
                AE2Items.CalculationProcessor.get(),
                'T',
                AE2Items.Item1kMEStorageComponent.get(),
                'A',
                AE2Items.FormationCore.get(),
                'E',
                AE2Items.EnergyCell.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.BiometricCard.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CPP",
                "GAG",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'G',
                OrePrefixes.plate.get(Materials.Gold),
                'A',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'C',
                AE2Items.EngineeringProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.SkyStoneSlab.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                AE2Items.SkyStone.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.SkyStoneBlockSlab.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                AE2Items.SkyStoneBlock.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.SkyStoneBrickSlab.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                AE2Items.SkyStoneBrick.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.SkyStoneSmallBrickSlab.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                AE2Items.SkyStoneSmallBrick.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.FluixSlab.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                AE2Items.FluixBlock.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.ChiseledCertusQuartzSlab.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                AE2Items.ChiseledCertusQuartzBlock.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.CertusQuartzPillarSlab.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                AE2Items.CertusQuartzPillar.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.CertusQuartzSlab.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sB",
                'B',
                AE2Items.CertusQuartzBlock.get(),
            ),
        )
    }
}
