package com.impactrecipes.recipes.chisel

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.UndergroundBiomesItems
import com.impactrecipes.util.CarvingRecipes
import cpw.mods.fml.common.Loader

internal class ChiselStoneCarvingRecipes {

    internal fun register() {
        CarvingRecipes.variation(
            group = "marble",
            block = RailcraftItems.Cube.getBlock(),
            meta = 7,
            sortOrder = 0,
        )

        if (Loader.isModLoaded("UndergroundBiomes")) {
            CarvingRecipes.variation(
                group = "marble",
                block = UndergroundBiomesItems.MetamorphicStone.getBlock(),
                meta = 2,
                sortOrder = 0,
            )
        }

        for (i in 0 until 8) {
            CarvingRecipes.variation(
                group = "marble",
                block = GregTechItems.Stones.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        if (Loader.isModLoaded("UndergroundBiomes")) {
            CarvingRecipes.variation(
                group = "RCAbyssalBlock",
                block = UndergroundBiomesItems.IgneousStone.getBlock(),
                meta = 1,
                sortOrder = 0,
            )
        }

        CarvingRecipes.variation(
            group = "RCAbyssalBlock",
            block = RailcraftItems.Cube.getBlock(),
            meta = 6,
            sortOrder = 0,
        )

        for (i in 0 until 8) {
            CarvingRecipes.variation(
                group = "RCAbyssalBlock",
                block = GregTechItems.Granites.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        CarvingRecipes.addGroup("basalt")

        if (Loader.isModLoaded("UndergroundBiomes")) {
            CarvingRecipes.variation(
                group = "basalt",
                block = UndergroundBiomesItems.IgneousStone.getBlock(),
                meta = 5,
                sortOrder = 0,
            )
        }

        for (i in 8 until 16) {
            if (i == 9 || i == 10) {
                continue
            }

            CarvingRecipes.variation(
                group = "basalt",
                block = GregTechItems.Stones.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        CarvingRecipes.addGroup("basaltcobble")

        if (Loader.isModLoaded("UndergroundBiomes")) {
            CarvingRecipes.variation(
                group = "basaltcobble",
                block = UndergroundBiomesItems.IgneousCobblestone.getBlock(),
                meta = 5,
                sortOrder = 0,
            )
        }

        for (i in 9 until 10) {
            CarvingRecipes.variation(
                group = "basaltcobble",
                block = GregTechItems.Stones.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        CarvingRecipes.addGroup("redgranite")

        if (Loader.isModLoaded("UndergroundBiomes")) {
            CarvingRecipes.variation(
                group = "redgranite",
                block = UndergroundBiomesItems.IgneousStone.getBlock(),
                meta = 0,
                sortOrder = 0,
            )
        }

        for (i in 8 until 16) {
            if (i == 9 || i == 10) {
                continue
            }

            CarvingRecipes.variation(
                group = "redgranite",
                block = GregTechItems.Granites.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }

        CarvingRecipes.addGroup("redgranitecobble")

        if (Loader.isModLoaded("UndergroundBiomes")) {
            CarvingRecipes.variation(
                group = "redgranitecobble",
                block = UndergroundBiomesItems.IgneousCobblestone.getBlock(),
                meta = 0,
                sortOrder = 0,
            )
        }

        for (i in 9 until 10) {
            CarvingRecipes.variation(
                group = "redgranitecobble",
                block = GregTechItems.Granites.getBlock(),
                meta = i,
                sortOrder = 0,
            )
        }
    }
}
