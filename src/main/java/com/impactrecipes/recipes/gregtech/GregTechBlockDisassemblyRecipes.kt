package com.impactrecipes.recipes.gregtech

import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.ItemList
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_OreDictUnificator
import net.minecraft.init.Blocks
import net.minecraft.item.ItemStack

/** Explicit block recipes do not require GT.CraftingComponents on crafted items. */
internal class GregTechBlockDisassemblyRecipes {

    internal fun register() {
        registerTransformers()
        registerWetTransformers()
        registerBatteryBuffers()
        registerChamberCasings()
    }

    private fun registerTransformers() {
        MachineRecipes.disassembler(
            input = ItemList.Transformer_LV_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Tin,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Lead,
                    4L,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_MV_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Copper,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Tin,
                    4L,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HV_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Gold,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Copper,
                    4L,
                ),
                ItemList.Circuit_Parts_Coil.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_EV_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Aluminium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Gold,
                    4L,
                ),
                ItemList.Circuit_Chip_ULPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_IV_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Tungsten,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Aluminium,
                    4L,
                ),
                ItemList.Circuit_Chip_LPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_LuV_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.VanadiumGallium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Tungsten,
                    4L,
                ),
                ItemList.Circuit_Chip_PIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_ZPM_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.Naquadah,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt01,
                    Materials.VanadiumGallium,
                    4L,
                ),
                ItemList.Circuit_Chip_HPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_UV_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt04,
                    Materials.NaquadahAlloy,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt02,
                    Materials.Naquadah,
                    4L,
                ),
                ItemList.Circuit_Chip_UHPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_MAX_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Europium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.cableGt04,
                    Materials.NaquadahAlloy,
                    4L,
                ),
                ItemList.Circuit_Chip_NPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_UEV_UHV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Diamericiumtitanium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Europium,
                    4L,
                ),
                ItemList.Circuit_Chip_PPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_UIV_UEV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UEV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Neutronium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Diamericiumtitanium,
                    4L,
                ),
                ItemList.Circuit_Chip_QPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_UMV_UIV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UIV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Quantium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Neutronium,
                    4L,
                ),
                ItemList.Circuit_Chip_FPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_UXV_UMV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UMV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt12,
                    Materials.BlackPlutonium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Quantium,
                    4L,
                ),
                ItemList.Circuit_Chip_FPIC.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_LV_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_LV_ULV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Tin,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Lead,
                    4L,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_MV_LV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_MV_LV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Copper,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Tin,
                    4L,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_HV_MV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_HV_MV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Gold,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Copper,
                    4L,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_EV_HV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_EV_HV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Aluminium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Gold,
                    4L,
                ),
                ItemList.Casing_Coil_Cupronickel.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_IV_EV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_IV_EV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Tungsten,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Aluminium,
                    4L,
                ),
                ItemList.Casing_Coil_Kanthal.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_LuV_IV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_LuV_IV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.VanadiumGallium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Tungsten,
                    4L,
                ),
                ItemList.Casing_Coil_Nichrome.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_ZPM_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_ZPM_LuV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Naquadah,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.VanadiumGallium,
                    4L,
                ),
                ItemList.Casing_Coil_TungstenSteel.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_UV_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_UV_ZPM.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.NaquadahAlloy,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Naquadah,
                    4L,
                ),
                ItemList.Casing_Coil_Naquadah.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_UHV_UV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_MAX_UV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Europium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.NaquadahAlloy,
                    4L,
                ),
                ItemList.Casing_Coil_NaquadahAlloy.get(2L),
                ItemList.Circuit_HighEnergyFlow.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_UEV_UHV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_UEV_UHV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Draconium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Europium,
                    4L,
                ),
                ItemList.Casing_Coil_Superconductor.get(2L),
                ItemList.Circuit_HighEnergyFlow.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_UIV_UEV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_UIV_UEV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Neutronium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Draconium,
                    4L,
                ),
                ItemList.Casing_Fusion_Coil.get(2L),
                ItemList.Circuit_HighEnergyFlow.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_UMV_UIV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_UMV_UIV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Quantium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Neutronium,
                    4L,
                ),
                ItemList.Casing_Fusion_Coil2.get(2L),
                ItemList.Circuit_HighEnergyFlow.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_HA_UXV_UMV.get(1L),
            outputs = arrayOf(
                ItemList.Transformer_UXV_UMV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.BlackPlutonium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Quantium,
                    4L,
                ),
                ItemList.Casing_Fusion_Coil3.get(2L),
                ItemList.Circuit_HighEnergyFlow.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_HV_MV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorMV,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.SuperconductorHV,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Good,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.Aluminium,
                    1L,
                ),
                ItemList.Electric_Motor_MV.get(1L),
                ItemList.WetTransformer_HV_MV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_EV_HV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorHV,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.SuperconductorEV,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Advanced,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.StainlessSteel,
                    1L,
                ),
                ItemList.Electric_Motor_HV.get(1L),
                ItemList.WetTransformer_EV_HV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_IV_EV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorEV,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.SuperconductorIV,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Data,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.Titanium,
                    1L,
                ),
                ItemList.Electric_Motor_EV.get(1L),
                ItemList.WetTransformer_IV_EV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_LuV_IV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorIV,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.SuperconductorLuV,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Elite,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.TungstenSteel,
                    1L,
                ),
                ItemList.Electric_Motor_IV.get(1L),
                ItemList.WetTransformer_LuV_IV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_ZPM_LuV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorLuV,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.SuperconductorZPM,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Master,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.Chrome,
                    1L,
                ),
                ItemList.Electric_Motor_LuV.get(1L),
                ItemList.WetTransformer_ZPM_LuV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_UV_ZPM.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorZPM,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.SuperconductorUV,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Ultimate,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.Iridium,
                    1L,
                ),
                ItemList.Electric_Motor_ZPM.get(1L),
                ItemList.WetTransformer_UV_ZPM.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_UHV_UV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorUV,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Superconductor,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Superconductor,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.Osmium,
                    1L,
                ),
                ItemList.Electric_Motor_UV.get(1L),
                ItemList.WetTransformer_UHV_UV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_UEV_UHV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Superconductor,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.SuperconductorUEV,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Infinite,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.NaquadahAlloy,
                    1L,
                ),
                ItemList.Electric_Motor_UHV.get(1L),
                ItemList.WetTransformer_UEV_UHV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Transformer_Ultra_UIV_UEV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorUEV,
                    4L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Neutronium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Bio,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.rotor,
                    Materials.Neutronium,
                    1L,
                ),
                ItemList.Electric_Motor_UEV.get(1L),
                ItemList.WetTransformer_UIV_UEV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerWetTransformers() {
        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_LV_ULV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Lead,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Lead,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Tin,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Tin,
                    1L,
                ),
                ItemList.Electric_Pump_LV.get(1L),
                ItemList.Transformer_HA_LV_ULV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_MV_LV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Tin,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Tin,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Copper,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Copper,
                    1L,
                ),
                ItemList.Electric_Pump_LV.get(1L),
                ItemList.Transformer_HA_MV_LV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_HV_MV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Copper,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Copper,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Gold,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Gold,
                    1L,
                ),
                ItemList.Electric_Pump_MV.get(1L),
                ItemList.Transformer_HA_HV_MV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_EV_HV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Gold,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Gold,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Aluminium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Aluminium,
                    1L,
                ),
                ItemList.Electric_Pump_MV.get(1L),
                ItemList.Transformer_HA_EV_HV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_IV_EV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Aluminium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Aluminium,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Tungsten,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Tungsten,
                    1L,
                ),
                ItemList.Electric_Pump_HV.get(1L),
                ItemList.Transformer_HA_IV_EV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_LuV_IV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Tungsten,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Tungsten,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.VanadiumGallium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.VanadiumGallium,
                    1L,
                ),
                ItemList.Electric_Pump_HV.get(1L),
                ItemList.Transformer_HA_LuV_IV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_ZPM_LuV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.VanadiumGallium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.VanadiumGallium,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Naquadah,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Naquadah,
                    1L,
                ),
                ItemList.Electric_Pump_EV.get(1L),
                ItemList.Transformer_HA_ZPM_LuV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_UV_ZPM.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Naquadah,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Naquadah,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.NaquadahAlloy,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.NaquadahAlloy,
                    1L,
                ),
                ItemList.Electric_Pump_EV.get(1L),
                ItemList.Transformer_HA_UV_ZPM.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_UHV_UV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.NaquadahAlloy,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.NaquadahAlloy,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Europium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Europium,
                    1L,
                ),
                ItemList.Electric_Pump_IV.get(1L),
                ItemList.Transformer_HA_UHV_UV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_UEV_UHV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Europium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Europium,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Diamericiumtitanium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Diamericiumtitanium,
                    1L,
                ),
                ItemList.Reactor_Coolant_He_1.get(2L),
                ItemList.Electric_Pump_IV.get(1L),
                ItemList.Transformer_HA_UEV_UHV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_UIV_UEV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Diamericiumtitanium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Diamericiumtitanium,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Neutronium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Neutronium,
                    1L,
                ),
                ItemList.Reactor_Coolant_He_3.get(2L),
                ItemList.Electric_Pump_LuV.get(1L),
                ItemList.Transformer_HA_UIV_UEV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_UMV_UIV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Neutronium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Neutronium,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.Quantium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Quantium,
                    1L,
                ),
                ItemList.Reactor_Coolant_He_6.get(2L),
                ItemList.Electric_Pump_LuV.get(1L),
                ItemList.Transformer_HA_UMV_UIV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.WetTransformer_UXV_UMV.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.springSmall,
                    Materials.Quantium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Quantium,
                    2L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.spring,
                    Materials.BlackPlutonium,
                    1L,
                ),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.BlackPlutonium,
                    1L,
                ),
                ItemList.Reactor_Coolant_Le_3.get(2L),
                ItemList.Electric_Pump_ZPM.get(1L),
                ItemList.Transformer_HA_UXV_UMV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerBatteryBuffers() {
        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Lead,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Tin,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Copper,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Gold,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Aluminium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Tungsten,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.VanadiumGallium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Naquadah,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.ElectrumFlux,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Superconductor,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_UEV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UEV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.SuperconductorUEV,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_UIV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UIV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Neutronium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_UMV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UMV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.Quantium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_1by1_UXV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UXV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt01,
                    Materials.BlackPlutonium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Lead,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Tin,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Copper,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Gold,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Aluminium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Tungsten,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.VanadiumGallium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Naquadah,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.ElectrumFlux,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Superconductor,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_UEV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UEV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.SuperconductorUEV,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_UIV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UIV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Neutronium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_UMV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UMV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.Quantium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_2by2_UXV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UXV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt04,
                    Materials.BlackPlutonium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Lead,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Tin,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Copper,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Gold,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Aluminium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Tungsten,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.VanadiumGallium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Naquadah,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.ElectrumFlux,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Superconductor,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_UEV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UEV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.SuperconductorUEV,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_UIV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UIV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Neutronium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_UMV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UMV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.Quantium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_3by3_UXV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UXV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt08,
                    Materials.BlackPlutonium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Lead,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Tin,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Copper,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Gold,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Aluminium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Tungsten,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.VanadiumGallium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Naquadah,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.ElectrumFlux,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Superconductor,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_UEV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UEV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.SuperconductorUEV,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_UIV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UIV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Neutronium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_UMV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UMV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.Quantium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Buffer_4by4_UXV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UXV.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.wireGt16,
                    Materials.BlackPlutonium,
                    4L,
                ),
                ItemStack(
                    Blocks.chest,
                    1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerChamberCasings() {
        MachineRecipes.disassembler(
            input = ItemList.Casing_Core_Chamber.get(1L),
            outputs = arrayOf(
                ItemList.Field_Generator_ZPM.get(2L),
                ItemList.Electric_Pump_ZPM.get(2L),
                ItemList.Emitter_ZPM.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.pipeMedium,
                    Materials.Superconductor,
                    1L,
                ),
                ItemList.Hull_ZPM.get(1L),
                GT_OreDictUnificator.get(
                    OrePrefixes.circuit,
                    Materials.Master,
                    1L,
                ),
                ItemList.Sensor_ZPM.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Casing_Internix_Chamber.get(1L),
            outputs = arrayOf(
                GT_OreDictUnificator.get(
                    OrePrefixes.plateDouble,
                    Materials.HSSS,
                    4L,
                ),
                ItemList.Neutron_Reflector.get(2L),
                ItemList.Electric_Pump_LuV.get(2L),
                ItemList.Casing_Pipe_TungstenSteel.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }
}
