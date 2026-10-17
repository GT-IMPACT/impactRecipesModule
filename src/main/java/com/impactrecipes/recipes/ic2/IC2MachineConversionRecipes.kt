package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2MachineConversionRecipes {

    internal fun register() {
        CraftingRecipes.shaped(
            output = IC2Items.IronFurnace.get(),
            recipe = arrayOf(
                "PPP",
                "PHP",
                "PFP",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'H',
                "craftingToolHardHammer",
                'F',
                VanillaItems.Furnace.get(),
            ),
        )

        CraftingRecipes.shapelessWithFixedOutput(
            output = IC2Items.MachineCasing.get(),
            ingredients = arrayOf(GregTechItems.CasingBronzePlatedBricks.get()),
        )

        CraftingRecipes.shaped(
            output = IC2Items.Fluidbottler.get(),
            recipe = arrayOf(
                "CPC",
                "CMC",
                "CPC",
                'C',
                "cellEmpty",
                'P',
                GregTechItems.ElectricPumpLV.get(),
                'M',
                GregTechItems.MachineLVCanner.get(),
            ),
        )
    }
}
