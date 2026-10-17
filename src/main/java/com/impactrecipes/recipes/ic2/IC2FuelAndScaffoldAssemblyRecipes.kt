package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class IC2FuelAndScaffoldAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = IC2Items.Uran238.get(amount = 6),
            secondaryInput = IC2Items.Plutonium.get(amount = 3),
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                1000,
            ),
            output = IC2Items.MOXFuel.get(),
            ticks = 400,
            eu = 250,
        )

        MachineRecipes.assembler(
            input = IC2Items.Uran238.get(amount = 6),
            secondaryInput = IC2Items.SmallUran235.get(amount = 3),
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                1000,
            ),
            output = IC2Items.UranFuel.get(),
            ticks = 400,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plank,
                    material = Materials.Wood,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Wood,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(12),
            ),
            fluid = null,
            output = IC2Items.Scaffold.get(),
            ticks = 20,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.WoodSealed,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.WoodSealed,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(12),
            ),
            fluid = null,
            output = IC2Items.Scaffold.get(amount = 2),
            ticks = 20,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Iron,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Iron,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(12),
            ),
            fluid = null,
            output = IC2Items.IronScaffold.get(),
            ticks = 20,
            eu = 4,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Steel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Steel,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(12),
            ),
            fluid = null,
            output = IC2Items.IronScaffold.get(amount = 2),
            ticks = 20,
            eu = 4,
        )
    }
}
