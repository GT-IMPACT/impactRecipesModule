package com.impactrecipes.items

import gregtech.api.util.GT_ModHandler
import net.minecraft.item.ItemStack

public interface IModItem {

    public val modId: String
    public val registryName: String
    public val meta: Int

    public fun get(amount: Int = 1): ItemStack? {
        return GT_ModHandler.getModItem(
            modId,
            registryName,
            amount.toLong(),
            meta,
        )
    }
}
