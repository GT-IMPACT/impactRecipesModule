package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values

internal class IC2ToolAndCellConversionRecipes {

    internal fun register() {
        CraftingRecipes.shapelessWithFixedOutput(
            output = IC2Items.ChargingEnergyCrystal.get(),
            ingredients = arrayOf(
                ModItemVariant(
                    item = IC2Items.ChargingEnergyCrystal,
                    meta = GT_Values.W.toInt(),
                ).get(),
            ),
        )

        CraftingRecipes.shapelessWithFixedOutput(
            output = IC2Items.LapotronChargingCrystal.get(),
            ingredients = arrayOf(
                ModItemVariant(
                    item = IC2Items.LapotronChargingCrystal,
                    meta = GT_Values.W.toInt(),
                ).get(),
            ),
        )

        CraftingRecipes.shapelessWithFixedOutput(
            output = IC2Items.ElectricWrench.get(),
            ingredients = arrayOf(
                GregTechItems.ToolWrench.get(),
                IC2Items.SmallPowerUnit.get(),
            ),
        )

        CraftingRecipes.shapelessWithFixedOutput(
            output = IC2Items.EmptyCell.get(),
            ingredients = arrayOf(
                ModItemVariant(
                    item = IC2Items.HydratingCell,
                    meta = 10000,
                ).get(),
            ),
        )
    }
}
