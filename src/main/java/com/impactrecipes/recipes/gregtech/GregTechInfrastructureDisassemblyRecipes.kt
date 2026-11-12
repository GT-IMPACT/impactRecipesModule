package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.GT_Mod
import gregtech.api.enums.ItemList
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechInfrastructureDisassemblyRecipes {

    internal fun register() {
        registerHatchInput()
        registerHatchOutput()
        registerHatchMaintenance()
        registerHatchAutoMaintenance()
        registerHatchDataAccess()
        registerHatchMuffler()
        registerBattery()
        registerLocker()
        registerMachine()
        registerGenerator()
        registerPump()
        registerCharcoal()
        registerConcreteBackfiller1()
        registerConcreteBackfiller2()
        registerMicroTransmitter()
        registerCasing()
        registerBlock()
        registerpipeMediumSuperconductor()
        registerAutomationChestBuffer()
        registerAutomationFilter()
        registerAutomationTypeFilter()
        registerAutomationRegulator()
        registerAutomationSuperBuffer()
        registerAutomationItemDistributor()
        registerAcceleratorLV()
        registerAcceleratorMV()
        registerAcceleratorHV()
        registerAcceleratorEV()
        registerAcceleratorIV()
        registerAcceleratorLuV()
        registerAcceleratorZPM()
        registerAcceleratorUV()
    }

    private fun registerHatchInput() {
        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Hatch_Input_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_ULV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Rubber,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Copper,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Hatch_Input_Bus_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_ULV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lead,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Tin,
                    count = 1,
                ),
                VanillaItems.Chest.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerHatchOutput() {
        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Hatch_Output_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_ULV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Rubber,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Copper,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Hatch_Output_Bus_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_ULV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Lead,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Tin,
                    count = 1,
                ),
                VanillaItems.Chest.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerHatchMaintenance() {
        MachineRecipes.disassembler(
            input = ItemList.Hatch_Maintenance.get(1L),
            outputs = arrayOf(
                ItemList.Casing_LV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerHatchAutoMaintenance() {
        MachineRecipes.disassembler(
            input = ItemList.Hatch_AutoMaintenance.get(1L),
            outputs = arrayOf(
                ItemList.Casing_IV.get(1L),
                ItemList.Hatch_Maintenance.get(2L),
                ItemList.Robot_Arm_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerHatchDataAccess() {
        MachineRecipes.disassembler(
            input = ItemList.Hatch_DataAccess_EV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_EV.get(1L),
                ItemList.Tool_DataStick.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Hatch_DataAccess_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_LuV.get(1L),
                ItemList.Tool_DataOrb.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Hatch_DataAccess_UV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_UV.get(1L),
                ItemList.Tool_DataOrb.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 4,
                ),
                ItemList.Robot_Arm_UV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerHatchMuffler() {
        MachineRecipes.disassembler(
            input = ItemList.Hatch_Muffler_LV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Bronze,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Bronze,
                    count = 1,
                ),
                ItemList.Electric_Motor_LV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Hatch_Muffler_MV.get(1L),
            outputs = arrayOf(
                ItemList.Casing_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Steel,
                    count = 1,
                ),
                ItemList.Electric_Motor_MV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerBattery() {
        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Lead,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.Battery_RE_ULV_Tantalum.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Tin,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.Battery_RE_LV_Lithium.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Copper,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.Battery_RE_MV_Lithium.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Gold,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.Battery_RE_HV_Lithium.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.BatteryHull_EV_Full.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Tungsten,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.BatteryHull_IV_Full.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.VanadiumGallium,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.BatteryHull_LuV_Full.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Naquadah,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.BatteryHull_ZPM_Full.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.ElectrumFlux,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.BatteryHull_UV_Full.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.BatteryHull_UHV_Full.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_UEV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UEV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.SuperconductorUEV,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.BatteryHull_UEV_Full.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_UIV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UIV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Neutronium,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.BatteryHull_UIV_Full.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Nano,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_UMV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UMV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Quantium,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.ZPM3.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Piko,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_Charger_4by4_UXV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UXV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.BlackPlutonium,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                ItemList.ZPM3.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Quantum,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_ULV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_LV_ULV.get(1L),
                ItemList.Battery_Charger_4by4_ULV.get(1L),
                ItemList.Battery_RE_ULV_Tantalum.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Lead,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Primitive,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_LV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_MV_LV.get(1L),
                ItemList.Battery_Charger_4by4_LV.get(1L),
                ItemList.Battery_RE_LV_Lithium.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Tin,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_MV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_HV_MV.get(1L),
                ItemList.Battery_Charger_4by4_MV.get(1L),
                ItemList.Battery_RE_MV_Lithium.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Copper,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_HV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_EV_HV.get(1L),
                ItemList.Battery_Charger_4by4_HV.get(1L),
                ItemList.Battery_RE_HV_Lithium.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Gold,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_EV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_IV_EV.get(1L),
                ItemList.Battery_Charger_4by4_EV.get(1L),
                ItemList.BatteryHull_EV_Full.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_IV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_LuV_IV.get(1L),
                ItemList.Battery_Charger_4by4_IV.get(1L),
                ItemList.Energy_LapotronicOrb.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Tungsten,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_LuV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_ZPM_LuV.get(1L),
                ItemList.Battery_Charger_4by4_LuV.get(1L),
                ItemList.Energy_LapotronicOrb2.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.VanadiumGallium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_UV_ZPM.get(1L),
                ItemList.Battery_Charger_4by4_ZPM.get(1L),
                ItemList.Energy_Module.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Naquadah,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_UV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_UHV_UV.get(1L),
                ItemList.Battery_Charger_4by4_UV.get(1L),
                ItemList.Energy_Cluster.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.NaquadahAlloy,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_UHV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_UEV_UHV.get(1L),
                ItemList.Battery_Charger_4by4_MAX.get(1L),
                ItemList.MysteriousCrystalOrb.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Europium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_UEV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_UIV_UEV.get(1L),
                ItemList.Battery_Charger_4by4_UEV.get(1L),
                ItemList.MysteriousCrystalModule.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Diamericiumtitanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_UIV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_UMV_UIV.get(1L),
                ItemList.Battery_Charger_4by4_UIV.get(1L),
                ItemList.ZPM2.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Neutronium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Nano,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Battery_TurboCharger_4by4_UMV.get(1L),
            outputs = arrayOf(
                ItemList.WetTransformer_UXV_UMV.get(1L),
                ItemList.Battery_Charger_4by4_UMV.get(1L),
                ItemList.ZPM3.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Quantium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Piko,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerLocker() {
        MachineRecipes.disassembler(
            input = ItemList.Locker_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_ULV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_LV.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_LV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_MV.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_MV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_HV.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_HV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_EV.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_EV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_IV.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_IV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_LuV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_ZPM.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_UV.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_UV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Locker_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Battery_Buffer_2by2_MAX.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerMachine() {
        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Scanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Emitter_LV.get(1L),
                ItemList.Sensor_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Scanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Emitter_MV.get(1L),
                ItemList.Sensor_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Scanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Emitter_HV.get(1L),
                ItemList.Sensor_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Scanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Emitter_EV.get(1L),
                ItemList.Sensor_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Scanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Emitter_IV.get(1L),
                ItemList.Sensor_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tungsten,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LuV_Scanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Emitter_LuV.get(1L),
                ItemList.Sensor_LuV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.VanadiumGallium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_ZPM_Scanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Emitter_ZPM.get(1L),
                ItemList.Sensor_ZPM.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Naquadah,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_UV_Scanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Emitter_UV.get(1L),
                ItemList.Sensor_UV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.NaquadahAlloy,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Boxinator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Robot_Arm_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Boxinator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Robot_Arm_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Boxinator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Robot_Arm_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 2,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Boxinator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Robot_Arm_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Boxinator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Robot_Arm_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tungsten,
                    count = 2,
                ),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_RockBreaker.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(1L),
                ItemList.Electric_Piston_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_RockBreaker.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(1L),
                ItemList.Electric_Piston_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_RockBreaker.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(1L),
                ItemList.Electric_Piston_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_RockBreaker.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(1L),
                ItemList.Electric_Piston_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_RockBreaker.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(1L),
                ItemList.Electric_Piston_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tungsten,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Disassembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Robot_Arm_LV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Disassembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Robot_Arm_MV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Disassembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Robot_Arm_HV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Disassembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Robot_Arm_EV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Disassembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Robot_Arm_IV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tungsten,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LuV_Disassembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Robot_Arm_LuV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.VanadiumGallium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_ZPM_Disassembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Robot_Arm_ZPM.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Naquadah,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_UV_Disassembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Robot_Arm_UV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.NaquadahAlloy,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Massfab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Field_Generator_LV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Tin,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Massfab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Field_Generator_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Copper,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Massfab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Field_Generator_HV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Gold,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Massfab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Field_Generator_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Massfab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Field_Generator_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Tungsten,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Replicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Field_Generator_LV.get(1L),
                ItemList.Emitter_LV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Tin,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Replicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Field_Generator_MV.get(1L),
                ItemList.Emitter_MV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Copper,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Replicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Field_Generator_HV.get(1L),
                ItemList.Emitter_HV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Gold,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Replicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Field_Generator_EV.get(1L),
                ItemList.Emitter_EV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Aluminium,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Replicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Field_Generator_IV.get(1L),
                ItemList.Emitter_IV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Tungsten,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Brewery.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Brewery.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Cupronickel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Brewery.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Kanthal,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Brewery.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.Nichrome,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Brewery.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.spring,
                    material = Materials.TungstenSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tungsten,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_Multi_BlastFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Casing_HeatProof.get(1L),
                ItemList.Machine_LV_E_Furnace.get(3L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_Multi_Furnace.get(1L),
            outputs = arrayOf(
                ItemList.Casing_HeatProof.get(1L),
                ItemList.Machine_MV_E_Furnace.get(3L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.AnnealedCopper,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_Multi_LargeBoiler_Bronze.get(1L),
            outputs = arrayOf(
                ItemList.Casing_Firebox_Bronze.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_Multi_LargeBoiler_Steel.get(1L),
            outputs = arrayOf(
                ItemList.Casing_Firebox_Steel.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 4,
                ),
                ItemList.Field_Generator_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                ItemList.Field_Generator_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                ItemList.Field_Generator_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                ItemList.Field_Generator_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                ItemList.Field_Generator_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tungsten,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LuV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                ItemList.Field_Generator_LuV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.VanadiumGallium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_ZPM_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                ItemList.Field_Generator_ZPM.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Naquadah,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_UV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                ItemList.Field_Generator_UV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.NaquadahAlloy,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_UHV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 4,
                ),
                ItemList.Field_Generator_UHV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Europium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_UEV_OrganicReplicator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UEV.get(1L),
                IC2Items.Crop.get(amount = 1),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 4,
                ),
                ItemList.Field_Generator_UEV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Diamericiumtitanium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        if (GT_Mod.gregtechproxy.mEnableCleanroom) {
            MachineRecipes.disassembler(
                input = ItemList.Machine_Multi_Cleanroom.get(1L),
                outputs = arrayOf(
                    ItemList.Hull_HV.get(1L),
                    ItemList.Component_Filter.get(3L),
                    RecipeItems.ore(
                        prefix = OrePrefixes.rotor,
                        material = Materials.StainlessSteel,
                        count = 2,
                    ),
                    ItemList.Electric_Motor_HV.get(2L),
                    RecipeItems.ore(
                        prefix = OrePrefixes.circuit,
                        material = Materials.Advanced,
                        count = 1,
                    ),
                ),
                ticks = 2000,
                eu = 16,
            )
        }

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_LightningRod.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Energy_LapotronicOrb.get(4L),
                ItemList.Transformer_ZPM_LuV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_LightningRod.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Energy_LapotronicOrb2.get(4L),
                ItemList.Transformer_UV_ZPM.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_LightningRod.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Energy_Module.get(4L),
                ItemList.Transformer_MAX_UV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LuV_LightningRod.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                ItemList.Energy_Cluster.get(4L),
                ItemList.Transformer_UEV_UHV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_ZPM_LightningRod.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UEV.get(1L),
                ItemList.ZPM2.get(4L),
                ItemList.Transformer_UIV_UEV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_UV_LightningRod.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UIV.get(1L),
                ItemList.ZPM3.get(4L),
                ItemList.Transformer_UMV_UIV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_AirGenerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 4,
                ),
                ItemList.Electric_Pump_LV.get(2L),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_AirGenerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                ItemList.Electric_Pump_MV.get(2L),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_AirGenerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
                ItemList.Electric_Pump_HV.get(2L),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_AirGenerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 4,
                ),
                ItemList.Electric_Pump_EV.get(2L),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_AirGenerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                ItemList.Electric_Pump_IV.get(2L),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LuV_AirGenerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 4,
                ),
                ItemList.Electric_Pump_LuV.get(2L),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_ZPM_AirGenerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 4,
                ),
                ItemList.Electric_Pump_ZPM.get(2L),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_UV_AirGenerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 4,
                ),
                ItemList.Electric_Pump_UV.get(2L),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IndustrialPulverizer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                ItemList.Electric_Piston_MV.get(2L),
                ItemList.Electric_Motor_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 1,
                ),
                ItemList.Component_Grinder_Diamond.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerGenerator() {
        MachineRecipes.disassembler(
            input = ItemList.Generator_Diesel_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(2L),
                ItemList.Electric_Motor_LV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Diesel_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(2L),
                ItemList.Electric_Motor_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.Aluminium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Diesel_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(2L),
                ItemList.Electric_Motor_HV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGt,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Gas_Turbine_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Tin,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Gas_Turbine_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Bronze,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Gas_Turbine_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Steel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Steam_Turbine_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Tin,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Bronze,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Steam_Turbine_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Bronze,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Steel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Steam_Turbine_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Plasma_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Field_Generator_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorIV,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Plutonium241,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Plasma_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Field_Generator_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorLuV,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Europium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Plasma_ZPMV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Field_Generator_LuV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorZPM,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Americium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Generator_Plasma_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Field_Generator_ZPM.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.ElectrumFlux,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Tritanium,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerPump() {
        MachineRecipes.disassembler(
            input = ItemList.Pump_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Bronze,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                ItemList.Electric_Pump_LV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Pump_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                ItemList.Electric_Pump_MV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Pump_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                ItemList.Electric_Pump_HV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Pump_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Titanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                ItemList.Electric_Pump_EV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Pump_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                ItemList.Electric_Pump_IV.get(4L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerCharcoal() {
        MachineRecipes.disassembler(
            input = ItemList.Charcoal_Pile.get(1L),
            outputs = arrayOf(
                ItemList.Hull_Bronze_Bricks.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.nugget,
                    material = Materials.WroughtIron,
                    count = 2,
                ),
                VanillaItems.Flint.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerConcreteBackfiller1() {
        MachineRecipes.disassembler(
            input = ItemList.ConcreteBackfiller1.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                ItemList.Electric_Motor_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Steel,
                    count = 1,
                ),
                ItemList.Electric_Pump_MV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerConcreteBackfiller2() {
        MachineRecipes.disassembler(
            input = ItemList.ConcreteBackfiller2.get(1L),
            outputs = arrayOf(
                ItemList.ConcreteBackfiller1.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.Titanium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                ItemList.Electric_Motor_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Steel,
                    count = 1,
                ),
                ItemList.Electric_Pump_EV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerMicroTransmitter() {
        MachineRecipes.disassembler(
            input = ItemList.MicroTransmitter_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Battery_RE_HV_Lithium.get(1L),
                ItemList.Emitter_HV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                ItemList.Field_Generator_HV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.MicroTransmitter_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.LapotronCrystal.get(1L),
                ItemList.Emitter_EV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                ItemList.Field_Generator_EV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.MicroTransmitter_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Energy_LapotronicOrb.get(1L),
                ItemList.Emitter_IV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                ItemList.Field_Generator_IV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.MicroTransmitter_LUV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Energy_LapotronicOrb2.get(1L),
                ItemList.Emitter_LuV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                ItemList.Field_Generator_LuV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.MicroTransmitter_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Energy_Module.get(1L),
                ItemList.Emitter_ZPM.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 2,
                ),
                ItemList.Field_Generator_ZPM.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.MicroTransmitter_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Energy_Cluster.get(1L),
                ItemList.Emitter_UV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 2,
                ),
                ItemList.Field_Generator_UV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerCasing() {
        MachineRecipes.disassembler(
            input = ItemList.Casing_EngineIntake.get(2L),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Titanium,
                    count = 2,
                ),
                ItemList.Casing_StableTitanium.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Titanium,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerBlock() {
        MachineRecipes.disassembler(
            input = ItemList.Block_Magnetic_Coil.get(1L),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.SuperconductorZPM,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NeodymiumMagnetic,
                    count = 6,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerpipeMediumSuperconductor() {
        MachineRecipes.disassembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.pipeMedium,
                material = Materials.Superconductor,
                count = 1,
            ),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeSmall,
                    material = Materials.Titanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.NeodymiumMagnetic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Plastic,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.SuperconductorIV,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAutomationChestBuffer() {
        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Conveyor_Module_LuV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Conveyor_Module_ZPM.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Conveyor_Module_UV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ChestBuffer_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                ItemList.Conveyor_Module_UHV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAutomationFilter() {
        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Conveyor_Module_LuV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Conveyor_Module_ZPM.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Conveyor_Module_UV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Filter_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                ItemList.Conveyor_Module_UHV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAutomationTypeFilter() {
        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Conveyor_Module_LuV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Conveyor_Module_ZPM.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Conveyor_Module_UV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_TypeFilter_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                ItemList.Conveyor_Module_UHV.get(1L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAutomationRegulator() {
        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                ItemList.Robot_Arm_LV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Robot_Arm_LV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Robot_Arm_MV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Robot_Arm_HV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Robot_Arm_EV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Robot_Arm_IV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Robot_Arm_LuV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Robot_Arm_ZPM.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Robot_Arm_UV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_Regulator_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                ItemList.Robot_Arm_UHV.get(2L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAutomationSuperBuffer() {
        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Conveyor_Module_LuV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Conveyor_Module_ZPM.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Conveyor_Module_UV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        // Alternative crafting ingredients cannot be recovered without crafting NBT.
        MachineRecipes.disassembler(
            input = ItemList.Automation_SuperBuffer_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                ItemList.Conveyor_Module_UHV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAutomationItemDistributor() {
        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_ULV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ULV.get(1L),
                ItemList.Conveyor_Module_LV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_LV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_MV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_HV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_EV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_IV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_LuV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LuV.get(1L),
                ItemList.Conveyor_Module_LuV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_ZPM.get(1L),
            outputs = arrayOf(
                ItemList.Hull_ZPM.get(1L),
                ItemList.Conveyor_Module_ZPM.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_UV.get(1L),
            outputs = arrayOf(
                ItemList.Hull_UV.get(1L),
                ItemList.Conveyor_Module_UV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Automation_ItemDistributor_MAX.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MAX.get(1L),
                ItemList.Conveyor_Module_UHV.get(3L),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAcceleratorLV() {
        MachineRecipes.disassembler(
            input = ItemList.AcceleratorLV.get(1L),
            outputs = arrayOf(
                ItemList.Robot_Arm_LV.get(2L),
                ItemList.Electric_Motor_LV.get(2L),
                ItemList.Electric_Pump_LV.get(1L),
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                ItemList.Electric_Piston_LV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAcceleratorMV() {
        MachineRecipes.disassembler(
            input = ItemList.AcceleratorMV.get(1L),
            outputs = arrayOf(
                ItemList.Robot_Arm_MV.get(2L),
                ItemList.Electric_Motor_MV.get(2L),
                ItemList.Electric_Pump_MV.get(1L),
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(1L),
                ItemList.Electric_Piston_MV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAcceleratorHV() {
        MachineRecipes.disassembler(
            input = ItemList.AcceleratorHV.get(1L),
            outputs = arrayOf(
                ItemList.Robot_Arm_HV.get(2L),
                ItemList.Electric_Motor_HV.get(2L),
                ItemList.Electric_Pump_HV.get(1L),
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(1L),
                ItemList.Electric_Piston_HV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAcceleratorEV() {
        MachineRecipes.disassembler(
            input = ItemList.AcceleratorEV.get(1L),
            outputs = arrayOf(
                ItemList.Robot_Arm_EV.get(2L),
                ItemList.Electric_Motor_EV.get(2L),
                ItemList.Electric_Pump_EV.get(1L),
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(1L),
                ItemList.Electric_Piston_EV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAcceleratorIV() {
        MachineRecipes.disassembler(
            input = ItemList.AcceleratorIV.get(1L),
            outputs = arrayOf(
                ItemList.Robot_Arm_IV.get(2L),
                ItemList.Electric_Motor_IV.get(2L),
                ItemList.Electric_Pump_IV.get(1L),
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
                ItemList.Electric_Piston_IV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAcceleratorLuV() {
        MachineRecipes.disassembler(
            input = ItemList.AcceleratorLuV.get(1L),
            outputs = arrayOf(
                ItemList.Robot_Arm_LuV.get(2L),
                ItemList.Electric_Motor_LuV.get(2L),
                ItemList.Electric_Pump_LuV.get(1L),
                ItemList.Hull_LuV.get(1L),
                ItemList.Conveyor_Module_LuV.get(1L),
                ItemList.Electric_Piston_LuV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAcceleratorZPM() {
        MachineRecipes.disassembler(
            input = ItemList.AcceleratorZPM.get(1L),
            outputs = arrayOf(
                ItemList.Robot_Arm_ZPM.get(2L),
                ItemList.Electric_Motor_ZPM.get(2L),
                ItemList.Electric_Pump_ZPM.get(1L),
                ItemList.Hull_ZPM.get(1L),
                ItemList.Conveyor_Module_ZPM.get(1L),
                ItemList.Electric_Piston_ZPM.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerAcceleratorUV() {
        MachineRecipes.disassembler(
            input = ItemList.AcceleratorUV.get(1L),
            outputs = arrayOf(
                ItemList.Robot_Arm_UV.get(2L),
                ItemList.Electric_Motor_UV.get(2L),
                ItemList.Electric_Pump_UV.get(1L),
                ItemList.Hull_UV.get(1L),
                ItemList.Conveyor_Module_UV.get(1L),
                ItemList.Electric_Piston_UV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }
}
