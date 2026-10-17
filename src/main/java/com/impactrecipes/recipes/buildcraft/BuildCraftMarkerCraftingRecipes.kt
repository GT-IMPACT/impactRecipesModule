package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.BuildCraftBuildersItems
import com.impactrecipes.items.BuildCraftCoreItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API.getStackofAmountFromOreDict
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BuildCraftMarkerCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BuildCraftCoreItems.MarkerBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " S ",
                " L ",
                'L',
                OrePrefixes.stick.get(Materials.Wood),
                'S',
                RecipeItems.ore(
                    prefix = OrePrefixes.gem,
                    material = Materials.Lapis,
                    count = 1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftBuildersItems.ConstructionMarkerBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " S ",
                " L ",
                'L',
                OrePrefixes.stick.get(Materials.Wood),
                'S',
                getStackofAmountFromOreDict(
                    "dyeYellow",
                    1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftCoreItems.PathMarkerBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " S ",
                " L ",
                'L',
                OrePrefixes.stick.get(Materials.Wood),
                'S',
                getStackofAmountFromOreDict(
                    "dyeGreen",
                    1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftBuildersItems.BlueprintItem.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LS",
                'L',
                OrePrefixes.plate.get(Materials.Paper),
                'S',
                RecipeItems.ore(
                    prefix = OrePrefixes.gem,
                    material = Materials.Lapis,
                    count = 1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftBuildersItems.TemplateItem.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LS",
                'L',
                OrePrefixes.plate.get(Materials.Paper),
                'S',
                getStackofAmountFromOreDict(
                    "dyeBlack",
                    1,
                ),
            ),
        )
    }
}
