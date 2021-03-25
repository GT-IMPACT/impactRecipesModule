package com.impactrecipes.recipes;

import gregtech.api.enums.*;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static com.impactrecipes.util.RecipeUtils.*;

public class Vanilla implements Runnable {

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED
            | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    @Override
    public void run() {
        handRecipe();
        oreRegisterRecipe();
    }

    private void handRecipe() {
        // --- Slabs
        ItemStack[] blocks = new ItemStack[]{
                ordictItemStack("stone"), ordictItemStack("sandstone"), null, ordictItemStack("cobblestone"),
                new ItemStack(Blocks.brick_block), ordictItemStack("stoneBricks"), ordictItemStack("stoneNetherBrick"),
                ordictItemStack("blockQuartz")
        };
        for (int i = 0; i < 8; i++) {
            if (i != 2) {
                continue;
            }
            GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stone_slab, i, 2),
                    tBitMask, new Object[]{"sB", 'B', blocks[i]});
        }
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.wooden_slab, 0, 2),
                tBitMask, new Object[]{"sB", 'B', new ItemStack(Blocks.planks, 0)});

        // --- Crafting Table
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "crafting_table", 1L), tBitMask, new Object[]{"WW", "WW", 'W', "logWood"});
        // --- Chest
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "chest", 1L), tBitMask, new Object[]{"WWW", "W W", "WWW", 'W', "plankWood"});
        // --- Trapper Chest
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "trapped_chest", 1L), tBitMask, new Object[]{" T ", "SCS", " d ", 'C', GT_ModHandler.getModItem("minecraft", "chest", 1L), 'S', OrePrefixes.screw.get(Materials.Iron), 'T', GT_ModHandler.getModItem("minecraft", "tripwire_hook", 1L)});
        // --- Dispenser
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "dispenser", 1L), tBitMask, new Object[]{"CRC", "SMS", "GWG", 'C', "cobblestone", 'S', OrePrefixes.spring.get(Materials.Iron), 'G', OrePrefixes.gearGtSmall.get(Materials.Iron), 'W', OrePrefixes.wireGt01.get(Materials.RedAlloy), 'R', OrePrefixes.ring.get(Materials.Iron), 'M', GT_ModHandler.getModItem("minecraft", "string", 1L)});
        // --- Dropper
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "dropper", 1L), tBitMask, new Object[]{"CRC", "SMS", "GWG", 'C', "cobblestone", 'S', OrePrefixes.springSmall.get(Materials.Iron), 'G', OrePrefixes.gearGtSmall.get(Materials.Iron), 'W', OrePrefixes.wireGt01.get(Materials.RedAlloy), 'R', OrePrefixes.ring.get(Materials.Iron), 'M', GT_ModHandler.getModItem("minecraft", "string", 1L)});
        // --- Sticky Piston
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "sticky_piston", 1L), tBitMask, new Object[]{"r", "S", "P", 'S', "slimeball", 'P', GT_ModHandler.getModItem("minecraft", "piston", 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "sticky_piston", 1L), tBitMask, new Object[]{"r", "S", "P", 'S', GT_ModHandler.getModItem("IC2", "itemHarz", 1L), 'P', GT_ModHandler.getModItem("minecraft", "piston", 1L)});
        // --- Noteblock
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "noteblock", 1L), tBitMask, new Object[]{"PPP", "BGB", "PWP", 'P', "plankWood", 'B', GT_ModHandler.getModItem("minecraft", "iron_bars", 1L), 'G', OrePrefixes.gear.get(Materials.Wood), 'W', OrePrefixes.wireGt01.get(Materials.RedAlloy)});
        // --- Jukebox
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "jukebox", 1L), tBitMask, new Object[]{"LBL", "NRN", "LGL", 'L', "plankWood", 'N', GT_ModHandler.getModItem("minecraft", "noteblock", 1L), 'G', OrePrefixes.gear.get(Materials.Iron), 'B', OrePrefixes.bolt.get(Materials.Diamond), 'R', "record"});
        // --- Jack O' Lantern
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("minecraft", "lit_pumpkin", 1L), tBitMask, new Object[]{GT_ModHandler.getModItem("minecraft", "pumpkin", 1L), GT_ModHandler.getModItem("minecraft", "torch", 1L), ToolDictNames.craftingToolKnife});
        // --- Trapdoor Oak
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "trapdoor", 1L), tBitMask, new Object[]{"PSP", "SSS", "PSP", 'S', OrePrefixes.stick.get(Materials.Wood), 'P', GT_ModHandler.getModItem("minecraft", "wooden_slab", 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "trapdoor", 2L), tBitMask, new Object[]{"PSP", "SRS", "PSP", 'S', OrePrefixes.stick.get(Materials.Wood), 'R', OrePrefixes.screw.get(Materials.Iron), 'P', GT_ModHandler.getModItem("minecraft", "wooden_slab", 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "trapdoor", 3L), tBitMask, new Object[]{"PSP", "SRS", "PSP", 'S', OrePrefixes.stick.get(Materials.Wood), 'R', OrePrefixes.screw.get(Materials.Steel), 'P', GT_ModHandler.getModItem("minecraft", "wooden_slab", 1L)});
        // --- Pressure Plate
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "stone_pressure_plate", 2L), tBitMask, new Object[]{"ShS", "BPB", "SdS", 'S', OrePrefixes.screw.get(Materials.Iron), 'P', OrePrefixes.spring.get(Materials.Iron), 'B', GT_ModHandler.getModItem("minecraft", "stone_slab", 1L)});
        // --- Wooden Pressure Plate
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "wooden_pressure_plate", 2L), tBitMask, new Object[]{"ShS", "BPB", "SdS", 'S', OrePrefixes.screw.get(Materials.Iron), 'P', OrePrefixes.spring.get(Materials.Iron), 'B', "slabWood"});
        // --- Glass Pane
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("minecraft", "glass_pane", 2L), tBitMask, new Object[]{ToolDictNames.craftingToolSaw, GT_ModHandler.getModItem("minecraft", "glass", 1L)});
        // --- Torch
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "torch", 3L), tBitMask, new Object[]{"C", "S", 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.gem.get(Materials.Coal)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "torch", 2L), tBitMask, new Object[]{"C", "S", 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.gem.get(Materials.Charcoal)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "torch", 1L), tBitMask, new Object[]{"C", "S", 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.gem.get(Materials.Lignite)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "torch", 5L), tBitMask, new Object[]{"C", "S", 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.gem.get(Materials.CokeCoal)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "torch", 3L), tBitMask, new Object[]{"C", "S", 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.dust.get(Materials.Sulfur)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "torch", 6L), tBitMask, new Object[]{"C", "S", 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.dust.get(Materials.Phosphorus)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "torch", 2L), tBitMask, new Object[]{"C", "S", 'S', OrePrefixes.stick.get(Materials.Wood), 'C', GT_ModHandler.getModItem("IC2", "itemHarz", 1L)});
        // --- Ladder
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "ladder", 1L), tBitMask, new Object[]{"SIS", "SSS", "SrS", 'S', OrePrefixes.stick.get(Materials.Wood), 'I', GT_ModHandler.getModItem("minecraft", "string", 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "ladder", 2L), tBitMask, new Object[]{"SdS", "SWS", "SrS", 'S', OrePrefixes.stick.get(Materials.Wood), 'W', OrePrefixes.screw.get(Materials.Wood)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "ladder", 4L), tBitMask, new Object[]{"SdS", "SWS", "SrS", 'S', OrePrefixes.stick.get(Materials.Wood), 'W', OrePrefixes.screw.get(Materials.Iron)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "ladder", 6L), tBitMask, new Object[]{"SdS", "SWS", "SrS", 'S', OrePrefixes.stick.get(Materials.Wood), 'W', OrePrefixes.screw.get(Materials.Steel)});
        // --- Fence
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fence", 1L), tBitMask, new Object[]{"SPS", "SPS", "SPS", 'S', OrePrefixes.stick.get(Materials.Wood), 'P', "plankWood"});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fence", 1L), tBitMask, new Object[]{"WdW", "SPS", "SPS", 'W', OrePrefixes.screw.get(Materials.Wood), 'S', OrePrefixes.stick.get(Materials.Wood), 'P', "plankWood"});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fence", 2L), tBitMask, new Object[]{"WdW", "SPS", "SPS", 'W', OrePrefixes.screw.get(Materials.Iron), 'S', OrePrefixes.stick.get(Materials.Wood), 'P', "plankWood"});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fence", 4L), tBitMask, new Object[]{"WdW", "SPS", "SPS", 'W', OrePrefixes.screw.get(Materials.Steel), 'S', OrePrefixes.stick.get(Materials.Wood), 'P', "plankWood"});
        // --- Oak Fence Gate
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fence_gate", 1L), tBitMask, new Object[]{"PSP", "PSP", "PSP", 'P', GT_ModHandler.getModItem("minecraft", "planks", 1L), 'S', OrePrefixes.stick.get(Materials.Wood)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fence_gate", 1L), tBitMask, new Object[]{"CdC", "PSP", "PSP", 'P', GT_ModHandler.getModItem("minecraft", "planks", 1L), 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.screw.get(Materials.Wood)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fence_gate", 2L), tBitMask, new Object[]{"CdC", "PSP", "PSP", 'P', GT_ModHandler.getModItem("minecraft", "planks", 1L), 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.screw.get(Materials.Iron)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fence_gate", 4L), tBitMask, new Object[]{"CdC", "PSP", "PSP", 'P', GT_ModHandler.getModItem("minecraft", "planks", 1L), 'S', OrePrefixes.stick.get(Materials.Wood), 'C', OrePrefixes.screw.get(Materials.Steel)});
        // --- Redstone Lamp
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "redstone_lamp", 1L), tBitMask, new Object[]{"GGG", "GBG", "GRG", 'R', OrePrefixes.wireGt01.get(Materials.RedAlloy), 'B', GT_ModHandler.getModItem("minecraft", "glowstone", 1L), 'G', GT_ModHandler.getModItem("minecraft", "glass_pane", 1L)});
        // --- Tripwire Hook
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "tripwire_hook", 1L), tBitMask, new Object[]{"RSR", "ISI", " I ", 'S', OrePrefixes.stick.get(Materials.Wood), 'R', OrePrefixes.ring.get(Materials.Iron), 'I', GT_ModHandler.getModItem("minecraft", "string", 1L)});
        // --- Anvil
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "anvil", 1L), tBitMask, new Object[]{"BBB", "SBS", "PBP", 'S', OrePrefixes.screw.get(Materials.Iron), 'P', OrePrefixes.plate.get(Materials.Iron), 'B', OrePrefixes.block.get(Materials.Iron)});
        // --- Daylight Sensor
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "daylight_detector", 1L), tBitMask, new Object[]{"GGG", "QQQ", "SRS", 'R', OrePrefixes.wireGt01.get(Materials.RedAlloy), 'Q', OrePrefixes.plate.get(Materials.NetherQuartz), 'S', "slabWood", 'G', GT_ModHandler.getModItem("minecraft", "glass_pane", 1L)});
        // --- Oak Door
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "wooden_door", 1L), tBitMask, new Object[]{"SPP", "RPP", "dPP", 'S', OrePrefixes.screw.get(Materials.Iron), 'R', OrePrefixes.ring.get(Materials.Iron), 'P', GT_ModHandler.getModItem("minecraft", "planks", 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "wooden_door", 1L), tBitMask, new Object[]{"SPP", "RPP", "dPP", 'S', OrePrefixes.screw.get(Materials.Copper), 'R', OrePrefixes.ring.get(Materials.Copper), 'P', GT_ModHandler.getModItem("minecraft", "planks", 1L)});
        // --- Iron Door
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "iron_door", 1L), tBitMask, new Object[]{"SPP", "RPP", "dPP", 'S', OrePrefixes.screw.get(Materials.Steel), 'R', OrePrefixes.ring.get(Materials.Steel), 'P', OrePrefixes.plate.get(Materials.Iron)});
        // --- Diamond Suit
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "diamond_helmet", 1L), tBitMask, new Object[]{"DDD", "DfD", 'D', OrePrefixes.gem.get(Materials.Diamond)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "diamond_chestplate", 1L), tBitMask, new Object[]{"DfD", "DDD", "DDD", 'D', OrePrefixes.gem.get(Materials.Diamond)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "diamond_leggings", 1L), tBitMask, new Object[]{"DDD", "DfD", "D D", 'D', OrePrefixes.gem.get(Materials.Diamond)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "diamond_boots", 1L), tBitMask, new Object[]{"D D", "DfD", 'D', OrePrefixes.gem.get(Materials.Diamond)});
        // --- Iron Horse Armor
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "iron_horse_armor", 1L), tBitMask, new Object[]{"hdH", "PCP", "LSL", 'P', OrePrefixes.plate.get(Materials.Iron), 'S', OrePrefixes.screw.get(Materials.Iron), 'H', GT_ModHandler.getModItem("minecraft", "iron_helmet", 1L), 'C', GT_ModHandler.getModItem("minecraft", "iron_chestplate", 1L), 'L', GT_ModHandler.getModItem("minecraft", "iron_leggings", 1L)});
        // --- Gold Horse Armor
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "golden_horse_armor", 1L), tBitMask, new Object[]{"hdH", "PCP", "LSL", 'P', OrePrefixes.plate.get(Materials.Gold), 'S', OrePrefixes.screw.get(Materials.Gold), 'H', GT_ModHandler.getModItem("minecraft", "golden_helmet", 1L), 'C', GT_ModHandler.getModItem("minecraft", "golden_chestplate", 1L), 'L', GT_ModHandler.getModItem("minecraft", "golden_leggings", 1L)});
        // --- Diamond Horse Armor
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "diamond_horse_armor", 1L), tBitMask, new Object[]{"hdH", "PCP", "LSL", 'P', OrePrefixes.plate.get(Materials.Diamond), 'S', OrePrefixes.screw.get(Materials.Diamond), 'H', GT_ModHandler.getModItem("minecraft", "diamond_helmet", 1L), 'C', GT_ModHandler.getModItem("minecraft", "diamond_chestplate", 1L), 'L', GT_ModHandler.getModItem("minecraft", "diamond_leggings", 1L)});
        // --- Saddle
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "saddle", 1L), tBitMask, new Object[]{"LBL", "LCL", "RSR", 'C', "blockWool", 'L', GT_ModHandler.getModItem("minecraft", "leather", 1L), 'B', GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L), 'S', GT_ModHandler.getModItem("minecraft", "string", 1L), 'R', OrePrefixes.ring.get(Materials.Iron)});
        // --- Item Frame
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "item_frame", 1L), tBitMask, new Object[]{"IRI", "SLS", "SSS", 'S', OrePrefixes.stick.get(Materials.Wood), 'R', OrePrefixes.ring.get(Materials.Iron), 'I', GT_ModHandler.getModItem("minecraft", "string", 1L), 'L', GT_ModHandler.getModItem("minecraft", "leather", 1L)});
        // --- Comparator
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "comparator", 1L), tBitMask, new Object[]{"STS", "TPT", "LdL", 'S', OrePrefixes.screw.get(Materials.Iron), 'P', OrePrefixes.plate.get(Materials.NetherQuartz), 'T', GT_ModHandler.getModItem("minecraft", "redstone_torch", 1L), 'L', GT_ModHandler.getModItem("minecraft", "stone_slab", 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "comparator", 1L), tBitMask, new Object[]{"STS", "TPT", "LdL", 'S', OrePrefixes.screw.get(Materials.Iron), 'P', OrePrefixes.plate.get(Materials.Quartzite), 'T', GT_ModHandler.getModItem("minecraft", "redstone_torch", 1L), 'L', GT_ModHandler.getModItem("minecraft", "stone_slab", 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "comparator", 1L), tBitMask, new Object[]{"STS", "TPT", "LdL", 'S', OrePrefixes.screw.get(Materials.Iron), 'P', OrePrefixes.plate.get(Materials.CertusQuartz), 'T', GT_ModHandler.getModItem("minecraft", "redstone_torch", 1L), 'L', GT_ModHandler.getModItem("minecraft", "stone_slab", 1L)});
        // --- Redstone Repeater
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "repeater", 1L), tBitMask, new Object[]{"S S", "TdT", "LIL", 'S', OrePrefixes.screw.get(Materials.Iron), 'I', OrePrefixes.stick.get(Materials.RedAlloy), 'T', GT_ModHandler.getModItem("minecraft", "redstone_torch", 1L), 'L', GT_ModHandler.getModItem("minecraft", "stone_slab", 1L)});
        // --- Bed
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "bed", 1L), tBitMask, new Object[]{"WWW", "FPF", 'P', OrePrefixes.plank.get(Materials.Wood), 'F', GT_ModHandler.getModItem("minecraft", "fence", 1L), 'W', "blockWool"});
        // --- Fishing Rod
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "fishing_rod", 1L), tBitMask, new Object[]{"  S", " SI", "SxR", 'S', OrePrefixes.stickLong.get(Materials.Wood), 'R', OrePrefixes.ring.get(Materials.Iron), 'I', GT_ModHandler.getModItem("minecraft", "string", 1L)});
        for (int i = 0; i < 16; i++) {
            // --- Carpet
            GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.carpet, 1, i), tBitMask, new Object[]{"WW", 'W', new ItemStack(Blocks.wool, 1, i)});
            GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.carpet, 3, i), tBitMask, new Object[]{"WWs", 'W', new ItemStack(Blocks.wool, 1, i)});
            GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.carpet, 1, 15 - i), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.carpet, 1, 0), Dyes.VALUES[i]});
            // --- Glass Pane
            GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stained_glass_pane, 2, i), tBitMask, new Object[]{"sW", 'W', new ItemStack(Blocks.stained_glass, 1, i)});
            GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stained_glass_pane, 8, 15 - i), tBitMask, new Object[]{"WWW", "WDW", "WWW", 'W', new ItemStack(Blocks.glass_pane, 1, 0), 'D', Dyes.VALUES[i]});
            GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 15 - i), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.glass_pane, 1, 0), Dyes.VALUES[i]});
            // --- GT's Dye
            GT_ModHandler.addShapelessCraftingRecipe(ItemList.DYE_ONLY_ITEMS[i].get(1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{Dyes.VALUES[i]});
        }

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("minecraft", "string", 2L), tBitMask, new Object[]{"Wk", 'W', "blockWool"});

    }

    private void oreRegisterRecipe() {
        // --- Dye Black
        OreDictionary.registerOre("dyeBlack", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Coal, 1L));
        OreDictionary.registerOre("dyeBlack", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Charcoal, 1L));
        OreDictionary.registerOre("dyeBlack", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DarkAshes, 1L));
        OreDictionary.registerOre("dyeBlack", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Magnetite, 1L));
        // --- Dye Gray
        OreDictionary.registerOre("dyeGray", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ashes, 1L));
        // --- Dye Green
        OreDictionary.registerOre("dyeGreen", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Malachite, 1L));
        OreDictionary.registerOre("dyeGreen", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glauconite, 1L));
        OreDictionary.registerOre("dyeGreen", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Garnierite, 1L));
        // --- Dye White
        OreDictionary.registerOre("dyeWhite", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Calcite, 1L));
        OreDictionary.registerOre("dyeWhite", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Zincite, 1L));
        OreDictionary.registerOre("dyeWhite", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Barite, 1L));
        OreDictionary.registerOre("dyeWhite", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Quicklime, 1L));
        OreDictionary.registerOre("dyeWhite", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AntimonyTrioxide, 1L));
        // --- Dye Red
        OreDictionary.registerOre("dyeRed", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cinnabar, 1L));
        OreDictionary.registerOre("dyeRed", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BandedIron, 1L));
        // --- Dye Yellow
        OreDictionary.registerOre("dyeYellow", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Massicot, 1L));
        // --- Dye Brown
        OreDictionary.registerOre("dyeBrown", GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lignite, 1L));
        for (int i = 0; i < 6; i++) {
            OreDictionary.registerOre("plankWood", new ItemStack(Blocks.planks, i));
        }
    }


}