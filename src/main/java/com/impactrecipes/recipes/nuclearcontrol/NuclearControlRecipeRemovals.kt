package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.util.CraftingRecipes

internal class NuclearControlRecipeRemovals {

    internal fun register() {
        val items = arrayOf(
            NuclearControlItems.ThermalMonitor,
            NuclearControlItems.IndustrialAlarm,
            NuclearControlItems.HowlerAlarm,
            NuclearControlItems.RemoteThermalMonitor,
            NuclearControlItems.IndustrialInformationPanel,
            NuclearControlItems.InformationPanelExtender,
            NuclearControlItems.EnergyCounter,
            NuclearControlItems.AverageCounter,
            NuclearControlItems.RangeTrigger,
            NuclearControlItems.AdvancedInformationPanel,
            NuclearControlItems.AdvancedPanelExtender,
            NuclearControlItems.WhiteLamp,
            NuclearControlItems.Thermometer,
            NuclearControlItems.DigitalThermometer,
            NuclearControlItems.RemoteSensorKit,
            NuclearControlItems.EnergySensorKit,
            NuclearControlItems.CounterSensorKit,
            NuclearControlItems.LiquidSensorKit,
            NuclearControlItems.GeneratorSensorKit,
            NuclearControlItems.TimeCard,
            NuclearControlItems.RangeUpgrade,
            NuclearControlItems.ColorUpgrade,
            NuclearControlItems.TextCard,
            NuclearControlItems.AppliedEnergisticsSensorKit,
            NuclearControlItems.PortableInformationPanel,
        )

        for (item in items) {
            CraftingRecipes.removeMatchingCraftingRecipesByOutput(item.get())
        }
    }
}
