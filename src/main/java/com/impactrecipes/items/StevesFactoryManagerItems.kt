package com.impactrecipes.items

import net.minecraft.block.Block
import net.minecraft.item.ItemStack
import vswe.stevesfactory.blocks.ModBlocks

public enum class StevesFactoryManagerItems(
    private val block: Block,
    private val meta: Int = 0,
) : IModItem {

    // Blocks

    Manager(block = ModBlocks.blockManager),
    InventoryCable(block = ModBlocks.blockCable),
    BlockGate(block = ModBlocks.blockCableBreaker),
    SignUpdater(block = ModBlocks.blockCableSign),
    CableCluster(block = ModBlocks.blockCableCluster),
    AdvancedCableCluster(
        block = ModBlocks.blockCableCluster,
        meta = 8,
    ),
    RedstoneEmitter(block = ModBlocks.blockCableOutput),
    RedstoneReceiver(block = ModBlocks.blockCableInput),
    InventoryRelay(block = ModBlocks.blockCableRelay),
    AdvancedInventoryRelay(
        block = ModBlocks.blockCableRelay,
        meta = 8,
    ),
    BlockDetector(block = ModBlocks.blockCableBUD),
    CableCamouflage(block = ModBlocks.blockCableCamouflage),
    DoubleSidedCableCamouflage(
        block = ModBlocks.blockCableCamouflage,
        meta = 1,
    ),
    TransformingCableCamouflage(
        block = ModBlocks.blockCableCamouflage,
        meta = 2,
    ),
    ItemValve(block = ModBlocks.blockCableIntake),
    RapidItemValve(
        block = ModBlocks.blockCableIntake,
        meta = 8,
    );

    public override fun get(amount: Int): ItemStack? {
        return ItemStack(
            block,
            amount,
            meta,
        )
    }
}
