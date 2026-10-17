package com.impactrecipes.items

public enum class WirelessRedstoneAddonsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    Triangulator(
        registryName = "triangulator",
        meta = 0,
    ),
    Remote(
        registryName = "remote",
        meta = 0,
    ),
    Sniffer(
        registryName = "sniffer",
        meta = 0,
    ),
    Map(
        registryName = "map",
        meta = 0,
    ),
    Tracker(
        registryName = "tracker",
        meta = 0,
    ),
    Rep(
        registryName = "rep",
        meta = 0,
    ),
    Psniffer(
        registryName = "psniffer",
        meta = 0,
    );

    public override val modId: String = "WR-CBE|Addons"
}
