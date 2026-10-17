package com.impactrecipes.recipes.enderio

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class EnderIOTeleportPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                EnderIOItems.BasicCapacitor2.get(),
                GregTechItems.FieldGeneratorMV.get(),
                GregTechItems.SensorHV.get(amount = 2),
                EnderIOItems.FusedQuartz.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.DarkSteel,
                    count = 8,
                ),
            ),
            output = EnderIOItems.TelePad.get(amount = 9),
            fluidInputs = null,
            ticks = 20 * 20,
            eu = 480,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                AE2Items.QuantumLinkChamber.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Enderium,
                    count = 1,
                ),
                GregTechItems.FieldGeneratorLuV.get(),
                EnderIOItems.BasicCapacitor2.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                EnderIOItems.FusedQuartz.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.Diamond,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.DarkSteel,
                    count = 12,
                ),
            ),
            output = EnderIOItems.Transceiver.get(),
            fluidInputs = null,
            ticks = 40 * 20,
            eu = 30720,
        )
    }
}
