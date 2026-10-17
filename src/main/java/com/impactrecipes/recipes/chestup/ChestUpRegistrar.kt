package com.impactrecipes.recipes.chestup

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ChestUpRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.CHESTUP)
        }

    public override fun register() {
        ChestUpCraftingRecipes().register()
        ChestUpAssemblyRecipes().register()
    }
}
