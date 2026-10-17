package com.impactrecipes.items

public enum class ImpactArchitectureItems(
    public override val registryName: String,
) : IRegistryModItem {

    // Blocks

    Glass(registryName = "i_glass"),
    Concrete(registryName = "i_concrete_block");

    public override val modId: String = "Impact|Architecture"
    public override val meta: Int = 0
}
