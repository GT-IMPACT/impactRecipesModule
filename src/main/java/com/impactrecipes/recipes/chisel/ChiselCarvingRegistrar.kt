package com.impactrecipes.recipes.chisel

import com.impactrecipes.loader.IRecipeRegistrar
import cpw.mods.fml.common.Loader

public class ChiselCarvingRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded("chisel")
        }

    public override fun register() {
        ChiselBasicCarvingRecipes().register()
        ChiselStoneCarvingRecipes().register()
        ChiselOptionalCarvingRecipes().register()
        ChiselMachineCarvingRecipes().register()
        ChiselZtonesCarvingRecipes().register()
    }
}
