package com.impactrecipes.items

public enum class BuildCraftCoreItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    WoodenGearItem(
        registryName = "woodenGearItem",
        meta = 0,
    ),
    StoneGearItem(
        registryName = "stoneGearItem",
        meta = 0,
    ),
    IronGearItem(
        registryName = "ironGearItem",
        meta = 0,
    ),
    GoldGearItem(
        registryName = "goldGearItem",
        meta = 0,
    ),
    DiamondGearItem(
        registryName = "diamondGearItem",
        meta = 0,
    ),

    // Blocks

    MarkerBlock(
        registryName = "markerBlock",
        meta = 0,
    ),
    PathMarkerBlock(
        registryName = "pathMarkerBlock",
        meta = 0,
    ),
    EngineBlock(
        registryName = "engineBlock",
        meta = 0,
    ),
    EngineBlock1(
        registryName = "engineBlock",
        meta = 1,
    ),
    EngineBlock2(
        registryName = "engineBlock",
        meta = 2,
    );

    public override val modId: String = "BuildCraft|Core"
}
