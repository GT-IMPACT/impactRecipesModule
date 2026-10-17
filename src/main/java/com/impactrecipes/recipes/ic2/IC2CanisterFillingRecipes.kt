package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

internal class IC2CanisterFillingRecipes {

    internal fun register() {
        MachineRecipes.fluidCanner(
            input = ImpactItems.TenKCell.get(),
            output = ModItemVariant(
                item = IC2Items.ReactorCoolantSimple,
                meta = 1,
            ).get(),
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                1000,
            ),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.ThirtyKCell.get(),
            output = ModItemVariant(
                item = IC2Items.ReactorCoolantTriple,
                meta = 1,
            ).get(),
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                3000,
            ),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.SixtyKCell.get(),
            output = ModItemVariant(
                item = IC2Items.ReactorCoolantSix,
                meta = 1,
            ).get(),
            fluidInput = FluidStack(
                FluidRegistry.getFluid("ic2coolant"),
                6000,
            ),
            fluidOutput = GT_Values.NF,
        )
    }
}
