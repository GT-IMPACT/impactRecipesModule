package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.TecTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class TecTechMultiblockRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.WetTransformerZPMLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Energy,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorLuV,
                    count = 16,
                ),
                GregTechItems.CircuitChipUHPIC.get(amount = 2),
            ),
            fluid = Materials.TungstenSteel.getMolten(576),
            output = TecTechItems.MachineMultiTransformer.get(),
            ticks = 400,
            eu = 30720,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = TecTechItems.MachineMultiMatterToEM.get(),
            researchComputation = 15000,
            computationPerSecond = 32,
            researchEu = 500000,
            researchAmperage = 8,
            inputs = arrayOf(
                TecTechItems.MachineMultiMatterToEM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Neutronium,
                    count = 4,
                ),
                GregTechItems.EmitterUV.get(amount = 2),
                GregTechItems.CircuitWetwaresupercomputer.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Diamericiumtitanium,
                    count = 2,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1296),
                Materials.Silver.getMolten(2592),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    4000,
                ),
                Materials.Osmium.getMolten(1296),
            ),
            output = TecTechItems.MachineMultiEssentiaToEM.get(),
            ticks = 24000,
            eu = 500000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = TecTechItems.MachineMultiEMToMatter.get(),
            researchComputation = 15000,
            computationPerSecond = 32,
            researchEu = 500000,
            researchAmperage = 8,
            inputs = arrayOf(
                TecTechItems.MachineMultiEMToMatter.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Neutronium,
                    count = 4,
                ),
                GregTechItems.SensorUV.get(amount = 2),
                GregTechItems.CircuitWetwaresupercomputer.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Diamericiumtitanium,
                    count = 2,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1296),
                Materials.Silver.getMolten(2592),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    4000,
                ),
                Materials.Osmium.getMolten(1296),
            ),
            output = TecTechItems.MachineMultiEMToEssentia.get(),
            ticks = 24000,
            eu = 500000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = TecTechItems.MachineMultiResearch.get(),
            researchComputation = 150000,
            computationPerSecond = 128,
            researchEu = 500000,
            researchAmperage = 16,
            inputs = arrayOf(
                TecTechItems.MachineMultiEMjunction.get(),
                TecTechItems.EMComputerBus.get(amount = 4),
                GregTechItems.FieldGeneratorUV.get(amount = 4),
                GregTechItems.SensorUV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Nano,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.MysteriousCrystal,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Diamericiumtitanium,
                    count = 4,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1296),
                Materials.Neutronium.getMolten(2592),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    4000,
                ),
                Materials.Osmiridium.getMolten(1296),
            ),
            output = TecTechItems.MachineMultiScanner.get(),
            ticks = 24000,
            eu = 500000,
        )
    }
}
