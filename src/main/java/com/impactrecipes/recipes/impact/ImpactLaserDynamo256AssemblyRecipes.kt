package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactLaserDynamo256AssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                ImpactItems.LaserCore1.get(),
                GregTechItems.EmitterIV.get(),
                GregTechItems.ElectricPumpIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.TungstenSteel,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel1IV.get(),
            ticks = 1000,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                ImpactItems.LaserCore1.get(),
                GregTechItems.EmitterLuV.get(),
                GregTechItems.ElectricPumpLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.VanadiumGallium,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel1LuV.get(),
            ticks = 1000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                ImpactItems.LaserCore2.get(),
                GregTechItems.EmitterZPM.get(),
                GregTechItems.ElectricPumpZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Naquadah,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel1ZPM.get(),
            ticks = 1000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                ImpactItems.LaserCore2.get(),
                GregTechItems.EmitterUV.get(),
                GregTechItems.ElectricPumpUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.NaquadahAlloy,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel1UV.get(),
            ticks = 1000,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMAX.get(),
                ImpactItems.LaserCore3.get(),
                GregTechItems.EmitterUHV.get(),
                GregTechItems.ElectricPumpUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Europium,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel1UHV.get(),
            ticks = 1000,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUEV.get(),
                ImpactItems.LaserCore3.get(),
                GregTechItems.EmitterUEV.get(),
                GregTechItems.ElectricPumpUEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt01,
                    material = Materials.Diamericiumtitanium,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel1UEV.get(),
            ticks = 1000,
            eu = 8000000,
        )
    }
}
