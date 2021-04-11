package com.impactrecipes.recipes;

import com.impact.common.item.Core_Items;
import com.impact.common.item.Core_Items2;
import cpw.mods.fml.common.Loader;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import static com.impact.common.item.Core_List_Items.NeutronReflectorParts;
import static com.impact.common.item.Core_List_Items.NeutronReflectorSmallParts;
import static gregtech.api.enums.GT_Values.RA;
import static gregtech.api.util.GT_ModHandler.removeRecipeByOutput;

public class IC2 implements Runnable {

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    final Core_Items2 CoreItems2 = Core_Items2.getInstance();
    final Core_Items CoreItems = Core_Items.getInstance();

    @Override
    public void run() {
        removeIC2();
        removeCompactGen();
        hand();
        compactGens(); //компакт гены
        thermalCentrifuge();
        printer3d();
        packager();
        formingPress();
        fluidCanner();
        extruder();
        assembler();
        disassembler();
    }

    private void removeIC2() {
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockGenerator", 1L, 5), true, false,
                false);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockGenerator", 1L, 9), true, false,
                false);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockKineticGenerator", 1L, 0), true,
                false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockKineticGenerator", 1L, 4), true,
                false, false);
        removeRecipeByOutput(GT_ModHandler.getIC2Item("nanoHelmet", 1, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getIC2Item("nanoBodyarmor", 1, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getIC2Item("nanoLeggings", 1, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getIC2Item("nanoBoots", 1, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getIC2Item("quantumHelmet", 1, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getIC2Item("quantumBodyarmor", 1, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getIC2Item("quantumLeggings", 1, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getIC2Item("quantumBoots", 1, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "itemBatChargeRE", 1L, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "itemBatChargeAdv", 1L, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "itemBatChargeCrystal", 1L, GT_Values.W));
        removeRecipeByOutput(
                GT_ModHandler.getModItem("IC2", "itemBatChargeLamaCrystal", 1L, GT_Values.W));
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorReflectorThick", 1L, 1), true,
                false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorPlating", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorPlatingHeat", 1L, 0), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorPlatingExplosive", 1L, 0), true,
                false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorVent", 1L, 1), true, false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorVentCore", 1L, 1), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorVentGold", 1L, 1), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorVentSpread", 1L), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorVentDiamond", 1L, 1), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorHeatSwitch", 1L, 1), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorHeatSwitchCore", 1L, 1), true,
                false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorHeatSwitchSpread", 1L, 1), true,
                false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorHeatSwitchDiamond", 1L, 1), true,
                false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorCoolantSimple", 1L, 1), true,
                false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorCoolantTriple", 1L, 1), true,
                false, true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorCoolantSix", 1L, 1), true, false,
                true);
        // --- Recrafting Iron Scaffold
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockIronScaffold", 1L), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "itemTreetapElectric", 1, GT_Values.W), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "itemToolHoe", 1, GT_Values.W), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "itemRecipePart", 1, 3), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockChargepad", 1L), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockChargepad", 1L, 1), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockChargepad", 1L, 2), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "blockChargepad", 1L, 3), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "itemMOX", 1L), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "itemUran", 1L), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorUraniumSimple", 1L), true, false,
                true);
        removeRecipeByOutput(GT_ModHandler.getModItem("IC2", "reactorMOXSimple", 1L), true, false,
                true);
    }

    private void removeCompactGen() {
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 0),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 1),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 2),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 3),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 4),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 5),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 6),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 7),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 8),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 9),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 10),
                true, false, false);
        removeRecipeByOutput(GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 11),
                true, false, false);
        removeRecipeByOutput(
                GT_ModHandler.getModItem("compactkineticgenerators", "IridiumRotor", 1L, 0), true, false,
                true);
        removeRecipeByOutput(
                GT_ModHandler.getModItem("compactkineticgenerators", "IridiumBlade", 1L, 0), true, false,
                true);
    }

    private void hand() {
        // --- Frequency Transmitter
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "itemFreq", 1L, 0), tBitMask, new Object[]{" S ", "PBP", " C ", 'C', OrePrefixes.circuit.get(Materials.Basic), 'P', OrePrefixes.itemCasing.get(Materials.Iron), 'B', GT_ModHandler.getModItem("minecraft", "stone_button", 1L, 0), 'S', ItemList.Sensor_LV});
        // --- Heat Vent
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorVent", 1L, 1), tBitMask, new Object[]{"PBP", "BwB", "PBP", 'P', OrePrefixes.plate.get(Materials.Aluminium), 'B', new ItemStack(Blocks.iron_bars)});
        // --- Reactor Heat Vent
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorVentCore", 1L, 1), tBitMask, new Object[]{"CSC", "SVS", "CSC", 'C', OrePrefixes.plateDouble.get(Materials.Copper), 'S', OrePrefixes.plate.get(Materials.Silver), 'V', GT_ModHandler.getModItem("IC2", "reactorVent", 1L, 1)});
        // --- Advanced Heat Vent
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorVentDiamond", 1L, 1), tBitMask, new Object[]{"BVB", "BDB", "BVB", 'D', OrePrefixes.gem.get(Materials.Diamond), 'V', GT_ModHandler.getModItem("IC2", "reactorVentCore", 1L, 1), 'B', CoreItems2.getRecipe(51, 1)});
        // --- Overclocked Heat Vent
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorVentGold", 1L, 1), tBitMask, new Object[]{"CSC", "SVS", "CSC", 'C', OrePrefixes.screw.get(Materials.StainlessSteel), 'S', OrePrefixes.plate.get(Materials.Gold), 'V', GT_ModHandler.getModItem("IC2", "reactorVentDiamond", 1L, 1)});
        // --- Component Heat Vent
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorVentSpread", 1L, 0), tBitMask, new Object[]{"CSC", "SVS", "CSC", 'C', CoreItems2.getRecipe(51, 1), 'S', OrePrefixes.plateDense.get(Materials.Tin), 'V', GT_ModHandler.getModItem("IC2", "reactorVent", 1L, 1)});
        // --- Heat Exchanger
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorHeatSwitch", 1L, 1), tBitMask, new Object[]{"COC", "SVS", "CSC", 'C', OrePrefixes.plate.get(Materials.Silver), 'S', OrePrefixes.plate.get(Materials.Aluminium), 'V', OrePrefixes.plate.get(Materials.Copper), 'O', OrePrefixes.circuit.get(Materials.Basic)});
        // --- Reactor Heat Exchanger
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorHeatSwitchCore", 1L, 1), tBitMask, new Object[]{"CSC", "SVS", "CSC", 'C', OrePrefixes.plateDouble.get(Materials.Copper), 'S', OrePrefixes.plate.get(Materials.Silver), 'V', GT_ModHandler.getModItem("IC2", "reactorHeatSwitch", 1L, 1)});
        // --- Component Heat Exchanger
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorHeatSwitchSpread", 1L, 1), tBitMask, new Object[]{"CSC", "SVS", "CSC", 'C', OrePrefixes.screw.get(Materials.StainlessSteel), 'S', OrePrefixes.plate.get(Materials.Gold), 'V', GT_ModHandler.getModItem("IC2", "reactorHeatSwitchCore", 1L, 1)});
        // --- Advanced Heat Exchanger
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "reactorHeatSwitchDiamond", 1L, 1), tBitMask, new Object[]{"LCL", "VDV", "LCL", 'L', OrePrefixes.plate.get(Materials.Lapis), 'D', OrePrefixes.plate.get(Materials.Diamond), 'C', OrePrefixes.circuit.get(Materials.Advanced), 'V', GT_ModHandler.getModItem("IC2", "reactorHeatSwitchSpread", 1L, 1)});
        // --- Recrafting Iron Scaffold
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2", "blockIronScaffold", 1L), new Object[]{"L", 'L', OrePrefixes.frameGt.get(Materials.Steel)});
        // --- Recrafting Iron Scaffold
        GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Steel, 1L), new Object[]{"L", 'L', GT_ModHandler.getModItem("IC2", "blockIronScaffold", 1L)});
        // --- Electric Treetap
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2","itemTreetapElectric",1, 26),tBitMask,
                new Object[] {"dRD","RPB","ECS",'R', OrePrefixes.stickLong.get(Materials.Steel),'D', OrePrefixes.toolHeadDrill.get(Materials.Steel),
                        'P',ItemList.Electric_Pump_LV,'B', OrePrefixes.battery.get(Materials.Basic),
                        'E',GT_ModHandler.getModItem("IC2","itemRecipePart",1,3),'C', OrePrefixes.cableGt01.get(Materials.Tin),
                        'S', OrePrefixes.screw.get(Materials.Steel)});
        // --- Electric Hoe
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2","itemToolHoe",1, 26),tBitMask,
                new Object[] {"dPH","PGB","ECS", 'S', OrePrefixes.screw.get(Materials.Steel),'H', OrePrefixes.toolHeadHoe.get(Materials.Steel),
                        'G', OrePrefixes.gearGtSmall.get(Materials.Steel),'B', OrePrefixes.battery.get(Materials.Basic),
                        'E',GT_ModHandler.getModItem("IC2","itemRecipePart",1,3), 'P', OrePrefixes.plate.get(Materials.Steel),
                        'C', OrePrefixes.cableGt01.get(Materials.Tin)});
        // --- Small Power Unit
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2","itemRecipePart",1, 3),tBitMask,
                new Object[] {"WPW","PdP","CMC",'W', OrePrefixes.cableGt01.get(Materials.Copper),'P', OrePrefixes.itemCasing.get(Materials.Steel),
                        'M',ItemList.Electric_Motor_LV, 'C', OrePrefixes.circuit.get(Materials.Basic)});
        // --- Charge Pad Bat Box
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2","blockChargepad",1, 0),tBitMask,
                new Object[] {"SHS","COC","PdP",'S', OrePrefixes.screw.get(Materials.Iron),'P', OrePrefixes.itemCasing.get(Materials.Iron),
                        'C', OrePrefixes.circuit.get(Materials.Basic), 'H', GT_ModHandler.getModItem("minecraft","wooden_pressure_plate",1,0),
                        'O', GT_ModHandler.getModItem("IC2","blockElectric",1,0)});
        // --- Charge Pad CESU
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2","blockChargepad",1, 1),tBitMask,
                new Object[] {"SHS","COC","PdP",'S', OrePrefixes.screw.get(Materials.Steel),'P', OrePrefixes.itemCasing.get(Materials.Steel),
                        'C', OrePrefixes.circuit.get(Materials.Good), 'H', GT_ModHandler.getModItem("minecraft","stone_pressure_plate",1,0),
                        'O', GT_ModHandler.getModItem("IC2","blockElectric",1,7)});
        // --- Charge Pad MFE
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2","blockChargepad",1, 2),tBitMask,
                new Object[] {"SHS","COC","PdP",'S', OrePrefixes.screw.get(Materials.Aluminium),'P', OrePrefixes.itemCasing.get(Materials.Aluminium),
                        'C', OrePrefixes.circuit.get(Materials.Advanced), 'H', GT_ModHandler.getModItem("minecraft","heavy_weighted_pressure_plate",1,0),
                        'O', GT_ModHandler.getModItem("IC2","blockElectric",1,1)});
        // --- Charge Pad MFSU
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("IC2","blockChargepad",1, 3),tBitMask,
                new Object[] {"SHS","COC","PdP",'S', OrePrefixes.screw.get(Materials.StainlessSteel),'P', OrePrefixes.itemCasing.get(Materials.StainlessSteel),
                        'C', OrePrefixes.circuit.get(Materials.Data), 'H', GT_ModHandler.getModItem("minecraft","light_weighted_pressure_plate",1,0),
                        'O', GT_ModHandler.getModItem("IC2","blockElectric",1,2)});

    }

    private void thermalCentrifuge() {
        GT_ModHandler.addThermalCentrifugeRecipe(GT_ModHandler.getModItem("IC2", "reactorMOXSimpledepleted", 1L),
                5000, GT_ModHandler.getModItem("IC2", "itemPlutoniumSmall", 1L),
                GT_ModHandler.getModItem("IC2", "itemPlutonium", 3L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Zirconium, 1L));
        GT_ModHandler.addThermalCentrifugeRecipe(GT_ModHandler.getModItem("IC2", "reactorMOXDualdepleted", 1L),
                5000, GT_ModHandler.getModItem("IC2", "itemPlutoniumSmall", 2L),
                GT_ModHandler.getModItem("IC2", "itemPlutonium", 6L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Zirconium, 3L));
        GT_ModHandler.addThermalCentrifugeRecipe(GT_ModHandler.getModItem("IC2", "reactorMOXQuaddepleted", 1L),
                5000, GT_ModHandler.getModItem("IC2", "itemPlutoniumSmall", 4L),
                GT_ModHandler.getModItem("IC2", "itemPlutonium", 12L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Zirconium, 6L));
        GT_ModHandler.addThermalCentrifugeRecipe(GT_ModHandler.getModItem("IC2", "reactorUraniumSimpledepleted", 1L),
                5000, GT_ModHandler.getModItem("IC2", "itemPlutoniumSmall", 1L),
                GT_ModHandler.getModItem("IC2", "itemUran238", 4L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Zirconium, 1L));
        GT_ModHandler.addThermalCentrifugeRecipe(GT_ModHandler.getModItem("IC2", "reactorUraniumDualdepleted", 1L),
                5000, GT_ModHandler.getModItem("IC2", "itemPlutoniumSmall", 2L),
                GT_ModHandler.getModItem("IC2", "itemUran238", 8L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Zirconium, 3L));
        GT_ModHandler.addThermalCentrifugeRecipe(GT_ModHandler.getModItem("IC2", "reactorUraniumQuaddepleted", 1L),
                5000, GT_ModHandler.getModItem("IC2", "itemPlutoniumSmall", 4L),
                GT_ModHandler.getModItem("IC2", "itemUran238", 16L),
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Zirconium, 6L));
    }

    private void printer3d() {
        //Kinetic Generator
        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Hatch_Dynamo_HV.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Aluminium, 2),
                GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Titanium, 2),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 2),
                ItemList.Electric_Motor_HV.get(2L), ItemList.Casing_Motor.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HSLA, 6)
        }, GT_ModHandler.getModItem("IC2", "blockGenerator", 1L, 9), null, 10 * 20, 480);

        //Kinetic Wind Generator
        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Casing_Gearbox_Steel.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Aluminium, 2),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Titanium, 2),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 2),
                ItemList.Electric_Motor_HV.get(2L),
                GT_ModHandler.getModItem("IC2", "itemRecipePart", 4, 12),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HSLA, 6)
        }, GT_ModHandler.getModItem("IC2", "blockKineticGenerator", 1L, 0), null, 10 * 20, 480);

        //Kinetic Water Generator
        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                ItemList.Casing_Gearbox_Steel.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Aluminium, 2),
                GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Titanium, 2),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 2),
                ItemList.Electric_Pump_HV.get(2L), GT_ModHandler.getModItem("IC2", "itemRecipePart", 4, 12),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HSLA, 6)
        }, GT_ModHandler.getModItem("IC2", "blockKineticGenerator", 1L, 4), null, 10 * 20, 480);
    }

    private void packager() {
        GT_Values.RA.
                addBoxingRecipe(CoreItems.getRecipe(29, 4), ItemList.Schematic_Dust.get(0L),
                        GT_ModHandler.getModItem("IC2", "itemFertilizer", 1L), 100, 4);
        GT_Values.RA.
                addBoxingRecipe(CoreItems.getRecipe(30, 9), ItemList.Schematic_Dust.get(0L),
                        GT_ModHandler.getModItem("IC2", "itemFertilizer", 1L), 100, 4);

    }

    private void formingPress() {
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Advanced, 4L),
                GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Lead, 1L),
                GT_ModHandler.getModItem("IC2", "reactorPlating", 1L, 0), 200, 256);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Copper, 1L),
                GT_ModHandler.getModItem("IC2", "reactorPlating", 1L, 0),
                GT_ModHandler.getModItem("IC2", "reactorPlatingHeat", 1L, 0), 220, 480);
        GT_Values.RA.addFormingPressRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Advanced, 8L),
                GT_ModHandler.getModItem("IC2", "reactorPlating", 1L, 0),
                GT_ModHandler.getModItem("IC2", "reactorPlatingExplosive", 1L, 0), 220, 480);

    }

    private void fluidCanner() {

        GT_Values.RA.addFluidCannerRecipe(CoreItems2.getRecipe(143, 1),
                GT_ModHandler.getModItem("IC2", "reactorCoolantSimple", 1L, 1),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 1000), GT_Values.NF);
        GT_Values.RA.addFluidCannerRecipe(CoreItems2.getRecipe(144, 1),
                GT_ModHandler.getModItem("IC2", "reactorCoolantTriple", 1L, 1),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 3000), GT_Values.NF);
        GT_Values.RA.addFluidCannerRecipe(CoreItems2.getRecipe(145, 1),
                GT_ModHandler.getModItem("IC2", "reactorCoolantSix", 1L, 1),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 6000), GT_Values.NF);
    }

    private void extruder() {
        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Iron, 1),
                ItemList.Shape_Extruder_Shaft.get(0L),
                GT_ModHandler.getIC2Item("itemRecipePart", 1L, 11), 2000, 120);
        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Steel, 1),
                ItemList.Shape_Extruder_Shaft.get(0L),
                GT_ModHandler.getIC2Item("itemRecipePart", 1L, 12), 2000, 480);
        GT_Values.RA.addExtruderRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Zirconium, 1),
                ItemList.Shape_Extruder_Cell.get(0L),
                GT_ModHandler.getIC2Item("fuelRod", 1), 200, 120);
    }

    private void assembler() {
        //Quantum Armor Parts
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getIC2Item("nanoBoots", 1L, GT_Values.W),
                CoreItems2.getRecipe(52, 4), CoreItems2.getRecipe(41, 1), 1200, 1920);
        GT_Values.RA.addAssemblerRecipe(Loader.isModLoaded("GraviSuite") ? GT_ModHandler
                        .getModItem("GraviSuite", "advNanoChestPlate", 1, GT_Values.W)
                        : GT_ModHandler.getIC2Item("nanoBodyarmor", 1L, GT_Values.W), CoreItems2.getRecipe(52, 8),
                CoreItems2.getRecipe(42, 1), 1200, 1920);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getIC2Item("nanoHelmet", 1L, GT_Values.W),
                CoreItems2.getRecipe(52, 5), CoreItems2.getRecipe(43, 1), 1200, 1920);
        GT_Values.RA.addAssemblerRecipe(CoreItems2.getRecipe(43, 1),
                GT_OreDictUnificator.get(OrePrefixes.lens, Materials.ReinforcedGlass, 8L),
                CoreItems2.getRecipe(44, 1), 1200, 1920);
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getIC2Item("nanoLeggings", 1L, GT_Values.W),
                CoreItems2.getRecipe(52, 7), CoreItems2.getRecipe(45, 1), 1200, 1920);

        //Nano Armor
        GT_Values.RA.addAssemblerRecipe(CoreItems2.getRecipe(137, 1), CoreItems2.getRecipe(100, 1),
                GT_ModHandler.getIC2Item("nanoHelmet", 1L, 27), 400, 120);
        GT_Values.RA.addAssemblerRecipe(CoreItems2.getRecipe(138, 1), CoreItems2.getRecipe(100, 1),
                GT_ModHandler.getIC2Item("nanoBodyarmor", 1L, 27), 400, 120);
        GT_Values.RA.addAssemblerRecipe(CoreItems2.getRecipe(139, 1), CoreItems2.getRecipe(100, 1),
                GT_ModHandler.getIC2Item("nanoLeggings", 1L, 27), 400, 120);
        GT_Values.RA.addAssemblerRecipe(CoreItems2.getRecipe(140, 1), CoreItems2.getRecipe(100, 1),
                GT_ModHandler.getIC2Item("nanoBoots", 1L, 27), 400, 120);

        // --- Charging Lapotron Crystal
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 1),
                        ItemList.Circuit_Parts_Crystal_Chip_Master.get(12),
                        GT_ModHandler.getModItem("IC2", "reactorHeatSwitchDiamond", 1L, 1)},
                Materials.SolderingAlloy.getMolten(1440L),
                GT_ModHandler.getModItem("IC2", "itemBatChargeLamaCrystal", 1L, 0), 200, 1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Tin, 4),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Graphite, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Steel, 1),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("IC2", "reactorReflector", 1L, 1), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TinAlloy, 6),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Graphite, 2),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Beryllium, 1),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("IC2", "reactorReflector", 1L, 1), 100, 16);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Tin, 16),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Graphite, 16),
                        GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Carbon, 6),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Steel, 4),
                        GT_Utility.getIntegratedCircuit(2)}, null, CoreItems2.getRecipe(141, 1), 120, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.plate, Materials.TinAlloy, 24),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Graphite, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Carbon, 6),
                        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Beryllium, 4),
                        GT_Utility.getIntegratedCircuit(2)}, null, CoreItems2.getRecipe(141, 1), 120, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(NeutronReflectorSmallParts.getMetaID(), 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Beryllium, 2),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("IC2", "reactorReflectorThick", 1L, 1), 600, 64);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(NeutronReflectorSmallParts.getMetaID(), 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.TungstenCarbide, 1),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("IC2", "reactorReflectorThick", 1L, 1), 600, 64);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(NeutronReflectorSmallParts.getMetaID(), 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Beryllium, 16),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                CoreItems2.getRecipe(NeutronReflectorParts.getMetaID(), 1), 400, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(NeutronReflectorSmallParts.getMetaID(), 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.TungstenCarbide, 8),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                CoreItems2.getRecipe(NeutronReflectorParts.getMetaID(), 1), 400, 256);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{CoreItems2.getRecipe(NeutronReflectorParts.getMetaID(), 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Iridium, 1)}, null,
                ItemList.Neutron_Reflector.get(1), 1200, 256);
        // --- Mox Nuclear Fuel
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("IC2", "itemUran238", 6L),
                GT_ModHandler.getModItem("IC2", "itemPlutonium", 3L),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 1000),
                GT_ModHandler.getModItem("IC2", "itemMOX", 1L), 400, 256);
        // --- Enriched Uranium Nuclear Fuel
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("IC2", "itemUran238", 6L),
                GT_ModHandler.getModItem("IC2", "itemUran235small", 3L),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 1000),
                GT_ModHandler.getModItem("IC2", "itemUran", 1L), 400, 120);


    }

    private void compactGens() {
        // --- Kinetic Gearbox Rotor (Iridium)
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("compactkineticgenerators", "IridiumRotor", 1L, 0), tBitMask, new Object[]{"dBS", "BAB", "SBw", 'S', OrePrefixes.screw.get(Materials.Lafium), 'B', GT_ModHandler.getModItem("compactkineticgenerators", "IridiumBlade", 1L, 0), 'A', GT_ModHandler.getModItem("IC2", "itemRecipePart", 1L, 12)});
        // --- Iridium Rotor Blade
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("compactkineticgenerators", "IridiumBlade", 1L, 0), tBitMask, new Object[]{"PPP", "PRP", "PPP", 'R', OrePrefixes.ring.get(Materials.Lafium), 'P', GT_ModHandler.getModItem("IC2", "itemPartIridium", 1L, 0)});

        //Wind Generator
        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                        ItemList.Hull_EV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Tungsten, 2),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Desh, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 2),
                        ItemList.Electric_Motor_EV.get(2L),
                        GT_ModHandler.getModItem("IC2", "blockKineticGenerator", 2, 0),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.TungstenSteel, 6)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 0), null, 20 * 20,
                1024);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hull_IV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt04, Materials.HSSG, 2),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Trinium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 2),
                        ItemList.Electric_Motor_IV.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 2L, 0),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HastelloyN, 8)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 1), null, 30 * 20,
                4096);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hull_LuV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt08, Materials.VanadiumGallium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Draconium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 2),
                        ItemList.Electric_Motor_LuV.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 2L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Lafium, 10)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 2), null, 40 * 20,
                16384);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hull_ZPM.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt12, Materials.Duranium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Oriharukon, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 2),
                        ItemList.Electric_Motor_ZPM.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 2L, 2),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.CinobiteA243, 12)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 3), null, 50 * 20,
                65536);

        //Water Generator
        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                        ItemList.Hull_EV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Tungsten, 2),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Desh, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 2),
                        ItemList.Electric_Pump_EV.get(2L),
                        GT_ModHandler.getModItem("IC2", "blockKineticGenerator", 2, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.TungstenSteel, 6)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 4), null, 20 * 20,
                1024);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hull_IV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt04, Materials.HSSG, 2),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Trinium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 2),
                        ItemList.Electric_Pump_IV.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 2L, 4),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HastelloyN, 8)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 5), null, 30 * 20,
                4096);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hull_LuV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt08, Materials.VanadiumGallium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Draconium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 2),
                        ItemList.Electric_Pump_LuV.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 2L, 5),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Lafium, 10)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 6), null, 40 * 20,
                16384);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hull_ZPM.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt12, Materials.Duranium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.rotor, Materials.Oriharukon, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 2),
                        ItemList.Electric_Pump_ZPM.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 2L, 6),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.CinobiteA243, 12)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 7), null, 50 * 20,
                65536);

        //Kinetic Generator
        GT_Values.RA.addPrimitiveLineRecipe(new ItemStack[]{
                        ItemList.Hatch_Dynamo_EV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Tungsten, 2),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Desh, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 2),
                        ItemList.Electric_Motor_EV.get(2L), GT_ModHandler.getModItem("IC2", "blockGenerator", 1, 9),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.TungstenSteel, 6)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 8), null, 20 * 20,
                1024);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hatch_Dynamo_IV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt04, Materials.HSSG, 2),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Trinium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 2),
                        ItemList.Electric_Motor_IV.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.HastelloyN, 8)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 9), null, 30 * 20,
                4096);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hatch_Dynamo_LuV.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt08, Materials.VanadiumGallium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Draconium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 2),
                        ItemList.Electric_Motor_LuV.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 9),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.Lafium, 10)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 10), null, 40 * 20,
                16384);

        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        ItemList.Hatch_Dynamo_ZPM.get(1L),
                        GT_OreDictUnificator.get(OrePrefixes.cableGt12, Materials.Duranium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.gearGtSmall, Materials.Oriharukon, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 2),
                        ItemList.Electric_Motor_ZPM.get(2L),
                        GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 10),
                        GT_OreDictUnificator.get(OrePrefixes.plateDouble, Materials.CinobiteA243, 12)
                }, GT_ModHandler.getModItem("compactkineticgenerators", "BlockCkg", 1L, 11), null, 50 * 20,
                65536);
    }

    public void disassembler() {
        // --- Reactor Chamber
        RA.addDisassemblerRecipe(GT_ModHandler.getModItem("IC2", "blockReactorChamber", 1L, 0),
                new ItemStack[]{
                        ItemList.Hull_EV.get(1), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lead, 4)
                }, 2000, 256);

        // --- Nuclear Reactor
        RA.addDisassemblerRecipe(GT_ModHandler.getModItem("IC2", "blockGenerator", 1L, 5),
                new ItemStack[]{
                        ItemList.Hull_IV.get(1L), ItemList.Robot_Arm_IV.get(2L),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Titanium, 4),
                        ItemList.Circuit_Data.get(4),
                        GT_ModHandler.getModItem("IC2", "blockReactorChamber", 4L, 0), CoreItems2.getRecipe(141, 8),
                        GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 12)
                }, 400 * 20, 1920);
    }
}
