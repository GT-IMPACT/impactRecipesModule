package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2QuantumArmorPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.HatchDynamoHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Titanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                GregTechItems.CasingMotor.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 6,
                ),
            ),
            output = IC2Items.KineticGenerator.get(),
            fluidInputs = null,
            ticks = 10 * 20,
            eu = 480,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.CasingGearboxSteel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Titanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                GregTechItems.ElectricMotorHV.get(amount = 2),
                IC2Items.Steelshaft.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 6,
                ),
            ),
            output = IC2Items.WindKineticGenerator.get(),
            fluidInputs = null,
            ticks = 10 * 20,
            eu = 480,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                GregTechItems.CasingGearboxSteel.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt02,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Titanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                GregTechItems.ElectricPumpHV.get(amount = 2),
                IC2Items.Steelshaft.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.HSLA,
                    count = 6,
                ),
            ),
            output = IC2Items.WaterKineticGenerator.get(),
            fluidInputs = null,
            ticks = 10 * 20,
            eu = 480,
        )
    }
}
