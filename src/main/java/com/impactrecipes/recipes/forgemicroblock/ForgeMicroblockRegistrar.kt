package com.impactrecipes.recipes.forgemicroblock

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ForgeMicroblockRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("ForgeMicroblock")
        }

    public override fun register() {
        ForgeMicroblockCraftingRecipes().register()
        ForgeMicroblockLathingRecipes().register()
    }
}
