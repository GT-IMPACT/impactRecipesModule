package com.impactrecipes.items

import com.impactrecipes.util.RecipeItems
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block
import net.minecraft.item.ItemStack

public interface IRegistryModItem : IModItem {

    public val modId: String
    public val registryName: String
    public val meta: Int

    public override fun get(amount: Int): ItemStack? {
        return RecipeItems.item(
            mod = modId,
            name = registryName,
            meta = meta,
            count = amount,
        )
    }

    public override fun getBlock(): Block? {
        return GameRegistry.findBlock(
            modId,
            registryName,
        )
    }
}
