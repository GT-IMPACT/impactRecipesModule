package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.ChiselItems
import com.impactrecipes.items.ImpactArchitectureItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.ZtonesItems
import com.impactrecipes.util.CarvingRecipes

internal class ChiselBasicCarvingRecipes {

    internal fun register() {
        CarvingRecipes.removeGroup("glowstone")

        CarvingRecipes.addGroup("glowstone")

        CarvingRecipes.variation(
            group = "glowstone",
            block = VanillaItems.Glowstone.getBlock(),
            meta = 0,
            sortOrder = 0,
        )

        for (i in 1 until 16) {
            CarvingRecipes.variation(
                group = "glowstone",
                block = ChiselItems.Glowstone.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        CarvingRecipes.removeGroup("cobblestone")

        CarvingRecipes.addGroup("cobblestone")

        CarvingRecipes.variation(
            group = "cobblestone",
            block = VanillaItems.Cobblestone.getBlock(),
            meta = 0,
            sortOrder = 0,
        )

        for (i in 1 until 16) {
            CarvingRecipes.variation(
                group = "cobblestone",
                block = ChiselItems.Cobblestone.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        CarvingRecipes.removeGroup("glass")

        CarvingRecipes.addGroup("glass")

        CarvingRecipes.variation(
            group = "glass",
            block = VanillaItems.Glass.getBlock(),
            meta = 0,
            sortOrder = 0,
        )

        for (i in 1 until 16) {
            CarvingRecipes.variation(
                group = "glass",
                block = ChiselItems.Glass.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        for (i in 0 until 16) {
            val find = ImpactArchitectureItems.Glass.getBlock()

            if (find != null) {
                CarvingRecipes.variation(
                    group = "glass",
                    block = find,
                    meta = i,
                    sortOrder = 0,
                )
            }
        }

        for (i in 0 until 16) {
            CarvingRecipes.variation(
                group = "glass",
                block = ZtonesItems.Glaxx.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        CarvingRecipes.variation(
            group = "glass",
            block = ChiselItems.Glass2.getBlock(),
            meta = 0,
            sortOrder = 0,
        )
    }
}
