package com.impactrecipes.recipes;

import com.impact.mods.gregtech.GT_ItemList;
import gregtech.api.GregTech_API;
import gregtech.api.enums.*;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

public class LogisticPipes implements Runnable {

    @Override
    public void run() {
       assembler();
       ciruit();
    }

    private void assembler() {
// --- Unrouted Transport Pipe
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "glass_pane", 1L),
                GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Birmabright, 6L), null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsBasicTransport", 8L, 0), 100, 30);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Birmabright, 6L), null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsBasicTransport", 8L, 0), 100, 30);
        // --- Basic Logistics Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsBasicTransport", 1L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.pipeMedium, Materials.Aluminium, 1L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsBasicLogistics", 1L, 0), 100,
                120);
        // --- Logistics Chassis Mk1
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsBasicLogistics", 1L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 1L),
                        GT_Utility.getIntegratedCircuit(1)}, Materials.Redstone.getMolten(288),
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk1", 1L, 0), 100, 120);
        // --- Logistics Chassis Mk2
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk1", 1L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 2L),
                        GT_Utility.getIntegratedCircuit(1)}, Materials.RedAlloy.getMolten(288),
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk2", 1L, 0), 120, 120);
        // --- Logistics Chassis Mk3
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk2", 1L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                        GT_Utility.getIntegratedCircuit(1)}, Materials.Electrum.getMolten(288),
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk3", 1L, 0), 140, 120);
        // --- Logistics Chassis Mk4
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk3", 1L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 2L),
                        GT_Utility.getIntegratedCircuit(1)}, Materials.Electrum.getMolten(576),
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk4", 1L, 0), 160, 120);
        // --- Logistics Chassis Mk5
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk4", 1L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 1L),
                        GT_Utility.getIntegratedCircuit(1)}, Materials.EnergeticAlloy.getMolten(576),
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk5", 1L, 0), 180, 120);
        // --- Crafting Logistics Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk1", 1L, 0),
                        ItemList.Cover_Crafting.get(1), GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsCraftingLogistics", 1L, 0), 100,
                120);
        // --- Crafting Logistics Pipe Mk2
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk2", 1L, 0),
                        ItemList.Cover_Crafting.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 1L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsCraftingLogisticsMk2", 1L, 0),
                120, 120);
        // --- Crafting Logistics Pipe Mk3
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk3", 1L, 0),
                        ItemList.Cover_Crafting.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsCraftingLogisticsMk3", 1L, 0),
                140, 120);
        // --- Provider Logistics Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk1", 1L, 0),
                        ItemList.Conveyor_Module_LV.get(1), GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsProviderLogistics", 1L, 0), 100,
                120);
        // --- Provider Logistics Pipe Mk2
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk2", 1L, 0),
                        ItemList.Conveyor_Module_MV.get(1), GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsProviderLogisticsMk2", 1L, 0),
                120, 120);
        // --- Supplier Logistics Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk1", 1L, 0),
                        ItemList.Conveyor_Module_MV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Aluminium, 2L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsSupplierLogistics", 1L, 0), 100,
                120);
        // --- Request Logistics Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk1", 1L, 0),
                        ItemList.Robot_Arm_LV.get(1), GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsRequestLogistics", 1L, 0), 100,
                120);
        // --- Request Logistics Pipe Mk2
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk2", 1L, 0),
                        ItemList.Robot_Arm_MV.get(1), ItemList.Cover_Screen.get(1),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsRequestLogisticsMk2", 1L, 0), 100,
                120);
        // --- Logistics Inventory System Connector
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk1", 1L, 0),
                        ItemList.Electric_Motor_LV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Steel, 2L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsInvSysConnector", 1L, 0), 100,
                120);
        // --- Logistics Firewall Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk1", 1L, 0),
                        ItemList.Electric_Motor_MV.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Aluminium, 2L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsFirewall", 1L, 0), 120, 120);
        // --- Logistics System Entrance Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk2", 1L, 0),
                        ItemList.Electric_Piston_MV.get(1), GT_Utility.getIntegratedCircuit(1)},
                Materials.Electrum.getMolten(288),
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsSystemEntranceLogistics", 1L, 0),
                120, 120);
        // --- Logistics System Destination Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeLogisticsChassiMk2", 1L, 0),
                        ItemList.Electric_Piston_MV.get(1), GT_Utility.getIntegratedCircuit(1)},
                Materials.RedAlloy.getMolten(288), GT_ModHandler
                        .getModItem("LogisticsPipes", "item.PipeItemsSystemDestinationLogistics", 1L, 0), 120,
                120);
        // --- Satellite Logistics Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsCraftingLogistics", 1L, 0),
                        ItemList.Electric_Piston_MV.get(1), GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsSatelliteLogistics", 1L, 0), 100,
                120);
        // --- Remote Ordered Logistics Pipe
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsSystemEntranceLogistics", 1L, 0),
                        ItemList.Conveyor_Module_MV.get(1), GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.PipeItemsRemoteOrdererLogistics", 1L, 0),
                120, 120);
        // --- Blank Module
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Paper, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Gold, 2L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("LogisticsPipes", "item.itemModule", 1L, 0), 80, 30);
        // --- Advanced Extractor Module
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("LogisticsPipes", "item.itemModule", 1L, 3),
                        GT_ItemList.RedstoneGoldChipset.get(1),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemModule", 1L, 7), 140, 120);
        // --- Advanced Extractor Module MK2
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("LogisticsPipes", "item.itemModule", 1L, 103),
                        GT_ItemList.RedstoneGoldChipset.get(1),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemModule", 1L, 107), 160, 120);
        // --- Advanced Extractor Module MK3
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("LogisticsPipes", "item.itemModule", 1L, 203),
                        GT_ItemList.RedstoneDiamondChipset.get(1),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemModule", 1L, 207), 180, 256);
        // --- IC2 LV Power Supplier Upgrade
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 30),
                        GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.Tin, 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 33), 100, 120);
        // --- IC2 MV Power Supplier Upgrade
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 30),
                        GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.Copper, 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 34), 120, 120);
        // --- IC2 HV Power Supplier Upgrade
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 30),
                        GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Electrum, 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 35), 140, 120);
        // --- IC2 EV Power Supplier Upgrade
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 30),
                        GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Aluminium, 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 36), 160, 120);

    }

    private void ciruit() {
        for (Materials tMat : Materials.values()) {
            if (tMat.mStandardMoltenFluid != null && tMat.contains(SubTag.SOLDERING_MATERIAL) &&
                    !(GregTech_API.mUseOnlyGoodSolderingMaterials && !tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD))) {
                int tMultiplier = tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD) ? 1 : tMat.contains(SubTag.SOLDERING_MATERIAL_BAD) ? 4 : 2;
                //LP Upgrades
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Tin, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedAlloy, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 6), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Iron, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedAlloy, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 7), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Electrum, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedAlloy, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 20), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Steel, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedAlloy, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 16), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Gold, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedAlloy, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 21), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.RedAlloy, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Electrum, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 23), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Gold, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Electrum, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 24), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Steel, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Lapis, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 25), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Steel, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.AnnealedCopper, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 30), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Bronze, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedAlloy, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 41), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Silver, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedAlloy, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 42), 120, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                ItemList.Circuit_Chip_Simple_SoC.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.RedAlloy, 1),
                                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Silver, 2)},
                        tMat.getMolten(144L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("LogisticsPipes", "item.itemUpgrade", 1L, 26), 120, 30);

            }
        }
    }
}
