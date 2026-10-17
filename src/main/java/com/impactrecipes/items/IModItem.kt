package com.impactrecipes.items

import net.minecraft.item.ItemStack

public interface IModItem {

    public fun get(amount: Int = 1): ItemStack?
}
