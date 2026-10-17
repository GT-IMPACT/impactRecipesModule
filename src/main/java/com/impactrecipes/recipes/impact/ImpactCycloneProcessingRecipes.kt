package com.impactrecipes.recipes.impact

import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials

internal class ImpactCycloneProcessingRecipes {

    internal fun register() {
        MachineRecipes.cyclone(
            inputs = arrayOf(
                Materials.Draconium.getDust(10),
            ),
            fluidInputs = arrayOf(
                Materials.NaquadhaGas.getGas(100),
                Materials.SulfuricAcid.getFluid(900),
            ),
            fluidOutputs = arrayOf(
                Materials.DilutedSulfuricAcid.getFluid(900),
            ),
            outputs = arrayOf(
                Materials.DeepIron.getDust(5),
                Materials.Naquadah.getDust(2),
                Materials.Osmium.getDust(2),
                Materials.DraconiumAwakened.getDust(1),
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 200,
            eu = 2000000,
        )

        MachineRecipes.cyclone(
            inputs = arrayOf(
                Materials.Adamantium.getDust(10),
            ),
            fluidInputs = arrayOf(
                Materials.NaquadriaLiquid.getFluid(100),
                Materials.SulfuricAcid.getFluid(900),
            ),
            fluidOutputs = arrayOf(
                Materials.DilutedSulfuricAcid.getFluid(900),
            ),
            outputs = arrayOf(
                Materials.Trinium.getDust(5),
                Materials.Americium.getDust(2),
                Materials.Tungsten.getDust(2),
                Materials.InfinityCatalyst.getDust(1),
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 250,
            eu = 2000000,
        )

        MachineRecipes.cyclone(
            inputs = arrayOf(
                Materials.BlackPlutonium.getDust(10),
            ),
            fluidInputs = arrayOf(
                Materials.EnrichedNaquadria.getFluid(144),
                Materials.SulfuricAcid.getFluid(900),
            ),
            fluidOutputs = arrayOf(
                Materials.DilutedSulfuricAcid.getFluid(900),
            ),
            outputs = arrayOf(
                Materials.Uranium235.getDust(5),
                Materials.Plutonium.getDust(2),
                Materials.Plutonium241.getDust(2),
                Materials.CosmicNeutronium.getDust(1),
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 300,
            eu = 2000000,
        )
    }
}
