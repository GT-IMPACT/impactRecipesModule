package com.impactrecipes.items

public enum class NaturaItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    NaturaFence(
        registryName = "Natura.fence",
        meta = 0,
    );

    public override val modId: String = "Natura"
}
