package com.impactrecipes.items

public enum class AE2StuffItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IModItem {

    WirelessConnector(registryName = "Wireless"),
    WirelessKit(registryName = "WirelessKit"),
    NetworkVisualiser(registryName = "Visualiser");

    public override val modId: String = "ae2stuff"
}
