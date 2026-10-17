package com.impactrecipes.items

public enum class BuildCraftFactoryItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    AutoWorkbenchBlock(
        registryName = "autoWorkbenchBlock",
        meta = 0,
    );

    public override val modId: String = "BuildCraft|Factory"
}
