package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class ChiselToolCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Chisel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "fI ",
                "SOI",
                'S',
                "stickWood",
                'O',
                "ingotIron",
                'I',
                "stickLongIron",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.DiamondChisel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "fI ",
                "SOI",
                'S',
                "stickWood",
                'O',
                "gemDiamond",
                'I',
                "stickLongSteel",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.ObsidianChisel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "fI ",
                "SOI",
                'S',
                "stickWood",
                'O',
                "ingotObsidian",
                'I',
                "stickLongBlackSteel",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.AutoChisel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SOS",
                "CUR",
                "dYh",
                'S',
                "screwSteel",
                'O',
                "ringWoodSealed",
                'C',
                GregTechItems.ConveyorModuleLV.get(),
                'U',
                GregTechItems.CoverCrafting.get(),
                'R',
                GregTechItems.RobotArmLV.get(),
                'Y',
                ChestUpItems.SteelChest.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Upgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PCP",
                "WOW",
                'S',
                "screwSteel",
                'P',
                "plateEmerald",
                'C',
                "circuitAdvanced",
                'W',
                "wireGt01RedAlloy",
                'O',
                GregTechItems.ConveyorModuleLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Upgrade1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PCP",
                "WOW",
                'S',
                "screwSteel",
                'P',
                "plateEmerald",
                'C',
                "circuitAdvanced",
                'W',
                "wireGt01RedAlloy",
                'O',
                GregTechItems.RobotArmLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ChiselItems.Upgrade2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PCP",
                "WOW",
                'S',
                "screwSteel",
                'P',
                "plateEmerald",
                'C',
                "circuitAdvanced",
                'W',
                "wireGt01RedAlloy",
                'O',
                GregTechItems.CoverCrafting.get(),
            ),
        )
    }
}
