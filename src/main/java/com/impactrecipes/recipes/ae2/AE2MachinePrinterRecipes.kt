package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2MachinePrinterRecipes {

    internal fun register() {
        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.frameGt,
                    material = Materials.VanadiumSteel,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Data,
                    count = 1,
                ),
                AE2Items.CalculationProcessor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.Platinum,
                    count = 4,
                ),
                AE2Items.MESmartCableFluix.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.VanadiumSteel,
                    count = 12,
                ),
            ),
            output = AE2Items.CraftingUnit.get(),
            fluidInputs = null,
            ticks = 30 * 20,
            eu = 1920,
        )

        MachineRecipes.printer3d3x3(
            inputs = arrayOf(
                AE2Items.EnergyCell.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.wireFine,
                    material = Materials.EnergeticAlloy,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 2,
                ),
                AE2Items.FluixCrystal.get(amount = 4),
                AE2Items.EngineeringProcessor.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plateDouble,
                    material = Materials.Vanadium,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.VanadiumSteel,
                    count = 8,
                ),
            ),
            output = AE2Items.EnergyAcceptor.get(),
            fluidInputs = null,
            ticks = 200,
            eu = 480,
        )
    }
}
