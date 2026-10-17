package com.impactrecipes.recipes.chickenchunks

import com.impactrecipes.items.ChickenChunksItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler
import gregtech.api.util.GT_Utility

internal class ChickenChunksRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        removeOriginalRecipes()
        craftingRecipes()
        machineRecipes()
    }

    private fun removeOriginalRecipes() {
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ChickenChunksItems.ChunkLoader.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
        CraftingRecipes.removeCraftingRecipesByOutput(
            output = ChickenChunksItems.SpotLoader.get(),
            ignoreNbt = true,
            keepShapeless = false,
            nativeOnly = false,
        )
    }

    private fun craftingRecipes() {
        CraftingRecipes.shapedWithFlags(
            output = ChickenChunksItems.ChunkLoader.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                " h ",
                "BPB",
                "PFP",
                'B',
                OrePrefixes.bolt.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Gold),
                'F',
                OrePrefixes.frameGt.get(Materials.Iron),
            ),
        )
        CraftingRecipes.shapedWithFlags(
            output = ChickenChunksItems.SpotLoader.get(amount = 9),
            flags = craftingFlags,
            recipe = arrayOf(
                "sC",
                'C',
                ChickenChunksItems.ChunkLoader.get(),
            ),
        )
    }

    private fun machineRecipes() {
        MachineRecipes.cutter(
            input = ChickenChunksItems.ChunkLoader.get(),
            output = ChickenChunksItems.SpotLoader.get(amount = 9),
            secondaryOutput = GT_Values.NI,
            ticks = 50,
            eu = 8,
        )
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Gold,
                    count = 3,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ChickenChunksItems.ChunkLoader.get(),
            ticks = 50,
            eu = 12,
        )
    }
}
