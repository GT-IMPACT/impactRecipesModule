package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility
import net.minecraftforge.fluids.FluidRegistry

internal class ImpactTankStorageFieldAssemblyRecipes {

    internal fun register() {
        val tfftstoragefield1 = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTechItems.ElectricPumpMV.get(),
            RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.StainlessSteel,
                count = 4,
            ),
        )

        MachineRecipes.assembler(
            inputs = tfftstoragefield1,
            fluid = FluidRegistry.getFluidStack(
                "molten.polytetrafluoroethylene",
                36,
            ),
            output = ImpactItems.FluidTank.get(),
            ticks = 200,
            eu = 480,
        )

        val tfftstoragefield2 = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTechItems.FieldGeneratorLV.get(),
            GregTechItems.ElectricPumpHV.get(),
            RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Titanium,
                count = 4,
            ),
        )

        MachineRecipes.assembler(
            inputs = tfftstoragefield2,
            fluid = FluidRegistry.getFluidStack(
                "molten.polytetrafluoroethylene",
                144,
            ),
            output = ImpactItems.FluidTankBlock1.get(),
            ticks = 200,
            eu = 1920,
        )

        val tfftstoragefield3 = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTechItems.FieldGeneratorMV.get(),
            GregTechItems.ElectricPumpEV.get(),
            RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.TungstenSteel,
                count = 4,
            ),
        )

        MachineRecipes.assembler(
            inputs = tfftstoragefield3,
            fluid = FluidRegistry.getFluidStack(
                "molten.epoxid",
                144,
            ),
            output = ImpactItems.FluidTankBlock2.get(),
            ticks = 200,
            eu = 7680,
        )

        val tfftstoragefield4 = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTechItems.FieldGeneratorHV.get(),
            GregTechItems.ElectricPumpIV.get(),
            RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Chrome,
                count = 4,
            ),
        )

        MachineRecipes.assembler(
            inputs = tfftstoragefield4,
            fluid = FluidRegistry.getFluidStack(
                "molten.epoxid",
                144,
            ),
            output = ImpactItems.FluidTankBlock3.get(),
            ticks = 200,
            eu = 30720,
        )

        val tfftstoragefield5 = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTechItems.FieldGeneratorEV.get(),
            GregTechItems.ElectricPumpLuV.get(),
            RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iridium,
                count = 4,
            ),
        )

        MachineRecipes.assembler(
            inputs = tfftstoragefield5,
            fluid = FluidRegistry.getFluidStack(
                "molten.epoxid",
                144,
            ),
            output = ImpactItems.FluidTankBlock4.get(),
            ticks = 200,
            eu = 122880,
        )

        val tfftstoragefield6 = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTechItems.FieldGeneratorIV.get(),
            GregTechItems.ElectricPumpZPM.get(),
            RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Osmium,
                count = 4,
            ),
        )

        MachineRecipes.assembler(
            inputs = tfftstoragefield6,
            fluid = FluidRegistry.getFluidStack(
                "molten.epoxid",
                144,
            ),
            output = ImpactItems.FluidTankBlock5.get(),
            ticks = 200,
            eu = 491520,
        )

        val tfftstoragefield7 = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTechItems.FieldGeneratorLuV.get(),
            GregTechItems.ElectricPumpUV.get(),
            RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Tritanium,
                count = 4,
            ),
        )

        MachineRecipes.assembler(
            inputs = tfftstoragefield7,
            fluid = FluidRegistry.getFluidStack(
                "molten.epoxid",
                144,
            ),
            output = ImpactItems.FluidTankBlock6.get(),
            ticks = 200,
            eu = 1966080,
        )

        val tfftstoragefield8 = arrayOf(
            GT_Utility.getIntegratedCircuit(6),
            GregTechItems.FieldGeneratorZPM.get(),
            GregTechItems.ElectricPumpUHV.get(),
            RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Neutronium,
                count = 4,
            ),
        )

        MachineRecipes.assembler(
            inputs = tfftstoragefield8,
            fluid = FluidRegistry.getFluidStack(
                "molten.epoxid",
                144,
            ),
            output = ImpactItems.FluidTankBlock7.get(),
            ticks = 200,
            eu = 7864320,
        )
    }
}
