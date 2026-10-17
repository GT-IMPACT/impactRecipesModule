package com.impactrecipes.util

import gregtech.api.commands.RecipesReload

public object RecipeUtils {

    @JvmStatic
    public fun registerRecipeClass(recipeClass: Class<*>) {
        val className = recipeClass.name.replace(
            oldValue = "class",
            newValue = "",
        ).substringAfterLast('.')
        RecipesReload.classMap[className] = recipeClass
    }
}
