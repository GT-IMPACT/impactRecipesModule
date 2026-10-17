package com.impactrecipes.recipes.gregslighting

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class GregsLightingRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("GregsLighting")
        }

    public override fun register() {
        GregsLightingRecipeRemovals().register()
        GregsLightingCraftingRecipes().register()
        GregsLightingMachineRecipes().register()
    }
}
