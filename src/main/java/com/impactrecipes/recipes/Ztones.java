package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;

public class Ztones implements Runnable {

    @Override
    public void run() {
        forgeHammer();
        assembler();
        cutting();
    }

    private void forgeHammer() {
        // --- Mine Charcoal
        GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("minecraft", "coal", 1L, 1),
                GT_ModHandler.getModItem("Ztones", "minicharcoal", 9L, 0), 50, 8);
        // --- Mine Charcoal
        GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("minecraft", "coal", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "minicoal", 9L, 0), 50, 8);
    }

    private void assembler() {
// --- Ztones Tile
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "stone_slab", 8L, 0),
                GT_ModHandler.getModItem("minecraft", "stone", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "stoneTile", 8L, 0), 160, 4);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "stone_slab", 8L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Iron, 1L),
                GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0), 140, 6);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "stone_slab", 8L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Steel, 1L),
                GT_ModHandler.getModItem("Ztones", "stoneTile", 32L, 0), 120, 8);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "stone_slab", 8L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 1L),
                GT_ModHandler.getModItem("Ztones", "stoneTile", 64L, 0), 100, 12);
        // --- Garden Soil
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "sand", 4L, 0),
                GT_ModHandler.getModItem("minecraft", "dirt", 4L, 0), Materials.SeedOil.getFluid(5),
                GT_ModHandler.getModItem("Ztones", "cleanDirt", 8L, 0), 160, 4);
        // --- Booster
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "stone_pressure_plate", 1L, 0),
                        GT_Utility.getIntegratedCircuit(1), Materials.Blaze.getMolten(8),
                        GT_ModHandler.getModItem("Ztones", "booster", 1L, 0), 100, 30);
        // --- Aurora Block
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "glass", 4L, 0),
                GT_ModHandler.getModItem("minecraft", "dye", 1L, 32767),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 8L, 0), 160, 4);
        // --- Korp
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Obsidian, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.korpBlock", 24L, 0), 100, 8);
        // --- Zech
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 4),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zechBlock", 16L, 0), 100, 8);
        // --- Tank
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Iron, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.tankBlock", 16L, 0), 100, 8);
        // --- Sync
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.gem, Materials.Emerald, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.syncBlock", 16L, 0), 100, 8);
        // --- Zkul
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 10),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zkulBlock", 16L, 0), 100, 8);
        // --- Mint
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Rubber, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.mintBlock", 24L, 0), 100, 8);
        // --- Lair
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0),
                GT_ModHandler.getModItem("minecraft", "netherrack", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.lairBlock", 16L, 0), 100, 8);
        // --- Sols
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Brass, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.solsBlock", 24L, 0), 100, 8);
        // --- Reds
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.redsBlock", 16L, 0), 100, 8);
        // --- Ztyl
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Steel, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 24L, 0), 100, 8);
        // --- Iszm
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 8),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.iszmBlock", 16L, 0), 100, 8);
        // --- Roen
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0),
                GT_ModHandler.getModItem("minecraft", "sandstone", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.roenBlock", 16L, 0), 100, 8);
        // --- Vect
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Carbon, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.vectBlock", 24L, 0), 100, 8);
        // --- Lave
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0),
                GT_ModHandler.getModItem("minecraft", "ice", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.laveBlock", 16L, 0), 100, 8);
        // --- Zest
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 11),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zestBlock", 16L, 0), 100, 8);
        // --- Zyth
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 15),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zythBlock", 16L, 0), 100, 8);
        // --- Bitt
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0),
                GT_ModHandler.getModItem("minecraft", "wool", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.bittBlock", 16L, 0), 100, 8);
        // --- Tinted Glass
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "glass", 16L, 0),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.glaxx", 16L, 0), 100, 8);
        // --- Agon
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.agonBlock", 16L, 0), 100, 8);
        // --- Zone
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 3),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zoneBlock", 16L, 0), 100, 8);
        // --- Zoea
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 14),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zoeaBlock", 16L, 0), 100, 8);
        // --- Jelt
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Gold, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.jeltBlock", 24L, 0), 100, 8);
        // --- Zeta
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 13),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zetaBlock", 16L, 0), 100, 8);
        // --- Reed
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Wood, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.reedBlock", 24L, 0), 100, 8);
        // --- Cray
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "hardened_clay", 16L, 0),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.crayBlock", 16L, 0), 100, 8);
        // --- Fort
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 9),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.fortBlock", 16L, 0), 100, 8);
        // --- Vena
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 24L, 0),
                GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Cobalt, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.venaBlock", 24L, 0), 100, 8);
        // --- Kryp
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0),
                GT_ModHandler.getModItem("chisel", "concrete", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.krypBlock", 16L, 0), 100, 8);
        // --- Zion
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 7),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zionBlock", 16L, 0), 100, 8);
        // --- Zome
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 6),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zomeBlock", 16L, 0), 100, 8);
        // --- Zane
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 12),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zaneBlock", 16L, 0), 100, 8);
        // --- Azur
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "stoneTile", 16L, 0),
                GT_OreDictUnificator.get(OrePrefixes.gem, Materials.Lapis, 1L),
                GT_ModHandler.getModItem("Ztones", "tile.azurBlock", 16L, 0), 100, 8);
        // --- Zorg
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("Ztones", "tile.ztylBlock", 16L, 5),
                GT_ModHandler.getModItem("Ztones", "auroraBlock", 1L, 0),
                GT_ModHandler.getModItem("Ztones", "tile.zorgBlock", 16L, 0), 100, 8);

    }

    private void cutting() {
        GT_Values.RA.addCutterRecipe(
                GT_ModHandler.getModItem("ProjRed|Illumination", "projectred.illumination.lamp", 1L, 16),
                GT_ModHandler.getModItem("Ztones", "lampf", 4L, 0), GT_Values.NI, 200, 4);
        // --- Flat Lamp white
        GT_Values.RA.addCutterRecipe(
                GT_ModHandler.getModItem("ProjRed|Illumination", "projectred.illumination.lamp", 1L, 24),
                GT_ModHandler.getModItem("Ztones", "lampt", 4L, 0), GT_Values.NI, 200, 4);
        // --- Flat Lamp black
        GT_Values.RA.addCutterRecipe(
                GT_ModHandler.getModItem("ProjRed|Illumination", "projectred.illumination.lamp", 1L, 23),
                GT_ModHandler.getModItem("Ztones", "lampb", 4L, 0), GT_Values.NI, 200, 4);

    }
}