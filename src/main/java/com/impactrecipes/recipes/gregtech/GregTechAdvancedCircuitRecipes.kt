package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechAdvancedCircuitRecipes {

    internal fun register() {
        // --- IV
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitData.get(amount = 2),
                GregTechItems.CircuitPartsCoil.get(amount = 12),
                GregTechItems.CircuitPartsCapacitor.get(amount = 24),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 24),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitElite.get(),
            ticks = 1600,
            eu = 480,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitData.get(amount = 2),
                GregTechItems.CircuitPartsInductorSMD.get(amount = 6),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 16),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitElite.get(),
            ticks = 1600,
            eu = 480,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitData.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 3),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitElite.get(),
            ticks = 800,
            eu = 480,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitNanocomputer.get(amount = 2),
                GregTechItems.CircuitPartsDiodeSMD.get(amount = 8),
                GregTechItems.CircuitChipNOR.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitElitenanocomputer.get(),
            ticks = 400,
            eu = 600,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitNanocomputer.get(amount = 2),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 2),
                GregTechItems.CircuitChipNOR.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitElitenanocomputer.get(),
            ticks = 200,
            eu = 600,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitQuantumprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorSMD.get(amount = 12),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 16),
                GregTechItems.CircuitChipRam.get(amount = 4),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitQuantumcomputer.get(amount = 2),
            ticks = 400,
            eu = 2400,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitQuantumprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 3),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 4),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 24),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitQuantumcomputer.get(amount = 2),
            ticks = 200,
            eu = 2400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitChipSoC4.get(),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.YttriumBariumCuprate.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitQuantumcomputer.get(amount = 2),
            ticks = 50,
            eu = 38400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitChipCrystalCPU.get(),
                GregTechItems.CircuitChipNanoCPU.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 6),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 6),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitCrystalprocessor.get(amount = 2),
            ticks = 100,
            eu = 9600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitChipCrystalSoC.get(),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 8),
                Materials.YttriumBariumCuprate.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitCrystalprocessor.get(amount = 3),
            ticks = 50,
            eu = 153600,
            cleanroom = true,
        )

        // --- LuV
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitElitenanocomputer.get(amount = 2),
                GregTechItems.CircuitPartsInductorSMD.get(amount = 16),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 32),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 32),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitMaster.get(),
            ticks = 1600,
            eu = 1920,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitElitenanocomputer.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 4),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 8),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 32),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitMaster.get(),
            ticks = 800,
            eu = 1920,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitChipSoC4.get(),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 32),
                Materials.YttriumBariumCuprate.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMaster.get(),
            ticks = 50,
            eu = 500000,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitQuantumcomputer.get(amount = 2),
                GregTechItems.CircuitPartsDiodeSMD.get(amount = 8),
                GregTechItems.CircuitChipNOR.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 32),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitMasterquantumcomputer.get(),
            ticks = 400,
            eu = 2400,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitQuantumcomputer.get(amount = 2),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 2),
                GregTechItems.CircuitChipNOR.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 16),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 48),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitMasterquantumcomputer.get(),
            ticks = 200,
            eu = 2400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitCrystalprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 8),
                GregTechItems.CircuitChipRam.get(amount = 24),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitCrystalcomputer.get(amount = 2),
            ticks = 200,
            eu = 9600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitCrystalprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 2),
                GregTechItems.CircuitChipRam.get(amount = 24),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitCrystalcomputer.get(amount = 2),
            ticks = 100,
            eu = 9600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitChipSoC4.get(),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.YttriumBariumCuprate.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitCrystalcomputer.get(amount = 2),
            ticks = 50,
            eu = 153600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitChipNeuroCPU.get(),
                GregTechItems.CircuitChipCrystalCPU.get(),
                GregTechItems.CircuitChipNanoCPU.get(),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 8),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 8),
                Materials.YttriumBariumCuprate.item(OrePrefixes.wireFine).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitNeuroprocessor.get(amount = 2),
            ticks = 200,
            eu = 38400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitChipNeuroCPU.get(),
                GregTechItems.CircuitChipCrystalCPU.get(),
                GregTechItems.CircuitChipNanoCPU.get(),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 2),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 2),
                Materials.YttriumBariumCuprate.item(OrePrefixes.wireFine).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitNeuroprocessor.get(amount = 2),
            ticks = 100,
            eu = 38400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitChipNeuroCPU.get(),
                GregTechItems.CircuitChipCrystalSoC2.get(),
                Materials.YttriumBariumCuprate.item(OrePrefixes.wireFine).get(amount = 8),
                Materials.Naquadah.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitNeuroprocessor.get(amount = 3),
            ticks = 50,
            eu = 614400,
            cleanroom = true,
        )

        // --- ZPM
        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitMasterquantumcomputer.get(amount = 2),
                GregTechItems.CircuitPartsInductorSMD.get(amount = 32),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 48),
                GregTechItems.CircuitChipRam.get(amount = 24),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 48),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitQuantummainframe.get(),
            ticks = 1600,
            eu = 7680,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitMasterquantumcomputer.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 12),
                GregTechItems.CircuitChipRam.get(amount = 24),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 48),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitQuantummainframe.get(),
            ticks = 800,
            eu = 7680,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitMasterquantumcomputer.get(amount = 2),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 3),
                GregTechItems.CircuitChipRam.get(amount = 24),
                Materials.AnnealedCopper.item(OrePrefixes.wireGt01).get(amount = 48),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitQuantummainframe.get(),
            ticks = 400,
            eu = 7680,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Trinium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitChipCrystalSoC.get(),
                Materials.Platinum.item(OrePrefixes.wireGt01).get(amount = 32),
                Materials.Europium.item(OrePrefixes.bolt).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitQuantummainframe.get(),
            ticks = 50,
            eu = 2000000,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardMultifiberglassElite.get(),
                GregTechItems.CircuitCrystalcomputer.get(amount = 2),
                GregTechItems.CircuitChipRam.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 32),
                GregTechItems.CircuitChipNAND.get(amount = 64),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 32),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitUltimatecrystalcomputer.get(),
            ticks = 400,
            eu = 9600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardWetwareExtreme.get(),
                GregTechItems.CircuitNeuroprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 12),
                GregTechItems.CircuitChipRam.get(amount = 24),
                Materials.YttriumBariumCuprate.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitWetwarecomputer.get(amount = 2),
            ticks = 300,
            eu = 38400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardWetwareExtreme.get(),
                GregTechItems.CircuitNeuroprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 3),
                GregTechItems.CircuitChipRam.get(amount = 24),
                Materials.YttriumBariumCuprate.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitWetwarecomputer.get(amount = 2),
            ticks = 150,
            eu = 38400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitChipBioCPU.get(),
                GregTechItems.CircuitChipCrystalSoC2.get(),
                GregTechItems.CircuitChipNanoCPU.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 12),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 12),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitBioprocessor.get(amount = 2),
            ticks = 300,
            eu = 153600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitChipBioCPU.get(),
                GregTechItems.CircuitChipCrystalSoC2.get(),
                GregTechItems.CircuitChipNanoCPU.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 3),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 3),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitBioprocessor.get(amount = 2),
            ticks = 150,
            eu = 153600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitChipBioCPU.get(),
                GregTechItems.CircuitChipMCrystalCPU.get(),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.ElectrumFlux.item(OrePrefixes.bolt).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitBioprocessor.get(amount = 3),
            ticks = 150,
            eu = 2457600,
            cleanroom = true,
        )

        // --- UV
        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitUltimatecrystalcomputer.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 16),
                GregTechItems.CircuitChipRam.get(amount = 32),
                Materials.SuperconductorLuV.item(OrePrefixes.wireGt01).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitCrystalmainframe.get(),
            ticks = 800,
            eu = 30720,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Aluminium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitUltimatecrystalcomputer.get(amount = 2),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 32),
                Materials.SuperconductorLuV.item(OrePrefixes.wireGt01).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitCrystalmainframe.get(),
            ticks = 400,
            eu = 30720,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Oriharukon.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitChipCrystalSoC.get(amount = 2),
                Materials.SuperconductorLuV.item(OrePrefixes.wireGt01).get(amount = 8),
                Materials.Americium.item(OrePrefixes.bolt).get(amount = 32),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitCrystalmainframe.get(),
            ticks = 50,
            eu = 8000000,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardWetwareExtreme.get(amount = 2),
                GregTechItems.CircuitWetwarecomputer.get(amount = 2),
                GregTechItems.CircuitPartsDiodeASMD.get(amount = 8),
                GregTechItems.CircuitChipNOR.get(amount = 16),
                GregTechItems.CircuitChipRam.get(amount = 64),
                Materials.YttriumBariumCuprate.item(OrePrefixes.wireFine).get(amount = 24),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitWetwaresupercomputer.get(),
            ticks = 600,
            eu = 38400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardWetwareExtreme.get(amount = 2),
                GregTechItems.CircuitWetwarecomputer.get(amount = 2),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 2),
                GregTechItems.CircuitChipNOR.get(amount = 16),
                GregTechItems.CircuitChipRam.get(amount = 64),
                Materials.YttriumBariumCuprate.item(OrePrefixes.wireFine).get(amount = 24),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitWetwaresupercomputer.get(),
            ticks = 300,
            eu = 38400,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardBioUltra.get(),
                GregTechItems.CircuitBioprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 12),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 16),
                GregTechItems.CircuitChipRam.get(amount = 32),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 24),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitBiowarecomputer.get(amount = 2),
            ticks = 400,
            eu = 153600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardBioUltra.get(),
                GregTechItems.CircuitBioprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorXSMD.get(amount = 3),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 32),
                Materials.NiobiumTitanium.item(OrePrefixes.wireFine).get(amount = 24),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitBiowarecomputer.get(amount = 2),
            ticks = 200,
            eu = 153600,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.NaquaBoardFull.get(),
                GregTechItems.CircuitChipMCrystalCPU.get(),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 16),
                GregTechItems.CircuitPartsDiodeXSMD.get(amount = 16),
                Materials.Naquadah.item(OrePrefixes.wireFine).get(amount = 24),
                Materials.CinobiteA243.item(OrePrefixes.bolt).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitNaquaprocessor.get(amount = 2),
            ticks = 400,
            eu = 614400,
            cleanroom = true,
        )

        // --- UHV
        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                Materials.Adamantium.item(OrePrefixes.frameGt).get(amount = 2),
                GregTechItems.CircuitChipMCrystalCPU.get(amount = 2),
                Materials.SuperconductorZPM.item(OrePrefixes.wireGt01).get(amount = 16),
                Materials.Neutronium.item(OrePrefixes.bolt).get(amount = 64),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(288L),
            output = GregTechItems.CircuitWetwaremainframe.get(),
            ticks = 50,
            eu = 32000000,
            cleanroom = true,
        )

        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitChipBarnardaCPU.get(),
                GregTechItems.CircuitChipSoC5.get(),
                GregTechItems.CircuitChipNanoCPU.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 8),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 8),
                Materials.BlackPlutonium.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitXenoprocessor.get(amount = 2),
            ticks = 400,
            eu = 8000000,
            cleanroom = true,
        )

        // --- UEV
        MachineRecipes.spaceCircuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitChipSGCPU.get(),
                GregTechItems.CircuitPartsSGController.get(),
                GregTechItems.CircuitChipSoC6.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorXSMD.get(amount = 16),
                GregTechItems.CircuitPartsTransistorXSMD.get(amount = 16),
                Materials.DraconiumAwakened.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitCosmicprocessor.get(amount = 2),
            ticks = 600,
            eu = 30000000,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(amount = 2),
                GregTechItems.CircuitChipNAND.get(amount = 32),
                GregTechItems.CircuitChipRam.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.Plastic.item(OrePrefixes.plate).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.ToolDataStick.get(),
            ticks = 400,
            eu = 90,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitNanoprocessor.get(amount = 2),
                GregTechItems.CircuitChipRam.get(amount = 4),
                GregTechItems.CircuitChipNOR.get(amount = 32),
                GregTechItems.CircuitChipNAND.get(amount = 64),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 32),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.ToolDataOrb.get(),
            ticks = 400,
            eu = 1200,
            cleanroom = true,
        )
    }
}
