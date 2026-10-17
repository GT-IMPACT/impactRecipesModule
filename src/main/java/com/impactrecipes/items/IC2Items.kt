package com.impactrecipes.items

import gregtech.api.util.GT_ModHandler
import net.minecraft.item.ItemStack

public enum class IC2Items(
    private val apiName: String,
) : IModItem {

    // Items

    EjectorUpgrade(apiName = "ejectorUpgrade"),
    PullingUpgrade(apiName = "pullingUpgrade"),
    RedstoneInverterUpgrade(apiName = "redstoneinvUpgrade"),
    SmallPowerUnit(apiName = "powerunitsmall"),
    RechargeableBattery(apiName = "reBattery"),
    Painter(apiName = "painter"),
    ElectronicCircuit(apiName = "electronicCircuit"),
    AdvancedCircuit(apiName = "advancedCircuit"),
    FuelRod(apiName = "fuelRod"),
    CarbonPlate(apiName = "carbonPlate"),

    // Blocks

    PersonalSafe(apiName = "personalSafe"),
    ReinforcedGlass(apiName = "reinforcedGlass"),
    MachineCasing(apiName = "machine"),
    Luminator(apiName = "luminator");

    public override fun get(amount: Int): ItemStack? {
        return GT_ModHandler.getIC2Item(
            apiName,
            amount.toLong(),
        )
    }
}
