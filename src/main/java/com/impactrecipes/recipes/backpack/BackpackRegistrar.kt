package com.impactrecipes.recipes.backpack

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class BackpackRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.BACKPACK)
        }

    public override fun register() {
        BackpackRecipeRemovals().register()
        BackpackCraftingRecipes().register()
        BackpackColorRecipes().register()
        BackpackLeatherRecipes().register()
    }
}
