package com.impactrecipes.recipes;

import com.impact.common.item.Core_Items;
import com.impact.common.item.Core_Items2;
import cpw.mods.fml.common.Loader;
import gregtech.api.GregTech_API;
import gregtech.api.enums.*;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

public class Forestry implements Runnable {

    final Core_Items CoreItems = Core_Items.getInstance();
    final Core_Items2 CoreItems2 = Core_Items2.getInstance();

    @Override
    public void run() {
        assembler();
        ciruit();
    }

    private void assembler() {
        if (Loader.isModLoaded("Natura")) {
            GT_Values.RA.addAssemblerRecipe(
                    new ItemStack[]{GT_ModHandler.getModItem("Natura", "Natura.fence", 1L),
                            ItemList.Plank_Oak.get(1L)}, Materials.Redstone.getMolten(72L),
                    CoreItems2.getRecipe(53, 1), 100, 30, false);
        }

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("Forestry", "fences", 1L),
                        ItemList.Plank_Oak.get(1L)}, Materials.Redstone.getMolten(72L),
                CoreItems2.getRecipe(53, 1), 100, 30, false);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("Forestry", "fencesFireproof", 1L),
                        ItemList.Plank_Oak.get(1L)}, Materials.Redstone.getMolten(72L),
                CoreItems2.getRecipe(53, 1), 100, 30, false);

    }

    private void ciruit() {
        for (Materials tMat : Materials.values()) {
            if (tMat.mStandardMoltenFluid != null && tMat.contains(SubTag.SOLDERING_MATERIAL) &&
                    !(GregTech_API.mUseOnlyGoodSolderingMaterials && !tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD))) {
                int tMultiplier = tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD) ? 1 : tMat.contains(SubTag.SOLDERING_MATERIAL_BAD) ? 4 : 2;

                //ALL Circuits
                //Forestry Chipsets
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Primitive, 2),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Tin, 2),
                                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Tin, 4),
                                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Tin, 1),
                                GT_Utility.getIntegratedCircuit(1)}, tMat.getMolten(1152L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("Forestry", "chipsets", 1L, 0), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 2),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Bronze, 2),
                                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Bronze, 4),
                                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Bronze, 1),
                                GT_Utility.getIntegratedCircuit(1)}, tMat.getMolten(1152L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("Forestry", "chipsets", 1L, 1), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L),
                                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 2),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Steel, 2),
                                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Steel, 4),
                                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Steel, 1),
                                GT_Utility.getIntegratedCircuit(1)}, tMat.getMolten(1152L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("Forestry", "chipsets", 1L, 2), 200, 30);
                GT_Values.RA.addCircuitAssemblerRecipe(
                        new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L),
                                ItemList.Circuit_Integrated_Good.get(2L),
                                GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Electrum, 2),
                                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Electrum, 4),
                                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 1),
                                GT_Utility.getIntegratedCircuit(1)}, tMat.getMolten(1152L * tMultiplier / 2L),
                        GT_ModHandler.getModItem("Forestry", "chipsets", 1L, 3), 200, 30);


            }
        }
    }
}
