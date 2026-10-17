package com.impactrecipes.recipes.projectred

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import com.impactrecipes.loader.IOreRecipeRegistry
import cpw.mods.fml.common.Loader

public class ProjectRedRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.PROJECTRED)
        }

    public override fun registerOreRecipes(oreRecipes: IOreRecipeRegistry) {
        oreRecipes.register(ProjectRedLensRecipes())
    }
}
