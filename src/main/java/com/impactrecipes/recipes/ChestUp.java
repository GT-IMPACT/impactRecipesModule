package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

public class ChestUp implements Runnable {

    @Override
    public void run() {
        assembler();
    }

    private void assembler() {
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.WroughtIron, 8),
                        GT_ModHandler.getModItem("minecraft", "chest", 1L),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 0), 80, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 0),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 1), 90, 16);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Aluminium, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 1),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2), 100, 64);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HSLA, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 3), 110, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Titanium, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 3),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 4), 120, 1024);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TungstenSteel, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 4),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 5), 130, 4096);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Chrome, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 5),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 6), 140, 16384);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iridium, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 6),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 7), 150, 65536);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 7),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 8), 160, 262144);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 8),
                        GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 8),
                        GT_Utility.getIntegratedCircuit(10)}, null,
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 9), 170, 1048576);

    }
}
