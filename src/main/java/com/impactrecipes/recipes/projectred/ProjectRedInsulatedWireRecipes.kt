package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.ProjectRedTransmissionItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Dyes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ProjectRedInsulatedWireRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        for (i in 0 until 16) {
            CraftingRecipes.shapelessWithFlags(
                output = ModItemVariant(
                    item = ProjectRedTransmissionItems.RedAlloyWire,
                    meta = 16 - i,
                ).get(),
                flags = craftingFlags,
                ingredients = arrayOf<Any?>(
                    ProjectRedTransmissionItems.RedAlloyWire.get(),
                    ProjectRedTransmissionItems.RedAlloyWire.get(),
                    OrePrefixes.plate.get(Materials.Rubber),
                    Dyes.VALUES[i],
                ),
            )
        }
    }
}
