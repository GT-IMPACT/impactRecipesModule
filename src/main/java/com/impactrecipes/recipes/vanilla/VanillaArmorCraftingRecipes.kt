package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class VanillaArmorCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.DiamondHelmet.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DDD",
                "DfD",
                'D',
                OrePrefixes.gem.get(Materials.Diamond),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.DiamondChestplate.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DfD",
                "DDD",
                "DDD",
                'D',
                OrePrefixes.gem.get(Materials.Diamond),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.DiamondLeggings.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DDD",
                "DfD",
                "D D",
                'D',
                OrePrefixes.gem.get(Materials.Diamond),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.DiamondBoots.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "D D",
                "DfD",
                'D',
                OrePrefixes.gem.get(Materials.Diamond),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.IronHorseArmor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hdH",
                "PCP",
                "LSL",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'H',
                VanillaItems.IronHelmet.get(),
                'C',
                VanillaItems.IronChestplate.get(),
                'L',
                VanillaItems.IronLeggings.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.GoldenHorseArmor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hdH",
                "PCP",
                "LSL",
                'P',
                OrePrefixes.plate.get(Materials.Gold),
                'S',
                OrePrefixes.screw.get(Materials.Gold),
                'H',
                VanillaItems.GoldenHelmet.get(),
                'C',
                VanillaItems.GoldenChestplate.get(),
                'L',
                VanillaItems.GoldenLeggings.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.DiamondHorseArmor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hdH",
                "PCP",
                "LSL",
                'P',
                OrePrefixes.plate.get(Materials.Diamond),
                'S',
                OrePrefixes.screw.get(Materials.Diamond),
                'H',
                VanillaItems.DiamondHelmet.get(),
                'C',
                VanillaItems.DiamondChestplate.get(),
                'L',
                VanillaItems.DiamondLeggings.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Saddle.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LBL",
                "LCL",
                "RSR",
                'C',
                "blockWool",
                'L',
                VanillaItems.Leather.get(),
                'B',
                BackpackItems.TannedLeather.get(),
                'S',
                VanillaItems.String.get(),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
            ),
        )
    }
}
