package com.impactrecipes.items

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import stevesaddons.registry.BlockRegistry.cableRFNode
import stevesaddons.registry.ItemRegistry.duplicator
import stevesaddons.registry.ItemRegistry.labeler

public enum class StevesAddonsItems(
    private val item: Item,
) : IModItem {

    // Items

    ManagerDuplicator(item = duplicator),
    FactoryLabeler(item = labeler),

    // Blocks

    RFNode(block = cableRFNode);

    constructor(block: Block) : this(item = Item.getItemFromBlock(block))

    public override fun get(amount: Int): ItemStack? {
        return ItemStack(
            item,
            amount,
            0,
        )
    }
}
