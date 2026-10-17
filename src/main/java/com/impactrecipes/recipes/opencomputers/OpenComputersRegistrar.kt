package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import com.impactrecipes.loader.IOreRecipeRegistry
import cpw.mods.fml.common.Loader

public class OpenComputersRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.OC)
        }

    public override fun registerOreRecipes(oreRecipes: IOreRecipeRegistry) {
        oreRecipes.register(OpenComputersLensRecipes())
    }
}
