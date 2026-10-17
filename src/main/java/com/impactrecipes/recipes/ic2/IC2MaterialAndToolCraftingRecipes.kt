package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class IC2MaterialAndToolCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = IC2Items.CopperBoiler.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "SwS",
                "CCC",
                'C',
                OrePrefixes.itemCasing.get(Materials.Copper),
                'S',
                OrePrefixes.screw.get(Materials.Copper),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ModItemVariant(
                item = IC2Items.Windmeter,
                meta = 26,
            ).get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SRd",
                "GIG",
                "PBP",
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.StainlessSteel),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'R',
                OrePrefixes.rotor.get(Materials.Aluminium),
                'B',
                "batteryBasic",
                'I',
                IC2Items.SmallPowerUnit.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.ConstructionFoamPowder.get(amount = 5),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCS",
                "YA ",
                'C',
                OrePrefixes.dust.get(Materials.Calcite),
                'S',
                OrePrefixes.dust.get(Materials.Stone),
                'Y',
                OrePrefixes.dust.get(Materials.Clay),
                'A',
                "sand",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.MugEmpty.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ShS",
                " S ",
                'S',
                "stone",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Treetap.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " S ",
                "PPP",
                "P  ",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                OrePrefixes.plank.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Crop.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "S S",
                "S S",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.EcMeter.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PMP",
                "SCS",
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'C',
                OrePrefixes.springSmall.get(Materials.Copper),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'M',
                GregTechItems.CoverScreen.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.CoalBall.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "CBC",
                "CCC",
                'C',
                OrePrefixes.dust.get(Materials.Coal),
                'B',
                "itemFlint",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.CoalChunk.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "CBC",
                "CCC",
                'C',
                IC2Items.CompressedCoalBall.get(),
                'B',
                "blockIron",
            ),
        )
    }
}
