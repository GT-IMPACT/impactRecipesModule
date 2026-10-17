package com.impactrecipes.recipes.stargate

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.StargateItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class StargateAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 24,
                ),
                GregTechItems.SensorUEV.get(amount = 4),
                EnderIOItems.DarkSteelPressurePlate.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Piko,
                    count = 1,
                ),
                StargateItems.ControllerCrystal.get(),
            ),
            fluid = null,
            output = StargateItems.Controller.get(),
            ticks = 1000,
            eu = 32000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.StargateShieldingFoil.get(amount = 8),
                ImpactItems.StargateChevron.get(amount = 3),
                GregTechItems.ElectricPistonUEV.get(amount = 6),
                GregTechItems.FieldGeneratorUEV.get(),
                GregTechItems.SensorUEV.get(),
            ),
            fluid = null,
            output = StargateItems.ChevronUpgrade.get(),
            ticks = 1000,
            eu = 32000000,
        )

        MachineRecipes.assembler(
            input = StargateItems.IrisBlade.get(amount = 20),
            secondaryInput = GregTechItems.CasingCoilSuperconductor.get(amount = 4),
            output = StargateItems.IrisUpgrade.get(),
            ticks = 1000,
            eu = 32000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.Titanium,
                    count = 32,
                ),
                GregTechItems.ElectricPistonUEV.get(),
                GregTechItems.CasingCoilSuperconductor.get(),
            ),
            fluid = null,
            output = StargateItems.IrisBlade.get(),
            ticks = 1000,
            eu = 32000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                ImpactItems.StargateFramePart.get(amount = 12),
                GregTechItems.FieldGeneratorUEV.get(),
                GregTechItems.ZPM3.get(),
            ),
            fluid = null,
            output = StargateItems.IC2Capacitor.get(),
            ticks = 1000,
            eu = 32000000,
        )
    }
}
