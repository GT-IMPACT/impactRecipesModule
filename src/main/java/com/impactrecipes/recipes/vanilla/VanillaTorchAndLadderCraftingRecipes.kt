package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class VanillaTorchAndLadderCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Torch.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C",
                "S",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.gem.get(Materials.Coal),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Torch.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C",
                "S",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.gem.get(Materials.Charcoal),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Torch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C",
                "S",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.gem.get(Materials.Lignite),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Torch.get(amount = 5),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C",
                "S",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.gem.get(Materials.CokeCoal),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Torch.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C",
                "S",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.dust.get(Materials.Sulfur),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Torch.get(amount = 6),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C",
                "S",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                OrePrefixes.dust.get(Materials.Phosphorus),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Torch.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "C",
                "S",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'C',
                IC2Items.Resin.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Ladder.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SIS",
                "SSS",
                "SrS",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'I',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Ladder.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "SWS",
                "SrS",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'W',
                OrePrefixes.screw.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Ladder.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "SWS",
                "SrS",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'W',
                OrePrefixes.screw.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Ladder.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "SWS",
                "SrS",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'W',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )
    }
}
