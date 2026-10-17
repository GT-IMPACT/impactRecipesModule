package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.util.MachineRecipes

internal class NuclearControlSensorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = NuclearControlItems.Thermometer.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.RemoteSensorKit.get(),
            ticks = 1600,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverEnergyDetector.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.EnergySensorKit.get(),
            ticks = 1600,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverActivityDetector.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.CounterSensorKit.get(),
            ticks = 1600,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = GregTechItems.CoverFluidDetector.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.LiquidSensorKit.get(),
            ticks = 1600,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = IC2Items.EnergyStorageUpgrade.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.GeneratorSensorKit.get(),
            ticks = 1600,
            eu = 2,
        )

        MachineRecipes.assembler(
            input = AE2Items.FluixCrystal.get(),
            secondaryInput = IC2Items.FrequencyTransmitter.get(),
            output = NuclearControlItems.AppliedEnergisticsSensorKit.get(),
            ticks = 1600,
            eu = 2,
        )
    }
}
