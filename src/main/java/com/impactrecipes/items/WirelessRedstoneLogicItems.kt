package com.impactrecipes.items

public enum class WirelessRedstoneLogicItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    WirelessLogic(
        registryName = "wirelessLogic",
        meta = 0,
    ),
    WirelessLogic1(
        registryName = "wirelessLogic",
        meta = 1,
    ),
    WirelessLogic2(
        registryName = "wirelessLogic",
        meta = 2,
    );

    public override val modId: String = "WR-CBE|Logic"
}
