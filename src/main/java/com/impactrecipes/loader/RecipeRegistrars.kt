package com.impactrecipes.loader

public object RecipeRegistrars {

    @JvmStatic
    public fun register(vararg registrars: IRecipeRegistrar) {
        for (registrar in registrars) {
            if (registrar.available) {
                registrar.register()
            }
        }
    }
}
