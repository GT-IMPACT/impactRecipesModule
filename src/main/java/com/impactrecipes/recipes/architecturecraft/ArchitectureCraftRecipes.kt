package com.impactrecipes.recipes.architecturecraft

import com.impactrecipes.items.ArchitectureCraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes.removeCraftingRecipesByOutput
import com.impactrecipes.util.CraftingRecipes.shapedWithFlags
import com.impactrecipes.util.CraftingRecipes.shapelessWithFlags
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ArchitectureCraftRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        removeOriginalRecipes()
        craftingRecipes()
    }

    private fun removeOriginalRecipes() {
        val originalOutputs = arrayOf(
            ArchitectureCraftItems.SawBench,
            ArchitectureCraftItems.SawBlade,
            ArchitectureCraftItems.LargePulley,
            ArchitectureCraftItems.Hammer,
            ArchitectureCraftItems.Chisel,
        )
        for (item in originalOutputs) {
            removeCraftingRecipesByOutput(
                output = item.get(),
                ignoreNbt = true,
                keepShapeless = false,
                nativeOnly = true,
            )
        }
    }

    private fun craftingRecipes() {
        shapedWithFlags(
            output = ArchitectureCraftItems.SawBench.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SPS",
                "BAB",
                "sLh",
                'S', OrePrefixes.screw.get(Materials.Steel),
                'P', VanillaItems.HeavyWeightedPressurePlate.get(),
                'B', VanillaItems.Fence.get(),
                'A', ArchitectureCraftItems.SawBlade.get(),
                'L', ArchitectureCraftItems.LargePulley.get(),
            ),
        )

        shapedWithFlags(
            output = ArchitectureCraftItems.LargePulley.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "SdS",
                "GWG",
                "ShS",
                'S', OrePrefixes.screw.get(Materials.Steel),
                'G', OrePrefixes.gearGtSmall.get(Materials.Iron),
                'W', OrePrefixes.gearGt.get(Materials.Wood),
            ),
        )

        shapedWithFlags(
            output = ArchitectureCraftItems.Hammer.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "PPI",
                "fSI",
                " Sh",
                'S', OrePrefixes.stick.get(Materials.Wood),
                'P', OrePrefixes.plate.get(Materials.Steel),
                'I', OrePrefixes.ingot.get(Materials.Iron),
            ),
        )

        shapedWithFlags(
            output = ArchitectureCraftItems.Chisel.get(),
            flags = craftingFlags,
            recipe = arrayOf(
                "hIP",
                "SKI",
                "WSd",
                'S', OrePrefixes.screw.get(Materials.Iron),
                'P', OrePrefixes.plate.get(Materials.Steel),
                'I', OrePrefixes.plate.get(Materials.Iron),
                'K', OrePrefixes.stick.get(Materials.Iron),
                'W', OrePrefixes.stick.get(Materials.Wood),
            ),
        )

        shapelessWithFlags(
            output = ArchitectureCraftItems.SawBlade.get(),
            flags = craftingFlags,
            ingredients = arrayOf(OrePrefixes.toolHeadBuzzSaw.get(Materials.Iron)),
        )
    }
}
