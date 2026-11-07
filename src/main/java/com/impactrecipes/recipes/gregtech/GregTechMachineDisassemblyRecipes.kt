package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.ItemList
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechMachineDisassemblyRecipes {

    internal fun register() {
        registerLV()
        registerMV()
        registerHV()
        registerEV()
        registerIV()
    }

    private fun registerLV() {
        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_AlloySmelter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
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
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Copper,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Assembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(2L),
                ItemList.Robot_Arm_LV.get(2L),
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
            input = ItemList.Machine_LV_Bender.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(2L),
                ItemList.Electric_Piston_LV.get(2L),
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
            input = ItemList.Machine_LV_Canner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(1L),
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
                VanillaItems.Glass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Compressor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(2L),
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
            input = ItemList.Machine_LV_Cutter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(1L),
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
                VanillaItems.Glass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingDiamondBlade",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_E_Furnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
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
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Copper,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Extractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(1L),
                ItemList.Electric_Pump_LV.get(1L),
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
            input = ItemList.Machine_LV_Extruder.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Bronze,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Copper,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Lathe.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(1L),
                ItemList.Electric_Piston_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gem,
                    material = Materials.Diamond,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Macerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(1L),
                ItemList.Electric_Piston_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.gem,
                    material = Materials.Diamond,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Printer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(3L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Recycler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(2L),
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
                    prefix = OrePrefixes.dust,
                    material = Materials.Glowstone,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Wiremill.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(4L),
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
            input = ItemList.Machine_LV_Centrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
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
            input = ItemList.Machine_LV_Electrolyzer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
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
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Gold,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_ThermalCentrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(2L),
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
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Copper,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_OreWasher.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Tin,
                    count = 2,
                ),
                ItemList.Electric_Motor_LV.get(1L),
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
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Unboxinator.get(1L),
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
            input = ItemList.Machine_LV_ChemicalReactor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Tin,
                    count = 1,
                ),
                ItemList.Electric_Motor_LV.get(1L),
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
            input = ItemList.Machine_LV_FluidCanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Amplifab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
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
            input = ItemList.Machine_LV_Fermenter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_FluidExtractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(1L),
                ItemList.Electric_Pump_LV.get(1L),
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
            input = ItemList.Machine_LV_FluidSolidifier.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(2L),
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
                VanillaItems.Glass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Distillery.get(1L),
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
            input = ItemList.Machine_LV_ChemicalBath.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(2L),
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
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Polarizer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Iron,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Tin,
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
            input = ItemList.Machine_LV_ElectromagneticSeparator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Tin,
                    count = 2,
                ),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Autoclave.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Mixer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Motor_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Tin,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_LaserEngraver.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Emitter_LV.get(1L),
                ItemList.Electric_Piston_LV.get(2L),
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
            input = ItemList.Machine_LV_Press.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
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
            input = ItemList.Machine_LV_Hammer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingAnvil",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_FluidHeater.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Pump_LV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Copper,
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
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_Slicer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
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
            input = ItemList.Machine_LV_Sifter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Electric_Piston_LV.get(2L),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 2,
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
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_ArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
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
            input = ItemList.Machine_LV_PlasmaArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Tin,
                    count = 2,
                ),
                ItemList.Electric_Pump_LV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_CircuitAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(2L),
                ItemList.Robot_Arm_LV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Tin,
                    count = 2,
                ),
                ItemList.Emitter_LV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_LV_WireAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_LV.get(1L),
                ItemList.Conveyor_Module_LV.get(1L),
                ItemList.Robot_Arm_LV.get(1L),
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
                ItemList.Electric_Motor_LV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerMV() {
        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_AlloySmelter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
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
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Cupronickel,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Assembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(2L),
                ItemList.Robot_Arm_MV.get(2L),
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
            input = ItemList.Machine_MV_Bender.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(2L),
                ItemList.Electric_Piston_MV.get(2L),
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
            input = ItemList.Machine_MV_Canner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(1L),
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
                VanillaItems.Glass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Compressor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(2L),
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
            input = ItemList.Machine_MV_Cutter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(1L),
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
                VanillaItems.Glass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingDiamondBlade",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_E_Furnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
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
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Cupronickel,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Extractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(1L),
                ItemList.Electric_Pump_MV.get(1L),
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
            input = ItemList.Machine_MV_Extruder.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Cupronickel,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Lathe.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(1L),
                ItemList.Electric_Piston_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 3,
                ),
                RecipeItems.ore(
                    name = "craftingIndustrialDiamond",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Macerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(1L),
                ItemList.Electric_Piston_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 3,
                ),
                RecipeItems.ore(
                    name = "craftingIndustrialDiamond",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Printer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(3L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Recycler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(2L),
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
                    prefix = OrePrefixes.dust,
                    material = Materials.Glowstone,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Wiremill.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(4L),
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
            input = ItemList.Machine_MV_Centrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
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
            input = ItemList.Machine_MV_Electrolyzer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
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
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Silver,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_ThermalCentrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(2L),
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
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Cupronickel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_OreWasher.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Bronze,
                    count = 2,
                ),
                ItemList.Electric_Motor_MV.get(1L),
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
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Unboxinator.get(1L),
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
            input = ItemList.Machine_MV_ChemicalReactor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Bronze,
                    count = 1,
                ),
                ItemList.Electric_Motor_MV.get(1L),
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
            input = ItemList.Machine_MV_FluidCanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Amplifab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
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
            input = ItemList.Machine_MV_Fermenter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_FluidExtractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(1L),
                ItemList.Electric_Pump_MV.get(1L),
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
            input = ItemList.Machine_MV_FluidSolidifier.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(2L),
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
                VanillaItems.Glass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Distillery.get(1L),
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
            input = ItemList.Machine_MV_ChemicalBath.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(2L),
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
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Polarizer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Copper,
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
            input = ItemList.Machine_MV_ElectromagneticSeparator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Copper,
                    count = 2,
                ),
                ItemList.Conveyor_Module_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Autoclave.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Mixer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Motor_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Bronze,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_LaserEngraver.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Emitter_MV.get(1L),
                ItemList.Electric_Piston_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 3,
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
            input = ItemList.Machine_MV_Press.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
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
            input = ItemList.Machine_MV_Hammer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingAnvil",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_FluidHeater.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Pump_MV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Cupronickel,
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
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_Slicer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
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
            input = ItemList.Machine_MV_Sifter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Electric_Piston_MV.get(2L),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 2,
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
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_ArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Aluminium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
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
            input = ItemList.Machine_MV_PlasmaArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Copper,
                    count = 2,
                ),
                ItemList.Electric_Pump_MV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_CircuitAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(2L),
                ItemList.Robot_Arm_MV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Copper,
                    count = 2,
                ),
                ItemList.Emitter_MV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_MV_WireAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_MV.get(1L),
                ItemList.Conveyor_Module_MV.get(1L),
                ItemList.Robot_Arm_MV.get(1L),
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
                ItemList.Electric_Motor_MV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerHV() {
        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_AlloySmelter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
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
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Kanthal,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Assembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(2L),
                ItemList.Robot_Arm_HV.get(2L),
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
            input = ItemList.Machine_HV_Bender.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(2L),
                ItemList.Electric_Piston_HV.get(2L),
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
            input = ItemList.Machine_HV_Canner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
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
                VanillaItems.Glass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Compressor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(2L),
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
            input = ItemList.Machine_HV_Cutter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(1L),
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
                VanillaItems.Glass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingDiamondBlade",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_E_Furnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
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
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Kanthal,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Extractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
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
            input = ItemList.Machine_HV_Extruder.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Kanthal,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Lathe.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(1L),
                ItemList.Electric_Piston_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 3,
                ),
                RecipeItems.ore(
                    name = "craftingIndustrialDiamond",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Macerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(1L),
                ItemList.Electric_Piston_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 3,
                ),
                RecipeItems.ore(
                    name = "craftingGrinder",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Printer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(3L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Recycler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(2L),
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
                    prefix = OrePrefixes.dust,
                    material = Materials.Glowstone,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Wiremill.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(4L),
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
            input = ItemList.Machine_HV_Centrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
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
            input = ItemList.Machine_HV_Electrolyzer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
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
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Electrum,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_ThermalCentrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(2L),
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
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Kanthal,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_OreWasher.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Steel,
                    count = 2,
                ),
                ItemList.Electric_Motor_HV.get(1L),
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
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Unboxinator.get(1L),
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
            input = ItemList.Machine_HV_ChemicalReactor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Steel,
                    count = 1,
                ),
                ItemList.Electric_Motor_HV.get(1L),
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
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Plastic,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_FluidCanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Amplifab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
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
            input = ItemList.Machine_HV_Fermenter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_FluidExtractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
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
            input = ItemList.Machine_HV_FluidSolidifier.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(2L),
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
                VanillaItems.Glass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Distillery.get(1L),
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
            input = ItemList.Machine_HV_ChemicalBath.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(2L),
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
                VanillaItems.Glass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Polarizer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Copper,
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
            input = ItemList.Machine_HV_ElectromagneticSeparator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Copper,
                    count = 2,
                ),
                ItemList.Conveyor_Module_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Autoclave.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSLA,
                    count = 4,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Mixer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Motor_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_LaserEngraver.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Emitter_HV.get(1L),
                ItemList.Electric_Piston_HV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 3,
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
            input = ItemList.Machine_HV_Press.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Hammer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingAnvil",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_FluidHeater.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Pump_HV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Kanthal,
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
                    count = 2,
                ),
                VanillaItems.Glass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Slicer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_Sifter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Electric_Piston_HV.get(2L),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 2,
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
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_ArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSLA,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
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
            input = ItemList.Machine_HV_PlasmaArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HSLA,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Gold,
                    count = 2,
                ),
                ItemList.Electric_Pump_HV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_CircuitAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(2L),
                ItemList.Robot_Arm_HV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Gold,
                    count = 2,
                ),
                ItemList.Emitter_HV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_HV_WireAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_HV.get(1L),
                ItemList.Conveyor_Module_HV.get(1L),
                ItemList.Robot_Arm_HV.get(1L),
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
                ItemList.Electric_Motor_HV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerEV() {
        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_AlloySmelter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
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
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Nichrome,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Assembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(2L),
                ItemList.Robot_Arm_EV.get(2L),
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
            input = ItemList.Machine_EV_Bender.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(2L),
                ItemList.Electric_Piston_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Canner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
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
                IC2Items.ReinforcedGlass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Compressor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(2L),
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
            input = ItemList.Machine_EV_Cutter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(1L),
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
                IC2Items.ReinforcedGlass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingDiamondBlade",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_E_Furnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
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
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Nichrome,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Extractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
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
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Extruder.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Titanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Nichrome,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Lathe.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(1L),
                ItemList.Electric_Piston_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 3,
                ),
                RecipeItems.ore(
                    name = "craftingIndustrialDiamond",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Macerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(1L),
                ItemList.Electric_Piston_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 3,
                ),
                RecipeItems.ore(
                    name = "craftingGrinder",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Printer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(3L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Recycler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(2L),
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
                    prefix = OrePrefixes.dust,
                    material = Materials.Glowstone,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Wiremill.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(4L),
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
            input = ItemList.Machine_EV_Centrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
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
            input = ItemList.Machine_EV_Electrolyzer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Platinum,
                    count = 4,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_ThermalCentrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(2L),
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
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Nichrome,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_OreWasher.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.StainlessSteel,
                    count = 2,
                ),
                ItemList.Electric_Motor_EV.get(1L),
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
                IC2Items.ReinforcedGlass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Unboxinator.get(1L),
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
            input = ItemList.Machine_EV_ChemicalReactor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                ItemList.Electric_Motor_EV.get(1L),
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
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Plastic,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_FluidCanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Amplifab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
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
            input = ItemList.Machine_EV_Fermenter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_FluidExtractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
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
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_FluidSolidifier.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(2L),
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
                IC2Items.ReinforcedGlass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Distillery.get(1L),
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
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_ChemicalBath.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 1,
                ),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Polarizer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Neodymium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.AnnealedCopper,
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
            input = ItemList.Machine_EV_ElectromagneticSeparator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Neodymium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.AnnealedCopper,
                    count = 2,
                ),
                ItemList.Conveyor_Module_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Autoclave.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 4,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Mixer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Motor_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_LaserEngraver.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Emitter_EV.get(1L),
                ItemList.Electric_Piston_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 3,
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
            input = ItemList.Machine_EV_Press.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Hammer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingAnvil",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_FluidHeater.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Pump_EV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Nichrome,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Slicer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_Sifter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Electric_Piston_EV.get(2L),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 2,
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
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_ArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 2,
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
            input = ItemList.Machine_EV_PlasmaArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                ItemList.Electric_Pump_EV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_CircuitAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(2L),
                ItemList.Robot_Arm_EV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                ItemList.Emitter_EV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_EV_WireAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_EV.get(1L),
                ItemList.Conveyor_Module_EV.get(1L),
                ItemList.Robot_Arm_EV.get(1L),
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
                ItemList.Electric_Motor_EV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }

    private fun registerIV() {
        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_AlloySmelter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Assembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(2L),
                ItemList.Robot_Arm_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Bender.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(2L),
                ItemList.Electric_Piston_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Canner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 3),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Compressor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Cutter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingDiamondBlade",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_E_Furnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Extractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Extruder.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.MaragingSteel300,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Lathe.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(1L),
                ItemList.Electric_Piston_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 3,
                ),
                RecipeItems.ore(
                    name = "craftingIndustrialDiamond",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Macerator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(1L),
                ItemList.Electric_Piston_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 3,
                ),
                RecipeItems.ore(
                    name = "craftingGrinder",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Printer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(3L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Recycler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Glowstone,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Wiremill.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Centrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Electrolyzer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Osmium,
                    count = 4,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_ThermalCentrifuge.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_OreWasher.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.HastelloyC276,
                    count = 2,
                ),
                ItemList.Electric_Motor_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Unboxinator.get(1L),
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
                    material = Materials.Platinum,
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
            input = ItemList.Machine_IV_ChemicalReactor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                ItemList.Electric_Motor_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeHuge,
                    material = Materials.Plastic,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_FluidCanner.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Amplifab.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(4L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Fermenter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 4,
                ),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_FluidExtractor.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_FluidSolidifier.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
                RecipeItems.ore(
                    name = "craftingChest",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Distillery.get(1L),
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
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_ChemicalBath.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 1,
                ),
                IC2Items.ReinforcedGlass.get(amount = 2),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Polarizer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Neodymium,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.AnnealedCopper,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_ElectromagneticSeparator.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Neodymium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.AnnealedCopper,
                    count = 2,
                ),
                ItemList.Conveyor_Module_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 3,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Autoclave.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 4,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Mixer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Motor_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 4),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_LaserEngraver.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Emitter_IV.get(1L),
                ItemList.Electric_Piston_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Press.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Hammer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 4,
                ),
                RecipeItems.ore(
                    name = "craftingAnvil",
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_FluidHeater.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Pump_IV.get(2L),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                IC2Items.ReinforcedGlass.get(amount = 1),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Slicer.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_Sifter.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Electric_Piston_IV.get(2L),
                RecipeItems.ore(
                    name = "craftingFilter",
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_ArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Platinum,
                    count = 2,
                ),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_PlasmaArcFurnace.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt04,
                    material = Materials.Platinum,
                    count = 2,
                ),
                ItemList.Electric_Pump_IV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_CircuitAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(2L),
                ItemList.Robot_Arm_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                ItemList.Emitter_IV.get(1L),
            ),
            ticks = 2000,
            eu = 16,
        )

        MachineRecipes.disassembler(
            input = ItemList.Machine_IV_WireAssembler.get(1L),
            outputs = arrayOf(
                ItemList.Hull_IV.get(1L),
                ItemList.Conveyor_Module_IV.get(1L),
                ItemList.Robot_Arm_IV.get(1L),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.cableGt01,
                    material = Materials.Platinum,
                    count = 2,
                ),
                ItemList.Electric_Motor_IV.get(2L),
            ),
            ticks = 2000,
            eu = 16,
        )
    }
}
