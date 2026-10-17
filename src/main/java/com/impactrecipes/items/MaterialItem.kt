package com.impactrecipes.items

import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

public class MaterialItem(
    private val prefix: OrePrefixes,
    private val material: Materials,
) : IModItem {

    public override fun get(amount: Int): ItemStack? {
        return RecipeItems.ore(
            prefix = prefix,
            material = material,
            count = amount,
        )
    }
}

public fun Materials.item(prefix: OrePrefixes): IModItem {
    return MaterialItem(
        prefix = prefix,
        material = this,
    )
}
