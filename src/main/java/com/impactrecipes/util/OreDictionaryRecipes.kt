package com.impactrecipes.util

import gregtech.api.util.GT_Utility
import net.minecraft.item.ItemStack
import net.minecraftforge.oredict.OreDictionary

public object OreDictionaryRecipes {

    public fun remove(
        name: String,
        item: ItemStack?,
    ) {
        if (item == null || !OreDictionary.doesOreNameExist(name)) {
            return
        }

        val entries = OreDictionary.getOres(name)
        val index = entries.indexOfFirst {
            GT_Utility.areStacksEqual(
                item,
                it,
                true,
            )
        }
        if (index >= 0) {
            entries.removeAt(index)
        }
    }
}
