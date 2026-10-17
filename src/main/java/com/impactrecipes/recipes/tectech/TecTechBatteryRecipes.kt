package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class TecTechBatteryRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.EnergyCluster.get(),
            researchComputation = 12000,
            computationPerSecond = 16,
            researchEu = 100000,
            researchAmperage = 3,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    4,
                ),
                GregTechItems.CircuitHighEnergyFlow.get(amount = 4),
                GregTechItems.EnergyCluster.get(amount = 8),
                GregTechItems.FieldGeneratorUV.get(amount = 2),
                GregTechItems.CircuitWaferHPIC.get(amount = 64),
                GregTechItems.CircuitWaferHPIC.get(amount = 64),
                arrayOf(
                    GregTechItems.CircuitPartsDiodeASMD.get(amount = 64),
                    GregTechItems.CircuitPartsDiodeXSMD.get(amount = 16),
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Superconductor,
                    count = 32,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2880),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    16000,
                ),
            ),
            output = GregTechItems.ZPM2.get(),
            ticks = 3000,
            eu = 400000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.ZPM2.get(),
            researchComputation = 24000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 6,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Neutronium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Neutronium,
                    count = 32,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    4,
                ),
                GregTechItems.CircuitHighEnergyFlow.get(amount = 8),
                GregTechItems.ZPM2.get(amount = 8),
                GregTechItems.FieldGeneratorUHV.get(amount = 4),
                GregTechItems.CircuitWaferUHPIC.get(amount = 64),
                GregTechItems.CircuitWaferUHPIC.get(amount = 64),
                GregTechItems.CircuitWaferSoC2.get(amount = 32),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorUEV,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(4032),
                Materials.Naquadria.getMolten(9000),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    32000,
                ),
            ),
            output = GregTechItems.ZPM3.get(),
            ticks = 4000,
            eu = 1600000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Quantium,
                count = 1,
            ),
            researchComputation = 12000,
            computationPerSecond = 16,
            researchEu = 500000,
            researchAmperage = 3,
            inputs = arrayOf(
                GregTechItems.CircuitBoardBioUltra.get(),
                ImpactItems.QuantiumCompressedPlate.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Neutronium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Pikyonium64B,
                    count = 8,
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
            fluidInputs = arrayOf(),
            output = ImpactItems.OrbCasingI.get(),
            ticks = 400,
            eu = 300000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Adamantium,
                count = 1,
            ),
            researchComputation = 16000,
            computationPerSecond = 18,
            researchEu = 1000000,
            researchAmperage = 6,
            inputs = arrayOf(
                GregTechItems.CircuitBoardCrystalExtreme.get(),
                ImpactItems.AdamantiumCompressedPlate.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Phoenixite,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Quantum,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.HSSE,
                    count = 24,
                ),
            ),
            fluidInputs = arrayOf(),
            output = ImpactItems.OrbCasingII.get(),
            ticks = 500,
            eu = 800000,
        )
    }
}
