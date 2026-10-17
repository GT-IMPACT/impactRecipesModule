package com.impactrecipes.items

public enum class GalacticraftMarsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ThermalCloth(
        registryName = "item.itemBasicAsteroids",
        meta = 4,
    );

    public override val modId: String = "GalacticraftMars"
}
