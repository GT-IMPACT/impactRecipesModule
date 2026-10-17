package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftSignalToolAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = IC2Items.EcMeter.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.circuit,
                material = Materials.Basic,
                count = 1,
            ),
            output = RailcraftItems.ElectricMeter.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = IC2Items.FrequencyTransmitter.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.circuit,
                material = Materials.Basic,
                count = 1,
            ),
            output = RailcraftItems.SignalTuner.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RailcraftItems.SignalTuner.get(),
            secondaryInput = VanillaItems.Compass.get(),
            output = RailcraftItems.SignalBlockSurveyor.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.wireAssembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Lead,
                    count = 2,
                ),
            ),
            fluidInput = null,
            output = RailcraftItems.ElectricShuntingWire.get(amount = 4),
            ticks = 100,
            eu = 8,
        )
    }
}
