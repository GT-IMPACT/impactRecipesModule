package com.impactrecipes.recipes.gravisuite

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class GraviSuiteRelocatorRecipes {

    internal fun register() {
        MachineRecipes.assemblyLineWithOreInputs(
            researchItem = GregTechItems.CasingCoilSuperconductor.get(),
            researchTicks = 288000,
            inputs = arrayOf<Any?>(
                GregTechItems.CasingCoilSuperconductor.get(),
                AE2Items.SpatialIOPort.get(),
                GregTechItems.FieldGeneratorIV.get(amount = 4),
                GregTechItems.SensorLuV.get(amount = 8),
                GregTechItems.EmitterLuV.get(amount = 8),
                AE2Items.SpatialPylon.get(amount = 8),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Master),
                    8,
                ),
                GregTechItems.CircuitWaferNPIC.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Europium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Europium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Europium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Europium,
                    count = 64,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.NiobiumTitanium.getMolten(1440),
                FluidStack(
                    FluidRegistry.getFluid("ic2coolant"),
                    2000,
                ),
                Materials.Enderium.getMolten(2880),
            ),
            output = GraviSuiteItems.Relocator26.get(),
            ticks = 8000,
            eu = 28600,
        )
    }
}
