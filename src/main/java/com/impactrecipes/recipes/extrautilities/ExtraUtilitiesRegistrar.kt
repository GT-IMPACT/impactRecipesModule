package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ExtraUtilitiesRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("ExtraUtilities")
        }

    public override fun register() {
        ExtraUtilitiesRecipeRemovals().register()
        ExtraUtilitiesStorageCraftingRecipes().register()
        ExtraUtilitiesUtilityCraftingRecipes().register()
        ExtraUtilitiesQuarryPrinterRecipes().register()
        ExtraUtilitiesGlassSmeltingRecipes().register()
        ExtraUtilitiesQuarryAssemblyRecipes().register()
        ExtraUtilitiesUtilityAssemblyRecipes().register()
        ExtraUtilitiesGlassAssemblyRecipes().register()
        ExtraUtilitiesStoneAssemblyRecipes().register()
        ExtraUtilitiesEtherealGlassRecipes().register()
    }
}
