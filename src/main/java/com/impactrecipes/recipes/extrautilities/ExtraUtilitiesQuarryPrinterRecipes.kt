package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ExtraUtilitiesQuarryPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.AdvancedMiner.get(),
                GregTechItems.FieldGeneratorLuV.get(),
                GregTechItems.ElectricMotorLuV.get(amount = 3),
                ExtraUtilitiesItems.ThermionicPump.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HastelloyN,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.HastelloyC276,
                    count = 8,
                ),
                ExtraUtilitiesItems.QuarryUpgrade.get(amount = 8),
            ),
            output = ExtraUtilitiesItems.EnderQuarry.get(),
            fluidInputs = null,
            ticks = 60 * 20,
            eu = 30720,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.EmitterLuV.get(),
                ExtraUtilitiesItems.QuarryUpgrade.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.HastelloyN,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Enderium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HastelloyC276,
                    count = 8,
                ),
            ),
            output = ExtraUtilitiesItems.Marker.get(),
            fluidInputs = null,
            ticks = 50 * 20,
            eu = 7680,
        )
    }
}
