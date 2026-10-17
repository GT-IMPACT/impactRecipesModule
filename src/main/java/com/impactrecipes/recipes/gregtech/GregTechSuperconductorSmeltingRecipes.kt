package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechSuperconductorSmeltingRecipes {

    internal fun register() {
        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforlvwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforlvwire.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 120,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforlvwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforlvwire.item(OrePrefixes.ingot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 800,
            eu = 120,
            temperature = 1200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Pentacadmiummagnesiumhexaoxid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Pentacadmiummagnesiumhexaoxid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1700,
            eu = 480,
            temperature = 2500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Pentacadmiummagnesiumhexaoxid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Pentacadmiummagnesiumhexaoxid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1200,
            eu = 480,
            temperature = 2500,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Titaniumonabariumdecacoppereikosaoxid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Titaniumonabariumdecacoppereikosaoxid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1800,
            eu = 480,
            temperature = 3300,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Titaniumonabariumdecacoppereikosaoxid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Nitrogen.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Titaniumonabariumdecacoppereikosaoxid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1300,
            eu = 480,
            temperature = 3300,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Uraniumtriplatinid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Uraniumtriplatinid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1900,
            eu = 1920,
            temperature = 4400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Uraniumtriplatinid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Uraniumtriplatinid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1400,
            eu = 1920,
            temperature = 4400,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Vanadiumtriindinid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Vanadiumtriindinid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 1920,
            temperature = 5200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Vanadiumtriindinid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Vanadiumtriindinid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 1920,
            temperature = 5200,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2100,
            eu = 7680,
            temperature = 6000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1600,
            eu = 7680,
            temperature = 6000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 160,
            eu = 7680,
            temperature = 6000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Tetranaquadahdiindiumhexaplatiumosminid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Tetranaquadahdiindiumhexaplatiumosminid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2000,
            eu = 7680,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Tetranaquadahdiindiumhexaplatiumosminid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Argon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Tetranaquadahdiindiumhexaplatiumosminid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1500,
            eu = 7680,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Tetranaquadahdiindiumhexaplatiumosminid.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Tetranaquadahdiindiumhexaplatiumosminid.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 150,
            eu = 7680,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuvwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuvwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2100,
            eu = 30720,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuvwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Radon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuvwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1600,
            eu = 30720,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuvwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuvwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 160,
            eu = 30720,
            temperature = 9000,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuhvwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuhvwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2200,
            eu = 122880,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuhvwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Radon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuhvwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1700,
            eu = 122880,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuhvwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuhvwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 170,
            eu = 122880,
            temperature = 10800,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuevwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(1).get(amount = 0),
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuevwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 2300,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuevwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(11).get(amount = 0),
            fluidInput = Materials.Radon.getGas(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuevwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 1800,
            eu = 500000,
            temperature = 12600,
        )

        MachineRecipes.blastFurnace(
            input = Materials.Longasssuperconductornameforuevwire.item(OrePrefixes.dust).get(),
            secondaryInput = IntegratedCircuit(12).get(amount = 0),
            fluidInput = Materials.PerroxGas.getGas(20L),
            fluidOutput = GT_Values.NF,
            output = Materials.Longasssuperconductornameforuevwire.item(OrePrefixes.ingotHot).get(),
            secondaryOutput = GT_Values.NI,
            ticks = 180,
            eu = 500000,
            temperature = 12600,
        )
    }
}
