package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class TecTechBiowareCircuitRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CircuitWetwaresupercomputer.get(),
            researchComputation = 24000,
            computationPerSecond = 64,
            researchEu = 50000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Tritanium,
                    count = 2,
                ),
                GregTechItems.CircuitWetwaresupercomputer.get(amount = 2),
                GregTechItems.ZPMCoil.get(amount = 16),
                arrayOf(
                    GregTechItems.CircuitPartsCapacitorASMD.get(amount = 32),
                    GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 8),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsResistorASMD.get(amount = 32),
                    GregTechItems.CircuitPartsResistorXSMD.get(amount = 8),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsTransistorASMD.get(amount = 32),
                    GregTechItems.CircuitPartsTransistorXSMD.get(amount = 8),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsDiodeASMD.get(amount = 32),
                    GregTechItems.CircuitPartsDiodeXSMD.get(amount = 8),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsInductorASMD.get(amount = 32),
                    GregTechItems.CircuitPartsInductorXSMD.get(amount = 8),
                ),
                GregTechItems.CircuitChipRam.get(amount = 48),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorZPM,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2880),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    10000,
                ),
                Materials.Radon.getGas(2500),
            ),
            output = GregTechItems.CircuitWetwaremainframe.get(),
            ticks = 2000,
            eu = 300000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CircuitBiowarecomputer.get(),
            researchComputation = 48000,
            computationPerSecond = 128,
            researchEu = 500000,
            researchAmperage = 8,
            inputs = arrayOf<Any?>(
                GregTechItems.CircuitBoardBioUltra.get(amount = 2),
                GregTechItems.CircuitBiowarecomputer.get(amount = 2),
                arrayOf(
                    GregTechItems.CircuitPartsTransistorASMD.get(amount = 16),
                    GregTechItems.CircuitPartsTransistorXSMD.get(amount = 4),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsResistorASMD.get(amount = 16),
                    GregTechItems.CircuitPartsResistorXSMD.get(amount = 4),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsCapacitorASMD.get(amount = 16),
                    GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 4),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsDiodeASMD.get(amount = 16),
                    GregTechItems.CircuitPartsDiodeXSMD.get(amount = 4),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsInductorASMD.get(amount = 16),
                    GregTechItems.CircuitPartsInductorXSMD.get(amount = 4),
                ),
                GregTechItems.CircuitChipNOR.get(amount = 32),
                GregTechItems.CircuitChipRam.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.NiobiumTitanium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1440),
                Materials.BioMediumSterilized.getFluid(1440),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    10000,
                ),
            ),
            output = GregTechItems.CircuitBiowaresupercomputer.get(),
            ticks = 4000,
            eu = 500000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CircuitBiowaresupercomputer.get(),
            researchComputation = 96000,
            computationPerSecond = 256,
            researchEu = 1000000,
            researchAmperage = 16,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Tritanium,
                    count = 4,
                ),
                GregTechItems.CircuitBiowaresupercomputer.get(amount = 2),
                GregTechItems.UVCoil.get(amount = 16),
                arrayOf(
                    GregTechItems.CircuitPartsCapacitorASMD.get(amount = 64),
                    GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 16),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsResistorASMD.get(amount = 64),
                    GregTechItems.CircuitPartsResistorXSMD.get(amount = 16),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsTransistorASMD.get(amount = 64),
                    GregTechItems.CircuitPartsTransistorXSMD.get(amount = 16),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsDiodeASMD.get(amount = 64),
                    GregTechItems.CircuitPartsDiodeXSMD.get(amount = 16),
                ),
                arrayOf(
                    GregTechItems.CircuitPartsInductorASMD.get(amount = 64),
                    GregTechItems.CircuitPartsInductorXSMD.get(amount = 16),
                ),
                GregTechItems.CircuitChipRam.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Superconductor,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Polybenzimidazole,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2880),
                Materials.BioMediumSterilized.getFluid(2880),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    20000,
                ),
            ),
            output = GregTechItems.CircuitBiomainframe.get(),
            ticks = 6000,
            eu = 2000000,
        )
    }
}
