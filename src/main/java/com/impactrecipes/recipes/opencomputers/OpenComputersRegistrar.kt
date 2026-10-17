package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IOreRecipeRegistry
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class OpenComputersRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.OC)
        }

    public override fun register() {
        OpenComputersRecipeRemovals().register()
        OpenComputersComponentCuttingRecipes().register()
        OpenComputersMachineCraftingRecipes().register()
        OpenComputersDeviceCraftingRecipes().register()
        OpenComputersPeripheralCraftingRecipes().register()
        OpenComputersMediaAndCaseCraftingRecipes().register()
        OpenComputersFloppySoftwareRecipes().register()
        OpenComputersStorageAndServerCraftingRecipes().register()
        OpenComputersScreenAssemblyRecipes().register()
        OpenComputersLogicAssemblyRecipes().register()
        OpenComputersProcessorAssemblyRecipes().register()
        OpenComputersEepromRecipes().register()
        OpenComputersMemoryAssemblyRecipes().register()
        OpenComputersMicrochipTier1Recipes().register()
        OpenComputersMicrochipTier2Recipes().register()
        OpenComputersMicrochipTier3Recipes().register()
        OpenComputersCardAssemblyRecipes().register()
        OpenComputersMobilityAndBatteryUpgradeRecipes().register()
        OpenComputersInventoryAndContainerUpgradeRecipes().register()
        OpenComputersRobotUpgradeRecipes().register()
        OpenComputersComputronicsPeripheralRecipes().register()
        OpenComputersSecurityPeripheralRecipes().register()
        OpenComputersSecurityCardAndTurretRecipes().register()
        OpenComputersSecureDoorAndUpgradeRecipes().register()
    }

    public override fun registerOreRecipes(oreRecipes: IOreRecipeRegistry) {
        oreRecipes.register(OpenComputersLensRecipes())
    }
}
