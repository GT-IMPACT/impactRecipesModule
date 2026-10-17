package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class TecTechExoticCircuitRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitXenoprocessor.get(),
            researchComputation = 384000,
            computationPerSecond = 512,
            researchEu = 2000000,
            researchAmperage = 64,
            inputs = arrayOf(
                GregTechItems.CircuitBoardCrystalExtreme.get(amount = 2),
                GregTechItems.CircuitXenoprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 12),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 12),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 12),
                GregTechItems.CircuitChipQPIC.get(amount = 16),
                GregTechItems.CircuitChipSoC5.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Draconium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(1440),
                Materials.BlackPlutonium.getMolten(720),
                Materials.SuperCoolant.getFluid(10000),
                Materials.HyperFuelII.getFluid(500),
            ),
            output = GregTechItems.CircuitXenocomputer.get(),
            ticks = 5000,
            eu = 8000000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitXenocomputer.get(),
            researchComputation = 512000,
            computationPerSecond = 1024,
            researchEu = 4000000,
            researchAmperage = 64,
            inputs = arrayOf(
                GregTechItems.CircuitBoardCrystalExtreme.get(amount = 2),
                GregTechItems.CircuitXenocomputer.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 24),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 24),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 24),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 24),
                GregTechItems.CircuitChipQPIC.get(amount = 32),
                GregTechItems.CircuitChipSoC5.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Draconium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PerroxPolymer,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2880),
                Materials.BlackPlutonium.getMolten(1440),
                Materials.SuperCoolant.getFluid(20000),
                Materials.HyperFuelII.getFluid(1000),
            ),
            output = GregTechItems.CircuitXenosupercomputer.get(),
            ticks = 5000,
            eu = 8000000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitXenosupercomputer.get(),
            researchComputation = 768000,
            computationPerSecond = 1024,
            researchEu = 8000000,
            researchAmperage = 64,
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.DraconiumAwakened,
                    count = 8,
                ),
                GregTechItems.CircuitXenosupercomputer.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 48),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 48),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 48),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 48),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 48),
                GregTechItems.CircuitChipQPIC.get(amount = 64),
                GregTechItems.CircuitChipSoC5.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Quantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
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
                    material = Materials.PerroxPolymer,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(11520),
                Materials.BlackPlutonium.getMolten(5760),
                Materials.SuperCoolant.getFluid(80000),
                Materials.HyperFuelII.getFluid(4000),
            ),
            output = GregTechItems.CircuitPiko.get(),
            ticks = 10000,
            eu = 32000000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitPiko.get(),
            researchComputation = 512000,
            computationPerSecond = 512,
            researchEu = 8000000,
            researchAmperage = 32,
            inputs = arrayOf(
                ImpactItems.StargateShieldingFoil.get(),
                ImpactItems.StargateChevron.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Quantum,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDense,
                    material = Materials.Phoenixite,
                    count = 8,
                ),
                GregTechItems.CircuitChipSoC6.get(amount = 16),
                GregTechItems.CircuitChipNanoCPU.get(amount = 16),
                GregTechItems.CircuitChipRam.get(amount = 16),
                GregTechItems.CircuitChipNOR.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Lafium,
                    count = 32,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(5760),
                Materials.SuperCoolant.getFluid(10000),
            ),
            output = GregTechItems.CircuitChipSGCPU.get(amount = 16),
            ticks = 800,
            eu = 8000000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitCosmicprocessor.get(),
            researchComputation = 768000,
            computationPerSecond = 1024,
            researchEu = 8000000,
            researchAmperage = 64,
            inputs = arrayOf(
                ImpactItems.StargateFramePart.get(amount = 2),
                GregTechItems.CircuitCosmicprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 32),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 32),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 32),
                GregTechItems.CircuitChipFPIC.get(amount = 16),
                GregTechItems.CircuitChipSoC6.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.DraconiumAwakened,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PerroxPolymer,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(5760),
                Materials.InfinityCatalyst.getMolten(1440),
                Materials.SuperCoolant.getFluid(30000),
                Materials.HyperFuelIII.getFluid(2000),
            ),
            output = GregTechItems.CircuitCosmiccomputer.get(),
            ticks = 8000,
            eu = 8000000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitCosmiccomputer.get(),
            researchComputation = 1024000,
            computationPerSecond = 2048,
            researchEu = 16000000,
            researchAmperage = 96,
            inputs = arrayOf(
                ImpactItems.StargateFramePart.get(amount = 4),
                GregTechItems.CircuitCosmiccomputer.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 48),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 48),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 48),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 48),
                GregTechItems.CircuitChipFPIC.get(amount = 32),
                GregTechItems.CircuitChipSoC6.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.DraconiumAwakened,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PerroxPolymer,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(11520),
                Materials.InfinityCatalyst.getMolten(2880),
                Materials.SuperCoolant.getFluid(60000),
                Materials.HyperFuelIII.getFluid(4000),
            ),
            output = GregTechItems.CircuitCosmicsupercomputer.get(),
            ticks = 10000,
            eu = 30000000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.CircuitCosmicsupercomputer.get(),
            researchComputation = 1440000,
            computationPerSecond = 4096,
            researchEu = 30000000,
            researchAmperage = 128,
            inputs = arrayOf(
                ImpactItems.StargateFramePart.get(amount = 8),
                GregTechItems.CircuitCosmicsupercomputer.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 64),
                GregTechItems.CircuitPartsResistorXSMD.get(amount = 64),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 64),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 64),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 64),
                GregTechItems.CircuitChipFPIC.get(amount = 64),
                GregTechItems.CircuitChipSoC6.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.BlackPlutonium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorUEV,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Silicone,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.PerroxPolymer,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(23040),
                Materials.InfinityCatalyst.getMolten(5760),
                Materials.SuperCoolant.getFluid(120000),
                Materials.HyperFuelIII.getFluid(8000),
            ),
            output = GregTechItems.CircuitQuantum.get(),
            ticks = 12000,
            eu = 134000000,
        )
    }
}
