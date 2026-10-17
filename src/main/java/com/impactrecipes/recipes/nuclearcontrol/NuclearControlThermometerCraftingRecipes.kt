package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class NuclearControlThermometerCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shaped(
            output = NuclearControlItems.Thermometer.get(),
            recipe = arrayOf(
                "AB ",
                "BCB",
                " BB",
                'A',
                OrePrefixes.stick.get(Materials.Iron),
                'B',
                OrePrefixes.plate.get(Materials.Glass),
                'C',
                "cellMercury",
            ),
        )

        CraftingRecipes.shaped(
            output = NuclearControlItems.DigitalThermometer.get(),
            recipe = arrayOf(
                "AB ",
                "CDC",
                " BE",
                'A',
                NuclearControlItems.Thermometer.get(),
                'B',
                OrePrefixes.plate.get(Materials.Glass),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'D',
                GregTechItems.CoverScreen.get(),
                'E',
                IC2Items.SmallPowerUnit.get(),
            ),
        )
    }
}
