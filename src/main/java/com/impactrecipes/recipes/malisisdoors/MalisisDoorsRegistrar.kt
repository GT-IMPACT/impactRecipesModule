package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class MalisisDoorsRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("malisisdoors")
        }

    public override fun register() {
        MalisisDoorsRecipeRemovals().register()
        MalisisMetalHatchCraftingRecipes().register()
        MalisisDeviceCraftingRecipes().register()
        MalisisWoodDoorCraftingRecipes().register()
        MalisisWoodTrapdoorCraftingRecipes().register()
        MalisisSpecialDoorCraftingRecipes().register()
        MalisisCurtainCraftingRecipes().register()
        MalisisFenceGateCraftingRecipes().register()
        MalisisMetalHatchAssemblyRecipes().register()
        MalisisDeviceAssemblyRecipes().register()
        MalisisWoodDoorAssemblyRecipes().register()
        MalisisSpecialDoorAssemblyRecipes().register()
        MalisisCurtainAssemblyRecipes().register()
        MalisisFenceGateAssemblyRecipes().register()
        MalisisWoodTrapdoorAssemblyRecipes().register()
    }
}
