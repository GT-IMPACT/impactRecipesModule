package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechSiliconSmeltingRecipes {

    internal fun register() {
        MachineRecipes.blastFurnace(
            input = GregTechItems.CircuitPartsRawCrystalChip.get(),
            secondaryInput = Materials.Emerald.item(OrePrefixes.plate).get(),
            fluidInput = Materials.Helium.getGas(1000),
            fluidOutput = null,
            output = GregTechItems.CircuitPartsCrystalChipElite.get(),
            secondaryOutput = null,
            ticks = 900,
            eu = 480,
            temperature = 5000,
        )

        MachineRecipes.blastFurnace(
            input = GregTechItems.CircuitPartsRawCrystalChip.get(),
            secondaryInput = Materials.Olivine.item(OrePrefixes.plate).get(),
            fluidInput = Materials.Helium.getGas(1000),
            fluidOutput = null,
            output = GregTechItems.CircuitPartsCrystalChipElite.get(),
            secondaryOutput = null,
            ticks = 900,
            eu = 480,
            temperature = 5000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.dust).get(amount = 64),
            secondaryInput = Materials.Gallium.item(OrePrefixes.dust).get(),
            fluidInput = null,
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot.get(amount = 2),
            secondaryOutput = null,
            ticks = 6000,
            eu = 120,
            temperature = 1784,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.dust).get(amount = 64),
            secondaryInput = Materials.Glowstone.item(OrePrefixes.dust).get(amount = 8),
            fluidInput = Materials.Nitrogen.getGas(8000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot2.get(),
            secondaryOutput = null,
            ticks = 9000,
            eu = 480,
            temperature = 2484,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 16),
            secondaryInput = Materials.Naquadah.item(OrePrefixes.ingot).get(),
            fluidInput = Materials.Argon.getGas(8000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot3.get(),
            secondaryOutput = null,
            ticks = 1200,
            eu = 1920,
            temperature = 5400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 8),
            secondaryInput = Materials.Enderium.item(OrePrefixes.ingot).get(amount = 6),
            fluidInput = Materials.Argon.getGas(4000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot4.get(),
            secondaryOutput = null,
            ticks = 11500,
            eu = 1920,
            temperature = 3333,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 24),
            secondaryInput = Materials.Naquadria.item(OrePrefixes.ingot).get(amount = 2),
            fluidInput = Materials.Argon.getGas(8000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot5.get(),
            secondaryOutput = null,
            ticks = 2100,
            eu = 30720,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 32),
            secondaryInput = Materials.MysteriousCrystal.item(OrePrefixes.dust).get(amount = 4),
            fluidInput = Materials.Argon.getGas(16000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot6.get(),
            secondaryOutput = null,
            ticks = 2900,
            eu = 500000,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 32),
            secondaryInput = Materials.Europium.item(OrePrefixes.ingot).get(amount = 2),
            fluidInput = Materials.Radon.getGas(8000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot7.get(),
            secondaryOutput = null,
            ticks = 15000,
            eu = 7680,
            temperature = 6484,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 64),
            secondaryInput = Materials.Americium.item(OrePrefixes.ingot).get(amount = 4),
            fluidInput = Materials.Radon.getGas(16000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot8.get(),
            secondaryOutput = null,
            ticks = 18000,
            eu = 30720,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 8),
            secondaryInput = Materials.VibrantAlloy.item(OrePrefixes.ingot).get(amount = 6),
            fluidInput = Materials.Argon.getGas(3000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot9.get(),
            secondaryOutput = null,
            ticks = 9000,
            eu = 1920,
            temperature = 3333,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 64),
            secondaryInput = Materials.Neutronium.item(OrePrefixes.ingot).get(amount = 4),
            fluidInput = Materials.Radon.getGas(24000),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot10.get(),
            secondaryOutput = null,
            ticks = 24000,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Silicon.item(OrePrefixes.block).get(amount = 64),
            secondaryInput = Materials.Neutronium.item(OrePrefixes.ingot).get(amount = 4),
            fluidInput = Materials.PerroxGas.getGas(480),
            fluidOutput = null,
            output = GregTechItems.CircuitSiliconIngot10.get(),
            secondaryOutput = null,
            ticks = 6400,
            eu = 500000,
            temperature = 12600,
        )
    }
}
