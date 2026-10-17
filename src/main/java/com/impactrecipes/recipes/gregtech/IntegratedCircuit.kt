package com.impactrecipes.recipes.gregtech

import com.impactrecipes.items.IModItem
import gregtech.api.util.GT_Utility
import net.minecraft.item.ItemStack

public class IntegratedCircuit(private val configuration: Int) : IModItem {

    public override fun get(amount: Int): ItemStack? {
        return GT_Utility.copyAmount(
            amount.toLong(),
            GT_Utility.getIntegratedCircuit(configuration),
        )
    }
}
