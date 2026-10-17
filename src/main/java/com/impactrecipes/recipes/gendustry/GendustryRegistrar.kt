package com.impactrecipes.recipes.gendustry

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class GendustryRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("gendustry")
        }

    public override fun register() {
        GendustryRecipeRemovals().register()
        GendustryMachineCraftingRecipes().register()
        GendustryApiaryUpgradeRecipes().register()
        GendustryToolCraftingRecipes().register()
        GendustryPrinterRecipes().register()
        GendustryComponentAssemblyRecipes().register()
    }
}
