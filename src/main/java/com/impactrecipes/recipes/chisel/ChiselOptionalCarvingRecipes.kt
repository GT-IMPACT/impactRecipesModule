package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.UndergroundBiomesItems
import com.impactrecipes.util.CarvingRecipes
import cpw.mods.fml.common.Loader

internal class ChiselOptionalCarvingRecipes {

    internal fun register() {
        if (Loader.isModLoaded("UndergroundBiomes")) {
            CarvingRecipes.variation(
                group = "andesite",
                block = UndergroundBiomesItems.IgneousStone.getBlock(),
                meta = 3,
                sortOrder = 0,
            )

            CarvingRecipes.variation(
                group = "limestone",
                block = UndergroundBiomesItems.SedimentaryStone.getBlock(),
                meta = 0,
                sortOrder = 0,
            )
        }

        if (Loader.isModLoaded("ExtraUtilities")) {
            for (i in 0 until 16) {
                val find = ExtraUtilitiesItems.Greenscreen.getBlock()

                if (find != null) {
                    CarvingRecipes.variation(
                        group = "antiBlock",
                        block = find,
                        meta = i,
                        sortOrder = 0,
                    )
                }
            }
        }
    }
}
