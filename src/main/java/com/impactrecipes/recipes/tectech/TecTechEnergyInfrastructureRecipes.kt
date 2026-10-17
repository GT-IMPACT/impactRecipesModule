package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class TecTechEnergyInfrastructureRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CasingCoreChamber.get(),
            researchComputation = 48000,
            computationPerSecond = 128,
            researchEu = 1000000,
            researchAmperage = 6,
            inputs = arrayOf<Any?>(
                GregTechItems.HullMAX.get(),
                GregTechItems.CasingDysonRing.get(amount = 16),
                GregTechItems.CasingFusionCoil.get(amount = 16),
                GregTechItems.FieldGeneratorUV.get(amount = 4),
                GregTechItems.SensorUHV.get(amount = 4),
                GregTechItems.EmitterUHV.get(amount = 4),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.EnrichedMysteriousCrystal,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Superconductor,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.EnrichedNaquadria.getFluid(2592),
                Materials.Neutronium.getMolten(2592),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    4000,
                ),
                Materials.Osmiridium.getMolten(1296),
            ),
            output = GregTechItems.MachineMultiblockTesseract.get(),
            ticks = 8000,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CasingFusionCoil3.get(),
            researchComputation = 12000,
            computationPerSecond = 32,
            researchEu = 500000,
            researchAmperage = 6,
            inputs = arrayOf<Any?>(
                GregTechItems.CasingFusionCoil3.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Nano),
                    4,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    8,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    16,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Superconductor),
                    32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Phoenixite,
                    count = 4,
                ),
                GregTechItems.FieldGeneratorUHV.get(amount = 2),
                GregTechItems.CircuitWaferFPIC.get(amount = 64),
                GregTechItems.CircuitWaferFPIC.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorUEV,
                    count = 32,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(5760),
                Materials.DraconiumAwakened.getMolten(2304),
            ),
            output = GregTechItems.FusionComputerUEV.get(),
            ticks = 1600,
            eu = 1000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CoverSolarPanelUV.get(),
            researchComputation = 96000,
            computationPerSecond = 128,
            researchEu = 500000,
            researchAmperage = 16,
            inputs = arrayOf<Any?>(
                GregTechItems.CoverSolarPanelUV.get(amount = 2),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Nano),
                    8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuintuple,
                    material = Materials.Sunnarium,
                    count = 8,
                ),
                GregTechItems.CircuitSiliconWafer10.get(amount = 4),
                GregTechItems.CircuitSiliconWafer6.get(amount = 4),
                GregTechItems.CircuitChipRPico.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateAlloy,
                    material = Materials.Carbon,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Neutronium,
                    count = 3,
                ),
                GregTechItems.CircuitChipQPIC.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Silicon,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.ElectrumFlux,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Superconductor,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1890),
                Materials.PerroxPolymer.getMolten(2880),
            ),
            output = GregTechItems.CoverSolarPanelUHV.get(),
            ticks = 840,
            eu = 8000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CoverSolarPanelUHV.get(),
            researchComputation = 192000,
            computationPerSecond = 512,
            researchEu = 2000000,
            researchAmperage = 32,
            inputs = arrayOf<Any?>(
                GregTechItems.CoverSolarPanelUHV.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Piko),
                    8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Sunnarium,
                    count = 8,
                ),
                GregTechItems.CircuitChipPico.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateAlloy,
                    material = Materials.Carbon,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Phoenixite,
                    count = 4,
                ),
                GregTechItems.CircuitChipFPIC.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Silicon,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuadruple,
                    material = Materials.ElectrumFlux,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt12,
                    material = Materials.SuperconductorUEV,
                    count = 18,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(3780),
                Materials.PerroxPolymer.getMolten(5760),
            ),
            output = GregTechItems.CoverSolarPanelUEV.get(),
            ticks = 960,
            eu = 32000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.MachineDigitalTransformerUV.get(),
            researchComputation = 12000,
            computationPerSecond = 16,
            researchEu = 100000,
            researchAmperage = 2,
            inputs = arrayOf<Any?>(
                GregTechItems.WetTransformerUEVUHV.get(),
                GregTechItems.CoverScreen.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Osmium,
                    count = 2,
                ),
                GregTechItems.UHVCoil.get(),
                GregTechItems.CircuitHighEnergyFlow.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    2,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(11520),
            ),
            output = GregTechItems.MachineDigitalTransformerUHV.get(),
            ticks = 1000,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.MachineDigitalTransformerUHV.get(),
            researchComputation = 24000,
            computationPerSecond = 32,
            researchEu = 100000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                GregTechItems.WetTransformerUIVUEV.get(),
                GregTechItems.CoverScreen.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Osmium,
                    count = 2,
                ),
                GregTechItems.UEVCoil.get(),
                GregTechItems.CircuitHighEnergyFlow.get(amount = 2),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    2,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(23040),
            ),
            output = GregTechItems.MachineDigitalTransformerUEV.get(),
            ticks = 2000,
            eu = 8000000,
        )
    }
}
