package com.impactrecipes.util

import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

public fun Materials.get(
    prefixes: OrePrefixes,
    amount: Int = 1,
): ItemStack? {
    return RecipeItems.ore(
        prefix = prefixes,
        material = this,
        count = amount,
    )
}

public fun Int.toEuPercent(tier: Int): Int {
    val tierEu = GT_Values.V[tier].toInt()
    return (tierEu - tierEu / 100.0 * this).toInt()
}
