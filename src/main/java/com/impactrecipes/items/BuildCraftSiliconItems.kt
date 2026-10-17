package com.impactrecipes.items

public enum class BuildCraftSiliconItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    LaserBlock(
        registryName = "laserBlock",
        meta = 0,
    ),
    LaserTableBlock(
        registryName = "laserTableBlock",
        meta = 0,
    ),
    LaserTableBlock1(
        registryName = "laserTableBlock",
        meta = 1,
    ),
    LaserTableBlock2(
        registryName = "laserTableBlock",
        meta = 2,
    ),
    LaserTableBlock3(
        registryName = "laserTableBlock",
        meta = 3,
    ),
    LaserTableBlock4(
        registryName = "laserTableBlock",
        meta = 4,
    ),
    LaserTableBlock5(
        registryName = "laserTableBlock",
        meta = 5,
    ),
    PackagerBlock(
        registryName = "packagerBlock",
        meta = 0,
    );

    public override val modId: String = "BuildCraft|Silicon"
}
