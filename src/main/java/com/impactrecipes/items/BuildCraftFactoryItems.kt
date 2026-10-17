package com.impactrecipes.items

public enum class BuildCraftFactoryItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    MiningWellBlock(
        registryName = "miningWellBlock",
        meta = 0,
    ),
    TankBlock(
        registryName = "tankBlock",
        meta = 0,
    ),
    PumpBlock(
        registryName = "pumpBlock",
        meta = 0,
    ),
    FloodGateBlock(
        registryName = "floodGateBlock",
        meta = 0,
    ),
    RefineryBlock(
        registryName = "refineryBlock",
        meta = 0,
    ),
    BlockHopper(
        registryName = "blockHopper",
        meta = 0,
    ),
    ZonePlan(
        registryName = "zonePlan",
        meta = 0,
    ),
    Requester(
        registryName = "requester",
        meta = 0,
    ),
    AutoWorkbenchBlock(
        registryName = "autoWorkbenchBlock",
        meta = 0,
    );

    public override val modId: String = "BuildCraft|Factory"
}
