package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class TecTechMotorAndPumpRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.ElectricMotorUV.get(),
            researchComputation = 24000,
            computationPerSecond = 32,
            researchEu = 100000,
            researchAmperage = 4,
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.EuropiumoxideMagnetic,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Quantium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.round,
                    material = Materials.Quantium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Americium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 2,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2592),
                Materials.Lubricant.getFluid(4000),
                Materials.Naquadria.getMolten(2592),
            ),
            output = GregTechItems.ElectricMotorUHV.get(),
            ticks = 1000,
            eu = 200000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.ElectricMotorUHV.get(),
            researchComputation = 48000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 8,
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.EuropiumoxideMagnetic,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.CosmicNeutronium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.CosmicNeutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.round,
                    material = Materials.CosmicNeutronium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Diamericiumtitanium,
                    count = 2,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(5184),
                Materials.Lubricant.getFluid(8000),
                Materials.Quantium.getMolten(2592),
            ),
            output = GregTechItems.ElectricMotorUEV.get(),
            ticks = 2000,
            eu = 800000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.ElectricPumpUV.get(),
            researchComputation = 24000,
            computationPerSecond = 32,
            researchEu = 100000,
            researchAmperage = 4,
            inputs = arrayOf(
                GregTechItems.ElectricMotorUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Infuscolium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Neutronium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.Neutronium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Silicone,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Neutronium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 2,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2592),
                Materials.Lubricant.getFluid(4000),
                Materials.Naquadria.getMolten(2592),
            ),
            output = GregTechItems.ElectricPumpUHV.get(),
            ticks = 1000,
            eu = 200000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.ElectricPumpUHV.get(),
            researchComputation = 48000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 8,
            inputs = arrayOf(
                GregTechItems.ElectricMotorUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Neutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CosmicNeutronium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.screw,
                    material = Materials.CosmicNeutronium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Silicone,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.CosmicNeutronium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Diamericiumtitanium,
                    count = 2,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(5184),
                Materials.Lubricant.getFluid(8000),
                Materials.Quantium.getMolten(2592),
            ),
            output = GregTechItems.ElectricPumpUEV.get(),
            ticks = 2000,
            eu = 800000,
        )
    }
}
