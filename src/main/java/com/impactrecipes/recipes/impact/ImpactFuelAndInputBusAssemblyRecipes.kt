package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class ImpactFuelAndInputBusAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = ImpactItems.Naquadah.get(amount = 6),
            secondaryInput = ImpactItems.NaquadahE.get(amount = 3),
            fluidInput = Materials.SuperCoolant.getFluid(1000),
            output = ImpactItems.NaquadahENuclearFuel.get(),
            ticks = 500,
            eu = 1920,
        )

        MachineRecipes.assembler(
            input = ImpactItems.Naquadah.get(amount = 6),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.nugget,
                material = Materials.Plutonium241,
                count = 3,
            ),
            fluidInput = Materials.SuperCoolant.getFluid(1000),
            output = ImpactItems.NaquadahNuclearFuel.get(),
            ticks = 500,
            eu = 1024,
        )

        MachineRecipes.assembler(
            input = IC2Items.Uran238.get(amount = 6),
            secondaryInput = ImpactItems.ThoriumNuclearPart.get(amount = 3),
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                1000,
            ),
            output = ImpactItems.ThoriumNuclearFuel.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            input = ImpactItems.ThoriumNuclearPart.get(amount = 6),
            secondaryInput = IC2Items.Plutonium.get(amount = 3),
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                1000,
            ),
            output = ImpactItems.ThoriumMOXFuel.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchInputBusHV.get(),
                GregTechItems.LargeFluidCellAluminium.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.BusHatchInputHV.get(),
            ticks = 480,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchInputBusEV.get(),
                GregTechItems.LargeFluidCellStainlessSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.BusHatchInputEV.get(),
            ticks = 480,
            eu = 1920,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchInputBusIV.get(),
                GregTechItems.LargeFluidCellTitanium.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.BusHatchInputIV.get(),
            ticks = 480,
            eu = 7680,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                GregTechItems.HatchInputBusLuV.get(),
                GregTechItems.LargeFluidCellTungstenSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = ImpactItems.BusHatchInputLuV.get(),
            ticks = 480,
            eu = 30720,
        )
    }
}
