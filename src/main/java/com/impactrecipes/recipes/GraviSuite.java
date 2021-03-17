package com.impactrecipes.recipes;

import com.impact.common.item.Core_Items2;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class GraviSuite implements Runnable {

    final Core_Items2 CoreItems2 = Core_Items2.getInstance();

    @Override
    public void run() {
        printer3d();
        assemblyLine();
    }

    private void printer3d() {
        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        GT_ModHandler.getIC2Item("quantumBodyarmor", 1L, GT_Values.W), ItemList.Transformer_ZPM_LuV.get(1L),
                        GT_ModHandler.getModItem("GraviSuite", "ultimateLappack", 1, GT_Values.W),
                        GT_ModHandler.getModItem("GraviSuite", "itemSimpleItem", 6, 1),
                        GT_ModHandler.getModItem("GraviSuite", "itemSimpleItem", 2, 2),
                        GT_ModHandler.getModItem("GraviSuite", "itemSimpleItem", 2, 3),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 2),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Duranium, 2),
                        ItemList.Energy_LapotronicOrb2.get(1L), ItemList.Field_Generator_IV.get(2L),
                        ItemList.Electric_Motor_ZPM.get(2L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Duranium, 4)
                }, GT_ModHandler.getModItem("GraviSuite", "graviChestPlate", 1, 27), null, 50 * 20,
                30720);

        //K2P4
        GT_Values.RA.addBasicLineRecipe(new ItemStack[]{
                        GT_ModHandler.getModItem("GraviSuite", "graviChestPlate", 1, GT_Values.W),
                        ItemList.Transformer_UV_ZPM.get(1L),
                        GT_ModHandler.getModItem("GraviSuite", "epicLappack", 1, GT_Values.W),
                        GT_ModHandler.getModItem("GraviSuite", "itemSimpleItem", 8, 1),
                        CoreItems2.getRecipe(98, 4), GT_ModHandler.getModItem("GraviSuite", "itemSimpleItem", 2, 7),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 2),
                        GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Tritanium, 2),
                        ItemList.Energy_Module.get(1L), ItemList.Field_Generator_LuV.get(2L),
                        ItemList.Electric_Motor_UV.get(2L),
                        GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Tritanium, 8)
                }, GT_ModHandler.getModItem("GraviSuite", "kpChestPlate", 1, 27), null, 60 * 20,
                122880);
    }

    private void assemblyLine() {
        // --- Relocator
        GT_Values.RA.addAssemblylineRecipe(ItemList.Casing_Coil_Superconductor.get(1L), 288000, new Object[]{
                ItemList.Casing_Coil_Superconductor.get(1L),
                GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockSpatialIOPort", 1),
                ItemList.Field_Generator_IV.get(4L),
                ItemList.Sensor_LuV.get(8L),
                ItemList.Emitter_LuV.get(8L),
                GT_ModHandler.getModItem("appliedenergistics2", "tile.BlockSpatialPylon", 8),
                new Object[]{OrePrefixes.circuit.get(Materials.Master), 8L},
                ItemList.Circuit_Wafer_NPIC.get(32L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Europium, 64L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Europium, 64L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Europium, 64L),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Europium, 64L)
        }, new FluidStack[]{
                Materials.NiobiumTitanium.getMolten(1440L),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 2000),
                Materials.Enderium.getMolten(2880L)
        }, GT_ModHandler.getModItem("GraviSuite", "relocator", 1, 26), 8000, 28600);
    }
}
