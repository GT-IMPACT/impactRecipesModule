package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.item
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GregTechFluidCellRecipes {

    internal fun filling() {
        MachineRecipes.fluidCanner(
            input = ImpactItems.Empty180SpCell.get(),
            output = GregTechItems.ReactorCoolantLe1.get(),
            fluidInput = Materials.SuperCoolant.getFluid(1000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.Empty360SpCell.get(),
            output = GregTechItems.ReactorCoolantLe2.get(),
            fluidInput = Materials.SuperCoolant.getFluid(2000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.Empty540SpCell.get(),
            output = GregTechItems.ReactorCoolantLe3.get(),
            fluidInput = Materials.SuperCoolant.getFluid(3000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.Empty1080SpCell.get(),
            output = GregTechItems.ReactorCoolantLe6.get(),
            fluidInput = Materials.SuperCoolant.getFluid(6000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.TenKCell.get(),
            output = GregTechItems.ReactorCoolantHe1.get(),
            fluidInput = Materials.Helium.getGas(1000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.ThirtyKCell.get(),
            output = GregTechItems.ReactorCoolantHe3.get(),
            fluidInput = Materials.Helium.getGas(3000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.SixtyKCell.get(),
            output = GregTechItems.ReactorCoolantHe6.get(),
            fluidInput = Materials.Helium.getGas(6000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.TenKCell.get(),
            output = GregTechItems.ReactorCoolantNaK1.get(),
            fluidInput = Materials.SodiumPotassium.getFluid(1000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.ThirtyKCell.get(),
            output = GregTechItems.ReactorCoolantNaK3.get(),
            fluidInput = Materials.SodiumPotassium.getFluid(3000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = ImpactItems.SixtyKCell.get(),
            output = GregTechItems.ReactorCoolantNaK6.get(),
            fluidInput = Materials.SodiumPotassium.getFluid(6000L),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = GregTechItems.NaquaBoardEmpty.get(),
            output = GregTechItems.NaquaBoardFull.get(),
            fluidInput = Materials.FluidNaquadahFuel.getFluid(2000L),
            fluidOutput = GT_Values.NF,
        )
    }

    internal fun canning() {
        //Air Filter
        MachineRecipes.canner(
            input = Materials.Coal.item(OrePrefixes.dust).get(amount = 32),
            secondaryInput = GregTechItems.AdsorptionFilterCasing.get(),
            output = GregTechItems.AdsorptionFilter.get(),
            secondaryOutput = null,
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.canner(
            input = GregTechItems.LargeFluidCellTungstenSteel.get(),
            secondaryInput = ImpactItems.NaquadahNuclearFuel.get(),
            output = GregTechItems.NaquadahCell1.get(),
            secondaryOutput = null,
            ticks = 30,
            eu = 12,
        )

        MachineRecipes.canner(
            input = GregTechItems.LargeFluidCellTungstenSteel.get(),
            secondaryInput = ImpactItems.NaquadahENuclearFuel.get(),
            output = GregTechItems.MNqCell1.get(),
            secondaryOutput = null,
            ticks = 30,
            eu = 12,
        )

        MachineRecipes.canner(
            input = IC2Items.FuelRod.get(),
            secondaryInput = ImpactItems.ThoriumNuclearFuel.get(),
            output = GregTechItems.ThoriumCell1.get(),
            secondaryOutput = null,
            ticks = 30,
            eu = 12,
        )

        MachineRecipes.canner(
            input = IC2Items.FuelRod.get(),
            secondaryInput = ImpactItems.ThoriumMOXFuel.get(),
            output = GregTechItems.MThCell1.get(),
            secondaryOutput = null,
            ticks = 30,
            eu = 12,
        )
    }
}
