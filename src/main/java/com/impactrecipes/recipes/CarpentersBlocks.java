package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;

public class CarpentersBlocks implements Runnable {

    @Override
    public void run() {
        assembler();
        cuttingSaw();
    }

    private void assembler() {
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 2L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Wood, 2L), null,
                        GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 4L, 0), 100, 16);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 3L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Iron, 1L), null,
                        GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 8L, 0), 100, 30);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 3L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Steel, 1L), null,
                        GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 12L, 0), 100, 48);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 3L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Aluminium, 1L), null,
                        GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 16L, 0), 100, 64);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 3L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.StainlessSteel, 1L), null,
                        GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 20L, 0), 100, 64);
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 3L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Titanium, 1L), null,
                        GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 24L, 0), 100, 64);
        // --- Carpenter's Barrier
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "fence", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBarrier", 2L, 0), 200, 16);
        // --- Carpenter's Collapsible Block
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                ItemList.Plank_Oak.get(1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersCollapsibleBlock", 1L, 0), 100,
                16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                ItemList.Plank_Spruce.get(1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersCollapsibleBlock", 1L, 0), 100,
                16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                ItemList.Plank_Birch.get(1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersCollapsibleBlock", 1L, 0), 100,
                16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                ItemList.Plank_Jungle.get(1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersCollapsibleBlock", 1L, 0), 100,
                16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                ItemList.Plank_Acacia.get(1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersCollapsibleBlock", 1L, 0), 100,
                16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                ItemList.Plank_DarkOak.get(1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersCollapsibleBlock", 1L, 0), 100,
                16);
        // --- Carpenter's Flower Pot
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "flower_pot", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersFlowerPot", 1L, 0), 100, 16);
        // --- Carpenter's Garage Door
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Iron, 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersGarageDoor", 2L, 0), 150, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Steel, 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersGarageDoor", 4L, 0), 300, 16);
        // --- Carpenter's Gate
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "fence_gate", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersGate", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "acaciaFenceGate", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersGate", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "birchFenceGate", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersGate", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "darkOakFenceGate", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersGate", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "jungleFenceGate", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersGate", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "spruceFenceGate", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersGate", 1L, 0), 100, 16);
        // --- Carpenter's Hatch
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "trapdoor", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersHatch", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_acacia", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersHatch", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_spruce", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersHatch", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_birch", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersHatch", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_jungle", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersHatch", 1L, 0), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "trapdoor_dark_oak", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersHatch", 1L, 0), 100, 16);
        // --- Carpenter's Ladder
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "ladder", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersLadder", 1L, 0), 100, 16);
        // --- Carpenter's Lever
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "lever", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersLever", 1L, 0), 50, 16);
        // --- Carpenter's Safe
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersCollapsibleBlock", 3L, 0),
                GT_ModHandler.getModItem("IC2", "blockPersonal", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersSafe", 1L, 0), 300, 30);
        // --- Carpenter's Torch
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "torch", 10L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersTorch", 10L, 0), 100, 16);
        // --- Carpenter's Chisel
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("TConstruct", "chiselHead", 1L, 2), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersChisel", 1L, 0), 200, 30);
        // --- Carpenter's Hammer
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_OreDictUnificator.get(OrePrefixes.toolHeadHammer, Materials.Iron, 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersHammer", 1L, 0), 200, 30);
        // --- Carpenter's Tile
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersPressurePlate", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "clay_ball", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersTile", 2L, 0), 50, 16);
        // --- Carpenter's Door
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("minecraft", "wooden_door", 1L, 0), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersDoor", 1L, 0), 150, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "item.door_acacia", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersDoor", 1L, 0), 150, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "item.door_birch", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersDoor", 1L, 0), 150, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "item.door_dark_oak", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersDoor", 1L, 0), 150, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "item.door_jungle", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersDoor", 1L, 0), 150, 16);
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("malisisdoors", "item.door_spruce", 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "itemCarpentersDoor", 1L, 0), 150, 16);
        // --- Carpenter's Pressure Plate
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 2L, 0),
                GT_OreDictUnificator.get(OrePrefixes.spring, Materials.Iron, 1L), null,
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersPressurePlate", 2L, 0), 100,
                8);
    }

    private void cuttingSaw() {
        // --- Carpenter's Button
        GT_Values.RA.addCutterRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersPressurePlate", 1L, 0),
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersButton", 4L, 0), GT_Values.NI,
                100, 30);
        // --- Carpenter's Stairs
        GT_Values.RA.addCutterRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersSlope", 1L, 0),
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersStairs", 1L, 0), GT_Values.NI,
                100, 30);
        // --- Carpenter's Slope
        GT_Values.RA.addCutterRecipe(
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersBlock", 1L, 0),
                GT_ModHandler.getModItem("CarpentersBlocks", "blockCarpentersSlope", 4L, 0), GT_Values.NI,
                100, 30);
    }
}
