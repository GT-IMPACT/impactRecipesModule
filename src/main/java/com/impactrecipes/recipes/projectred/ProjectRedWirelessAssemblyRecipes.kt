package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.VanillaItems
import com.impactrecipes.items.WirelessRedstoneAddonsItems
import com.impactrecipes.items.WirelessRedstoneCoreItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ProjectRedWirelessAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Birmabright,
                count = 1,
            ),
            secondaryInput = WirelessRedstoneCoreItems.RetherPearl.get(),
            output = WirelessRedstoneCoreItems.WirelessTransceiver.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Electrum,
                count = 1,
            ),
            secondaryInput = WirelessRedstoneCoreItems.RetherPearl.get(),
            output = WirelessRedstoneCoreItems.BlazeTransceiver.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = WirelessRedstoneCoreItems.StoneBowl.get(),
            secondaryInput = WirelessRedstoneCoreItems.WirelessTransceiver.get(),
            output = WirelessRedstoneCoreItems.RecieverDish.get(),
            ticks = 600,
            eu = 250,
        )

        MachineRecipes.assembler(
            input = WirelessRedstoneCoreItems.StoneBowl.get(),
            secondaryInput = WirelessRedstoneCoreItems.BlazeTransceiver.get(),
            output = WirelessRedstoneCoreItems.BlazeRecieverDish.get(),
            ticks = 600,
            eu = 250,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Compass.get(),
            secondaryInput = WirelessRedstoneCoreItems.WirelessTransceiver.get(),
            fluidInput = Materials.Redstone.getMolten(144),
            output = WirelessRedstoneAddonsItems.Triangulator.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = WirelessRedstoneAddonsItems.Triangulator.get(),
            secondaryInput = VanillaItems.Paper.get(amount = 8),
            fluidInput = Materials.Redstone.getMolten(144),
            output = WirelessRedstoneAddonsItems.Map.get(),
            ticks = 300,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Obsidian,
                count = 3,
            ),
            secondaryInput = WirelessRedstoneCoreItems.WirelessTransceiver.get(),
            fluidInput = Materials.Redstone.getMolten(144),
            output = WirelessRedstoneAddonsItems.Tracker.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = WirelessRedstoneCoreItems.BlazeTransceiver.get(amount = 2),
            secondaryInput = WirelessRedstoneCoreItems.RetherPearl.get(amount = 2),
            fluidInput = Materials.Obsidian.getMolten(1296),
            output = WirelessRedstoneAddonsItems.Rep.get(),
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Stone.get(amount = 7),
            secondaryInput = GT_Utility.getIntegratedCircuit(7),
            fluidInput = null,
            output = WirelessRedstoneCoreItems.StoneBowl.get(),
            ticks = 50,
            eu = 12,
        )
    }
}
