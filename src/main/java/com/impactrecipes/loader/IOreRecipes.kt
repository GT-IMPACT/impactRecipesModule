package com.impactrecipes.loader

import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

public interface IOreRecipes {

    public val prefix: OrePrefixes

    public fun registerOre(
        prefix: OrePrefixes,
        material: Materials,
        oreDictName: String,
        modName: String,
        stack: ItemStack,
    )
}
