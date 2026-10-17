package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactArchitectureItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CarvingRecipes

internal class ChiselMachineCarvingRecipes {

    internal fun register() {
        CarvingRecipes.addGroup("steelCasing")

        CarvingRecipes.variation(
            group = "steelCasing",
            block = GregTechItems.MachineCasings2.getBlock(),
            meta = 0,
            sortOrder = 0,
        )

        for (i in 0 until 10) {
            CarvingRecipes.variation(
                group = "steelCasing",
                block = GregTechItems.MachineCasings3.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        CarvingRecipes.variation(
            group = "concrete",
            block = ImpactItems.ImpactUtil.getBlock(),
            meta = 2,
            sortOrder = 0,
        )

        for (i in 0 until 16) {
            val find = ImpactArchitectureItems.Concrete.getBlock()

            if (find != null) {
                CarvingRecipes.variation(
                    group = "concrete",
                    block = find,
                    meta = i,
                    sortOrder = 0,
                )
            }
        }

        for (i in 0 until 16) {
            CarvingRecipes.variation(
                group = "concrete",
                block = GregTechItems.Concrete.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }
    }
}
