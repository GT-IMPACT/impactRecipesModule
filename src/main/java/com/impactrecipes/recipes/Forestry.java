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

import static gregtech.api.util.GT_ModHandler.removeRecipeByOutput;

public class Forestry implements Runnable {

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    final Core_Items2 CoreItems2 = Core_Items2.getInstance();

    @Override
    public void run() {
        removeForestry();
        hand();
        assembler();
        ciruit();
    }

    private void removeForestry() {
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "apiaristBag", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "lepidopteristBag", 1L, 0), true,
                false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "minerBag", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "diggerBag", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "foresterBag", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "hunterBag", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "adventurerBag", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "builderBag", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "bronzePickaxe", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "bronzeShovel", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("Forestry", "wrench", 1L, 0), true, false,
                true);
    }

    private void hand() {
        // --- Apiarist's Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "apiaristBag", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Iron), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 0), 'C', GT_ModHandler.getModItem("Forestry", "apicultureChest", 1L, 0), 'W', "blockWool"});
        // --- Lepidopterist's Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "lepidopteristBag", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Iron), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 0), 'C', GT_ModHandler.getModItem("Forestry", "lepidopterology", 1L, 0), 'W', "blockWool"});
        // --- Miner's Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "minerBag", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Iron), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 0), 'C', OrePrefixes.plate.get(Materials.Iron), 'W', "blockWool"});
        // --- Digger's Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "diggerBag", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Iron), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 0), 'C', "stone", 'W', "blockWool"});
        // --- Forester's Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "foresterBag", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Iron), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 0), 'C', "logWood", 'W', "blockWool"});
        // --- Hunter's Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "hunterBag", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Iron), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 0), 'C', GT_ModHandler.getModItem("minecraft", "feather", 1L, 0), 'W', "blockWool"});
        // --- Builder's Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "builderBag", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Iron), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 0), 'C', GT_ModHandler.getModItem("minecraft", "fence", 1L, 0), 'W', "blockWool"});

        // --- Miner's Woven Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "minerBagT2", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Steel), 'B', GT_ModHandler.getModItem("Forestry", "minerBag", 1L, 0), 'C', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100), 'W', GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L, 0)});
        // --- Digger's Woven Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "diggerBagT2", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Steel), 'B', GT_ModHandler.getModItem("Forestry", "diggerBag", 1L, 0), 'C', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100), 'W', GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L, 0)});
        // --- Forester's Woven Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "foresterBagT2", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Steel), 'B', GT_ModHandler.getModItem("Forestry", "foresterBag", 1L, 0), 'C', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100), 'W', GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L, 0)});
        // --- Hunter's Woven Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "hunterBagT2", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Steel), 'B', GT_ModHandler.getModItem("Forestry", "hunterBag", 1L, 0), 'C', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100), 'W', GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L, 0)});
        // --- Builder's Woven Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Forestry", "builderBagT2", 1L, 0), tBitMask, new Object[]{"WRW", "WBW", "WCW", 'R', OrePrefixes.ring.get(Materials.Steel), 'B', GT_ModHandler.getModItem("Forestry", "builderBag", 1L, 0), 'C', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100), 'W', GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L, 0)});

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
