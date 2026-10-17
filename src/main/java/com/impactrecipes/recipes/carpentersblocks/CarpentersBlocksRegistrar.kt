package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class CarpentersBlocksRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("CarpentersBlocks")
        }

    public override fun register() {
        CarpentersRecipeRemovals().register()
        CarpentersFrameCraftingRecipes().register()
        CarpentersToolCraftingRecipes().register()
        CarpentersFixtureCraftingRecipes().register()
        CarpentersAccessCraftingRecipes().register()
        CarpentersBuildingCraftingRecipes().register()
        CarpentersFrameAssemblyRecipes().register()
        CarpentersAccessAssemblyRecipes().register()
        CarpentersToolAssemblyRecipes().register()
        CarpentersDoorAssemblyRecipes().register()
        CarpentersCuttingRecipes().register()
    }
}
