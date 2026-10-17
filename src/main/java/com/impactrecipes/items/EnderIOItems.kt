package com.impactrecipes.items

public enum class EnderIOItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    BlockDarkIronBars(
        registryName = "blockDarkIronBars",
        meta = 0,
    );

    public override val modId: String = "EnderIO"
}
