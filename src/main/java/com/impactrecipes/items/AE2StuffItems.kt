package com.impactrecipes.items

public enum class AE2StuffItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    WirelessKit(registryName = "WirelessKit"),
    NetworkVisualiser(registryName = "Visualiser"),

    // Blocks

    PatternEncoder(
        registryName = "Encoder",
        meta = 0,
    ),
    Grower(
        registryName = "Grower",
        meta = 0,
    ),
    Inscriber(
        registryName = "Inscriber",
        meta = 0,
    ),
    WirelessConnector(registryName = "Wireless");

    public override val modId: String = "ae2stuff"
}
