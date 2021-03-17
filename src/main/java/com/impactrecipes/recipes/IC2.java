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
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import static com.impact.common.item.Core_List_Items.NeutronReflectorParts;
import static com.impact.common.item.Core_List_Items.NeutronReflectorSmallParts;

public class IC2 implements Runnable {

    final Core_Items2 CoreItems2 = Core_Items2.getInstance();
    final Core_Items CoreItems = Core_Items.getInstance();

    @Override
    public void run() {
        compactGens(); //компакт гены
        thermalCentrifuge();
        printer3d();
        packager();
        formingPress();
        fluidCanner();
        extruder();
        assembler();
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
        //Nuclear Reactor
        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                ItemList.Hull_IV.get(1L), ItemList.Robot_Arm_IV.get(2L),
                GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Titanium, 4),
                GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 4),
                GT_ModHandler.getModItem("IC2", "blockReactorChamber", 4L, 0), CoreItems2.getRecipe(141, 8),
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 12)
        }, GT_ModHandler.getModItem("IC2", "blockGenerator", 1L, 5), null, 40 * 20, 1920);

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
}
