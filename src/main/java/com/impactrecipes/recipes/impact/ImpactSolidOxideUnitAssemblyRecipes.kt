package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class ImpactSolidOxideUnitAssemblyRecipes {

    internal fun register() {
        val yszUnit = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTech_API.getStackofAmountFromOreDict(
                "plateYSZ",
                6,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.StainlessSteel,
                count = 1,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.rotor,
                material = Materials.StainlessSteel,
                count = 1,
            ),
            GregTechItems.ElectricMotorEV.get(),
        )

        MachineRecipes.assembler(
            inputs = yszUnit,
            fluid = Materials.Hydrogen.getGas(4000),
            output = ImpactItems.CeramicCasing.get(),
            ticks = 20 * 60,
            eu = 480,
        )

        val gdcUnit = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTech_API.getStackofAmountFromOreDict(
                "plateGDC",
                6,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Titanium,
                count = 1,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.rotor,
                material = Materials.Titanium,
                count = 1,
            ),
            GregTechItems.ElectricMotorIV.get(),
        )

        MachineRecipes.assembler(
            inputs = gdcUnit,
            fluid = Materials.Hydrogen.getGas(8000),
            output = ImpactItems.CeramicBlock1.get(),
            ticks = 20 * 60,
            eu = 1920,
        )

        val lscfUnit = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTech_API.getStackofAmountFromOreDict(
                "plateLSCF",
                6,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.TungstenSteel,
                count = 1,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.rotor,
                material = Materials.TungstenSteel,
                count = 1,
            ),
            GregTechItems.ElectricMotorLuV.get(),
        )

        MachineRecipes.assembler(
            inputs = lscfUnit,
            fluid = Materials.Hydrogen.getGas(16000),
            output = ImpactItems.CeramicBlock2.get(),
            ticks = 20 * 60,
            eu = 7680,
        )
    }
}
