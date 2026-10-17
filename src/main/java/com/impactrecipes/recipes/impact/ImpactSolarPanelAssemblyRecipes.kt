package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactSolarPanelAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanel8V.get(),
                ImpactItems.ULVRobotArm.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GregTechItems.SensorLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Silicon,
                    count = 6,
                ),
                GregTechItems.BatteryBuffer2by2ULV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(144),
            output = ImpactItems.SolarULV.get(),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelLV.get(),
                GregTechItems.RobotArmLV.get(),
                GregTechItems.LargeFluidCellAluminium.get(),
                GregTechItems.SensorLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Silicon,
                    count = 6,
                ),
                GregTechItems.BatteryBuffer2by2LV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(288),
            output = ImpactItems.SolarLV.get(),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelMV.get(),
                GregTechItems.RobotArmMV.get(),
                GregTechItems.LargeFluidCellStainlessSteel.get(),
                GregTechItems.SensorMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Silicon,
                    count = 6,
                ),
                GregTechItems.BatteryBuffer2by2MV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(576),
            output = ImpactItems.SolarMV.get(),
            ticks = 300,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelHV.get(),
                GregTechItems.RobotArmHV.get(),
                GregTechItems.LargeFluidCellTitanium.get(),
                GregTechItems.SensorHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 8,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.GalliumArsenide,
                    count = 8,
                ),
                GregTechItems.BatteryBuffer2by2HV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(1152),
            output = ImpactItems.SolarHV.get(),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelEV.get(),
                GregTechItems.RobotArmEV.get(),
                GregTechItems.LargeFluidCellTungstenSteel.get(),
                GregTechItems.SensorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Elite,
                    count = 10,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.GalliumArsenide,
                    count = 8,
                ),
                GregTechItems.BatteryBuffer2by2EV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(2304),
            output = ImpactItems.SolarEV.get(),
            ticks = 500,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelIV.get(),
                GregTechItems.RobotArmIV.get(),
                GregTechItems.LargeFluidCellChrome.get(),
                GregTechItems.SensorIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Master,
                    count = 12,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.GalliumArsenide,
                    count = 8,
                ),
                GregTechItems.BatteryBuffer2by2IV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(4608),
            output = ImpactItems.SolarIV.get(),
            ticks = 600,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelLuV.get(),
                GregTechItems.RobotArmLuV.get(),
                GregTechItems.LargeFluidCellIridium.get(),
                GregTechItems.SensorLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Ultimate,
                    count = 14,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2LuV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(9216),
            output = ImpactItems.SolarLuV.get(),
            ticks = 700,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelZPM.get(),
                GregTechItems.RobotArmZPM.get(),
                GregTechItems.LargeFluidCellOsmium.get(),
                GregTechItems.SensorZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Superconductor,
                    count = 16,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2ZPM.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(18432),
            output = ImpactItems.SolarZPM.get(),
            ticks = 800,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelUV.get(),
                GregTechItems.RobotArmUV.get(),
                GregTechItems.LargeFluidCellNeutronium.get(),
                GregTechItems.SensorUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Infinite,
                    count = 18,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateTriple,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2UV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(36864),
            output = ImpactItems.SolarUV.get(),
            ticks = 900,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelUHV.get(),
                GregTechItems.RobotArmUHV.get(),
                ImpactItems.FluidTankBlock4.get(),
                GregTechItems.SensorUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Bio,
                    count = 20,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuadruple,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2MAX.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(73728),
            output = ImpactItems.SolarUHV.get(),
            ticks = 1000,
            eu = 8000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.CoverSolarPanelUEV.get(),
                GregTechItems.RobotArmUEV.get(),
                ImpactItems.FluidTankBlock5.get(),
                GregTechItems.SensorUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Nano,
                    count = 22,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateQuintuple,
                    material = Materials.Sunnarium,
                    count = 10,
                ),
                GregTechItems.BatteryBuffer2by2UEV.get(),
            ),
            fluid = Materials.SolderingAlloy.getMolten(147456),
            output = ImpactItems.SolarUEV.get(),
            ticks = 1100,
            eu = 32000000,
        )
    }
}
