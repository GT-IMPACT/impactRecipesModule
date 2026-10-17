package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class TecTechEnergyHatchRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.HatchEnergyUV.get(),
            researchComputation = 24000,
            computationPerSecond = 64,
            researchEu = 500000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                GregTechItems.HullMAX.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Superconductor,
                    count = 2,
                ),
                GregTechItems.CircuitChipQPIC.get(amount = 2),
                GregTechItems.CircuitHighEnergyFlow.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    2,
                ),
                GregTechItems.UHVCoil.get(amount = 2),
                arrayOf(
                    GregTechItems.ReactorCoolantHe6.get(),
                    GregTechItems.ReactorCoolantNaK6.get(),
                    GregTechItems.ReactorCoolantLe2.get(),
                ),
                arrayOf(
                    GregTechItems.ReactorCoolantHe6.get(),
                    GregTechItems.ReactorCoolantNaK6.get(),
                    GregTechItems.ReactorCoolantLe2.get(),
                ),
                arrayOf(
                    GregTechItems.ReactorCoolantHe6.get(),
                    GregTechItems.ReactorCoolantNaK6.get(),
                    GregTechItems.ReactorCoolantLe2.get(),
                ),
                GregTechItems.ElectricPumpUHV.get(),
            ),
            fluidInputs = arrayOf(
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    16000,
                ),
                Materials.SolderingAlloy.getMolten(5760),
            ),
            output = GregTechItems.HatchEnergyMAX.get(),
            ticks = 1000,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.HatchEnergyMAX.get(),
            researchComputation = 48000,
            computationPerSecond = 128,
            researchEu = 1000000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                GregTechItems.HullUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorUEV,
                    count = 6,
                ),
                GregTechItems.CircuitChipFPIC.get(amount = 2),
                GregTechItems.CircuitHighEnergyFlow.get(amount = 2),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    2,
                ),
                GregTechItems.UEVCoil.get(amount = 2),
                GregTechItems.ReactorCoolantLe2.get(),
                GregTechItems.ReactorCoolantLe2.get(),
                GregTechItems.ReactorCoolantLe2.get(),
                GregTechItems.ElectricPumpUEV.get(),
            ),
            fluidInputs = arrayOf(
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    32000,
                ),
                Materials.SolderingAlloy.getMolten(11520),
            ),
            output = GregTechItems.HatchEnergyUEV.get(),
            ticks = 1200,
            eu = 8000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.HatchDynamoUV.get(),
            researchComputation = 24000,
            computationPerSecond = 64,
            researchEu = 500000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                GregTechItems.HullMAX.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Europium,
                    count = 4,
                ),
                GregTechItems.CircuitChipQPIC.get(amount = 2),
                GregTechItems.CircuitHighEnergyFlow.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    2,
                ),
                GregTechItems.UHVCoil.get(amount = 2),
                arrayOf(
                    GregTechItems.ReactorCoolantHe6.get(),
                    GregTechItems.ReactorCoolantNaK6.get(),
                    GregTechItems.ReactorCoolantLe2.get(),
                ),
                arrayOf(
                    GregTechItems.ReactorCoolantHe6.get(),
                    GregTechItems.ReactorCoolantNaK6.get(),
                    GregTechItems.ReactorCoolantLe2.get(),
                ),
                arrayOf(
                    GregTechItems.ReactorCoolantHe6.get(),
                    GregTechItems.ReactorCoolantNaK6.get(),
                    GregTechItems.ReactorCoolantLe2.get(),
                ),
                GregTechItems.ElectricPumpUHV.get(),
            ),
            fluidInputs = arrayOf(
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    16000,
                ),
                Materials.SolderingAlloy.getMolten(5760),
            ),
            output = GregTechItems.HatchDynamoMAX.get(),
            ticks = 1000,
            eu = 2000000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.HatchDynamoMAX.get(),
            researchComputation = 48000,
            computationPerSecond = 128,
            researchEu = 1000000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                GregTechItems.HullUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Diamericiumtitanium,
                    count = 6,
                ),
                GregTechItems.CircuitChipFPIC.get(amount = 2),
                GregTechItems.CircuitHighEnergyFlow.get(amount = 2),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    2,
                ),
                GregTechItems.UEVCoil.get(amount = 2),
                GregTechItems.ReactorCoolantLe2.get(),
                GregTechItems.ReactorCoolantLe2.get(),
                GregTechItems.ReactorCoolantLe2.get(),
                GregTechItems.ElectricPumpUEV.get(),
            ),
            fluidInputs = arrayOf(
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    32000,
                ),
                Materials.SolderingAlloy.getMolten(11520),
            ),
            output = GregTechItems.HatchDynamoUEV.get(),
            ticks = 1200,
            eu = 8000000,
        )
    }
}
