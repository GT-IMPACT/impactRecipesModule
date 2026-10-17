package com.impactrecipes.items

public enum class BackpackItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    TannedLeather(registryName = "tannedLeather");

    public override val modId: String = "Backpack"
}
