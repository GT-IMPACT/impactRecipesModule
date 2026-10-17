package com.impactrecipes.util

import gregtech.api.GregTech_API
import gregtech.api.commands.RecipesReload
import net.minecraft.item.ItemStack

public object RecipeUtils {

    @JvmStatic
    public fun registerRecipeClass(recipeClass: Class<*>) {
        val className = recipeClass.name.replace(
            oldValue = "class",
            newValue = "",
        ).substringAfterLast('.')
        RecipesReload.classMap[className] = recipeClass
    }

    @JvmStatic
    @JvmOverloads
    public fun ordictItemStack(
        oredict: String,
        amount: Int = 1,
    ): ItemStack? {
        return GregTech_API.getStackofAmountFromOreDict(
            oredict,
            amount,
        )
    }
}
