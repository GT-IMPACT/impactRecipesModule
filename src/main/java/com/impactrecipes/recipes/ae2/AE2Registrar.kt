package com.impactrecipes.recipes.ae2

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import com.impactrecipes.loader.IOreRecipeRegistry
import cpw.mods.fml.common.Loader

public class AE2Registrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.AE2)
        }

    public override fun registerOreRecipes(oreRecipes: IOreRecipeRegistry) {
        oreRecipes.register(AE2LensRecipes())
    }
}
