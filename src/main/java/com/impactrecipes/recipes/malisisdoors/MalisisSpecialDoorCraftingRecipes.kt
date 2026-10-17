package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class MalisisSpecialDoorCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PDP",
                " s ",
                'P',
                "paneGlassColorless",
                'D',
                VanillaItems.WoodenDoor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PDP",
                " s ",
                'P',
                "paneGlassColorless",
                'D',
                MalisisDoorsItems.ItemDoorAcacia.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PDP",
                " s ",
                'P',
                "paneGlassColorless",
                'D',
                MalisisDoorsItems.ItemDoorBirch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PDP",
                " s ",
                'P',
                "paneGlassColorless",
                'D',
                MalisisDoorsItems.ItemDoorDarkOak.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PDP",
                " s ",
                'P',
                "paneGlassColorless",
                'D',
                MalisisDoorsItems.ItemDoorJungle.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemWoodSlidingDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PDP",
                " s ",
                'P',
                "paneGlassColorless",
                'D',
                MalisisDoorsItems.ItemDoorSpruce.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemIronSlidingDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PDP",
                " s ",
                'P',
                "paneGlassColorless",
                'D',
                VanillaItems.IronDoor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemJailDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "PDP",
                " s ",
                'P',
                ImpactItems.SteelBars.get(),
                'D',
                VanillaItems.IronDoor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemLaboratoryDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "SDS",
                " h ",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'S',
                OrePrefixes.plate.get(Materials.Steel),
                'D',
                VanillaItems.IronDoor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemFactoryDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "SDS",
                " h ",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.plate.get(Materials.Iron),
                'D',
                VanillaItems.IronDoor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemShojiDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTS",
                "PTR",
                "PTd",
                'P',
                VanillaItems.Paper.get(),
                'T',
                OrePrefixes.stick.get(Materials.Wood),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemShojiDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTS",
                "PTR",
                "PTd",
                'P',
                VanillaItems.Paper.get(),
                'T',
                OrePrefixes.stick.get(Materials.Wood),
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'R',
                OrePrefixes.ring.get(Materials.Copper),
            ),
        )
    }
}
