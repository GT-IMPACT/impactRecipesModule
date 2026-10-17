package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class TecTechAdvancedProcessorRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitBiomainframe.get(),
            researchComputation = 48000,
            computationPerSecond = 128,
            researchEu = 1000000,
            researchAmperage = 8,
            inputs = arrayOf(
                GregTechItems.FieldGeneratorUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 2,
                ),
                ImpactItems.NaqChamberPart.get(amount = 6),
                IC2Items.ReinforcedGlass.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Superconductor,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Neutronium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.ElectrumFlux,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.NaquadahAlloy,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 16,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1152),
                Materials.SuperCoolant.getFluid(10000),
            ),
            output = GregTechItems.NaquaBoardEmpty.get(amount = 32),
            ticks = 300,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CircuitNaquaprocessor.get(),
            researchComputation = 96000,
            computationPerSecond = 256,
            researchEu = 1000000,
            researchAmperage = 16,
            inputs = arrayOf<Any?>(
                GregTechItems.CircuitNaquaprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 16),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 16),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 24),
                GregTechItems.CircuitChipPPIC.get(amount = 16),
                GregTechItems.CircuitChipSoC2.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Naquadah,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2880),
                Materials.Naquadria.getMolten(2880),
                Materials.SuperCoolant.getFluid(20000),
                Materials.HyperFuelI.getFluid(1000),
            ),
            output = GregTechItems.CircuitNaquacomputer.get(),
            ticks = 4000,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CircuitNaquacomputer.get(),
            researchComputation = 192000,
            computationPerSecond = 512,
            researchEu = 2000000,
            researchAmperage = 32,
            inputs = arrayOf<Any?>(
                GregTechItems.CircuitNaquacomputer.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 24),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 24),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 24),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 24),
                GregTechItems.CircuitChipPPIC.get(amount = 32),
                GregTechItems.CircuitChipSoC2.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Naquadah,
                    count = 32,
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
                Materials.Naquadria.getMolten(2880),
                Materials.SuperCoolant.getFluid(20000),
                Materials.HyperFuelI.getFluid(1000),
            ),
            output = GregTechItems.CircuitNaquasupercomputer.get(),
            ticks = 4000,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.CircuitNaquasupercomputer.get(),
            researchComputation = 384000,
            computationPerSecond = 1024,
            researchEu = 2000000,
            researchAmperage = 64,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Phoenixite,
                    count = 8,
                ),
                GregTechItems.CircuitNaquasupercomputer.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 32),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 32),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 32),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 32),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 32),
                GregTechItems.CircuitChipRam.get(amount = 64),
                GregTechItems.CircuitChipPPIC.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorUV,
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
                Materials.SolderingAlloy.getMolten(5760),
                Materials.Naquadria.getMolten(5760),
                Materials.SuperCoolant.getFluid(40000),
                Materials.HyperFuelI.getFluid(2000),
            ),
            output = GregTechItems.CircuitNano.get(),
            ticks = 8000,
            eu = 8000000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitNano.get(),
            researchComputation = 192000,
            computationPerSecond = 256,
            researchEu = 2000000,
            researchAmperage = 32,
            inputs = arrayOf(
                GregTechItems.CircuitChipBioCPU.get(),
                GregTechItems.CircuitChipBarnardacell.get(amount = 16),
                GregTechItems.CircuitPartsReinforcedGlassTube.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeTiny,
                    material = Materials.Polybenzimidazole,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Draconium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CinobiteA243,
                    count = 32,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.BioMediumSterilized.getFluid(1000),
                Materials.Radon.getGas(1000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    2000,
                ),
            ),
            output = GregTechItems.CircuitChipBarnardaCPU.get(),
            ticks = 800,
            eu = 2000000,
        )
    }
}
