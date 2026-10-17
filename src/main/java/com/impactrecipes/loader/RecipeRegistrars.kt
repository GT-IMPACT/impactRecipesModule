package com.impactrecipes.loader

public object RecipeRegistrars {

    private val oreRecipes: IOreRecipeRegistry = OreRecipeHandler()

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
