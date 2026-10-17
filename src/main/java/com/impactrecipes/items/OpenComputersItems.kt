package com.impactrecipes.items

public enum class OpenComputersItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    APUTier3(
        registryName = "item",
        meta = 102,
    ),
    MicrochipTier1(
        registryName = "item",
        meta = 24,
    ),
    MicrochipTier2(
        registryName = "item",
        meta = 25,
    ),
    MicrochipTier3(
        registryName = "item",
        meta = 26,
    ),

    // Blocks

    CaseTier3(registryName = "case3");

    public override val modId: String = "OpenComputers"
}
