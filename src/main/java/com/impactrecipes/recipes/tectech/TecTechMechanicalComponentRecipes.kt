package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class TecTechMechanicalComponentRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.ConveyorModuleUV.get(),
            researchComputation = 24000,
            computationPerSecond = 32,
            researchEu = 100000,
            researchAmperage = 4,
            inputs = arrayOf(
                GregTechItems.ElectricMotorUHV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Neutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.round,
                    material = Materials.Neutronium,
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
                Materials.Silicone.getMolten(5760),
                Materials.Naquadria.getMolten(2592),
            ),
            output = GregTechItems.ConveyorModuleUHV.get(),
            ticks = 1000,
            eu = 200000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.ConveyorModuleUHV.get(),
            researchComputation = 48000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 8,
            inputs = arrayOf(
                GregTechItems.ElectricMotorUEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CosmicNeutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.CosmicNeutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.round,
                    material = Materials.CosmicNeutronium,
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
                Materials.Silicone.getMolten(11520),
                Materials.Quantium.getMolten(2592),
            ),
            output = GregTechItems.ConveyorModuleUEV.get(),
            ticks = 2000,
            eu = 800000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.ElectricPistonUV.get(),
            researchComputation = 24000,
            computationPerSecond = 32,
            researchEu = 100000,
            researchAmperage = 4,
            inputs = arrayOf(
                GregTechItems.ElectricMotorUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Neutronium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.round,
                    material = Materials.Neutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Neutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Neutronium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 4,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(2592),
                Materials.Lubricant.getFluid(4000),
                Materials.Naquadria.getMolten(2592),
            ),
            output = GregTechItems.ElectricPistonUHV.get(),
            ticks = 1000,
            eu = 200000,
        )

        MachineRecipes.researchAssemblyLine(
            researchItem = GregTechItems.ElectricPistonUHV.get(),
            researchComputation = 48000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 8,
            inputs = arrayOf(
                GregTechItems.ElectricMotorUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CosmicNeutronium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ring,
                    material = Materials.CosmicNeutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.round,
                    material = Materials.CosmicNeutronium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.CosmicNeutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.CosmicNeutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.CosmicNeutronium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Diamericiumtitanium,
                    count = 4,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(5184),
                Materials.Lubricant.getFluid(8000),
                Materials.Quantium.getMolten(2592),
            ),
            output = GregTechItems.ElectricPistonUEV.get(),
            ticks = 2000,
            eu = 800000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.RobotArmUV.get(),
            researchComputation = 24000,
            computationPerSecond = 32,
            researchEu = 100000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Neutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Neutronium,
                    count = 6,
                ),
                GregTechItems.ElectricMotorUHV.get(amount = 2),
                GregTechItems.ElectricPistonUHV.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    2,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Superconductor),
                    4,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Ultimate),
                    8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 6,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(4608),
                Materials.Lubricant.getFluid(4000),
                Materials.Naquadria.getMolten(2592),
            ),
            output = GregTechItems.RobotArmUHV.get(),
            ticks = 1000,
            eu = 200000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.RobotArmUHV.get(),
            researchComputation = 48000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 8,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.CosmicNeutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.CosmicNeutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.CosmicNeutronium,
                    count = 6,
                ),
                GregTechItems.ElectricMotorUEV.get(amount = 2),
                GregTechItems.ElectricPistonUEV.get(),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    2,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    4,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Superconductor),
                    8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Diamericiumtitanium,
                    count = 6,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(9216),
                Materials.Lubricant.getFluid(8000),
                Materials.Quantium.getMolten(2592),
            ),
            output = GregTechItems.RobotArmUEV.get(),
            ticks = 2000,
            eu = 800000,
        )
    }
}
