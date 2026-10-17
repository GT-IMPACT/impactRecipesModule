package com.impactrecipes.recipes.storagedrawers

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class StorageDrawersRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("StorageDrawers")
        }

    public override fun register() {
        DrawerWoodCraftingRecipes().register()
        DrawerControllerCraftingRecipes().register()
        DrawerCapacityUpgradeRecipes().register()
        DrawerAutomationUpgradeRecipes().register()
        DrawerFramingCraftingRecipes().register()
        DrawerWoodAssemblyRecipes().register()
        DrawerTemplateAssemblyRecipes().register()
        DrawerUtilityAssemblyRecipes().register()
    }
}
