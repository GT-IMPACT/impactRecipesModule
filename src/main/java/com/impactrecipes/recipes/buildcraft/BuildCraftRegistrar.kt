package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class BuildCraftRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("BuildCraft|Core")
        }

    public override fun register() {
        BuildCraftRecipeRemovals().register()
        BuildCraftBuilderCraftingRecipes().register()
        BuildCraftMarkerCraftingRecipes().register()
        BuildCraftDeviceCraftingRecipes().register()
        BuildCraftPipeCraftingRecipes().register()
        BuildCraftColoredPipeCraftingRecipes().register()
        BuildCraftPipeAssemblyRecipes().register()
        BuildCraftColoredPipeAssemblyRecipes().register()
        BuildCraftPipeCuttingRecipes().register()
    }
}
