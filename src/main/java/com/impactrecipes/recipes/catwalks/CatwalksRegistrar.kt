package com.impactrecipes.recipes.catwalks

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class CatwalksRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("catwalks")
        }

    public override fun register() {
        CatwalksRecipeRemovals().register()
        CatwalksCraftingRecipes().register()
        CatwalksAssemblyRecipes().register()
        CatwalksGratingRecipes().register()
    }
}
