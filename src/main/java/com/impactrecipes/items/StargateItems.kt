package com.impactrecipes.items

public enum class StargateItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ControllerCrystal(registryName = "sgControllerCrystal");

    public override val modId: String = "SGCraft"
}
