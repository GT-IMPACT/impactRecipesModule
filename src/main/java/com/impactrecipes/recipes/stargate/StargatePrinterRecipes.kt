package com.impactrecipes.recipes.stargate

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.items.StargateItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class StargatePrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 6,
                ),
                StargateItems.Ring.get(amount = 4),
                StargateItems.Chevron.get(),
                GregTechItems.EmitterUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Quantum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Infinity,
                    count = 32,
                ),
            ),
            output = StargateItems.Base.get(),
            fluidInputs = null,
            ticks = 100 * 20,
            eu = 32000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                ImpactItems.StargateShieldingFoil.get(amount = 8),
                ImpactItems.StargateFramePart.get(amount = 6),
                ImpactItems.StargateChevron.get(amount = 3),
                GregTechItems.FieldGeneratorUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Infinity,
                    count = 16,
                ),
            ),
            output = StargateItems.Ring.get(),
            fluidInputs = null,
            ticks = 50 * 20,
            eu = 32000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                GregTechItems.SensorUEV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Nano,
                    count = 4,
                ),
                StargateItems.ChevronUpgrade.get(),
                StargateItems.Ring.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Infinity,
                    count = 16,
                ),
            ),
            output = StargateItems.Chevron.get(),
            fluidInputs = null,
            ticks = 50 * 20,
            eu = 32000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 12,
                ),
                GregTechItems.CasingCoilSuperconductor.get(amount = 10),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Piko,
                    count = 4,
                ),
                StargateItems.IC2Capacitor.get(amount = 4),
                StargateItems.Ring.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Infinity,
                    count = 32,
                ),
            ),
            output = StargateItems.IC2PowerUnit.get(),
            fluidInputs = null,
            ticks = 100 * 20,
            eu = 32000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.block,
                    material = Materials.NaquadahAlloy,
                    count = 12,
                ),
                GregTechItems.CasingCoilSuperconductor.get(amount = 10),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Piko,
                    count = 4,
                ),
                OpenComputersItems.APUTier3.get(amount = 16),
                OpenComputersItems.CaseTier3.get(),
                StargateItems.Ring.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Infinity,
                    count = 32,
                ),
            ),
            output = StargateItems.OpenComputersInterface.get(),
            fluidInputs = null,
            ticks = 100 * 20,
            eu = 32000000,
        )
    }
}
