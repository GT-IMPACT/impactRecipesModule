package com.impactrecipes.items

public enum class ComputeryItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    Card1(
        registryName = "card",
        meta = 1,
    );

    public override val modId: String = "computery"
}
