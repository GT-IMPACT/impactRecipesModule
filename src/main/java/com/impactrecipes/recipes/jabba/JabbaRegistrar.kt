package com.impactrecipes.recipes.jabba

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class JabbaRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("JABBA")
        }

    public override fun register() {
        JabbaRecipeRemovals().register()
        JabbaUtilityCraftingRecipes().register()
        JabbaStructuralUpgradeRecipes().register()
        JabbaAutomationUpgradeRecipes().register()
        JabbaBarrelAssemblyRecipes().register()
        JabbaStorageUpgradeRecipes().register()
        JabbaVoidUpgradeRecipes().register()
    }
}
