package com.impactrecipes.items

import net.minecraft.item.ItemStack

public class ModItemVariant(
    private val item: IModItem,
    private val meta: Int,
) : IModItem {

    public override fun get(amount: Int): ItemStack? {
        val stack = item.get(amount) ?: return null
        stack.itemDamage = meta
        return stack
    }
}
