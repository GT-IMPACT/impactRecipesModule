package com.impactrecipes.recipes.ztones

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ZtonesRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("Ztones")
        }

    public override fun register() {
        ZtonesRecipeRemovals().register()
        ZtonesUtilityCraftingRecipes().register()
        ZtonesTileCraftingRecipes().register()
        ZtonesHammerRecipes().register()
        ZtonesBaseAssemblyRecipes().register()
        ZtonesTileAssemblyRecipes().register()
        ZtonesLampCuttingRecipes().register()
    }
}
