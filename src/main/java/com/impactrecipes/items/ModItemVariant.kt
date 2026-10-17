package com.impactrecipes.items

import gregtech.api.util.GT_Utility
import net.minecraft.item.ItemStack

public class ModItemVariant(
    private val item: IModItem,
    private val meta: Int,
) : IModItem {

    public override fun get(amount: Int): ItemStack? {
        val stack = item.get(amount) ?: return null
        return GT_Utility.copyMetaData(
            meta.toLong(),
            stack,
        )
    }
}
