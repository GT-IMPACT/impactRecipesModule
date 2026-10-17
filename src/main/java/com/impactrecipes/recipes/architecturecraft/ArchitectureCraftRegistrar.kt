package com.impactrecipes.recipes.architecturecraft

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ArchitectureCraftRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.ARCHITEC)
        }

    public override fun register() {
        ArchitectureCraftRecipes().register()
    }
}
