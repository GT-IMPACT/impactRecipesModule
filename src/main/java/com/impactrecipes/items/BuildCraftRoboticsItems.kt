package com.impactrecipes.items

public enum class BuildCraftRoboticsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    ZonePlan(
        registryName = "zonePlan",
        meta = 0,
    ),
    Requester(
        registryName = "requester",
        meta = 0,
    );

    public override val modId: String = "BuildCraft|Robotics"
}
