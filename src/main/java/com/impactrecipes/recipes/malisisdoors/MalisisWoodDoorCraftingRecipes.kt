package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class MalisisWoodDoorCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorAcacia.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'P',
                VanillaItems.Planks4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorAcacia.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'R',
                OrePrefixes.ring.get(Materials.Copper),
                'P',
                VanillaItems.Planks4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorBirch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'P',
                VanillaItems.Planks2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorBirch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'R',
                OrePrefixes.ring.get(Materials.Copper),
                'P',
                VanillaItems.Planks2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorDarkOak.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'P',
                VanillaItems.Planks5.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorDarkOak.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'R',
                OrePrefixes.ring.get(Materials.Copper),
                'P',
                VanillaItems.Planks5.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorJungle.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'P',
                VanillaItems.Planks3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorJungle.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'R',
                OrePrefixes.ring.get(Materials.Copper),
                'P',
                VanillaItems.Planks3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorSpruce.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'P',
                VanillaItems.Planks1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemDoorSpruce.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'R',
                OrePrefixes.ring.get(Materials.Copper),
                'P',
                VanillaItems.Planks1.get(),
            ),
        )
    }
}
