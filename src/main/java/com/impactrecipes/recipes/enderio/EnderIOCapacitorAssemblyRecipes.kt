package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class EnderIOCapacitorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = GregTechItems.BatteryHullLV.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.Plastic,
                count = 4,
            ),
            fluidInput = Materials.Redstone.getMolten(576),
            output = EnderIOItems.BasicCapacitor.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.BasicCapacitor.get(amount = 2),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.EnergeticAlloy,
                count = 4,
            ),
            fluidInput = Materials.Glowstone.getMolten(576),
            output = EnderIOItems.BasicCapacitor1.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = EnderIOItems.BasicCapacitor1.get(amount = 2),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.VibrantAlloy,
                count = 4,
            ),
            fluidInput = Materials.ConductiveIron.getMolten(576),
            output = EnderIOItems.BasicCapacitor2.get(),
            ticks = 400,
            eu = 480,
        )
    }
}
