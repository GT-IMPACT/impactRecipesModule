package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class IC2ScaffoldAndRotorCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Scaffold.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "IdI",
                'S',
                OrePrefixes.screw.get(Materials.Wood),
                'P',
                OrePrefixes.plank.get(Materials.Wood),
                'I',
                OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Scaffold.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "IdI",
                'S',
                OrePrefixes.screw.get(Materials.WoodSealed),
                'P',
                OrePrefixes.plate.get(Materials.WoodSealed),
                'I',
                OrePrefixes.stick.get(Materials.WoodSealed),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.IronScaffold.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "IdI",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'I',
                OrePrefixes.stick.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.IronScaffold.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "IdI",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'I',
                OrePrefixes.stick.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Woodrotorblade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "PRP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Wood),
                'R',
                OrePrefixes.ring.get(Materials.Wood),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Ironrotorblade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "PRP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Steelrotorblade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "PRP",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'R',
                OrePrefixes.ring.get(Materials.TungstenSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Carbonrotorblade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "PRP",
                "PPP",
                'P',
                OrePrefixes.plateAlloy.get(Materials.Carbon),
                'R',
                OrePrefixes.ring.get(Materials.Iridium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.WeedingTrowel.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SId",
                "PII",
                "IPS",
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'I',
                OrePrefixes.stick.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )
    }
}
