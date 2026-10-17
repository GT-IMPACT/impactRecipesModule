package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.ProjectRedIntegrationItems
import com.impactrecipes.items.ProjectRedTransmissionItems
import com.impactrecipes.items.StorageDrawersItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class DrawerAutomationUpgradeRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.StatusUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IRI",
                "RTR",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Redstone),
                'R',
                ProjectRedTransmissionItems.RedAlloyWire.get(),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
                'I',
                VanillaItems.RedstoneTorch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.AdvancedStatusUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IRI",
                "RTR",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Redstone),
                'R',
                ProjectRedTransmissionItems.RedAlloyWire.get(),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
                'I',
                ProjectRedIntegrationItems.ProjectredIntegrationGate26.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.RedstoneUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PSP",
                "STS",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.Redstone),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                ProjectRedTransmissionItems.RedAlloyWire.get(),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.MaximumRedstoneUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "STS",
                "SRS",
                'P',
                OrePrefixes.plate.get(Materials.Redstone),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                ProjectRedTransmissionItems.RedAlloyWire.get(),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.MinimumRedstoneUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SRS",
                "STS",
                "PPP",
                'P',
                OrePrefixes.plate.get(Materials.Redstone),
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                ProjectRedTransmissionItems.RedAlloyWire.get(),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.VoidUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "STS",
                "PVP",
                "SRS",
                'P',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'V',
                ExtraUtilitiesItems.TrashCan.get(),
                'R',
                ProjectRedTransmissionItems.RedAlloyWire.get(),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = StorageDrawersItems.StorageKey.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " BP",
                "TPS",
                "Gs ",
                'B',
                OrePrefixes.bolt.get(Materials.Gold),
                'G',
                OrePrefixes.plate.get(Materials.Gold),
                'S',
                OrePrefixes.stick.get(Materials.Gold),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'T',
                StorageDrawersItems.UpgradeTemplate.get(),
            ),
        )
    }
}
