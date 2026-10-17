package com.impactrecipes.items

public enum class WirelessRedstoneCoreItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ObsidianStick(
        registryName = "obsidianStick",
        meta = 0,
    ),
    StoneBowl(
        registryName = "stoneBowl",
        meta = 0,
    ),
    RetherPearl(
        registryName = "retherPearl",
        meta = 0,
    ),
    WirelessTransceiver(
        registryName = "wirelessTransceiver",
        meta = 0,
    ),
    BlazeTransceiver(
        registryName = "blazeTransceiver",
        meta = 0,
    ),
    RecieverDish(
        registryName = "recieverDish",
        meta = 0,
    ),
    BlazeRecieverDish(
        registryName = "blazeRecieverDish",
        meta = 0,
    );

    public override val modId: String = "WR-CBE|Core"
}
