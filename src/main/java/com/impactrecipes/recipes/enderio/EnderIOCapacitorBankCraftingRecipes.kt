package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class EnderIOCapacitorBankCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.CapBank1.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "CIC",
                "PMP",
                "CBC",
                'P',
                OrePrefixes.plate.get(Materials.ConductiveIron),
                'C',
                EnderIOItems.BasicCapacitor.get(),
                'I',
                OrePrefixes.circuit.get(Materials.Basic),
                'B',
                GregTechItems.BatteryRELVLithium.get(),
                'M',
                EnderIOItems.MachinePart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.CapBank2.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "CIC",
                "PMP",
                "CBC",
                'P',
                OrePrefixes.plate.get(Materials.EnergeticAlloy),
                'C',
                EnderIOItems.BasicCapacitor1.get(),
                'I',
                OrePrefixes.circuit.get(Materials.Good),
                'B',
                GregTechItems.BatteryREMVLithium.get(),
                'M',
                EnderIOItems.CapBank1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = EnderIOItems.CapBank3.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "CIC",
                "PMP",
                "CBC",
                'P',
                OrePrefixes.plate.get(Materials.VibrantAlloy),
                'C',
                EnderIOItems.BasicCapacitor2.get(),
                'I',
                OrePrefixes.circuit.get(Materials.Advanced),
                'B',
                GregTechItems.BatteryREHVLithium.get(),
                'M',
                EnderIOItems.CapBank2.get(),
            ),
        )
    }
}
