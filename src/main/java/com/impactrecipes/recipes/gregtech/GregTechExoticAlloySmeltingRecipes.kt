package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechExoticAlloySmeltingRecipes {

    internal fun register() {
        MachineRecipes.blastFurnace(
            input = Materials.RedstoneAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.RedstoneAlloy.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 500,
            eu = 120,
            temperature = 1000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.RedstoneAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.RedstoneAlloy.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 120,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.ConductiveIron.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.ConductiveIron.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 700,
            eu = 120,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.ConductiveIron.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.ConductiveIron.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 120,
            temperature = 1500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.EnergeticAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Hydrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.EnergeticAlloy.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 120,
            temperature = 2200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.EnergeticAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.EnergeticAlloy.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 120,
            temperature = 2500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.VibrantAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Hydrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.VibrantAlloy.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 480,
            temperature = 3000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.VibrantAlloy.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.VibrantAlloy.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 480,
            temperature = 3600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.ElectricalSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.ElectricalSteel.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 120,
            temperature = 1000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.ElectricalSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.ElectricalSteel.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 120,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.PulsatingIron.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.PulsatingIron.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 480,
            temperature = 1800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.PulsatingIron.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.PulsatingIron.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 480,
            temperature = 2200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Soularium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Soularium.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 120,
            temperature = 1000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Soularium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Soularium.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 120,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.DarkSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.DarkSteel.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 480,
            temperature = 1800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.DarkSteel.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.DarkSteel.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 480,
            temperature = 2200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Draconium.item(OrePrefixes.dust).get(amount = 4),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.Naquadah.getMolten(576L),
            fluidOutput = Materials.Tartarite.getFluid(576L),
            output = Materials.Naquadah.item(OrePrefixes.dust).get(amount = 2),
            secondaryOutput = Materials.Uranium.item(OrePrefixes.dust).get(),
            ticks = 800,
            eu = 30720,
            temperature = 7200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.DraconiumAwakened.item(OrePrefixes.dust).get(amount = 4),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.NaquadahEnriched.getMolten(576L),
            fluidOutput = Materials.EnrichedTartarite.getFluid(576L),
            output = Materials.NaquadahEnriched.item(OrePrefixes.dust).get(amount = 2),
            secondaryOutput = Materials.Plutonium.item(OrePrefixes.dust).get(),
            ticks = 1600,
            eu = 122880,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Europiumoxide.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Europiumoxide.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 30720,
            temperature = 7200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Europiumoxide.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Europiumoxide.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 30720,
            temperature = 7200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Diamericiumtitanium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Diamericiumtitanium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 122880,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Infuscolium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Infuscolium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 600,
            eu = 30720,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Infuscolium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Infuscolium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 30720,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Europium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Europium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 7680,
            temperature = 6000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Europium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Europium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 7680,
            temperature = 6000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Quantium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Quantium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 160,
            eu = 122880,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Quantium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Quantium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1600,
            eu = 122880,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Quantium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Quantium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2100,
            eu = 122880,
            temperature = 9900,
        )

        MachineRecipes.blastFurnace(
            input = Materials.CosmicNeutronium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.CosmicNeutronium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 150,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.CosmicNeutronium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.CosmicNeutronium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.CosmicNeutronium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.CosmicNeutronium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.BlackPlutonium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.BlackPlutonium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 150,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.BlackPlutonium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.BlackPlutonium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.BlackPlutonium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.BlackPlutonium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Enderium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Enderium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1000,
            eu = 480,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Enderium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Enderium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 480,
            temperature = 4500,
        )
    }
}
