package com.impactrecipes.recipes.nuclearcontrol

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.NuclearControlItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.util.GT_ModHandler

internal class NuclearControlSensorRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.removeMatchingCraftingRecipesByOutput(output = VanillaItems.StoneButton.get())

        CraftingRecipes.shapelessWithFlags(
            output = NuclearControlItems.RemoteSensorKit.get(),
            flags = craftingFlags,
            ingredients = arrayOf(NuclearControlItems.SensorLocationCard.get()),
        )
        CraftingRecipes.shapelessWithFlags(
            output = NuclearControlItems.EnergySensorKit.get(),
            flags = craftingFlags,
            ingredients = arrayOf(NuclearControlItems.EnergySensorLocationCard.get()),
        )
        CraftingRecipes.shapelessWithFlags(
            output = NuclearControlItems.CounterSensorKit.get(),
            flags = craftingFlags,
            ingredients = arrayOf(NuclearControlItems.CounterSensorLocationCard.get()),
        )
        CraftingRecipes.shapelessWithFlags(
            output = NuclearControlItems.LiquidSensorKit.get(),
            flags = craftingFlags,
            ingredients = arrayOf(NuclearControlItems.LiquidSensorLocationCard.get()),
        )
        CraftingRecipes.shapelessWithFlags(
            output = NuclearControlItems.GeneratorSensorKit.get(),
            flags = craftingFlags,
            ingredients = arrayOf(NuclearControlItems.GeneratorSensorLocationCard.get()),
        )
        CraftingRecipes.shapelessWithFlags(
            output = GregTechItems.NuclearControlSensorKit.get(),
            flags = craftingFlags,
            ingredients = arrayOf(GregTechItems.NuclearControlSensorCard.get()),
        )
        CraftingRecipes.shapelessWithFlags(
            output = NuclearControlItems.AppliedEnergisticsSensorKit.get(),
            flags = craftingFlags,
            ingredients = arrayOf(NuclearControlItems.AppliedEnergisticsSensorCard.get()),
        )
    }
}
