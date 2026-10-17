package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactLaserDynamo1048576AssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullIV.get(),
                ImpactItems.LaserCore1.get(amount = 64),
                GregTechItems.EmitterIV.get(amount = 64),
                GregTechItems.ElectricPumpIV.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.TungstenSteel,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel7IV.get(),
            ticks = 64000,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullLuV.get(),
                ImpactItems.LaserCore1.get(amount = 64),
                GregTechItems.EmitterLuV.get(amount = 64),
                GregTechItems.ElectricPumpLuV.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.VanadiumGallium,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel7LuV.get(),
            ticks = 64000,
            eu = 30720,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullZPM.get(),
                ImpactItems.LaserCore2.get(amount = 64),
                GregTechItems.EmitterZPM.get(amount = 64),
                GregTechItems.ElectricPumpZPM.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Naquadah,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel7ZPM.get(),
            ticks = 64000,
            eu = 122880,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUV.get(),
                ImpactItems.LaserCore2.get(amount = 64),
                GregTechItems.EmitterUV.get(amount = 64),
                GregTechItems.ElectricPumpUV.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.NaquadahAlloy,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel7UV.get(),
            ticks = 64000,
            eu = 500000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullMAX.get(),
                ImpactItems.LaserCore3.get(amount = 64),
                GregTechItems.EmitterUHV.get(amount = 64),
                GregTechItems.ElectricPumpUHV.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Europium,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel7UHV.get(),
            ticks = 64000,
            eu = 2000000,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HullUEV.get(),
                ImpactItems.LaserCore3.get(amount = 64),
                GregTechItems.EmitterUEV.get(amount = 64),
                GregTechItems.ElectricPumpUEV.get(amount = 64),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireGt16,
                    material = Materials.Diamericiumtitanium,
                    count = 16,
                ),
                GT_Utility.getIntegratedCircuit(7),
            ),
            fluid = null,
            output = ImpactItems.DynamoTunnel7UEV.get(),
            ticks = 64000,
            eu = 8000000,
        )
    }
}
