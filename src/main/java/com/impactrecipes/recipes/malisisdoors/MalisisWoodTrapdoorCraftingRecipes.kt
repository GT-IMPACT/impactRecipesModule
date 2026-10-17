package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class MalisisWoodTrapdoorCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorAcacia.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SSS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                VanillaItems.WoodenSlab4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorAcacia.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                VanillaItems.WoodenSlab4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorAcacia.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                VanillaItems.WoodenSlab4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorSpruce.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SSS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                VanillaItems.WoodenSlab1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorSpruce.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                VanillaItems.WoodenSlab1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorSpruce.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                VanillaItems.WoodenSlab1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorBirch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SSS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                VanillaItems.WoodenSlab2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorBirch.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                VanillaItems.WoodenSlab2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorBirch.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                VanillaItems.WoodenSlab2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorJungle.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SSS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                VanillaItems.WoodenSlab3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorJungle.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                VanillaItems.WoodenSlab3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorJungle.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                VanillaItems.WoodenSlab3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorDarkOak.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SSS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                VanillaItems.WoodenSlab5.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorDarkOak.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                VanillaItems.WoodenSlab5.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.TrapdoorDarkOak.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "SRS",
                "PSP",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                VanillaItems.WoodenSlab5.get(),
            ),
        )
    }
}
