package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.ItemList
import gregtech.api.enums.Materials
import net.minecraftforge.fluids.FluidStack

internal class GalacticraftTankFillingRecipes {

    internal fun register() {
        MachineRecipes.fluidCanner(
            input = GalacticraftCoreItems.ItemOxygenTankLightFull1800.get(),
            output = GalacticraftCoreItems.ItemOxygenTankLightFull.get(),
            fluidInput = Materials.Oxygen.getGas(1800),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = GalacticraftCoreItems.ItemOxygenTankMedFull3600.get(),
            output = GalacticraftCoreItems.ItemOxygenTankMedFull.get(),
            fluidInput = Materials.Oxygen.getGas(3600),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = GalacticraftCoreItems.ItemOxygenTankHeavyFull5400.get(),
            output = GalacticraftCoreItems.ItemOxygenTankHeavyFull.get(),
            fluidInput = Materials.Oxygen.getGas(5400),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = GalacticraftCoreItems.ItemOxygenTankt47200.get(),
            output = GalacticraftCoreItems.ItemOxygenTankt4.get(),
            fluidInput = Materials.Oxygen.getGas(7200),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = GalacticraftCoreItems.ItemOxygenTankt59000.get(),
            output = GalacticraftCoreItems.ItemOxygenTankt5.get(),
            fluidInput = Materials.Oxygen.getGas(9000),
            fluidOutput = GT_Values.NF,
        )

        MachineRecipes.fluidCanner(
            input = GalacticraftCoreItems.ItemFuelCanisterPartial1001.get(),
            output = GalacticraftCoreItems.ItemFuelCanisterPartial1.get(),
            fluidInput = FluidStack(
                ItemList.sRocketFuel,
                1000,
            ),
            fluidOutput = GT_Values.NF,
        )
    }
}
