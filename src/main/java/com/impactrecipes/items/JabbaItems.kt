package com.impactrecipes.items

import mcp.mobius.betterbarrels.BetterBarrels
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemStack

public enum class JabbaItems(
    private val item: Item,
    private val meta: Int = 0,
) : IModItem {

    // Items

    BarrelHammer(
        item = BetterBarrels.itemHammer,
        meta = 0,
    ),
    Dolly(
        item = BetterBarrels.itemMover,
        meta = 0,
    ),
    DiamondDolly(
        item = BetterBarrels.itemMoverDiamond,
        meta = 0,
    ),
    TuningFork(
        item = BetterBarrels.itemTuningFork,
        meta = 0,
    ),
    StorageUpgrade(
        item = BetterBarrels.itemUpgradeCore,
        meta = 0,
    ),
    RedstoneUpgrade(
        item = BetterBarrels.itemUpgradeCore,
        meta = 2,
    ),
    HopperUpgrade(
        item = BetterBarrels.itemUpgradeCore,
        meta = 3,
    ),
    StorageUpgrade3x(
        item = BetterBarrels.itemUpgradeCore,
        meta = 4,
    ),
    StorageUpgrade9x(
        item = BetterBarrels.itemUpgradeCore,
        meta = 5,
    ),
    StorageUpgrade27x(
        item = BetterBarrels.itemUpgradeCore,
        meta = 6,
    ),
    VoidUpgrade(
        item = BetterBarrels.itemUpgradeCore,
        meta = 7,
    ),
    StorageUpgrade81x(
        item = BetterBarrels.itemUpgradeCore,
        meta = 8,
    ),
    StorageUpgrade243x(
        item = BetterBarrels.itemUpgradeCore,
        meta = 9,
    ),
    StructuralUpgradeMk1(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 0,
    ),
    StructuralUpgradeMk2(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 1,
    ),
    StructuralUpgradeMk3(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 2,
    ),
    StructuralUpgradeMk4(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 3,
    ),
    StructuralUpgradeMk5(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 4,
    ),
    StructuralUpgradeMk6(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 5,
    ),
    StructuralUpgradeMk7(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 6,
    ),
    StructuralUpgradeMk8(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 7,
    ),
    StructuralUpgradeMk9(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 8,
    ),
    StructuralUpgradeMk10(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 9,
    ),
    StructuralUpgradeMk11(
        item = BetterBarrels.itemUpgradeStructural,
        meta = 10,
    ),

    // Blocks

    Barrel(
        block = BetterBarrels.blockBarrel,
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
