package com.impactrecipes.util

import gregtech.api.util.GT_ModHandler
import gregtech.api.util.GT_Utility
import net.minecraft.item.ItemStack
import net.minecraft.item.crafting.CraftingManager
import net.minecraft.item.crafting.IRecipe

/** Missing outputs or ingredients skip registration instead of reaching GT as a partial recipe. */
public object CraftingRecipes {

    private val defaultFlags = GT_ModHandler.RecipeBits.BUFFERED or
        GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS

    @JvmStatic
    public fun shaped(
        output: ItemStack?,
        vararg recipe: Any?,
    ): Unit {
        shapedWithFlags(
            output = output,
            flags = defaultFlags,
            recipe = recipe,
        )
    }

    @JvmStatic
    public fun shapedWithFlags(
        output: ItemStack?,
        flags: Long,
        vararg recipe: Any?,
    ): Unit {
        val id = "shaped: ${describe(output = output)}"
        val isValid = valid(
            id = id,
            output = output,
            ingredients = recipe,
        )
        if (!isValid) {
            return
        }

        RecipeDiagnostics.attempt(
            id = id,
            rejectedReason = "GregTech rejected the recipe. Check its pattern, inputs and conflicts.",
        ) {
            GT_ModHandler.addCraftingRecipe(
                output,
                flags,
                recipe,
            )
        }
    }

    @JvmStatic
    public fun shapeless(
        output: ItemStack?,
        vararg ingredients: Any?,
    ): Unit {
        shapelessWithFlags(
            output = output,
            flags = defaultFlags,
            ingredients = ingredients,
        )
    }

    @JvmStatic
    public fun shapelessWithFlags(
        output: ItemStack?,
        flags: Long,
        vararg ingredients: Any?,
    ): Unit {
        val id = "shapeless: ${describe(output = output)}"
        val isValid = valid(
            id = id,
            output = output,
            ingredients = ingredients,
        )
        if (!isValid) {
            return
        }

        RecipeDiagnostics.attempt(
            id = id,
            rejectedReason = "GregTech rejected the recipe. Check its inputs and conflicts.",
        ) {
            GT_ModHandler.addShapelessCraftingRecipe(
                output,
                flags,
                ingredients,
            )
        }
    }

    @JvmStatic
    @JvmOverloads
    public fun removeCraftingRecipesByOutput(
        output: ItemStack?,
        ignoreNbt: Boolean = true,
        keepShapeless: Boolean = false,
        nativeOnly: Boolean = false,
    ): Boolean {
        return output != null && GT_ModHandler.removeRecipeByOutput(
            output,
            ignoreNbt,
            keepShapeless,
            nativeOnly,
        )
    }

    /** Matches RecipeUtils removal, including recipes outside GregTech's crafting cache. */
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun removeMatchingCraftingRecipesByOutput(output: ItemStack?) {
        if (output == null) {
            return
        }

        val recipes = CraftingManager.getInstance().recipeList as MutableList<IRecipe>
        recipes.removeAll {
            GT_Utility.areStacksEqual(
                output,
                it.recipeOutput,
                true,
            )
        }
    }

    @JvmStatic
    @JvmOverloads
    public fun removeCraftingRecipesByOutputIfPresent(
        mod: String,
        name: String,
        meta: Int = 0,
    ): Boolean {
        return RecipeItems.find(
            mod = mod,
            name = name,
            meta = meta,
        )?.let {
            removeCraftingRecipesByOutput(output = it)
        } ?: false
    }

    internal fun describe(output: ItemStack?): String {
        return output?.let {
            "${it.unlocalizedName}@${it.itemDamage}"
        } ?: "missing output"
    }

    internal fun valid(
        id: String,
        output: ItemStack?,
        ingredients: Array<out Any?>,
    ): Boolean {
        if (output == null) {
            RecipeDiagnostics.failure(
                id = id,
                reason = "Skipped: output item is missing.",
            )
            return false
        }
        val missing = ingredients.indices.filter {
            ingredients[it] == null
        }
        if (missing.isNotEmpty()) {
            RecipeDiagnostics.failure(
                id = id,
                reason = "Skipped: missing inputs at indexes $missing. See missing item IDs above.",
            )
            return false
        }
        return true
    }
}
