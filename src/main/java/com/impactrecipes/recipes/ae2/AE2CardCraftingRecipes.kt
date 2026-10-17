package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2CardCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = AE2Items.AdvancedCard.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PVS",
                "RCV",
                "PVS",
                'P',
                OrePrefixes.plate.get(Materials.Platinum),
                'V',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'S',
                OrePrefixes.screw.get(Materials.Titanium),
                'C',
                AE2Items.CalculationProcessor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.BasicCard.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PVS",
                "RCV",
                "PVS",
                'P',
                OrePrefixes.plate.get(Materials.Gold),
                'V',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'R',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'C',
                AE2Items.CalculationProcessor.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CapacityCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.BasicCard.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.ChargedCertusQuartzCrystal.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.PatternCapacityCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.AdvancedCard.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.ChargedCertusQuartzCrystal.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.CraftingCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.BasicCard.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.CalculationProcessor.get(),
                "craftingWorkBench",
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.RedstoneCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.BasicCard.get(),
                "craftingRedstoneTorch",
                "craftingRedstoneTorch",
                AE2Items.CalculationProcessor.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.FuzzyCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.AdvancedCard.get(),
                AE2Items.EngineeringProcessor.get(),
                AE2Items.LogicProcessor.get(),
                AE2Items.CalculationProcessor.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.InverterCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.AdvancedCard.get(),
                IC2Items.RedstoneInverterUpgrade.get(),
                IC2Items.RedstoneInverterUpgrade.get(),
                AE2Items.CalculationProcessor.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.AccelerationCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.AdvancedCard.get(),
                AE2Items.EngineeringProcessor.get(),
                OrePrefixes.circuit.get(Materials.Advanced),
                AE2Items.FluixCrystal.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.HyperAccelerationCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.AdvancedCard.get(),
                AE2Items.EngineeringProcessor.get(),
                OrePrefixes.circuit.get(Materials.Elite),
                ImpactItems.FlawlessFluixCrystal.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2Items.WirelessBooster.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DGE",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'E',
                OrePrefixes.plate.get(Materials.EnderPearl),
                'G',
                OrePrefixes.gem.get(Materials.CertusQuartz),
                'D',
                AE2Items.FluixDust.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.OreDictionaryFilterCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.AdvancedCard.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.CalculationProcessor.get(),
                EnderIOItems.AdvancedItemFilter.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.ThisItemIsDisabled.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.BasicCard.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.BlankPattern.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.AdvancedBlockingCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.AdvancedCard.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.CalculationProcessor.get(),
                GregTechItems.ElectricPistonHV.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2Items.StickyCard.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                AE2Items.BasicCard.get(),
                AE2Items.CalculationProcessor.get(),
                AE2Items.CalculationProcessor.get(),
                "slimeball",
            ),
        )
    }
}
