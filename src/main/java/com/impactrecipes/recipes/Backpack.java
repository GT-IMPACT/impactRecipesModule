package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Backpack implements Runnable {

    @Override
    public void run() {
        assembler();
        bath();
    }

    private void assembler() {
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{new ItemStack(Items.leather, 2), new ItemStack(Items.string, 3),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("Backpack", "boundLeather", 1L), 100, 16);
    }

    private void bath() {
        // --- Tanned Leather
        GT_Values.RA.addChemicalBathRecipe(new ItemStack(Items.leather, 2, 0),
                Materials.PhosphoricAcid.getFluid(100),
                GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L, 0), GT_Values.NI, GT_Values.NI,
                new int[]{10000}, 300, 30);

    }
}
