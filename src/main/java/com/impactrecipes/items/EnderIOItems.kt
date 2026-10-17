package com.impactrecipes.items

public enum class EnderIOItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ItemConduit(registryName = "itemItemConduit"),
    PowerConduit(registryName = "itemPowerConduit"),

    // Blocks

    BlockInventoryPanel(
        registryName = "blockInventoryPanel",
        meta = 0,
    ),
    DarkSteelPressurePlate(registryName = "blockDarkSteelPressurePlate"),
    BlockDarkIronBars(
        registryName = "blockDarkIronBars",
        meta = 0,
    );

    public override val modId: String = "EnderIO"
}
