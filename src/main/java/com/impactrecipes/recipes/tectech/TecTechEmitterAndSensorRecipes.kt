package com.impactrecipes.recipes.tectech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class TecTechEmitterAndSensorRecipes {

    internal fun register() {
        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.EmitterUV.get(),
            researchComputation = 24000,
            computationPerSecond = 32,
            researchEu = 100000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Neutronium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.MysteriousCrystal,
                    count = 4,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ElectrumFlux,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ElectrumFlux,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ElectrumFlux,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ElectrumFlux,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 7,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(4608),
                Materials.Naquadria.getMolten(2592),
            ),
            output = GregTechItems.EmitterUHV.get(),
            ticks = 1000,
            eu = 200000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.EmitterUHV.get(),
            researchComputation = 48000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 8,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.CosmicNeutronium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.stickLong,
                    material = Materials.Phoenixite,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.EnrichedMysteriousCrystal,
                    count = 8,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Diamericiumtitanium,
                    count = 7,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(9216),
                Materials.Quantium.getMolten(2592),
            ),
            output = GregTechItems.EmitterUEV.get(),
            ticks = 2000,
            eu = 800000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.SensorUV.get(),
            researchComputation = 24000,
            computationPerSecond = 32,
            researchEu = 100000,
            researchAmperage = 4,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Neutronium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Neutronium,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.MysteriousCrystal,
                    count = 4,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Infinite),
                    4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ElectrumFlux,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ElectrumFlux,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ElectrumFlux,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.ElectrumFlux,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 7,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(4608),
                Materials.Naquadria.getMolten(2592),
            ),
            output = GregTechItems.SensorUHV.get(),
            ticks = 1000,
            eu = 200000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.SensorUHV.get(),
            researchComputation = 48000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 8,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.CosmicNeutronium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Phoenixite,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.EnrichedMysteriousCrystal,
                    count = 8,
                ),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Adamantium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Draconium,
                    count = 7,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(9216),
                Materials.Quantium.getMolten(2592),
            ),
            output = GregTechItems.SensorUEV.get(),
            ticks = 2000,
            eu = 800000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.FieldGeneratorUV.get(),
            researchComputation = 48000,
            computationPerSecond = 64,
            researchEu = 200000,
            researchAmperage = 8,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Neutronium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Neutronium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.MysteriousCrystal,
                    count = 4,
                ),
                GregTechItems.EmitterUHV.get(amount = 4),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Bio),
                    4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Tritanium,
                    count = 64,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 8,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(4608),
                Materials.Naquadria.getMolten(2592),
            ),
            output = GregTechItems.FieldGeneratorUHV.get(),
            ticks = 2000,
            eu = 200000,
        )

        MachineRecipes.researchAssemblyLineWithOreInputs(
            researchItem = GregTechItems.FieldGeneratorUHV.get(),
            researchComputation = 96000,
            computationPerSecond = 128,
            researchEu = 400000,
            researchAmperage = 16,
            inputs = arrayOf<Any?>(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.CosmicNeutronium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.CosmicNeutronium,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gemExquisite,
                    material = Materials.EnrichedMysteriousCrystal,
                    count = 4,
                ),
                GregTechItems.EmitterUEV.get(amount = 4),
                arrayOf<Any?>(
                    OrePrefixes.circuit.get(Materials.Nano),
                    8,
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
                    count = 8,
                ),
            ),
            fluidInputs = arrayOf(
                Materials.SolderingAlloy.getMolten(9216),
                Materials.Quantium.getMolten(2592),
            ),
            output = GregTechItems.FieldGeneratorUEV.get(),
            ticks = 4000,
            eu = 800000,
        )
    }
}
