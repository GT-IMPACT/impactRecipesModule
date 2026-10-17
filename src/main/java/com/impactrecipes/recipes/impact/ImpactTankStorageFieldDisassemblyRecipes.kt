package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactTankStorageFieldDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.FluidTank.get(),
            outputs = arrayOf(
                GregTechItems.ElectricPumpMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 120,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.FluidTankBlock1.get(),
            outputs = arrayOf(
                GregTechItems.FieldGeneratorLV.get(),
                GregTechItems.ElectricPumpHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titanium,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 480,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.FluidTankBlock2.get(),
            outputs = arrayOf(
                GregTechItems.FieldGeneratorMV.get(),
                GregTechItems.ElectricPumpEV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.FluidTankBlock3.get(),
            outputs = arrayOf(
                GregTechItems.FieldGeneratorHV.get(),
                GregTechItems.ElectricPumpIV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Chrome,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 7680,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.FluidTankBlock4.get(),
            outputs = arrayOf(
                GregTechItems.FieldGeneratorEV.get(),
                GregTechItems.ElectricPumpLuV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Iridium,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 30720,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.FluidTankBlock5.get(),
            outputs = arrayOf(
                GregTechItems.FieldGeneratorIV.get(),
                GregTechItems.ElectricPumpZPM.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Osmium,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 122880,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.FluidTankBlock6.get(),
            outputs = arrayOf(
                GregTechItems.FieldGeneratorLuV.get(),
                GregTechItems.ElectricPumpUV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Tritanium,
                    count = 4,
                ),
            ),
            ticks = 2000,
            eu = 500000,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.FluidTankBlock7.get(),
            outputs = arrayOf(
                GregTechItems.FieldGeneratorZPM.get(),
                GregTechItems.ElectricPumpUHV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Neutronium,
                    count = 4,
                ),
            ),
            ticks = 4000,
            eu = 500000,
        )
    }
}
