package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactLaserTarget262144AssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                ImpactItems.LaserCore1.get(amount = 32),
                GregTechItems.SensorIV.get(amount = 32),
                GregTechItems.ElectricPumpIV.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.TungstenSteel,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel6IV.get(),
            ticks = 32000,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                ImpactItems.LaserCore1.get(amount = 32),
                GregTechItems.SensorLuV.get(amount = 32),
                GregTechItems.ElectricPumpLuV.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.VanadiumGallium,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel6LuV.get(),
            ticks = 32000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                ImpactItems.LaserCore2.get(amount = 32),
                GregTechItems.SensorZPM.get(amount = 32),
                GregTechItems.ElectricPumpZPM.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Naquadah,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel6ZPM.get(),
            ticks = 32000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                ImpactItems.LaserCore2.get(amount = 32),
                GregTechItems.SensorUV.get(amount = 32),
                GregTechItems.ElectricPumpUV.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.NaquadahAlloy,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel6UV.get(),
            ticks = 32000,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMAX.get(),
                ImpactItems.LaserCore3.get(amount = 32),
                GregTechItems.SensorUHV.get(amount = 32),
                GregTechItems.ElectricPumpUHV.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Europium,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel6UHV.get(),
            ticks = 32000,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUEV.get(),
                ImpactItems.LaserCore3.get(amount = 32),
                GregTechItems.SensorUEV.get(amount = 32),
                GregTechItems.ElectricPumpUEV.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Diamericiumtitanium,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(6),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel6UEV.get(),
            ticks = 32000,
            eu = 8000000,
        )
    }
}
