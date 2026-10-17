package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactEnergyOrbPrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Plutonium241,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Europium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 8,
                ),
                GregTechItems.EnergyLapotronicOrb.get(amount = 4),
                GregTechItems.FieldGeneratorEV.get(),
                GregTechItems.CircuitChipUHPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 8),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 8),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorLuV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Trinium,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyLapotronicOrb2.get(),
            fluidInputs = null,
            ticks = 1000,
            eu = 80000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.NaquadahEnriched,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Europium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 8,
                ),
                GregTechItems.EnergyLapotronicOrb.get(amount = 2),
                GregTechItems.FieldGeneratorIV.get(),
                GregTechItems.CircuitChipUHPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 8),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 8),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorLuV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Oriharukon,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyLapotronicOrb2.get(),
            fluidInputs = null,
            ticks = 1000,
            eu = 80000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Naquadria,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Europium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 8,
                ),
                GregTechItems.EnergyLapotronicOrb.get(),
                GregTechItems.FieldGeneratorLuV.get(),
                GregTechItems.CircuitChipUHPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 8),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 8),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorLuV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Quantium,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyLapotronicOrb2.get(),
            fluidInputs = null,
            ticks = 1000,
            eu = 80000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Plutonium241,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Americium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 16,
                ),
                GregTechItems.EnergyLapotronicOrb2.get(amount = 4),
                GregTechItems.FieldGeneratorIV.get(),
                GregTechItems.CircuitChipNPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 16),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 16),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 16),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorZPM,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Oriharukon,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyModule.get(),
            fluidInputs = null,
            ticks = 1200,
            eu = 100000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.NaquadahEnriched,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Americium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 16,
                ),
                GregTechItems.EnergyLapotronicOrb2.get(amount = 2),
                GregTechItems.FieldGeneratorLuV.get(),
                GregTechItems.CircuitChipNPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 16),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 16),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 16),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorZPM,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Quantium,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyModule.get(),
            fluidInputs = null,
            ticks = 1200,
            eu = 100000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Naquadria,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Americium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 16,
                ),
                GregTechItems.EnergyLapotronicOrb2.get(),
                GregTechItems.FieldGeneratorZPM.get(),
                GregTechItems.CircuitChipNPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 16),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 16),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 16),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorZPM,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Adamantium,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyModule.get(),
            fluidInputs = null,
            ticks = 1200,
            eu = 100000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardWetwareExtreme.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Plutonium241,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Neutronium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 32,
                ),
                GregTechItems.EnergyModule.get(amount = 4),
                GregTechItems.FieldGeneratorLuV.get(),
                GregTechItems.CircuitChipPPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 32),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 32),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 32),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorUV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Quantium,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyCluster.get(),
            fluidInputs = null,
            ticks = 1400,
            eu = 200000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardWetwareExtreme.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.NaquadahEnriched,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Neutronium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 32,
                ),
                GregTechItems.EnergyModule.get(amount = 2),
                GregTechItems.FieldGeneratorZPM.get(),
                GregTechItems.CircuitChipPPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 32),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 32),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 32),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorUV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Adamantium,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyCluster.get(),
            fluidInputs = null,
            ticks = 1400,
            eu = 200000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                GregTechItems.CircuitBoardWetwareExtreme.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Naquadria,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Neutronium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 32,
                ),
                GregTechItems.EnergyModule.get(),
                GregTechItems.FieldGeneratorUV.get(),
                GregTechItems.CircuitChipPPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 32),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 32),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 32),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorUV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.BlackPlutonium,
                    count = 16,
                ),
            ),
            output = GregTechItems.EnergyCluster.get(),
            fluidInputs = null,
            ticks = 1400,
            eu = 200000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.OrbCasingI.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Plutonium241,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Neutronium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 48,
                ),
                GregTechItems.CircuitPartsMECrystalChipElite.get(amount = 60),
                GregTechItems.FieldGeneratorIV.get(),
                GregTechItems.CircuitChipQPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 48),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 48),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 48),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 48),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Europium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.Adamantium,
                    count = 16,
                ),
            ),
            output = GregTechItems.MysteriousCrystalOrb.get(),
            fluidInputs = null,
            ticks = 2000,
            eu = 1000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.OrbCasingI.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.NaquadahEnriched,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Neutronium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 48,
                ),
                GregTechItems.CircuitPartsMECrystalChipElite.get(amount = 48),
                GregTechItems.FieldGeneratorLuV.get(),
                GregTechItems.CircuitChipQPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 48),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 48),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 48),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 48),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Europium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.BlackPlutonium,
                    count = 16,
                ),
            ),
            output = GregTechItems.MysteriousCrystalOrb.get(),
            fluidInputs = null,
            ticks = 1600,
            eu = 1000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.OrbCasingI.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Naquadria,
                    count = 24,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Neutronium,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 48,
                ),
                GregTechItems.CircuitPartsMECrystalChipElite.get(amount = 36),
                GregTechItems.FieldGeneratorZPM.get(),
                GregTechItems.CircuitChipQPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 48),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 48),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 48),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 48),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Europium,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CosmicNeutronium,
                    count = 16,
                ),
            ),
            output = GregTechItems.MysteriousCrystalOrb.get(),
            fluidInputs = null,
            ticks = 1200,
            eu = 1000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.OrbCasingII.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Plutonium241,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Phoenixite,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 64,
                ),
                GregTechItems.MysteriousCrystalOrb.get(amount = 4),
                GregTechItems.FieldGeneratorZPM.get(),
                GregTechItems.CircuitChipFPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 64),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 64),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 64),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorUEV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.BlackPlutonium,
                    count = 16,
                ),
            ),
            output = GregTechItems.MysteriousCrystalModule.get(),
            fluidInputs = null,
            ticks = 1600,
            eu = 4000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.OrbCasingII.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.NaquadahEnriched,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Phoenixite,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 64,
                ),
                GregTechItems.MysteriousCrystalOrb.get(amount = 2),
                GregTechItems.FieldGeneratorUV.get(),
                GregTechItems.CircuitChipFPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 64),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 64),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 64),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorUEV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.CosmicNeutronium,
                    count = 16,
                ),
            ),
            output = GregTechItems.MysteriousCrystalModule.get(),
            fluidInputs = null,
            ticks = 1600,
            eu = 4000000,
        )

        MachineRecipes.printer3d4x4(
            inputs = arrayOf(
                ImpactItems.OrbCasingII.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Naquadria,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.foil,
                    material = Materials.Phoenixite,
                    count = 32,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.itemCasing,
                    material = Materials.Californium,
                    count = 64,
                ),
                GregTechItems.MysteriousCrystalOrb.get(),
                GregTechItems.FieldGeneratorUHV.get(),
                GregTechItems.CircuitChipFPIC.get(amount = 16),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 64),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 64),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 64),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.SuperconductorUEV,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.DraconiumAwakened,
                    count = 16,
                ),
            ),
            output = GregTechItems.MysteriousCrystalModule.get(),
            fluidInputs = null,
            ticks = 1600,
            eu = 4000000,
        )
    }
}
