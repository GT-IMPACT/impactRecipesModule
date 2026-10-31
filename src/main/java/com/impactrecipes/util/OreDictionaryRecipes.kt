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
            // Forge 1.7.10 exposes a read-only view; mutate its backing list and rebuild the reverse lookup.
            val stacksField = OreDictionary::class.java.getDeclaredField("idToStack")
            stacksField.isAccessible = true

            @Suppress("UNCHECKED_CAST")
            val stacksById = stacksField.get(null) as List<MutableList<ItemStack>>
            stacksById[OreDictionary.getOreID(name)].removeAt(index)
            OreDictionary.rebakeMap()
        }
    }
}
