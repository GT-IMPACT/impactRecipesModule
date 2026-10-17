package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class CarpentersAccessCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Gate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                VanillaItems.FenceGate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Gate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.AcaciaFenceGate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Gate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.BirchFenceGate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Gate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.DarkOakFenceGate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Gate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.JungleFenceGate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Gate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.SpruceFenceGate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Hatch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                VanillaItems.Trapdoor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Hatch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.TrapdoorAcacia.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Hatch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.TrapdoorSpruce.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Hatch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.TrapdoorBirch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Hatch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.TrapdoorJungle.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Hatch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.TrapdoorDarkOak.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Lever.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLS",
                " d ",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                VanillaItems.Lever.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Door.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                VanillaItems.WoodenDoor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Door.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.ItemDoorAcacia.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Door.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.ItemDoorBirch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Door.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.ItemDoorDarkOak.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Door.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.ItemDoorJungle.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CarpentersBlocksItems.Door.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BLB",
                "SdS",
                'B',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'L',
                MalisisDoorsItems.ItemDoorSpruce.get(),
            ),
        )
    }
}
