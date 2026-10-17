package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactLaserDynamo1024AssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                ImpactItems.LaserCore1.get(amount = 2),
                GregTechItems.EmitterIV.get(amount = 2),
                GregTechItems.ElectricPumpIV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel2IV.get(),
            ticks = 2000,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                ImpactItems.LaserCore1.get(amount = 2),
                GregTechItems.EmitterLuV.get(amount = 2),
                GregTechItems.ElectricPumpLuV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.VanadiumGallium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel2LuV.get(),
            ticks = 2000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                ImpactItems.LaserCore2.get(amount = 2),
                GregTechItems.EmitterZPM.get(amount = 2),
                GregTechItems.ElectricPumpZPM.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Naquadah,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel2ZPM.get(),
            ticks = 2000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                ImpactItems.LaserCore2.get(amount = 2),
                GregTechItems.EmitterUV.get(amount = 2),
                GregTechItems.ElectricPumpUV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.NaquadahAlloy,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel2UV.get(),
            ticks = 2000,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMAX.get(),
                ImpactItems.LaserCore3.get(amount = 2),
                GregTechItems.EmitterUHV.get(amount = 2),
                GregTechItems.ElectricPumpUHV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Europium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel2UHV.get(),
            ticks = 2000,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUEV.get(),
                ImpactItems.LaserCore3.get(amount = 2),
                GregTechItems.EmitterUEV.get(amount = 2),
                GregTechItems.ElectricPumpUEV.get(amount = 2),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt02,
                    material = Materials.Diamericiumtitanium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel2UEV.get(),
            ticks = 2000,
            eu = 8000000,
        )
    }
}
