package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactLaserTarget65536AssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                ImpactItems.LaserCore1.get(amount = 16),
                GregTechItems.SensorIV.get(amount = 16),
                GregTechItems.ElectricPumpIV.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.TungstenSteel,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel5IV.get(),
            ticks = 16000,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                ImpactItems.LaserCore1.get(amount = 16),
                GregTechItems.SensorLuV.get(amount = 16),
                GregTechItems.ElectricPumpLuV.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.VanadiumGallium,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel5LuV.get(),
            ticks = 16000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                ImpactItems.LaserCore2.get(amount = 16),
                GregTechItems.SensorZPM.get(amount = 16),
                GregTechItems.ElectricPumpZPM.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Naquadah,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel5ZPM.get(),
            ticks = 16000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                ImpactItems.LaserCore2.get(amount = 16),
                GregTechItems.SensorUV.get(amount = 16),
                GregTechItems.ElectricPumpUV.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.NaquadahAlloy,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel5UV.get(),
            ticks = 16000,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMAX.get(),
                ImpactItems.LaserCore3.get(amount = 16),
                GregTechItems.SensorUHV.get(amount = 16),
                GregTechItems.ElectricPumpUHV.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Europium,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel5UHV.get(),
            ticks = 16000,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUEV.get(),
                ImpactItems.LaserCore3.get(amount = 16),
                GregTechItems.SensorUEV.get(amount = 16),
                GregTechItems.ElectricPumpUEV.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt08,
                    material = Materials.Diamericiumtitanium,
                    count = 8,
                ),
                GT_Utility.getIntegratedCircuit(5),
            ),
            fluid = null,
            output = ImpactItems.EnergyTunnel5UEV.get(),
            ticks = 16000,
            eu = 8000000,
        )
    }
}
