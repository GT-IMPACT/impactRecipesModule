package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import static gregtech.api.util.GT_ModHandler.removeRecipeByOutput;

public class ChiselRecipes implements Runnable {

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED
            | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    @Override
    public void run() {
        remove();
        handRecipe();
        cutting();
    }

    private void remove() {
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "chisel", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "diamondChisel", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "obsidianChisel", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "valentines", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "cloudinabottle", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "smashingrock", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "autoChisel", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "upgrade", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "upgrade", 1L, 1));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "upgrade", 1L, 2));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "factoryblock", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "fantasyblock", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "tyrian", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "road_line", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "technical", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "hexPlating", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "holystone", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "laboratoryblock", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "rebel", 1L));
        removeRecipeByOutput(GT_ModHandler.getModItem("chisel", "voidstone", 1L));
    }

    private void handRecipe() {
        // --- Iron Chisel
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "chisel", 1L), tBitMask, new Object[]{"fI ", "SOI", 'S', "stickWood", 'O', "ingotIron", 'I', "stickLongIron"});
        // --- Diamond Chisel
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "diamondChisel", 1L), tBitMask, new Object[]{"fI ", "SOI", 'S', "stickWood", 'O', "gemDiamond", 'I', "stickLongSteel"});
        // --- Obsidian Chisel
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "obsidianChisel", 1L), tBitMask, new Object[]{"fI ", "SOI", 'S', "stickWood", 'O', "ingotObsidian", 'I', "stickLongBlackSteel"});
        // --- Auto Chisel
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "autoChisel", 1L), tBitMask, new Object[]{"SOS", "CUR", "dYh", 'S', "screwSteel", 'O', "ringWoodSealed", 'C', ItemList.Conveyor_Module_LV, 'U', ItemList.Cover_Crafting, 'R', ItemList.Robot_Arm_LV, 'Y', GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 1)});
        // --- Speed Upgrade
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "upgrade", 1L), tBitMask, new Object[]{"SPS", "PCP", "WOW", 'S', "screwSteel", 'P', "plateEmerald", 'C', "circuitAdvanced", 'W', "wireGt01RedAlloy", 'O', ItemList.Conveyor_Module_LV});
        // --- Automation Upgrade
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "upgrade", 1L, 1), tBitMask, new Object[]{"SPS", "PCP", "WOW", 'S', "screwSteel", 'P', "plateEmerald", 'C', "circuitAdvanced", 'W', "wireGt01RedAlloy", 'O', ItemList.Robot_Arm_LV});
        // --- Stack Upgrade
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "upgrade", 1L, 2), tBitMask, new Object[]{"SPS", "PCP", "WOW", 'S', "screwSteel", 'P', "plateEmerald", 'C', "circuitAdvanced", 'W', "wireGt01RedAlloy", 'O', ItemList.Cover_Crafting});
        // --- Factory Block
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "factoryblock", 32L), tBitMask, new Object[]{"SFS", "F F", "SFS", 'S', "stone", 'F', "frameGtIron"});
        // --- Fantasy Block
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "fantasyblock", 8L), tBitMask, new Object[]{"SSS", "SFS", "SSS", 'S', "stone", 'F', "frameGtGold"});
        // --- Tyrian Block
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "tyrian", 8L), tBitMask, new Object[]{"SSS", "SFS", "SSS", 'S', "stone", 'F', "frameGtIron"});
        // --- Road Line
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "road_line", 2L), tBitMask, new Object[]{"Cs", 'C', GT_ModHandler.getModItem("minecraft", "carpet", 1L)});
        // --- Technical Block
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "technical", 32L), tBitMask, new Object[]{"SFS", "FSF", "SFS", 'S', "stone", 'F', "frameGtIron"});
        // --- Hex Plating Block
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "hexPlating", 8L), tBitMask, new Object[]{"SSS", "SFS", "SSS", 'S', "stone", 'F', "frameGtCarbon"});
        // --- Holystone Block
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "holystone", 8L), tBitMask, new Object[]{"SSS", "SDS", "SSS", 'S', "stone", 'D', "dustGlass"});
        // --- Laboratory Block
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "laboratoryblock", 8L), tBitMask, new Object[]{"SSS", "SGS", "SSS", 'S', "stone", 'G', "craftingQuartz"});
        // --- Rebellious Block
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "rebel", 8L), tBitMask, new Object[]{"SSS", "SFS", "SSS", 'S', "stone", 'F', "frameGtWroughtIron"});
        // --- Voidstone
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("chisel", "voidstone", 8L), tBitMask, new Object[]{"SSS", "SDS", "SSS", 'S', "stone", 'D', "dustObsidian"});

    }

    private void cutting() {
        GT_Values.RA.addCutterRecipe(new ItemStack(Blocks.carpet, 1), GT_ModHandler.getModItem("chisel", "road_line", 4L), GT_Values.NI, 50, 8);
    }
}
