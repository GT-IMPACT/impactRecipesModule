package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class LogisticsFluidPipeAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 8),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Steel,
                    count = 1,
                ),
                GregTechItems.ElectricPumpLV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidBasic.get(amount = 8),
            ticks = 160,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 16),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
                GregTechItems.ElectricPumpMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidBasic.get(amount = 16),
            ticks = 180,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 32),
                RecipeItems.ore(
                    prefix = OrePrefixes.pipeMedium,
                    material = Materials.Titanium,
                    count = 1,
                ),
                GregTechItems.ElectricPumpHV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidBasic.get(amount = 32),
            ticks = 200,
            eu = 480,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeFluidBasic.get(),
                LogisticsPipesItems.ItemPipeItemsRequestLogistics.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidRequestLogistics.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeFluidBasic.get(),
                LogisticsPipesItems.ItemPipeItemsSatelliteLogistics.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidSatellite.get(),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeFluidBasic.get(amount = 4),
                LogisticsPipesItems.ItemItemModule500.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidProvider.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeFluidBasic.get(amount = 4),
                LogisticsPipesItems.ItemItemModule502.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidSupplierMk2.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeFluidBasic.get(amount = 4),
                LogisticsPipesItems.ItemItemModule3.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidExtractor.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeFluidBasic.get(amount = 4),
                GregTechItems.ElectricPumpMV.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeFluidInsertion.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeFluidBasic.get(amount = 4),
                GregTechItems.RobotArmLV.get(),
                GregTechItems.LargeFluidCellSteel.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsFluidSupplier.get(amount = 4),
            ticks = 100,
            eu = 120,
        )
    }
}
