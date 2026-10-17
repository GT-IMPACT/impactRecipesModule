package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
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
            output = AE2FCItems.MEDualInterfaceMeta0.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                AE2FCItems.DualInterface.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = AE2FCItems.DualInterface.get(),
            flags = 0,
            ingredients = arrayOf<Any?>(
                AE2FCItems.MEDualInterfaceMeta0.get(),
            ),
        )
    }
}
