package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.items.StorageDrawersItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class DrawerCapacityUpgradeRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.IronUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "TPT",
                "PSP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.GoldUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "TRT",
                "PSP",
                'P',
                OrePrefixes.plate.get(Materials.Gold),
                'R',
                OrePrefixes.plate.get(Materials.Steel),
                'S',
                OrePrefixes.stick.get(Materials.Gold),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.ObsidianUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "TRT",
                "PSP",
                'P',
                OrePrefixes.plate.get(Materials.Obsidian),
                'R',
                OrePrefixes.plate.get(Materials.Aluminium),
                'S',
                OrePrefixes.stick.get(Materials.Obsidian),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.DiamondUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "TRT",
                "PSP",
                'P',
                OrePrefixes.plate.get(Materials.Diamond),
                'R',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'S',
                OrePrefixes.stick.get(Materials.Diamond),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.EmeraldUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "TRT",
                "PSP",
                'P',
                OrePrefixes.plate.get(Materials.Emerald),
                'R',
                OrePrefixes.plate.get(Materials.Titanium),
                'S',
                OrePrefixes.stick.get(Materials.Emerald),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )
    }
}
