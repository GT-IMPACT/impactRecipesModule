package com.impactrecipes.items

public enum class AE2WirelessCraftingTerminalItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    WirelessCraftingTerminal(
        registryName = "wirelessCraftingTerminal",
        meta = 0,
    ),
    MagnetCard(
        registryName = "magnetCard",
        meta = 0,
    ),
    InfinityBoosterCard(
        registryName = "infinityBoosterCard",
        meta = 0,
    );

    public override val modId: String = "ae2wct"
}
