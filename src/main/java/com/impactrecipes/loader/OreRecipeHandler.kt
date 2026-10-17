package com.impactrecipes.loader

import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.interfaces.IOreRecipeRegistrator
import net.minecraft.item.ItemStack

public class OreRecipeHandler : IOreRecipeRegistrator, IOreRecipeRegistry {

    private val recipesByPrefix = mutableMapOf<OrePrefixes, MutableMap<Class<out IOreRecipes>, IOreRecipes>>()
    private val registeredPrefixes = mutableSetOf<OrePrefixes>()

    public override fun register(recipes: IOreRecipes) {
        val prefix = recipes.prefix
        if (prefix !in registeredPrefixes) {
            if (!prefix.add(this)) {
                return
            }
            registeredPrefixes.add(prefix)
        }

        val handlers = recipesByPrefix.getOrPut(prefix) {
            mutableMapOf()
        }
        handlers.putIfAbsent(
            recipes.javaClass,
            recipes,
        )
    }

    public override fun registerOre(
        prefix: OrePrefixes,
        material: Materials,
        oreDictName: String,
        modName: String,
        stack: ItemStack,
    ) {
        val handlers = recipesByPrefix[prefix] ?: return
        for (recipes in handlers.values) {
            recipes.registerOre(
                prefix = prefix,
                material = material,
                oreDictName = oreDictName,
                modName = modName,
                stack = stack,
            )
        }
    }
}
