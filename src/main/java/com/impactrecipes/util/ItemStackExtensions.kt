package com.impactrecipes.util

import gregtech.api.util.GT_Utility
import net.minecraft.item.ItemStack

/** GregTech treats a zero-size ingredient as non-consumable; the original stack is preserved. */
public fun ItemStack.asNonConsumable(): ItemStack? {
    return GT_Utility.copyAmount(
        0L,
        this,
    )
}
