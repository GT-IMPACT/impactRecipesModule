package com.impactrecipes.recipes.stargate

import com.impactrecipes.core.Reference
import com.impactrecipes.loader.IRecipeRegistrar
import com.impactrecipes.loader.IOreRecipeRegistry
import cpw.mods.fml.common.Loader

public class StargateRegistrar : IRecipeRegistrar {

    public override val available: Boolean
        get() {
            return Loader.isModLoaded(Reference.SG)
        }

    public override fun register() {
        StargateRecipeRemovals().register()
        StargatePrinterRecipes().register()
        StargateAssemblyRecipes().register()
        StargateCrystalRecipes().register()
    }

    public override fun registerOreRecipes(oreRecipes: IOreRecipeRegistry) {
        oreRecipes.register(StargateLensRecipes())
    }
}
