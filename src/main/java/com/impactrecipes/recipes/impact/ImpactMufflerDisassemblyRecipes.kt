package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactMufflerDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = GregTechItems.HatchMufflerHV.get(),
            outputs = arrayOf(
                GregTechItems.HullHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                GregTechItems.ElectricMotorHV.get(),
            ),
            ticks = 2000,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchMufflerEV.get(),
            outputs = arrayOf(
                GregTechItems.HullEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Titanium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Titanium,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchMufflerIV.get(),
            outputs = arrayOf(
                GregTechItems.HullIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.TungstenSteel,
                    count = 1,
                ),
                GregTechItems.ElectricMotorIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.TungstenSteel,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchMufflerLuV.get(),
            outputs = arrayOf(
                GregTechItems.HullLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Enderium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Iridium,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchMufflerZPM.get(),
            outputs = arrayOf(
                GregTechItems.HullZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Naquadah,
                    count = 1,
                ),
                GregTechItems.ElectricMotorZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Osmium,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchMufflerUV.get(),
            outputs = arrayOf(
                GregTechItems.HullUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Duranium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.NaquadahAlloy,
                    count = 1,
                ),
            ),
            ticks = 2000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = GregTechItems.HatchMufflerMAX.get(),
            outputs = arrayOf(
                GregTechItems.HullMAX.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeLarge,
                    material = Materials.Infuscolium,
                    count = 1,
                ),
                GregTechItems.ElectricMotorUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.rotor,
                    material = Materials.Diamericiumtitanium,
                    count = 1,
                ),
            ),
            ticks = 4000,
            eu = 500000,
        )
    }
}
