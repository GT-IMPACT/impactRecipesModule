package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class ImpactToolAndAlloyCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.PortableTankULV.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PTP",
                "hPC",
                'T',
                GregTechItems.LargeFluidCellSteel.get(),
                'P',
                OrePrefixes.plateDouble.get(Materials.Lead),
                'S',
                OrePrefixes.screw.get(Materials.WroughtIron),
                'C',
                ToolDictNames.craftingToolScrewdriver,
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Potin,
                count = 9,
            ),
            flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
            ingredients = arrayOf<Any?>(
                OrePrefixes.dust.get(Materials.Copper),
                OrePrefixes.dust.get(Materials.Copper),
                OrePrefixes.dust.get(Materials.Copper),
                OrePrefixes.dust.get(Materials.Copper),
                OrePrefixes.dust.get(Materials.Copper),
                OrePrefixes.dust.get(Materials.Copper),
                OrePrefixes.dust.get(Materials.Tin),
                OrePrefixes.dust.get(Materials.Tin),
                OrePrefixes.dust.get(Materials.Lead),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ImpactItems.WoodBrickForm.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                ToolDictNames.craftingToolKnife,
                ImpactItems.BlankPattern.get(),
            ),
        )
    }
}
