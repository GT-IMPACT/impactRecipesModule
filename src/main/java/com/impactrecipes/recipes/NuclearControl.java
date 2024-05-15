package com.impactrecipes.recipes;

import com.impactrecipes.util.RecipeUtils;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

import static com.impactrecipes.util.RecipeUtils.getItemStack;
import static gregtech.api.enums.GT_Values.RA;

public class NuclearControl implements Runnable {

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    @Override
    public void run() {
        crafting();
        assembler();
    }
    private void crafting() {
        RecipeUtils.removeRecipeByOutput(getItemStack("minecraft", "stone_button"));
        // --- Remote Sensor Kit
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("IC2NuclearControl", "ItemRemoteSensorKit", 1L, 0), tBitMask, new Object[]{GT_ModHandler.getModItem("IC2NuclearControl", "ItemSensorLocationCard", 1L, 0)});
        // --- Energy Sensor Kit
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("IC2NuclearControl", "ItemEnergySensorKit", 1L, 0), tBitMask, new Object[]{GT_ModHandler.getModItem("IC2NuclearControl", "ItemEnergySensorLocationCard", 1L, 0)});
        // --- Counter Sensor Kit
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("IC2NuclearControl", "ItemMultipleSensorKit", 1L, 0), tBitMask, new Object[]{GT_ModHandler.getModItem("IC2NuclearControl", "ItemMultipleSensorLocationCard", 1L, 0)});
        // --- Liquid Sensor Kit
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("IC2NuclearControl", "ItemMultipleSensorKit", 1L, 1), tBitMask, new Object[]{GT_ModHandler.getModItem("IC2NuclearControl", "ItemMultipleSensorLocationCard", 1L, 1)});
        // --- Generator Sensor Kit
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("IC2NuclearControl", "ItemMultipleSensorKit", 1L, 2), tBitMask, new Object[]{GT_ModHandler.getModItem("IC2NuclearControl", "ItemMultipleSensorLocationCard", 1L, 2)});
        // --- GregTech Sensor Kit
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.NC_SensorKit.get(1), tBitMask, new Object[]{ItemList.NC_SensorCard});
        // --- AE Sensor Kit
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("IC2NuclearControl", "KitAppeng", 1L, 0), tBitMask, new Object[]{GT_ModHandler.getModItem("IC2NuclearControl", "CardAppeng", 1L, 0)});
    }
    private void assembler() {
        // --- Industrial Informational Panel
        RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("IC2", "blockMachine", 1L, 0),
                        GT_ModHandler.getModItem("minecraft", "stained_glass_pane", 1L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.RedAlloy, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 2),
                        ItemList.Cover_Screen.get(2)}, null,
                GT_ModHandler.getModItem("IC2NuclearControl", "blockNuclearControlMain", 1L, 4), 50, 12);
        // --- Informational Panel Extender
        RA.addAssemblerRecipe(new ItemStack[]{
                        ItemList.Cover_Screen.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.RedAlloy, 1),
                        GT_ModHandler.getModItem("minecraft", "stained_glass_pane", 2L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Wood, 5)}, null,
                GT_ModHandler.getModItem("IC2NuclearControl", "blockNuclearControlMain", 1L, 5), 50, 12);

        // --- Advanced Informational Panel
        RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("IC2NuclearControl", "blockNuclearControlMain", 1L, 4),
                        GT_ModHandler.getModItem("IC2NuclearControl", "ItemUpgrade", 1L, 0),
                        GT_ModHandler.getModItem("IC2NuclearControl", "ItemUpgrade", 1L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1),
                        GT_ModHandler.getModItem("IC2", "itemPartCarbonPlate", 2L, 0),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("IC2NuclearControl", "blockNuclearControlMain", 1L, 9), 50, 12);
        // --- Advanced Panel Extender
        RA.addAssemblerRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("IC2NuclearControl", "blockNuclearControlMain", 1L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 1),
                        GT_ModHandler.getModItem("IC2NuclearControl", "ItemUpgrade", 1L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 1),
                        GT_ModHandler.getModItem("IC2", "itemPartCarbonPlate", 2L, 0),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("IC2NuclearControl", "blockNuclearControlMain", 1L, 10), 50, 12);
    }
}
