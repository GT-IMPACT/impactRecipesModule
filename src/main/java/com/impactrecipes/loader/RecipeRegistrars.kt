package com.impactrecipes.loader

import com.impactrecipes.util.RecipeUtils

public object RecipeRegistrars {

    private val oreRecipes: IOreRecipeRegistry = OreRecipeHandler()

    init {
        RecipeUtils.registerRecipeClass(RecipeReloadLoader::class.java)
    }

    @JvmStatic
    public fun register(vararg registrars: IRecipeRegistrar) {
        for (registrar in registrars) {
            if (registrar.available) {
                registrar.registerOreRecipes(oreRecipes)
                registrar.register()
            }
        }
    }
}
