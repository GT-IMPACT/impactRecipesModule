package com.impactrecipes.recipes.vanilla

import com.impactrecipes.loader.IRecipeRegistrar

public class VanillaRegistrar : IRecipeRegistrar {

    public override val available: Boolean = true

    public override fun register() {
        VanillaRecipeRemovals().register()
        VanillaSlabCraftingRecipes().register()
        VanillaDeviceCraftingRecipes().register()
        VanillaTorchAndLadderCraftingRecipes().register()
        VanillaFenceCraftingRecipes().register()
        VanillaMechanismCraftingRecipes().register()
        VanillaArmorCraftingRecipes().register()
        VanillaUtilityCraftingRecipes().register()
        VanillaStairCraftingRecipes().register()
        VanillaMaterialCraftingRecipes().register()
        VanillaOreDictionaryRecipes().register()
        VanillaDeviceAssemblyRecipes().register()
        VanillaLadderAssemblyRecipes().register()
        VanillaFenceAssemblyRecipes().register()
        VanillaCarpetAssemblyRecipes().register()
        VanillaStairAssemblyRecipes().register()
        VanillaMelonSlicingRecipes().register()
        VanillaClayAutoclaveRecipes().register()
    }
}
