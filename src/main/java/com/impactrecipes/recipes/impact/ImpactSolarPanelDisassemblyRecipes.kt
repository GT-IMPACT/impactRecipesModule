package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactSolarPanelDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.SolarULV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanel8V.get(),
                ImpactItems.ULVRobotArm.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GregTechItems.SensorLV.get(),
                IC2Items.ElectronicCircuit.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Silicon,
                    count = 6,
                ),
                GregTechItems.BatteryBuffer2by2ULV.get(),
            ),
            ticks = 1000,
            eu = 30,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarLV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelLV.get(),
                GregTechItems.RobotArmLV.get(),
                GregTechItems.LargeFluidCellAluminium.get(),
                GregTechItems.SensorLV.get(),
                GregTechItems.CircuitGood.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Silicon,
                    count = 6,
                ),
                GregTechItems.BatteryBuffer2by2LV.get(),
            ),
            ticks = 2000,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarMV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelMV.get(),
                GregTechItems.RobotArmMV.get(),
                GregTechItems.LargeFluidCellStainlessSteel.get(),
                GregTechItems.SensorMV.get(),
                IC2Items.AdvancedCircuit.get(amount = 6),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Silicon,
                    count = 6,
                ),
                GregTechItems.BatteryBuffer2by2MV.get(),
            ),
            ticks = 3000,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarHV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelHV.get(),
                GregTechItems.RobotArmHV.get(),
                GregTechItems.LargeFluidCellTitanium.get(),
                GregTechItems.SensorHV.get(),
                GregTechItems.CircuitData.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.GalliumArsenide,
                    count = 8,
                ),
                GregTechItems.BatteryBuffer2by2HV.get(),
            ),
            ticks = 4000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarEV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelEV.get(),
                GregTechItems.RobotArmEV.get(),
                GregTechItems.LargeFluidCellTungstenSteel.get(),
                GregTechItems.SensorEV.get(),
                GregTechItems.CircuitElite.get(amount = 10),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.GalliumArsenide,
                    count = 8,
                ),
                GregTechItems.BatteryBuffer2by2EV.get(),
            ),
            ticks = 5000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarIV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelIV.get(),
                GregTechItems.RobotArmIV.get(),
                GregTechItems.LargeFluidCellChrome.get(),
                GregTechItems.SensorIV.get(),
                GregTechItems.CircuitMaster.get(amount = 12),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.GalliumArsenide,
                    count = 8,
                ),
                GregTechItems.BatteryBuffer2by2IV.get(),
            ),
            ticks = 6000,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarLuV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelLuV.get(),
                GregTechItems.RobotArmLuV.get(),
                GregTechItems.LargeFluidCellIridium.get(),
                GregTechItems.SensorLuV.get(),
                GregTechItems.CircuitQuantummainframe.get(amount = 14),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2LuV.get(),
            ),
            ticks = 7000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarZPM.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelZPM.get(),
                GregTechItems.RobotArmZPM.get(),
                GregTechItems.LargeFluidCellOsmium.get(),
                GregTechItems.SensorZPM.get(),
                GregTechItems.CircuitCrystalmainframe.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2ZPM.get(),
            ),
            ticks = 8000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarUV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelUV.get(),
                GregTechItems.RobotArmUV.get(),
                GregTechItems.LargeFluidCellNeutronium.get(),
                GregTechItems.SensorUV.get(),
                GregTechItems.CircuitWetwaremainframe.get(amount = 18),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2UV.get(),
            ),
            ticks = 10000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarUHV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelUHV.get(),
                GregTechItems.RobotArmUHV.get(),
                ImpactItems.FluidTankBlock4.get(),
                GregTechItems.SensorUHV.get(),
                GregTechItems.CircuitBiomainframe.get(amount = 20),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuadruple,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2MAX.get(),
            ),
            ticks = 12000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SolarUEV.get(),
            outputs = arrayOf(
                GregTechItems.CoverSolarPanelUEV.get(),
                GregTechItems.RobotArmUEV.get(),
                ImpactItems.FluidTankBlock5.get(),
                GregTechItems.SensorUEV.get(),
                GregTechItems.CircuitNano.get(amount = 22),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuintuple,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2UEV.get(),
            ),
            ticks = 14000,
            eu = 500000,
        )
    }
}
