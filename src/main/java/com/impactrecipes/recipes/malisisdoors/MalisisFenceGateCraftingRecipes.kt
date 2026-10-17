package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class MalisisFenceGateCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.ItemSaloon.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " SW",
                "hPW",
                " SW",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                OrePrefixes.springSmall.get(Materials.Iron),
                'W',
                OrePrefixes.plank.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.AcaciaFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks4.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.AcaciaFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks4.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.AcaciaFenceGate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks4.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.AcaciaFenceGate.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks4.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.BirchFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks2.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.BirchFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks2.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.BirchFenceGate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks2.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.BirchFenceGate.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks2.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.DarkOakFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks5.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.DarkOakFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks5.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.DarkOakFenceGate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks5.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.DarkOakFenceGate.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks5.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.JungleFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks3.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.JungleFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks3.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.JungleFenceGate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks3.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.JungleFenceGate.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks3.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.SpruceFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks1.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.SpruceFenceGate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks1.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.SpruceFenceGate.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks1.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = MalisisDoorsItems.SpruceFenceGate.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CdC",
                "PSP",
                "PSP",
                'P',
                VanillaItems.Planks1.get(),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )
    }
}
