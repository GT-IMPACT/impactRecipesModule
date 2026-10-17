package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactTankControllerCraftingRecipes {

    internal fun register() {
        val tfftRecipe = arrayOf<Any?>(
            "HFH",
            "PVP",
            "CFC",
            'H',
            OrePrefixes.pipeMedium.get(Materials.Titanium),
            'F',
            GregTechItems.FieldGeneratorMV.get(),
            'P',
            GregTechItems.ElectricPumpHV.get(),
            'V',
            GregTechItems.HullHV.get(),
            'C',
            OrePrefixes.circuit.get(Materials.Data),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.MultiTank.get(),
            flags = 0L,
            recipe = tfftRecipe,
        )
    }
}
