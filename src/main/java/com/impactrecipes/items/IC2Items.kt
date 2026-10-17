package com.impactrecipes.items

import gregtech.api.util.GT_ModHandler
import net.minecraft.item.ItemStack

public enum class IC2Items(
    private val apiName: String,
) : IModItem {

    // Items

    ElectronicCircuit(apiName = "electronicCircuit"),
    AdvancedCircuit(apiName = "advancedCircuit"),
    FuelRod(apiName = "fuelRod"),

    // Blocks

    ReinforcedGlass(apiName = "reinforcedGlass");

    public override fun get(amount: Int): ItemStack? {
        return GT_ModHandler.getIC2Item(
            apiName,
            amount.toLong(),
        )
    }
}
