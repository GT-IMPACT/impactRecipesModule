package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class MalisisMetalHatchCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.IronTrapdoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PTP",
                "sPd",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                VanillaItems.Trapdoor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.IronTrapdoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PTP",
                "sPd",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                MalisisDoorsItems.TrapdoorAcacia.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.IronTrapdoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PTP",
                "sPd",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                MalisisDoorsItems.TrapdoorSpruce.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.IronTrapdoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PTP",
                "sPd",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                MalisisDoorsItems.TrapdoorBirch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.IronTrapdoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PTP",
                "sPd",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                MalisisDoorsItems.TrapdoorJungle.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.IronTrapdoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PTP",
                "sPd",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'T',
                MalisisDoorsItems.TrapdoorDarkOak.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.SlidingTrapdoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "S S",
                "PTP",
                "s d",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                MalisisDoorsItems.IronTrapdoor.get(),
            ),
        )
    }
}
