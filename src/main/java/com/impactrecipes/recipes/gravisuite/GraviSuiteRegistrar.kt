package com.impactrecipes.recipes.gravisuite

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class GraviSuiteRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("GraviSuite")
        }

    public override fun register() {
        GraviSuiteConductorRecipes().register()
        GraviSuiteCoreRecipes().register()
        GraviSuiteToolRecipes().register()
        GraviSuiteArmorRecipes().register()
        GraviSuiteArmorPrinterRecipes().register()
        GraviSuiteRelocatorRecipes().register()
    }
}
