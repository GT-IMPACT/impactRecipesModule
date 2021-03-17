package com.impactrecipes.recipes;

import com.impact.common.item.Core_Items;
import com.impact.common.item.Core_Items2;
import com.impact.mods.gregtech.GT_ItemList;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Gendustry implements Runnable {

    final Core_Items CoreItems = Core_Items.getInstance();
    final Core_Items2 CoreItems2 = Core_Items2.getInstance();

    @Override
    public void run() {
        printer3d();
        assembler();
    }

    private void  printer3d() {
// --- Mutagen Producer
        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_LuV.get(1), GT_ModHandler.getModItem("gendustry", "GeneticsProcessor", 2L, 0),
                GT_ModHandler.getModItem("gendustry", "BeeReceptacle", 2L, 0),
                GT_ModHandler.getModItem("gendustry", "PowerModule", 2L, 0),
                ItemList.Robot_Arm_LuV.get(2), ItemList.Electric_Pump_LuV.get(4),
                GT_ModHandler.getModItem("gendustry", "MutagenTank", 4L, 0),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Trinium, 4),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 32),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSS, 32)
        }, GT_ModHandler.getModItem("gendustry", "MutagenProducer", 1L, 0), null, 100 * 20, 65576);

        // --- Mutatron
        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_LuV.get(1), GT_ModHandler.getModItem("gendustry", "GeneticsProcessor", 2L, 0),
                GT_ModHandler.getModItem("gendustry", "BeeReceptacle", 2L, 0),
                GT_ModHandler.getModItem("gendustry", "PowerModule", 2L, 0),
                ItemList.Robot_Arm_LuV.get(2), GT_ModHandler.getModItem("gendustry", "MutagenTank", 4L, 0),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Osmium, 4),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Naquadah, 8),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 32),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSS, 32)
        }, GT_ModHandler.getModItem("gendustry", "Mutatron", 1L, 0), null, 100 * 20, 65576);

        // --- Advanced Mutatron
        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_ZPM.get(1), GT_ModHandler.getModItem("gendustry", "GeneticsProcessor", 4L, 0),
                GT_ModHandler.getModItem("gendustry", "BeeReceptacle", 4L, 0),
                GT_ModHandler.getModItem("gendustry", "PowerModule", 4L, 0),
                ItemList.Robot_Arm_ZPM.get(4), GT_ModHandler.getModItem("gendustry", "MutagenTank", 8L, 0),
                GT_OreDictUnificator.get(OrePrefixes.gear, Materials.NaquadahAlloy, 8),
                GT_OreDictUnificator.get(OrePrefixes.plate, Materials.MysteriousCrystal, 16),
                GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.HSSE, 64),
                GT_OreDictUnificator.get(OrePrefixes.screw, Materials.HSSS, 64)
        }, GT_ModHandler.getModItem("gendustry", "MutatronAdv", 1L, 0), null, 200 * 20, 500000);

        // --- Industrial Apiary
        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                GT_ModHandler.getModItem("Forestry", "apiculture", 1L, 0),
                GT_ModHandler.getModItem("Forestry", "alveary", 2L, 2),
                GT_ModHandler.getModItem("Forestry", "alveary", 2L, 3),
                GT_ModHandler.getModItem("Forestry", "alveary", 2L, 4),
                GT_ModHandler.getModItem("Forestry", "alveary", 2L, 5),
                GT_ModHandler.getModItem("Forestry", "alveary", 2L, 6),
                GT_ModHandler.getModItem("Forestry", "alveary", 2L, 7),
                GT_ModHandler.getModItem("Forestry", "alveary", 4L, 0), ItemList.Field_Generator_HV.get(4)
        }, GT_ModHandler.getModItem("gendustry", "IndustrialApiary", 1L, 0), null, 60 * 20, 1024);

    }

    private void assembler() {
        GT_Values.RA.addAssemblerRecipe(CoreItems2.getRecipe(146, 1),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 1),
                Materials.Mutagen.getFluid(100L), GT_ModHandler.getModItem("gendustry", "UpgradeFrame", 1L),
                400, 7680);
        // --- Genetics Processor
        GT_Values.RA.addAssemblerRecipe(GT_ItemList.GeneticCircuit.get(1),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 1),
                Materials.Mutagen.getFluid(500L),
                GT_ModHandler.getModItem("gendustry", "GeneticsProcessor", 1L), 400, 7680);
        // --- Environmental Processor
        GT_Values.RA.addAssemblerRecipe(GT_ItemList.EnvironmentalCircuit.get(1),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 1),
                Materials.Bacteria.getFluid(500L),
                GT_ModHandler.getModItem("gendustry", "EnvProcessor", 1L), 400, 7680);
        // --- Genetics Labware
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.StainlessSteel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Diamond, 2),
                        new ItemStack(Items.glass_bottle, 4)}, null,
                GT_ModHandler.getModItem("gendustry", "Labware", 1L), 200, 1920, true);
        // --- Item Ejector Cover
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HSSG, 1),
                GT_ModHandler.getModItem("IC2", "upgradeModule", 1L, 3),
                GT_ModHandler.getModItem("gendustry", "EjectCover", 1L), 200, 7680);
        // --- Item Import Cover
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HSSG, 1),
                GT_ModHandler.getModItem("IC2", "upgradeModule", 1L, 6),
                GT_ModHandler.getModItem("gendustry", "ImportCover", 1L), 200, 7680);
        // --- Item Sensor Cover
        GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.HSSG, 1),
                GT_ModHandler.getModItem("IC2", "upgradeModule", 1L, 5),
                GT_ModHandler.getModItem("gendustry", "ErrorSensorCover", 1L), 200, 7680);

    }
}
