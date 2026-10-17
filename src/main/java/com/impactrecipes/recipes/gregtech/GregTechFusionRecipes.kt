package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechFusionRecipes {

    internal fun register() {
        MachineRecipes.fusionReactor(
            fluidInput = Materials.Tartarite.getFluid(16),
            secondaryFluidInput = Materials.Europium.getMolten(16),
            fluidOutput = Materials.DraconiumPlasma.getFluid(16),
            ticks = 32,
            eu = 30000,
            startupEnergy = 300000000,
        )

        MachineRecipes.fusionReactor(
            fluidInput = Materials.EnrichedTartarite.getFluid(16),
            secondaryFluidInput = Materials.Neutronium.getMolten(16),
            fluidOutput = Materials.DraconiumAwakenedPlasma.getFluid(16),
            ticks = 64,
            eu = 250000,
            startupEnergy = 1000000000,
        )

        MachineRecipes.fusionReactor(
            fluidInput = Materials.InfinityCatalyst.getMolten(16),
            secondaryFluidInput = Materials.Phoenixite.getMolten(16),
            fluidOutput = Materials.Neutronium.getPlasma(16),
            ticks = 64,
            eu = 500000,
            startupEnergy = 2000000000,
        )
    }

    internal fun tinyWormhole() {
        //Tiny Wormhole
        MachineRecipes.tinyWormhole(
            input = GT_Values.NI,
            fluidInput = Materials.EnrichedNaquadria.getFluid(1000L),
            fluidOutput = GT_Values.NF,
            output = Materials.Duranium.item(OrePrefixes.dust).get(amount = 54),
            secondaryOutput = Materials.Europium.item(OrePrefixes.dust).get(amount = 45),
            output3 = Materials.Plutonium241.item(OrePrefixes.dust).get(amount = 36),
            output4 = Materials.NaquadahEnriched.item(OrePrefixes.dust).get(amount = 33),
            output5 = Materials.Trinium.item(OrePrefixes.dust).get(amount = 26),
            output6 = Materials.Californium.item(OrePrefixes.dust).get(amount = 23),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 200,
            eu = 2000000,
        )
    }
}
