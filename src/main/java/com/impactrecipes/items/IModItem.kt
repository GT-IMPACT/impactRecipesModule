package com.impactrecipes.items

import net.minecraft.block.Block
import net.minecraft.item.ItemStack

public interface IModItem {

    public fun get(amount: Int = 1): ItemStack?

    public fun getBlock(): Block? {
        val stack = get() ?: return null
        return Block.getBlockFromItem(stack.item)
    }
}
