package com.impactrecipes.recipes.gregtech

import gregtech.api.util.GT_ModHandler.RecipeBits

internal object GregTechRecipeFlags {

    internal val reversible: Long = RecipeBits.NOT_REMOVABLE or RecipeBits.REVERSIBLE or
        RecipeBits.BUFFERED
    internal val buffered: Long = RecipeBits.BUFFERED or RecipeBits.NOT_REMOVABLE
    internal val dismantleable: Long = reversible
    internal val componentCrafting: Long = RecipeBits.NOT_REMOVABLE or RecipeBits.REVERSIBLE
}
