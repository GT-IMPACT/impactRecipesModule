package com.impactrecipes.recipes.forestry

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ForestryRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("Forestry")
        }

    public override fun register() {
        ForestryRecipeRemovals().register()
        ForestryBackpackRecipes().register()
        ForestryWoodCraftingRecipes().register()
        ForestryToolCraftingRecipes().register()
        ForestryWaxSmeltingRecipes().register()
        ForestryFenceAssemblyRecipes().register()
        ForestryWoodAssemblyRecipes().register()
        ForestryChipsetRecipes().register()
        ForestryWaxPressRecipes().register()
        ForestryHoneyCastingRecipes().register()
    }
}
