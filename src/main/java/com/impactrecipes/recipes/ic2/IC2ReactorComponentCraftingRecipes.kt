package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class IC2ReactorComponentCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = IC2Items.FrequencyTransmitter.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " S ",
                "PBP",
                " C ",
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'P',
                OrePrefixes.itemCasing.get(Materials.Iron),
                'B',
                VanillaItems.StoneButton.get(),
                'S',
                GregTechItems.SensorLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ReactorVent,
                meta = 1,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PBP",
                "BwB",
                "PBP",
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'B',
                VanillaItems.IronBars.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ReactorVentCore,
                meta = 1,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CSC",
                "SVS",
                "CSC",
                'C',
                OrePrefixes.plateDouble.get(Materials.Copper),
                'S',
                OrePrefixes.plate.get(Materials.Silver),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorVent,
                    meta = 1,
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.AdvancedHeatVent,
                meta = 1,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BVB",
                "BDB",
                "BVB",
                'D',
                OrePrefixes.gem.get(Materials.Diamond),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorVentCore,
                    meta = 1,
                ).get(),
                'B',
                ImpactItems.SteelBars.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ReactorVentGold,
                meta = 1,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CSC",
                "SVS",
                "CSC",
                'C',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'S',
                OrePrefixes.plate.get(Materials.Gold),
                'V',
                ModItemVariant(
                    item = IC2Items.AdvancedHeatVent,
                    meta = 1,
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.ReactorVentSpread.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CSC",
                "SVS",
                "CSC",
                'C',
                ImpactItems.SteelBars.get(),
                'S',
                OrePrefixes.plateDense.get(Materials.Tin),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorVent,
                    meta = 1,
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ReactorHeatSwitch,
                meta = 1,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "COC",
                "SVS",
                "CSC",
                'C',
                OrePrefixes.plate.get(Materials.Silver),
                'S',
                OrePrefixes.plate.get(Materials.Aluminium),
                'V',
                OrePrefixes.plate.get(Materials.Copper),
                'O',
                OrePrefixes.circuit.get(Materials.Basic),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ReactorHeatSwitchCore,
                meta = 1,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CSC",
                "SVS",
                "CSC",
                'C',
                OrePrefixes.plateDouble.get(Materials.Copper),
                'S',
                OrePrefixes.plate.get(Materials.Silver),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorHeatSwitch,
                    meta = 1,
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.ReactorHeatSwitchSpread,
                meta = 1,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CSC",
                "SVS",
                "CSC",
                'C',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'S',
                OrePrefixes.plate.get(Materials.Gold),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorHeatSwitchCore,
                    meta = 1,
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.AdvancedHeatExchanger,
                meta = 1,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LCL",
                "VDV",
                "LCL",
                'L',
                OrePrefixes.plate.get(Materials.Lapis),
                'D',
                OrePrefixes.plate.get(Materials.Diamond),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorHeatSwitchSpread,
                    meta = 1,
                ).get(),
            ),
        )
    }
}
