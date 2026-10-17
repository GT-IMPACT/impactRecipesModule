package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ExtraCellsItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class AE2FluidComponentCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.FluidAutoFiller.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PMP",
                "CIC",
                "PRP",
                'P',
                "plateLapis",
                'M',
                AE2Items.METerminal.get(),
                'C',
                AE2Items.ItemItemMultiPart16.get(),
                'R',
                AE2Items.LevelEmitter.get(),
                'I',
                AE2FCItems.DualInterface.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = AE2FCItems.WirelessLevelTerminal.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WTW",
                "PCP",
                "PEP",
                'P',
                OrePrefixes.plate.get(Materials.VanadiumSteel),
                'T',
                AE2FCItems.LevelTerminal.get(),
                'W',
                AE2Items.WirelessReceiver.get(),
                'C',
                AE2Items.EngineeringProcessor.get(),
                'E',
                AE2Items.DenseEnergyCell.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.MEFluidImportBus.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.PartBase1.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.FluidExportBus.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.PartBase.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.MEDualInterfaceMeta0.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                AE2FCItems.DualInterface.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.MEDualInterfaceMeta0.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.PartBase9.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.DualInterface.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                AE2FCItems.MEDualInterfaceMeta0.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.DualInterface.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.Ecbaseblock.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.FluidStorageComponent1k.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.StorageComponent4.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.Item4kMEFluidStorageComponent.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.StorageComponent5.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.Item16kMEFluidStorageComponent.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.StorageComponent6.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.Item64kMEFluidStorageComponent.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.StorageComponent7.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.Item256kMEFluidStorageComponent.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.StorageComponent8.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.Item1024kMEFluidStorageComponent.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.StorageComponent9.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.Item4096kMEFluidStorageComponent.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                ExtraCellsItems.StorageComponent10.get(),
            ),
        )
    }
}
