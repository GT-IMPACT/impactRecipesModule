package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.RA;
import com.impactrecipes.util.CraftingRecipes;
import com.impactrecipes.util.ModItems;
import com.impactrecipes.util.MachineRecipes;
import com.impactrecipes.util.RecipeItems;

public class ChickenChunks implements Runnable {

    private static final ModItems items = new ModItems("ChickenChunks");

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    @Override
    public void run() {
        removeChickens();
        CraftingRecipes.shapedWithFlags(items.item("chickenChunkLoader"), tBitMask, new Object[]{" h ", "BPB", "PFP", 'B', OrePrefixes.bolt.get(Materials.Iron), 'P', OrePrefixes.plate.get(Materials.Gold), 'F', OrePrefixes.frameGt.get(Materials.Iron)});
        CraftingRecipes.shapedWithFlags(items.item("chickenChunkLoader", 1, 9), tBitMask, new Object[]{"sC", 'C', items.item("chickenChunkLoader")});

        RA.addCutterRecipe(items.item("chickenChunkLoader"),
                items.item("chickenChunkLoader", 1, 9), GT_Values.NI, 50, 8);

        MachineRecipes.assembler(new ItemStack[]{
                        RecipeItems.ore(OrePrefixes.frameGt, Materials.Iron, 1),
                        RecipeItems.ore(OrePrefixes.plate, Materials.Gold, 3),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                items.item("chickenChunkLoader"), 50, 12);
    }

    private void removeChickens() {
        CraftingRecipes.removeCraftingRecipesByOutput(items.item("chickenChunkLoader"),
                true, false, false);
        CraftingRecipes.removeCraftingRecipesByOutput(items.item("chickenChunkLoader", 1),
                true, false, false);
    }
}
