package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactComponentUnboxingRecipes {

    internal fun register() {
        MachineRecipes.unboxing(
            input = ImpactItems.SolarULV.get(),
            output = GregTechItems.CoverSolarPanel8V.get(),
            secondaryOutput = ImpactItems.ULVRobotArm.get(),
            ticks = 800,
            eu = 1,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarLV.get(),
            output = GregTechItems.CoverSolarPanelLV.get(),
            secondaryOutput = GregTechItems.RobotArmLV.get(),
            ticks = 1000,
            eu = 2,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarMV.get(),
            output = GregTechItems.CoverSolarPanelMV.get(),
            secondaryOutput = GregTechItems.RobotArmMV.get(),
            ticks = 1200,
            eu = 4,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarHV.get(),
            output = GregTechItems.CoverSolarPanelHV.get(),
            secondaryOutput = GregTechItems.RobotArmHV.get(),
            ticks = 1400,
            eu = 16,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarEV.get(),
            output = GregTechItems.CoverSolarPanelEV.get(),
            secondaryOutput = GregTechItems.RobotArmEV.get(),
            ticks = 1600,
            eu = 64,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarIV.get(),
            output = GregTechItems.CoverSolarPanelIV.get(),
            secondaryOutput = GregTechItems.RobotArmIV.get(),
            ticks = 1800,
            eu = 250,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarLuV.get(),
            output = GregTechItems.CoverSolarPanelLuV.get(),
            secondaryOutput = GregTechItems.RobotArmLuV.get(),
            ticks = 2000,
            eu = 1020,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarZPM.get(),
            output = GregTechItems.CoverSolarPanelZPM.get(),
            secondaryOutput = GregTechItems.RobotArmZPM.get(),
            ticks = 2200,
            eu = 4096,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarUV.get(),
            output = GregTechItems.CoverSolarPanelUV.get(),
            secondaryOutput = GregTechItems.RobotArmUV.get(),
            ticks = 2400,
            eu = 7680,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarUHV.get(),
            output = GregTechItems.CoverSolarPanelUHV.get(),
            secondaryOutput = GregTechItems.RobotArmUHV.get(),
            ticks = 2600,
            eu = 16340,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.SolarUEV.get(),
            output = GregTechItems.CoverSolarPanelUEV.get(),
            secondaryOutput = GregTechItems.RobotArmUEV.get(),
            ticks = 2800,
            eu = 30000,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.LapotronicCapacitorIV.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Inconel792,
                count = 1,
            ),
            secondaryOutput = GregTechItems.EnergyLapotronicOrb.get(amount = 4),
            ticks = 1600,
            eu = 64,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.EnergiumCapacitorIV.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Inconel792,
                count = 1,
            ),
            secondaryOutput = GregTechItems.EnergyCrystalIV.get(amount = 4),
            ticks = 1600,
            eu = 64,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.LapotronicCapacitorLuV.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Inconel792,
                count = 1,
            ),
            secondaryOutput = GregTechItems.EnergyLapotronicOrb2.get(amount = 4),
            ticks = 1800,
            eu = 250,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.LapotronicCapacitorZPM.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Inconel792,
                count = 1,
            ),
            secondaryOutput = GregTechItems.EnergyModule.get(amount = 4),
            ticks = 2000,
            eu = 1024,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.LapotronicCapacitorUV.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Inconel792,
                count = 1,
            ),
            secondaryOutput = GregTechItems.EnergyCluster.get(amount = 4),
            ticks = 2200,
            eu = 4096,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.UltimateCapacitorUHV.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Inconel792,
                count = 1,
            ),
            secondaryOutput = GregTechItems.ZPM2.get(amount = 4),
            ticks = 2400,
            eu = 7680,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.MysteriousCrystalOrbCapacitorUHV.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Inconel792,
                count = 1,
            ),
            secondaryOutput = GregTechItems.MysteriousCrystalOrb.get(amount = 4),
            ticks = 2400,
            eu = 4096,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.MysteriousCrystalModuleCapacitorUEV.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Inconel792,
                count = 1,
            ),
            secondaryOutput = GregTechItems.MysteriousCrystalModule.get(amount = 4),
            ticks = 2400,
            eu = 7680,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.Processorx1.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Titanium,
                count = 1,
            ),
            secondaryOutput = GregTechItems.CircuitData.get(amount = 2),
            ticks = 800,
            eu = 15,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.Processorx4.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.TungstenSteel,
                count = 1,
            ),
            secondaryOutput = GregTechItems.CircuitElite.get(amount = 2),
            ticks = 1000,
            eu = 30,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.Processorx16.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Chrome,
                count = 1,
            ),
            secondaryOutput = GregTechItems.CircuitMaster.get(amount = 2),
            ticks = 1200,
            eu = 48,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.Processorx64.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Iridium,
                count = 1,
            ),
            secondaryOutput = GregTechItems.CircuitQuantummainframe.get(amount = 2),
            ticks = 1400,
            eu = 96,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.Processorx256.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Osmium,
                count = 1,
            ),
            secondaryOutput = GregTechItems.CircuitCrystalmainframe.get(amount = 2),
            ticks = 1600,
            eu = 192,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.Processorx1024.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Neutronium,
                count = 1,
            ),
            secondaryOutput = GregTechItems.CircuitWetwaremainframe.get(amount = 2),
            ticks = 1800,
            eu = 360,
        )

        MachineRecipes.unboxing(
            input = ImpactItems.Processorx4096.get(),
            output = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Phoenixite,
                count = 1,
            ),
            secondaryOutput = GregTechItems.CircuitBiomainframe.get(amount = 2),
            ticks = 2000,
            eu = 940,
        )
    }
}
