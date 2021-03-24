package com.impactrecipes.recipes;

import com.cricketcraft.chisel.api.carving.CarvingUtils;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import team.chisel.carving.Carving;

import static com.riciJak.Ztones.init.ModBlocks.*;

public class ChiselGroup {
    public static void run(){

        /*String name = "Molds";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Block[] mold = new Block[]{
                Shape_Mold_Plate.getBlock(), Shape_Mold_Casing.getBlock(), Shape_Mold_Gear.getBlock(), Shape_Mold_Credit.getBlock(),
                Shape_Mold_Bottle.getBlock(), Shape_Mold_Ingot.getBlock(), Shape_Mold_Ball.getBlock(), Shape_Mold_Block.getBlock(),
                Shape_Mold_Nugget.getBlock(), Shape_Mold_Bun.getBlock(), Shape_Mold_Bread.getBlock(), Shape_Mold_Baguette.getBlock(),
                Shape_Mold_Cylinder.getBlock(), Shape_Mold_Anvil.getBlock(), Shape_Mold_Name.getBlock(), null, Shape_Mold_Gear_Small.getBlock(),
                Shape_Mold_Rod.getBlock(), Shape_Mold_Bolt.getBlock(), Shape_Mold_Round.getBlock(), Shape_Mold_Screw.getBlock(),
                Shape_Mold_Ring.getBlock(), Shape_Mold_Rod_Long.getBlock(), Shape_Mold_Rotor.getBlock(), Shape_Mold_Turbine_Blade.getBlock()
        };
        for (int i = 0; i < 25; i++) {
            if (i != 16) {
                continue;
            }
            Carving.chisel.addVariation(name, mold[i], 32301 + i, 0);
        }*/
        // --- Glowstone
        String name = "glowstone";
        Carving.chisel.removeGroup(name);
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, Blocks.glowstone, 0, 0);
        for (int i = 1; i < 16; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("chisel", "glowstone"), i, 0);
        }

        // --- Cobblestone
        name = "cobblestone";
        Carving.chisel.removeGroup(name);
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, Blocks.cobblestone, 0, 0);
        for (int i = 1; i < 16; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("chisel", "cobblestone"), i, 0);
        }

        // --- Glass
        name = "glass";
        Carving.chisel.removeGroup(name);
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, Blocks.glass, 0, 0);
        for (int i = 1; i < 16; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("chisel", "glass"), i, 0);
            Carving.chisel.addVariation(name, GameRegistry.findBlock("Impact|Architecture", "i_glass"), i, 0);
            Carving.chisel.addVariation(name, glaxx, i, 0);
        }
        Carving.chisel.addVariation(name, GameRegistry.findBlock("chisel", "glass2"), 0, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "GlassBlock"), 0, 0);

        // --- Marble
        name = "marble";
        Carving.chisel.addVariation(name, GameRegistry.findBlock("Railcraft", "cube"), 7, 0);
        if (Loader.isModLoaded("UndergroundBiomes")) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("UndergroundBiomes", "metamorphicStone"), 2, 0);
        }
        for (int i = 0; i < 8; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("gregtech", "gt.blockstones"), i, 0);
        }

        // --- Abyssal Stone
        name = "RCAbyssalBlock";
        if (Loader.isModLoaded("UndergroundBiomes")) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("UndergroundBiomes", "igneousStone"), 1, 0);
        }
        Carving.chisel.addVariation(name, GameRegistry.findBlock("Railcraft", "cube"), 6, 0);
        for (int i = 0; i < 8; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("gregtech", "gt.blockgranites"), i, 0);
        }

        // --- Basalt
        name = "basalt";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        if (Loader.isModLoaded("UndergroundBiomes")) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("UndergroundBiomes", "igneousStone"), 5, 0);
        }
        for (int i = 8; i < 16; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("gregtech", "gt.blockstones"), i, 0);
        }

        // --- Red Granite
        name = "redgranite";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        if (Loader.isModLoaded("UndergroundBiomes")) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("UndergroundBiomes", "igneousStone"), 0, 0);
        }
        for (int i = 8; i < 16; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("gregtech", "gt.blockgranites"), i, 0);
        }

        if (Loader.isModLoaded("UndergroundBiomes")) {
            // --- Andesite
            name = "andesite";
            Carving.chisel.addVariation(name, GameRegistry.findBlock("UndergroundBiomes", "igneousStone"), 3, 0);

            // --- Limestone
            name = "limestone";
            Carving.chisel.addVariation(name, GameRegistry.findBlock("UndergroundBiomes", "sedimentaryStone"), 0, 0);
        }

        // --- Seared Stone TConstruct
        name = "searedStoneTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "Smeltery"), 4, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "Smeltery"), 6, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "Smeltery"), 11, 0);
        name = "searedStoneNetherTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SmelteryNether"), 4, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SmelteryNether"), 6, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SmelteryNether"), 11, 0);

        // --- Seared Bricks TConstruct
        name = "searedBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "Smeltery"), 2, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "Smeltery"), 8, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "Smeltery"), 9, 0);
        name = "searedBricksNetherTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SmelteryNether"), 2, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SmelteryNether"), 8, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SmelteryNether"), 9, 0);

        // --- SpeedBlock TConstruct
        name = "speedBlockTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SpeedBlock"), 0, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SpeedBlock"), 1, 0);

        // --- BrownStone TConstruct
        name = "brownStoneTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SpeedBlock"), 2, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SpeedBlock"), 3, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SpeedBlock"), 4, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SpeedBlock"), 5, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "SpeedBlock"), 6, 0);

        // --- Bricks
        name = "ironBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 4, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 4, 0);
        name = "goldBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 5, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 5, 0);
        name = "lapisBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 6, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 6, 0);
        name = "diamondBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 7, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 7, 0);
        name = "redstoneBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 8, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 8, 0);
        name = "boneBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 9, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 9, 0);
        name = "greenSlimeBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 10, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 10, 0);
        name = "blueSlimeBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 11, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 11, 0);
        name = "obsidianBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrick"), 13, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickfancy"), 13, 0);
        name = "alumiteBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "MetalBlock"), 8, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickmetal"), 0, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickmetal"), 4, 0);
        name = "arditeBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "MetalBlock"), 1, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickmetal"), 1, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickmetal"), 5, 0);
        name = "cobaltBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "MetalBlock"), 0, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickmetal"), 2, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickmetal"), 6, 0);
        name = "manyullynBricksTCon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "MetalBlock"), 2, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickmetal"), 3, 0);
        Carving.chisel.addVariation(name, GameRegistry.findBlock("TConstruct", "decoration.multibrickmetal"), 7, 0);

        // --- GregTech
        name = "steelCasing";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        Carving.chisel.addVariation(name, GameRegistry.findBlock("gregtech", "gt.blockcasings2"), 0, 0);
        for (int i = 0; i < 10; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("gregtech", "gt.blockcasings3"), i, 0);
        }

        // --- Impact
        name = "concrete";
        Carving.chisel.addVariation(name, GameRegistry.findBlock("impact", "impact_util"), 2, 0);
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("Impact|Architecture", "i_concrete_block"), i, 0);
        }
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, GameRegistry.findBlock("gregtech", "gt.blockconcretes"), i, 0);
        }

        // --- Ztones
        name = "Agon";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, agonBlock, i, 0);
        }

        name = "Bitt";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, bittBlock, i, 0);
        }

        name = "Cray";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, crayBlock, i, 0);
        }

        name = "Fort";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, fortBlock, i, 0);
        }

        name = "Iszm";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, iszmBlock, i, 0);
        }

        name = "Jelt";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, jeltBlock, i, 0);
        }

        name = "Korp";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, korpBlock, i, 0);
        }

        name = "Kryp";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, krypBlock, i, 0);
        }

        name = "Lair";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, lairBlock, i, 0);
        }

        name = "Lave";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, laveBlock, i, 0);
        }

        name = "Mint";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, mintBlock, i, 0);
        }

        name = "Myst";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, mystBlock, i, 0);
        }

        name = "Reds";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, redsBlock, i, 0);
        }

        name = "Roen";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, roenBlock, i, 0);
        }

        name = "Sols";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, solsBlock, i, 0);
        }

        name = "Tank";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, tankBlock, i, 0);
        }

        name = "Vect";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, vectBlock, i, 0);
        }

        name = "Vena";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, venaBlock, i, 0);
        }

        name = "Zech";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zechBlock, i, 0);
        }

        name = "Zion";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zionBlock, i, 0);
        }

        name = "Zome";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zomeBlock, i, 0);
        }

        name = "Zone";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zoneBlock, i, 0);
        }

        name = "Zorg";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zorgBlock, i, 0);
        }

        name = "Azur";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, azurBlock, i, 0);
        }

        name = "Zane";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zaneBlock, i, 0);
        }

        name = "Zest";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zestBlock, i, 0);
        }

        name = "Zeta";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zetaBlock, i, 0);
        }

        name = "Zoea";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zoeaBlock, i, 0);
        }

        name = "Zyth";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zythBlock, i, 0);
        }

        name = "Reed";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, reedBlock, i, 0);
        }

        name = "Sync";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, syncBlock, i, 0);
        }

        name = "Zkul";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, zkulBlock, i, 0);
        }

        name = "Ztyl";
        Carving.chisel.addGroup(new CarvingUtils.SimpleCarvingGroup(name));
        for (int i = 0; i < 16; i++) {
            Carving.chisel.addVariation(name, ztylBlock, i, 0);
        }
    }
}
