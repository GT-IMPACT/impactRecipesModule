package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactLaserDynamo4096AssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                ImpactItems.LaserCore1.get(amount = 4),
                GregTechItems.EmitterIV.get(amount = 4),
                GregTechItems.ElectricPumpIV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel3IV.get(),
            ticks = 4000,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                ImpactItems.LaserCore1.get(amount = 4),
                GregTechItems.EmitterLuV.get(amount = 4),
                GregTechItems.ElectricPumpLuV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.VanadiumGallium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel3LuV.get(),
            ticks = 4000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                ImpactItems.LaserCore2.get(amount = 4),
                GregTechItems.EmitterZPM.get(amount = 4),
                GregTechItems.ElectricPumpZPM.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Naquadah,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel3ZPM.get(),
            ticks = 4000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                ImpactItems.LaserCore2.get(amount = 4),
                GregTechItems.EmitterUV.get(amount = 4),
                GregTechItems.ElectricPumpUV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.NaquadahAlloy,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel3UV.get(),
            ticks = 4000,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMAX.get(),
                ImpactItems.LaserCore3.get(amount = 4),
                GregTechItems.EmitterUHV.get(amount = 4),
                GregTechItems.ElectricPumpUHV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Europium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel3UHV.get(),
            ticks = 4000,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUEV.get(),
                ImpactItems.LaserCore3.get(amount = 4),
                GregTechItems.EmitterUEV.get(amount = 4),
                GregTechItems.ElectricPumpUEV.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt04,
                    material = Materials.Diamericiumtitanium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(3),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel3UEV.get(),
            ticks = 4000,
            eu = 8000000,
        )
    }
}
