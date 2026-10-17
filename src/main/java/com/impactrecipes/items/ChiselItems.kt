package com.impactrecipes.items

public enum class ChiselItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    Concrete(
        registryName = "concrete",
        meta = 0,
    );

    public override val modId: String = "chisel"
}
