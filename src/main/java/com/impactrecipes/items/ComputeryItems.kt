package com.impactrecipes.items

import com.impactrecipes.util.RecipeItems
import net.dragon.computery.cart.ModEnumCart
import net.dragon.computery.item.Objects
import net.minecraft.item.ItemStack

public enum class ComputeryItems(
    private val stack: ItemStack?,
    private val registryName: String?,
    private val meta: Int,
) : IModItem {

    // Items

    Card1(
        registryName = "card",
        meta = 1,
    ),
    DieselLocomotiveCart(stack = ModEnumCart.LOCO_DIESEL.getCartItem()),
    MetaItem(
        stack = ItemStack(
            Objects.metaItem,
            1,
            0,
        ),
    ),
    MetaItem1(
        stack = ItemStack(
            Objects.metaItem,
            1,
            1,
        ),
    ),
    MetaItem2(
        stack = ItemStack(
            Objects.metaItem,
            1,
            2,
        ),
    ),
    MetaItem3(
        stack = ItemStack(
            Objects.metaItem,
            1,
            3,
        ),
    ),
    OcComponents(
        stack = ItemStack(
            Objects.ocComponents,
            1,
            0,
        ),
    ),

    // Blocks

    NfcTrack(
        stack = ItemStack(
            Objects.nfcTrack,
            1,
            0,
        ),
    );

    public val modId: String = "computery"

    constructor(stack: ItemStack?) : this(
        stack = stack,
        registryName = null,
        meta = 0,
    )

    constructor(
        registryName: String,
        meta: Int = 0,
    ) : this(
        stack = null,
        registryName = registryName,
        meta = meta,
    )

    public override fun get(amount: Int): ItemStack? {
        val copy = stack?.copy()
        if (copy != null) {
            copy.stackSize = amount
            return copy
        }
        val name = registryName ?: return null
        return RecipeItems.item(
            mod = modId,
            name = name,
            meta = meta,
            count = amount,
        )
    }
}
