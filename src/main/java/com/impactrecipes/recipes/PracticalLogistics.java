package com.impactrecipes.recipes;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

public class PracticalLogistics implements Runnable {

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED
            | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    @Override
    public void run() {
        handRecipe();
        assemblerRecipe();
    }

    private void handRecipe() {
        // --- Energy Reader
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "EnergyReader", 1L, 0),
                tBitMask, new Object[]{"SES", "TBT", "hRd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Cover_EnergyDetector, 'E', OrePrefixes.circuit.get(Materials.Basic),
                        'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Fluid Reader
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "FluidReader", 1L, 0),
                tBitMask, new Object[]{"SES", "TBT", "hRd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Cover_FluidDetector, 'E', OrePrefixes.circuit.get(Materials.Basic),
                        'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Item Reader
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "InventoryReader", 1L, 0),
                tBitMask, new Object[]{"SES", "TBT", "hRd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Cover_ItemDetector, 'E', OrePrefixes.circuit.get(Materials.Basic),
                        'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Info Reader
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "InfoReader", 1L, 0),
                tBitMask, new Object[]{"SES", "TBT", "hRd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Cover_Screen, 'E', OrePrefixes.circuit.get(Materials.Basic),
                        'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Data Modifier
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "DataModifier", 1L, 0),
                tBitMask, new Object[]{"SRS", "hBd", "STS", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Cover_Screen, 'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Info Creator
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "InfoCreator", 1L, 0),
                tBitMask, new Object[]{"SRS", " T ", "hBd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Cover_Screen, 'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Channel Selector
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "ChannelSelector", 1L, 0),
                tBitMask, new Object[]{"SRS", "hBd", "STS", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Cover_Screen, 'T', GT_ModHandler.getModItem("PracticalLogistics", "MultiCable", 1L)});
        // --- Holographic Display
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "HolographicDisplay", 1L, 0),
                tBitMask, new Object[]{" G ", "WCW", " T ", 'W', OrePrefixes.wireFine.get(Materials.Cobalt), 'C', OrePrefixes.circuit.get(Materials.Basic),
                        'G', "paneGlass", 'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "HolographicDisplay", 1L, 0),
                tBitMask, new Object[]{" G ", "WCW", " T ", 'W', OrePrefixes.wireFine.get(Materials.Cobalt), 'C', OrePrefixes.circuit.get(Materials.Basic),
                        'G', GT_ModHandler.getModItem("TConstruct", "GlassPane", 1L),
                        'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Item Router
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "ItemRouter", 1L, 0),
                tBitMask, new Object[]{"SES", "TBT", "hRd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', "craftingFilter", 'E', OrePrefixes.circuit.get(Materials.Basic),
                        'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Entity Node
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "EntityNode", 1L, 0),
                tBitMask, new Object[]{"SRS", " T ", "hBd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Sensor_LV, 'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Node
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "Node", 1L, 0),
                tBitMask, new Object[]{"SRS", " T ", "hBd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Conveyor_Module_LV, 'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
        // --- Transceiver Array
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("PracticalLogistics", "TransceiverArray", 1L, 0),
                tBitMask, new Object[]{"SRS", " T ", "hBd", 'S', OrePrefixes.screw.get(Materials.Steel), 'B', OrePrefixes.frameGt.get(Materials.Steel),
                        'R', ItemList.Robot_Arm_LV, 'T', GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L)});
    }

    private void assemblerRecipe() {
        // --- Data Emitter
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("PracticalLogistics", "InfoReader", 1L, 0),
                        ItemList.Emitter_LV.get(1),
                        GT_ModHandler.getModItem("PracticalLogistics", "DataEmitter", 1L, 0), 200, 8);
        // --- Data Receiver
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("PracticalLogistics", "InfoReader", 1L, 0),
                        ItemList.Sensor_LV.get(1),
                        GT_ModHandler.getModItem("PracticalLogistics", "DataReceiver", 1L, 0), 200, 8);
        // --- Transceiver
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("IC2", "itemFreq", 1L, 0),
                GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L),
                GT_ModHandler.getModItem("PracticalLogistics", "Transceiver", 1L, 0), 200, 8);
        // --- Redstone Signaller
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "redstone_torch", 1L),
                GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L),
                GT_ModHandler.getModItem("PracticalLogistics", "RedstoneSignaller_OFF", 1L), 200, 8);
        // --- Data Cable
        GT_Values.RA
                .addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.Cobalt, 1L),
                        GT_ModHandler.getModItem("EnderIO", "itemMaterial", 4L, 1),
                        GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L, 0), 100, 8);
        // --- Channelled Cable
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 8L),
                        GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Steel, 2),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 1),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("PracticalLogistics", "MultiCable", 1L), 200, 8);
        // --- Clock
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("ExtraUtilities", "timer", 1L),
                GT_ModHandler.getModItem("PracticalLogistics", "DataCable", 1L),
                GT_ModHandler.getModItem("PracticalLogistics", "Clock", 1L, 0), 200, 8);
        // --- Display Screen
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Cover_Screen.get(1),
                        GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Cobalt, 2),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Silicon, 4)}, null,
                GT_ModHandler.getModItem("PracticalLogistics", "DisplayScreenItem", 1L, 0), 200, 8);
        // --- Large Display Screen
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("PracticalLogistics", "DisplayScreenItem", 2L, 0),
                GT_Utility.getIntegratedCircuit(1),
                GT_ModHandler.getModItem("PracticalLogistics", "LargeDisplayScreen", 1L, 0), 100, 8);
    }


}
