package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechAdvancedMetalSmeltingRecipes {

    internal fun register() {
        MachineRecipes.blastFurnace(
            input = Materials.Trinium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Trinium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1600,
            eu = 30720,
            temperature = 7200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Trinium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Trinium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 30720,
            temperature = 7200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.HSLA.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.HSLA.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 480,
            temperature = 1811,
        )

        MachineRecipes.blastFurnace(
            input = Materials.HSLA.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Oxygen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.HSLA.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 600,
            eu = 480,
            temperature = 1811,
        )

        MachineRecipes.blastFurnace(
            input = Materials.BT6.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.BT6.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 480,
            temperature = 3200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.BT6.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.BT6.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 480,
            temperature = 3200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Birmabright.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Birmabright.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 400,
            eu = 120,
            temperature = 1476,
        )

        MachineRecipes.blastFurnace(
            input = Materials.InfinityCatalyst.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(100L),
            fluidOutput = GT_Values.NF,
            output = Materials.InfinityCatalyst.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 2000000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Infinity.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(500L),
            fluidOutput = GT_Values.NF,
            output = Materials.Infinity.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 2000000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Iridium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Iridium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 7680,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Iridium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Iridium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1600,
            eu = 7680,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Osmium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Osmium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 900,
            eu = 30720,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Osmium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Osmium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1800,
            eu = 30720,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Oriharukon.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Oriharukon.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 700,
            eu = 30720,
            temperature = 5400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Oriharukon.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Oriharukon.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1400,
            eu = 30720,
            temperature = 5400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.VanadiumGallium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.VanadiumGallium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 480,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.VanadiumGallium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.VanadiumGallium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 600,
            eu = 480,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Titanium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Titanium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1400,
            eu = 1920,
            temperature = 1940,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Titanium.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Titanium.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 700,
            eu = 1920,
            temperature = 1940,
        )

        MachineRecipes.blastFurnace(
            input = Materials.YttriumBariumCuprate.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.YttriumBariumCuprate.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 480,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.YttriumBariumCuprate.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.YttriumBariumCuprate.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 600,
            eu = 480,
            temperature = 4500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Tungsten.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Tungsten.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2400,
            eu = 1920,
            temperature = 3000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Tungsten.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Tungsten.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 1920,
            temperature = 3000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Mytryl.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Mytryl.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1700,
            eu = 1920,
            temperature = 3600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Mytryl.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Mytryl.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 1920,
            temperature = 3600,
        )

        MachineRecipes.blastFurnace(
            input = GalacticraftMarsItems.ThermalCloth.get(amount = 2),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Titanium.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 120,
            temperature = 1500,
        )
    }
}
