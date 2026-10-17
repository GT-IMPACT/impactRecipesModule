package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.StorageDrawersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class DrawerFramingCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.FramingTable.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "TTT",
                "FSF",
                "FdF",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'F',
                VanillaItems.Fence.get(),
                'T',
                StorageDrawersItems.Trim.get(amount = GT_Values.W.toInt()),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.UpgradeTemplate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "SDS",
                " d ",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                VanillaItems.Piston.get(),
                'D',
                "drawerBasic",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.FramedFullDrawer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "SCS",
                "PPP",
                'P',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'C',
                "chestWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.FramedFullDoubleDrawer.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "SPS",
                "PCP",
                'P',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'C',
                "chestWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.FramedFullQuadDrawer.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CPC",
                "SPS",
                "CPC",
                'P',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'C',
                "chestWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.FramedHalfDoubleDrawer.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "CSC",
                "PPP",
                'P',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'C',
                "chestWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.FramedHalfQuadDrawer.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "CSC",
                "PCP",
                'P',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'C',
                "chestWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.FramedTrim.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PPP",
                "SPS",
                'P',
                CarpentersBlocksItems.CarpentersBlock.get(),
                'S',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )
    }
}
