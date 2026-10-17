package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.ChestUpItems
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class LogisticsRoutedPipeAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsBasicLogistics.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                VanillaItems.Chest.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Redstone.getMolten(288),
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(amount = 4),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 2,
                ),
                ExtraUtilitiesItems.ChestFull.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.RedAlloy.getMolten(288),
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk2.get(amount = 4),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk2.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                ChestUpItems.WroughtIronChest.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Electrum.getMolten(288),
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk3.get(amount = 4),
            ticks = 200,
            eu = 48,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk3.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 2,
                ),
                ChestUpItems.SteelChest.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Electrum.getMolten(576),
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk4.get(amount = 4),
            ticks = 200,
            eu = 86,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk4.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                ChestUpItems.AluminiumChest.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.EnergeticAlloy.getMolten(576),
            output = LogisticsPipesItems.ItemPipeLogisticsChassiMk5.get(amount = 4),
            ticks = 200,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(amount = 4),
                GregTechItems.CoverCrafting.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Basic,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsCraftingLogistics.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk2.get(amount = 4),
                GregTechItems.CoverCrafting.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Good,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsCraftingLogisticsMk2.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk3.get(amount = 4),
                GregTechItems.CoverCrafting.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.circuit,
                    material = Materials.Advanced,
                    count = 1,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsCraftingLogisticsMk3.get(amount = 4),
            ticks = 140,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(amount = 4),
                GregTechItems.ConveyorModuleLV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsProviderLogistics.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk2.get(amount = 4),
                GregTechItems.ConveyorModuleMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsProviderLogisticsMk2.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(amount = 4),
                GregTechItems.ConveyorModuleMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Electrum,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsSupplierLogistics.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(amount = 4),
                GregTechItems.RobotArmLV.get(),
                GregTechItems.CoverScreen.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsRequestLogistics.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk2.get(amount = 4),
                GregTechItems.RobotArmMV.get(),
                GregTechItems.CoverScreen.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsRequestLogisticsMk2.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(amount = 4),
                GregTechItems.ElectricMotorLV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.gear,
                    material = Materials.Steel,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsInvSysConnector.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk1.get(amount = 4),
                GregTechItems.ElectricMotorMV.get(),
                RecipeItems.ore(
                    prefix = OrePrefixes.gearGtSmall,
                    material = Materials.Aluminium,
                    count = 2,
                ),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsFirewall.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk2.get(amount = 4),
                GregTechItems.ElectricPistonMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = Materials.Electrum.getMolten(288),
            output = LogisticsPipesItems.ItemPipeItemsSystemEntranceLogistics.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeLogisticsChassiMk2.get(amount = 4),
                GregTechItems.ElectricPistonMV.get(),
                GT_Utility.getIntegratedCircuit(2),
            ),
            fluid = Materials.RedAlloy.getMolten(288),
            output = LogisticsPipesItems.ItemPipeItemsSystemDestinationLogistics.get(amount = 4),
            ticks = 120,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsCraftingLogistics.get(amount = 4),
                GregTechItems.ElectricPistonMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsSatelliteLogistics.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                LogisticsPipesItems.ItemPipeItemsSystemEntranceLogistics.get(amount = 4),
                GregTechItems.ConveyorModuleMV.get(),
                GT_Utility.getIntegratedCircuit(1),
            ),
            fluid = null,
            output = LogisticsPipesItems.ItemPipeItemsRemoteOrdererLogistics.get(amount = 4),
            ticks = 120,
            eu = 120,
        )
    }
}
