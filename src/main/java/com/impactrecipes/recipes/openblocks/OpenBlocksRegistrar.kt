package com.impactrecipes.recipes.openblocks

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class OpenBlocksRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.OPENBLOCKS)
        }

    public override fun register() {
        OpenBlocksRecipeRemovals().register()
        OpenBlocksCraftingRecipes().register()
        OpenBlocksMachineRecipes().register()
    }
}
