package com.impactrecipes.recipes;

import com.impact.common.item.Core_Items;
import com.impact.common.item.Core_Items2;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

public class MalisisDoors implements Runnable {

    final Core_Items CoreItems = Core_Items.getInstance();
    final Core_Items2 CoreItems2 = Core_Items2.getInstance();

    @Override
    public void run() {
        assembler();
    }

    private void assembler() {
// --- Iron Trap Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "trapdoor", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                GT_ModHandler.getModItem("malisisdoors", "iron_trapdoor", 1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "trapdoor_acacia", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                GT_ModHandler.getModItem("malisisdoors", "iron_trapdoor", 1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "trapdoor_spruce", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                GT_ModHandler.getModItem("malisisdoors", "iron_trapdoor", 1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "trapdoor_birch", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                GT_ModHandler.getModItem("malisisdoors", "iron_trapdoor", 1L), 100, 16);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "trapdoor_jungle", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                GT_ModHandler.getModItem("malisisdoors", "iron_trapdoor", 1L), 100, 16);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "trapdoor_dark_oak", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                        GT_ModHandler.getModItem("malisisdoors", "iron_trapdoor", 1L), 100, 16);
        // --- Sliding Trap Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "iron_trapdoor", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 2L),
                GT_ModHandler.getModItem("malisisdoors", "sliding_trapdoor", 1L), 150, 16);
        // --- Wooden Vanishing Frame
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.EnderEye, 1L),
                Materials.Redstone.getMolten(288),
                GT_ModHandler.getModItem("malisisdoors", "vanishing_block", 1L), 300, 30);
        // --- Iron Vanishing Frame
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Iron, 4L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.EnderEye, 1L),
                Materials.Redstone.getMolten(288),
                GT_ModHandler.getModItem("malisisdoors", "vanishing_block", 1L, 1), 400, 30);
        // --- Gold Vanishing Frame
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Gold, 4L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.EnderEye, 1L),
                Materials.Redstone.getMolten(288),
                GT_ModHandler.getModItem("malisisdoors", "vanishing_block", 1L, 2), 500, 30);
        // --- Diamond Vanishing Frame
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Diamond, 4L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.EnderEye, 1L),
                        Materials.Redstone.getMolten(288),
                        GT_ModHandler.getModItem("malisisdoors", "vanishing_block", 1L, 3), 600, 30);
        // --- Rusty Hatch
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 4L),
                GT_ModHandler.getModItem("malisisdoors", "item.rustyHandle", 1L),
                GT_ModHandler.getModItem("malisisdoors", "rustyHatch", 1L), 200, 16);
        // --- Garage Door
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 2L),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Steel, 1L),
                GT_ModHandler.getModItem("malisisdoors", "garage_door", 3L), 150, 16);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Plastic, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Steel, 1L),
                        GT_ModHandler.getModItem("malisisdoors", "garage_door", 4L), 160, 16);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Plastic, 3L),
                        GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Aluminium, 2L),
                        GT_ModHandler.getModItem("malisisdoors", "garage_door", 6L), 170, 16);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Plastic, 3L),
                        GT_OreDictUnificator.get(OrePrefixes.ring, Materials.StainlessSteel, 2L),
                        GT_ModHandler.getModItem("malisisdoors", "garage_door", 8L), 180, 16);
        // --- Rusty Ladder
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Iron, 3L),
                GT_Utility.getIntegratedCircuit(5),
                GT_ModHandler.getModItem("malisisdoors", "rustyLadder", 1L), 60, 16);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Steel, 3L),
                        GT_Utility.getIntegratedCircuit(5),
                        GT_ModHandler.getModItem("malisisdoors", "rustyLadder", 2L), 70, 16);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Aluminium, 3L),
                        GT_Utility.getIntegratedCircuit(5),
                        GT_ModHandler.getModItem("malisisdoors", "rustyLadder", 4L), 80, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_OreDictUnificator.get(OrePrefixes.stick, Materials.StainlessSteel, 3L),
                GT_Utility.getIntegratedCircuit(5),
                GT_ModHandler.getModItem("malisisdoors", "rustyLadder", 8L), 90, 16);
        // --- Carriage Door
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.NetherQuartz, 4L),
                        GT_ModHandler.getModItem("minecraft", "door", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "carriage_door", 1L), 200, 30);
        // --- Acacia Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 4),
                GT_Utility.getIntegratedCircuit(6), Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_acacia", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 4),
                GT_Utility.getIntegratedCircuit(6), Materials.Copper.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_acacia", 1L), 400, 4);
        // --- Birch Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 2),
                GT_Utility.getIntegratedCircuit(6), Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_birch", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 2),
                GT_Utility.getIntegratedCircuit(6), Materials.Copper.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_birch", 1L), 400, 4);
        // --- Dark Oak Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 5),
                GT_Utility.getIntegratedCircuit(6), Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_dark_oak", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 5),
                GT_Utility.getIntegratedCircuit(6), Materials.Copper.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_dark_oak", 1L), 400, 4);
        // --- Jungle Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 3),
                GT_Utility.getIntegratedCircuit(6), Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_jungle", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 3),
                GT_Utility.getIntegratedCircuit(6), Materials.Copper.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_jungle", 1L), 400, 4);
        // --- Spruce Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 1),
                GT_Utility.getIntegratedCircuit(6), Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_spruce", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "planks", 6L, 1),
                GT_Utility.getIntegratedCircuit(6), Materials.Copper.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "item.door_spruce", 1L), 400, 4);
        // --- Wooden Glass Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "wooden_door", 1L),
                GT_ModHandler.getModItem("minecraft", "glass_pane", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "wooden_door", 1L),
                GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_acacia", 1L),
                        GT_ModHandler.getModItem("minecraft", "glass_pane", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_acacia", 1L),
                        GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_birch", 1L),
                GT_ModHandler.getModItem("minecraft", "glass_pane", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_birch", 1L),
                GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_dark_oak", 1L),
                        GT_ModHandler.getModItem("minecraft", "glass_pane", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_dark_oak", 1L),
                        GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_jungle", 1L),
                        GT_ModHandler.getModItem("minecraft", "glass_pane", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_jungle", 1L),
                        GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_spruce", 1L),
                        GT_ModHandler.getModItem("minecraft", "glass_pane", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_spruce", 1L),
                        GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                        GT_ModHandler.getModItem("malisisdoors", "item.wood_sliding_door", 1L), 400, 4);
        // --- Iron Glass Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "iron_door", 1L),
                GT_ModHandler.getModItem("minecraft", "glass_pane", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.iron_sliding_door", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "iron_door", 1L),
                GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.iron_sliding_door", 1L), 400, 4);
        // --- Jail Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "iron_door", 1L),
                CoreItems2.getRecipe(51, 2), GT_ModHandler.getModItem("malisisdoors", "item.jail_door", 1L),
                400, 4);
        // --- Laboratory Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "wooden_door", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 2L),
                GT_ModHandler.getModItem("malisisdoors", "item.laboratory_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_acacia", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 2L),
                        GT_ModHandler.getModItem("malisisdoors", "item.laboratory_door", 1L), 400, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_birch", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 2L),
                GT_ModHandler.getModItem("malisisdoors", "item.laboratory_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_dark_oak", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 2L),
                        GT_ModHandler.getModItem("malisisdoors", "item.laboratory_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_jungle", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 2L),
                        GT_ModHandler.getModItem("malisisdoors", "item.laboratory_door", 1L), 400, 4);
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("malisisdoors", "item.door_spruce", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Steel, 2L),
                        GT_ModHandler.getModItem("malisisdoors", "item.laboratory_door", 1L), 400, 4);
        // --- Factory Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "iron_door", 1L),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 2L),
                GT_ModHandler.getModItem("malisisdoors", "item.factory_door", 1L), 400, 4);
        // --- Shoji Door
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "paper", 2L),
                GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                GT_ModHandler.getModItem("malisisdoors", "item.shoji_door", 1L), 400, 4);
        // --- Purple Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 10),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_purple", 1L), 400, 4);
        // --- Yellow Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 4),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_yellow", 1L), 400, 4);
        // --- Magenta Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 2),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_magenta", 1L), 400, 4);
        // --- Pink Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 6),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_pink", 1L), 400, 4);
        // --- White Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_white", 1L), 400, 4);
        // --- Blue Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 11),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_blue", 1L), 400, 4);
        // --- Cyan Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 9),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_cyan", 1L), 400, 4);
        // --- Red Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 14),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_red", 1L), 400, 4);
        // --- Gray Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 7),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_gray", 1L), 400, 4);
        // --- Brown Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 12),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_brown", 1L), 400, 4);
        // --- Lime Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 5),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_lime", 1L), 400, 4);
        // --- Orange Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 1),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_orange", 1L), 400, 4);
        // --- Light Gray Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 8),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_silver", 1L), 400, 4);
        // --- Green Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 13),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_green", 1L), 400, 4);
        // --- Light Blue Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 3),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_light_blue", 1L), 400, 4);
        // --- Black Curtain
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "carpet", 3L, 15),
                GT_ModHandler.getModItem("minecraft", "string", 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.curtain_black", 1L), 400, 4);
        // --- Saloon Door
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plank, Materials.Wood, 3L),
                GT_OreDictUnificator.get(OrePrefixes.springSmall, Materials.Iron, 1L),
                GT_ModHandler.getModItem("malisisdoors", "item.saloon", 1L), 400, 4);
        // --- Fence Gate Acacia
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 4),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                GT_ModHandler.getModItem("malisisdoors", "acaciaFenceGate", 1L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 4),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "acaciaFenceGate", 2L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 4),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "acaciaFenceGate", 4L), 300, 8);
        // --- Fence Gate Birch
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 2),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                GT_ModHandler.getModItem("malisisdoors", "birchFenceGate", 1L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 2),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "birchFenceGate", 2L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 2),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "birchFenceGate", 4L), 300, 8);
        // --- Fence Gate Dark Oak
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                GT_ModHandler.getModItem("malisisdoors", "darkOakFenceGate", 1L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "darkOakFenceGate", 2L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "darkOakFenceGate", 4L), 300, 8);
        // --- Fence Gate Jungle
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 3),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                GT_ModHandler.getModItem("malisisdoors", "jungleFenceGate", 1L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 3),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "jungleFenceGate", 2L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 3),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "jungleFenceGate", 4L), 300, 8);
        // --- Fence Gate Spruce
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                GT_ModHandler.getModItem("malisisdoors", "spruceFenceGate", 1L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "spruceFenceGate", 2L), 300, 8);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "planks", 3L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 2L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "spruceFenceGate", 4L), 300, 8);
        // --- Trapped Door Arcania
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 4),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_acacia", 2L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 4),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(2)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_acacia", 4L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 4),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_acacia", 6L), 600, 4);
        // --- Trapped Door Birch
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 2),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_birch", 2L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 2),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(2)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_birch", 4L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 2),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_birch", 6L), 600, 4);
        // --- Trapped Door Dark Oak
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_dark_oak", 2L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(2)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_dark_oak", 4L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_dark_oak", 6L), 600, 4);
        // --- Trapped Door Jungle
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 3),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_jungle", 2L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 3),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(2)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_jungle", 4L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 3),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_jungle", 6L), 600, 4);
        // --- Trapped Door Spruce
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_spruce", 2L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(2)}, Materials.Iron.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_spruce", 4L), 600, 4);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "wooden_slab", 4L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Wood, 4L),
                        GT_Utility.getIntegratedCircuit(3)}, Materials.Steel.getMolten(16),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_spruce", 6L), 600, 4);

    }
}
