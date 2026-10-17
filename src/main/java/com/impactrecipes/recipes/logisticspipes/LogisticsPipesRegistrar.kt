package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class LogisticsPipesRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("LogisticsPipes")
        }

    public override fun register() {
        LogisticsRecipeRemovals().register()
        LogisticsMachineCraftingRecipes().register()
        LogisticsControlCraftingRecipes().register()
        LogisticsModuleCraftingRecipes().register()
        LogisticsBasicPipeAssemblyRecipes().register()
        LogisticsRoutedPipeAssemblyRecipes().register()
        LogisticsFluidPipeAssemblyRecipes().register()
        LogisticsUpgradeAssemblyRecipes().register()
        LogisticsComponentAssemblyRecipes().register()
        LogisticsControlCircuitRecipes().register()
        LogisticsSneakyUpgradeRecipes().register()
        LogisticsDisconnectionUpgradeRecipes().register()
        LogisticsModuleUpgradeRecipes().register()
        LogisticsModuleBathRecipes().register()
        LogisticsModulePressRecipes().register()
    }
}
