package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class GregTechConventionalCircuitRecipes {

    internal fun register() {
        // --- GT Circuits
        // --- ULV
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitChipSimpleSoC.get(),
                Materials.RedAlloy.item(OrePrefixes.bolt).get(),
                Materials.Copper.item(OrePrefixes.wireFine).get(),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = ImpactItems.NANDArray.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitChipSimpleSoC.get(),
                Materials.RedAlloy.item(OrePrefixes.bolt).get(),
                Materials.AnnealedCopper.item(OrePrefixes.wireFine).get(),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = ImpactItems.NANDArray.get(),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipSimpleSoC.get(amount = 2),
                Materials.RedstoneAlloy.item(OrePrefixes.bolt).get(),
                Materials.Gold.item(OrePrefixes.wireFine).get(),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = ImpactItems.NANDArray.get(amount = 2),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitChipSimpleSoC.get(amount = 4),
                Materials.EnergeticAlloy.item(OrePrefixes.bolt).get(),
                Materials.Platinum.item(OrePrefixes.wireFine).get(),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = ImpactItems.NANDArray.get(amount = 4),
            ticks = 500,
            eu = 250,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitChipSimpleSoC.get(amount = 8),
                Materials.VibrantAlloy.item(OrePrefixes.bolt).get(),
                Materials.Osmium.item(OrePrefixes.wireFine).get(),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = ImpactItems.NANDArray.get(amount = 8),
            ticks = 600,
            eu = 480,
        )

        // --- LV
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 2),
                Materials.RedAlloy.item(OrePrefixes.wireGt01).get(amount = 2),
                GregTechItems.CircuitPartsVacuumTube.get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = IC2Items.ElectronicCircuit.get(amount = 2),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                Materials.RedAlloy.item(OrePrefixes.wireGt01).get(amount = 2),
                GregTechItems.CircuitPartsVacuumTube.get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = IC2Items.ElectronicCircuit.get(amount = 2),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 2),
                Materials.RedAlloy.item(OrePrefixes.wireGt01).get(amount = 2),
                GregTechItems.NandChip.get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = IC2Items.ElectronicCircuit.get(amount = 2),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                Materials.RedAlloy.item(OrePrefixes.wireGt01).get(amount = 2),
                GregTechItems.NandChip.get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = IC2Items.ElectronicCircuit.get(amount = 2),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                GregTechItems.CircuitChipILC.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 2),
                GregTechItems.CircuitPartsDiode.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
                Materials.Tin.item(OrePrefixes.bolt).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitBasic.get(amount = 3),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                GregTechItems.CircuitChipILC.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                GregTechItems.CircuitPartsDiode.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
                Materials.Tin.item(OrePrefixes.bolt).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitBasic.get(amount = 3),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                GregTechItems.CircuitChipILC.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                GregTechItems.CircuitPartsDiodeSMD.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
                Materials.Tin.item(OrePrefixes.bolt).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitBasic.get(amount = 3),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardCoatedBasic.get(),
                GregTechItems.CircuitChipILC.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 2),
                GregTechItems.CircuitPartsDiodeSMD.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
                Materials.Tin.item(OrePrefixes.bolt).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitBasic.get(amount = 3),
            ticks = 200,
            eu = 12,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 2),
                GregTechItems.CircuitPartsCapacitor.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitor.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 2),
                GregTechItems.CircuitPartsCapacitor.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitor.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipSoC.get(),
                Materials.Copper.item(OrePrefixes.wireFine).get(amount = 2),
                Materials.Tin.item(OrePrefixes.bolt).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitMicroprocessor.get(amount = 6),
            ticks = 50,
            eu = 600,
            cleanroom = true,
        )

        // --- MV
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                IC2Items.ElectronicCircuit.get(amount = 2),
                GregTechItems.CircuitPartsDiode.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireGt01).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitGood.get(amount = 2),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                IC2Items.ElectronicCircuit.get(amount = 2),
                GregTechItems.CircuitPartsDiodeSMD.get(amount = 2),
                Materials.Copper.item(OrePrefixes.wireGt01).get(amount = 2),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitGood.get(amount = 2),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitBasic.get(amount = 3),
                GregTechItems.CircuitPartsResistor.get(amount = 4),
                GregTechItems.CircuitPartsDiode.get(amount = 4),
                Materials.Gold.item(OrePrefixes.wireFine).get(amount = 4),
                Materials.Silver.item(OrePrefixes.bolt).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitIntegratedGood.get(amount = 3),
            ticks = 400,
            eu = 24,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitBasic.get(amount = 3),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 4),
                GregTechItems.CircuitPartsDiode.get(amount = 4),
                Materials.Gold.item(OrePrefixes.wireFine).get(amount = 4),
                Materials.Silver.item(OrePrefixes.bolt).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitIntegratedGood.get(amount = 3),
            ticks = 400,
            eu = 24,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitBasic.get(amount = 3),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 4),
                GregTechItems.CircuitPartsDiodeSMD.get(amount = 4),
                Materials.Gold.item(OrePrefixes.wireFine).get(amount = 4),
                Materials.Silver.item(OrePrefixes.bolt).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitIntegratedGood.get(amount = 3),
            ticks = 400,
            eu = 24,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPhenolicGood.get(),
                GregTechItems.CircuitBasic.get(amount = 3),
                GregTechItems.CircuitPartsResistor.get(amount = 4),
                GregTechItems.CircuitPartsDiodeSMD.get(amount = 4),
                Materials.Gold.item(OrePrefixes.wireFine).get(amount = 4),
                Materials.Silver.item(OrePrefixes.bolt).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitIntegratedGood.get(amount = 3),
            ticks = 400,
            eu = 24,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 4),
                GregTechItems.CircuitPartsCapacitor.get(amount = 4),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 4),
                GregTechItems.CircuitPartsCapacitor.get(amount = 4),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 4),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 4),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 4),
                GregTechItems.CircuitPartsCapacitor.get(amount = 4),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 4),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 4),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 4),
                GregTechItems.CircuitPartsCapacitor.get(amount = 4),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistor.get(amount = 4),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 4),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 4),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 4),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 200,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipCPU.get(),
                GregTechItems.CircuitPartsResistorASMD.get(),
                GregTechItems.CircuitPartsCapacitorASMD.get(),
                GregTechItems.CircuitPartsTransistorASMD.get(),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 4),
            ticks = 100,
            eu = 60,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitChipSoC.get(),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 4),
                Materials.AnnealedCopper.item(OrePrefixes.bolt).get(amount = 4),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitProcessor.get(amount = 6),
            ticks = 50,
            eu = 2400,
            cleanroom = true,
        )

        // --- HV
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitIntegratedGood.get(),
                GregTechItems.CircuitChipILC.get(amount = 2),
                GregTechItems.CircuitChipRam.get(amount = 2),
                GregTechItems.CircuitPartsTransistor.get(amount = 4),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 8),
                Materials.AnnealedCopper.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = IC2Items.AdvancedCircuit.get(),
            ticks = 800,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitIntegratedGood.get(),
                GregTechItems.CircuitChipILC.get(amount = 2),
                GregTechItems.CircuitChipRam.get(amount = 2),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 4),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 8),
                Materials.AnnealedCopper.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = IC2Items.AdvancedCircuit.get(),
            ticks = 800,
            eu = 30,
            cleanroom = false,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitProcessor.get(amount = 2),
                GregTechItems.CircuitPartsCoil.get(amount = 4),
                GregTechItems.CircuitPartsCapacitor.get(amount = 8),
                GregTechItems.CircuitChipRam.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitComputer.get(amount = 2),
            ticks = 400,
            eu = 120,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitProcessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorSMD.get(amount = 4),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 8),
                GregTechItems.CircuitChipRam.get(amount = 4),
                Materials.RedAlloy.item(OrePrefixes.wireFine).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitComputer.get(amount = 2),
            ticks = 400,
            eu = 96,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitChipNanoCPU.get(),
                GregTechItems.CircuitPartsResistorSMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 8),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 8),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitNanoprocessor.get(amount = 3),
            ticks = 200,
            eu = 600,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitChipNanoCPU.get(),
                GregTechItems.CircuitPartsResistorASMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 2),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 2),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitNanoprocessor.get(amount = 3),
            ticks = 100,
            eu = 600,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitChipSoC2.get(),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 8),
                Materials.Platinum.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitNanoprocessor.get(amount = 4),
            ticks = 50,
            eu = 9600,
            cleanroom = true,
        )

        // --- EV
        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitAdvanced.get(amount = 2),
                GregTechItems.CircuitPartsDiode.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 8),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.Platinum.item(OrePrefixes.bolt).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitData.get(),
            ticks = 400,
            eu = 120,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardPlasticAdvanced.get(),
                GregTechItems.CircuitAdvanced.get(amount = 2),
                GregTechItems.CircuitPartsDiodeSMD.get(amount = 4),
                GregTechItems.CircuitChipRam.get(amount = 8),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.Platinum.item(OrePrefixes.bolt).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitData.get(),
            ticks = 400,
            eu = 120,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitNanoprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorSMD.get(amount = 8),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 8),
                GregTechItems.CircuitChipRam.get(amount = 8),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitNanocomputer.get(),
            ticks = 400,
            eu = 600,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardEpoxyAdvanced.get(),
                GregTechItems.CircuitNanoprocessor.get(amount = 2),
                GregTechItems.CircuitPartsInductorASMD.get(amount = 2),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 2),
                GregTechItems.CircuitChipRam.get(amount = 8),
                Materials.Electrum.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(144L),
            output = GregTechItems.CircuitNanocomputer.get(),
            ticks = 200,
            eu = 600,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitChipQuantumCPU.get(),
                GregTechItems.CircuitChipNanoCPU.get(),
                GregTechItems.CircuitPartsCapacitorSMD.get(amount = 12),
                GregTechItems.CircuitPartsTransistorSMD.get(amount = 12),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 12),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitQuantumprocessor.get(amount = 2),
            ticks = 200,
            eu = 2400,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitChipQuantumCPU.get(),
                GregTechItems.CircuitChipNanoCPU.get(),
                GregTechItems.CircuitPartsCapacitorASMD.get(amount = 3),
                GregTechItems.CircuitPartsTransistorASMD.get(amount = 3),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 16),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitQuantumprocessor.get(amount = 2),
            ticks = 100,
            eu = 2400,
            cleanroom = true,
        )

        MachineRecipes.circuitAssembler(
            inputs = arrayOf<ItemStack?>(
                GregTechItems.CircuitBoardFiberglassAdvanced.get(),
                GregTechItems.CircuitChipSoC3.get(),
                Materials.Platinum.item(OrePrefixes.wireFine).get(amount = 16),
                Materials.NiobiumTitanium.item(OrePrefixes.bolt).get(amount = 8),
            ),
            fluidInput = Materials.SolderingAlloy.getMolten(72L),
            output = GregTechItems.CircuitQuantumprocessor.get(amount = 3),
            ticks = 50,
            eu = 38400,
            cleanroom = true,
        )
    }
}
