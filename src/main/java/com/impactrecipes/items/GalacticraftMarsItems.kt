package com.impactrecipes.items

public enum class GalacticraftMarsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ItemNull5(
        registryName = "item.null",
        meta = 5,
    ),
    ItemItemBasicAsteroids7(
        registryName = "item.itemBasicAsteroids",
        meta = 7,
    ),
    ItemItemBasicAsteroids(
        registryName = "item.itemBasicAsteroids",
        meta = 0,
    ),
    ThermalCloth(
        registryName = "item.itemBasicAsteroids",
        meta = 4,
    );

    public override val modId: String = "GalacticraftMars"
}
