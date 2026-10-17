package com.impactrecipes.items

public enum class ForgeMicroblockItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    StoneRod(
        registryName = "stoneRod",
        meta = 0,
    ),
    StoneRod1(
        registryName = "stoneRod",
        meta = 1,
    );

    public override val modId: String = "ForgeMicroblock"
}
