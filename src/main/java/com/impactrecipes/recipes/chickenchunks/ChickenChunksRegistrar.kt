package com.impactrecipes.recipes.chickenchunks

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ChickenChunksRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.CHICKENS)
        }

    public override fun register() {
        ChickenChunksRecipes().register()
    }
}
