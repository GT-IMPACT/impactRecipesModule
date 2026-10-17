package com.impactrecipes.recipes.undergroundbiomes

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class UndergroundBiomesRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("UndergroundBiomes")
        }

    public override fun register() {
        UndergroundBiomesRecipeRemovals().register()
        UndergroundBiomesCraftingRecipes().register()
        UndergroundBiomesCuttingRecipes().register()
        UndergroundBiomesPulverizingRecipes().register()
    }
}
