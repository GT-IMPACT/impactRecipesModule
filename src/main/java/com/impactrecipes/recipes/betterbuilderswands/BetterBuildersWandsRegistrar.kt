package com.impactrecipes.recipes.betterbuilderswands

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class BetterBuildersWandsRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("betterbuilderswands")
        }

    public override fun register() {
        BetterBuildersWandsRecipeRemovals().register()
        BetterBuildersWandsCraftingRecipes().register()
        BetterBuildersWandsAssemblyRecipes().register()
    }
}
