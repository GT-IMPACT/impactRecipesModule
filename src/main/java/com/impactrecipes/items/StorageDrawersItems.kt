package com.impactrecipes.items

import com.jaquadro.minecraft.storagedrawers.core.ModBlocks
import com.jaquadro.minecraft.storagedrawers.core.ModItems
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemStack

public enum class StorageDrawersItems(
    private val item: Item,
    private val meta: Int = 0,
) : IModItem {

    // Items

    IronUpgrade(
        item = ModItems.upgrade,
        meta = 2,
    ),
    UpgradeTemplate(
        item = ModItems.upgradeTemplate,
        meta = 0,
    ),
    GoldUpgrade(
        item = ModItems.upgrade,
        meta = 3,
    ),
    ObsidianUpgrade(
        item = ModItems.upgrade,
        meta = 4,
    ),
    DiamondUpgrade(
        item = ModItems.upgrade,
        meta = 5,
    ),
    EmeraldUpgrade(
        item = ModItems.upgrade,
        meta = 6,
    ),
    StatusUpgrade(
        item = ModItems.upgradeStatus,
        meta = 1,
    ),
    AdvancedStatusUpgrade(
        item = ModItems.upgradeStatus,
        meta = 2,
    ),
    RedstoneUpgrade(
        item = ModItems.upgradeRedstone,
        meta = 0,
    ),
    MaximumRedstoneUpgrade(
        item = ModItems.upgradeRedstone,
        meta = 1,
    ),
    MinimumRedstoneUpgrade(
        item = ModItems.upgradeRedstone,
        meta = 2,
    ),
    VoidUpgrade(
        item = ModItems.upgradeVoid,
        meta = 0,
    ),
    StorageKey(
        item = ModItems.upgradeLock,
        meta = 0,
    ),
    ConcealmentKey(
        item = ModItems.shroudKey,
        meta = 0,
    ),
    PersonalKey(
        item = ModItems.personalKey,
        meta = 0,
    ),
    PackingTape(
        item = ModItems.tape,
        meta = 0,
    ),

    // Blocks

    FullDrawer(
        block = ModBlocks.fullDrawers1,
        meta = 0,
    ),
    FullDoubleDrawer(
        block = ModBlocks.fullDrawers2,
        meta = 0,
    ),
    FullQuadDrawer(
        block = ModBlocks.fullDrawers4,
        meta = 0,
    ),
    HalfDoubleDrawer(
        block = ModBlocks.halfDrawers2,
        meta = 0,
    ),
    HalfQuadDrawer(
        block = ModBlocks.halfDrawers4,
        meta = 0,
    ),
    Trim(
        block = ModBlocks.trim,
        meta = 0,
    ),
    ControllerSlave(
        block = ModBlocks.controllerSlave,
        meta = 0,
    ),
    CompactingDrawers(
        block = ModBlocks.compDrawers,
        meta = 0,
    ),
    Controller(
        block = ModBlocks.controller,
        meta = 0,
    ),
    FramingTable(
        block = ModBlocks.framingTable,
        meta = 0,
    ),
    FramedFullDrawer(
        block = ModBlocks.fullCustom1,
        meta = 0,
    ),
    FramedFullDoubleDrawer(
        block = ModBlocks.fullCustom2,
        meta = 0,
    ),
    FramedFullQuadDrawer(
        block = ModBlocks.fullCustom4,
        meta = 0,
    ),
    FramedHalfDoubleDrawer(
        block = ModBlocks.halfCustom2,
        meta = 0,
    ),
    FramedHalfQuadDrawer(
        block = ModBlocks.halfCustom4,
        meta = 0,
    ),
    FramedTrim(
        block = ModBlocks.trimCustom,
        meta = 0,
    );

    constructor(
        block: Block,
        meta: Int = 0,
    ) : this(
        item = Item.getItemFromBlock(block),
        meta = meta,
    )

    public override fun get(amount: Int): ItemStack? {
        return ItemStack(
            item,
            amount,
            meta,
        )
    }
}
