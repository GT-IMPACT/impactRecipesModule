package com.impactrecipes.recipes.impact

import gregtech.api.util.GT_ModHandler.RecipeBits

internal object ImpactRecipeFlags {

    internal val componentCrafting: Long = RecipeBits.DISMANTLEABLE or RecipeBits.NOT_REMOVABLE or
        RecipeBits.REVERSIBLE
    internal val reversible: Long = RecipeBits.NOT_REMOVABLE or RecipeBits.REVERSIBLE or
        RecipeBits.DISMANTLEABLE or RecipeBits.BUFFERED
    internal val reversibleWithDeletion: Long = reversible or RecipeBits.DELETE_ALL_OTHER_RECIPES
    internal val dismantleable: Long = RecipeBits.DISMANTLEABLE or reversible
}
