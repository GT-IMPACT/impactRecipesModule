package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactLaserTarget16384AssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                ImpactItems.LaserCore1.get(amount = 8),
                GregTechItems.SensorIV.get(amount = 8),
                GregTechItems.ElectricPumpIV.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel4IV.get(),
            ticks = 8000,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                ImpactItems.LaserCore1.get(amount = 8),
                GregTechItems.SensorLuV.get(amount = 8),
                GregTechItems.ElectricPumpLuV.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.VanadiumGallium,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel4LuV.get(),
            ticks = 8000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                ImpactItems.LaserCore2.get(amount = 8),
                GregTechItems.SensorZPM.get(amount = 8),
                GregTechItems.ElectricPumpZPM.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Naquadah,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel4ZPM.get(),
            ticks = 8000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                ImpactItems.LaserCore2.get(amount = 8),
                GregTechItems.SensorUV.get(amount = 8),
                GregTechItems.ElectricPumpUV.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel4UV.get(),
            ticks = 8000,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMAX.get(),
                ImpactItems.LaserCore3.get(amount = 8),
                GregTechItems.SensorUHV.get(amount = 8),
                GregTechItems.ElectricPumpUHV.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel4UHV.get(),
            ticks = 8000,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUEV.get(),
                ImpactItems.LaserCore3.get(amount = 8),
                GregTechItems.SensorUEV.get(amount = 8),
                GregTechItems.ElectricPumpUEV.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Diamericiumtitanium,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel4UEV.get(),
            ticks = 8000,
            eu = 8000000,
        )
    }
}
