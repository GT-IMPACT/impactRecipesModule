package com.impactrecipes.recipes.stevesfactorymanager

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import com.impactrecipes.recipes.stevesaddons.StevesAddonsAssemblyRecipes
import com.impactrecipes.recipes.stevesaddons.StevesAddonsRecipeRemovals
import cpw.mods.fml.common.Loader

public class StevesFactoryManagerRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.SFM)
        }

    public override fun register() {
        FactoryManagerRecipeRemovals().register()
        if (Loader.isModLoaded("StevesAddons")) {
            StevesAddonsRecipeRemovals().register()
        }

        FactoryManagerCraftingRecipes().register()
        FactoryManagerNetworkRecipes().register()
        FactoryManagerCableUpgradeRecipes().register()
        if (Loader.isModLoaded("StevesAddons")) {
            StevesAddonsAssemblyRecipes().register()
        }
    }
}
