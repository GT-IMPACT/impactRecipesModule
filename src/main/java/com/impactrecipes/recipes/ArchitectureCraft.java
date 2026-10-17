package com.impactrecipes.recipes;

import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.impactrecipes.util.CraftingRecipes;
import com.impactrecipes.util.ModItems;
import com.impactrecipes.util.RecipeItems;

public class ArchitectureCraft implements Runnable {

    private static final ModItems items = new ModItems("ArchitectureCraft");

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    @Override
    public void run() {
        removeArchitectureCraft();
        hand();
    }

    private void removeArchitectureCraft() {
        CraftingRecipes.removeCraftingRecipesByOutput(items.item("sawbench"), true,
                false, true);
        CraftingRecipes.removeCraftingRecipesByOutput(items.item("sawblade"), true,
                false, true);
        CraftingRecipes.removeCraftingRecipesByOutput(items.item("largePulley"), true,
                false, true);
        CraftingRecipes.removeCraftingRecipesByOutput(items.item("hammer"), true, false,
                true);
        CraftingRecipes.removeCraftingRecipesByOutput(items.item("chisel"), true, false,
                true);
    }

    private void hand() {
        // --- Architecs Saw Bench
        CraftingRecipes.shapedWithFlags(items.item("sawbench"), tBitMask, new Object[]{"SPS", "BAB", "sLh", 'S', OrePrefixes.screw.get(Materials.Steel), 'P', RecipeItems.item("minecraft", "heavy_weighted_pressure_plate"), 'B', new ItemStack(Blocks.fence), 'A', items.item("sawblade"), 'L', items.item("largePulley")});
        // --- Large Pulley
        CraftingRecipes.shapedWithFlags(items.item("largePulley"), tBitMask, new Object[]{"SdS", "GWG", "ShS", 'S', OrePrefixes.screw.get(Materials.Steel), 'G', OrePrefixes.gearGtSmall.get(Materials.Iron), 'W', OrePrefixes.gearGt.get(Materials.Wood)});
        // --- Architecs Hammer
        CraftingRecipes.shapedWithFlags(items.item("hammer"), tBitMask, new Object[]{"PPI", "fSI", " Sh", 'S', OrePrefixes.stick.get(Materials.Wood), 'P', OrePrefixes.plate.get(Materials.Steel), 'I', OrePrefixes.ingot.get(Materials.Iron)});
        // --- Architecs Chisel
        CraftingRecipes.shapedWithFlags(items.item("chisel"), tBitMask, new Object[]{"hIP", "SKI", "WSd", 'S', OrePrefixes.screw.get(Materials.Iron), 'P', OrePrefixes.plate.get(Materials.Steel), 'I', OrePrefixes.plate.get(Materials.Iron), 'K', OrePrefixes.stick.get(Materials.Iron), 'W', OrePrefixes.stick.get(Materials.Wood)});
        // --- Circular Saw
        CraftingRecipes.shapelessWithFlags(items.item("sawblade"), tBitMask, new Object[]{OrePrefixes.toolHeadBuzzSaw.get(Materials.Iron)});

    }
}
