package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechCircuitBoardRecipes {

    internal fun register() {
        //Energy Flow Circuit
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                Materials.Ultimate.item(OrePrefixes.circuit).get(amount = 2),
                GregTechItems.CircuitChipUHPIC.get(amount = 4),
                GregTechItems.CircuitChipQuantumCPU.get(amount = 2),
                GregTechItems.CircuitChipNanoCPU.get(amount = 2),
                Materials.SuperconductorZPM.item(OrePrefixes.wireGt01).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitHighEnergyFlow.get(),
            ticks = 2400,
            eu = 7680,
            cleanroom = true,
        )

        //Lapoorbs
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitChipPIC.get(amount = 4),
                GregTechItems.CircuitPartsCrystalChipMaster.get(amount = 24),
                GregTechItems.CircuitChipNanoCPU.get(amount = 2),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.Platinum.item(OrePrefixes.plate).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.EnergyLapotronicOrb.get(),
            ticks = 512,
            eu = 1024,
            cleanroom = true,
        )

        //Wetware Board
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardMultifiberglass.get(amount = 16),
                GregTechItems.CircuitPartsPetriDish.get(),
                GregTechItems.ElectricPumpLuV.get(),
                GregTechItems.SensorIV.get(),
                Materials.Elite.item(OrePrefixes.circuit).get(),
                Materials.NiobiumTitanium.item(OrePrefixes.foil).get(amount = 16),
            ),
            fluidInput = Materials.GrowthMediumSterilized.getFluid(4000L),
            output = GregTechItems.CircuitBoardWetware.get(amount = 16),
            ticks = 1200,
            eu = 30720,
            cleanroom = true,
        )

        //Bio Board
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardWetware.get(amount = 32),
                GregTechItems.CircuitPartsPetriDish.get(amount = 32),
                GregTechItems.ElectricPumpUV.get(),
                GregTechItems.SensorLuV.get(amount = 2),
                Materials.Superconductor.item(OrePrefixes.circuit).get(),
                Materials.Neutronium.item(OrePrefixes.foil).get(amount = 32),
            ),
            fluidInput = Materials.BioMediumSterilized.getFluid(16000L),
            output = GregTechItems.CircuitBoardBio.get(amount = 32),
            ticks = 1200,
            eu = 500000,
            cleanroom = true,
        )

        //Crystal Board
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardBio.get(amount = 32),
                Materials.DraconiumAwakened.item(OrePrefixes.pipeTiny).get(amount = 32),
                GregTechItems.ElectricPumpUEV.get(),
                GregTechItems.SensorUEV.get(amount = 2),
                Materials.Nano.item(OrePrefixes.circuit).get(),
                Materials.Oriharukon.item(OrePrefixes.foil).get(amount = 64),
            ),
            fluidInput = Materials.FermentedAlienBiomass.getFluid(16000L),
            output = GregTechItems.CircuitBoardCrystal.get(amount = 32),
            ticks = 1400,
            eu = 2000000,
            cleanroom = true,
        )

        // --- Blank Gene Sample
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsPetriDish.get(),
                GregTechItems.CircuitChipCPU.get(amount = 2),
                GregTechItems.CircuitChipRam.get(amount = 4),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.Europium.item(OrePrefixes.plate).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = ImpactItems.BlankGeneSampleRaw.get(),
            ticks = 400,
            eu = 2560,
            cleanroom = true,
        )

        // --- Genetic Template
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitPartsPetriDish.get(),
                GregTechItems.CircuitChipRam.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 32),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 32),
                Materials.Europium.item(OrePrefixes.plate).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = ImpactItems.GeneticTemplateRaw.get(),
            ticks = 500,
            eu = 7680,
            cleanroom = true,
        )
    }
}
