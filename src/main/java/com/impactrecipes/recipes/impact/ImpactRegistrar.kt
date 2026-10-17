package com.impactrecipes.recipes.impact

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import com.impactrecipes.loader.IOreRecipeRegistry
import cpw.mods.fml.common.Loader

public class ImpactRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.IMPACT)
        }

    public override fun registerOreRecipes(oreRecipes: IOreRecipeRegistry) {
        oreRecipes.register(ImpactLensRecipes())
    }
}
