package com.impactrecipes.items

public enum class GalacticraftCoreItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ItemBasicItem9(
        registryName = "item.basicItem",
        meta = 9,
    ),
    ItemOxygenConcentrator(
        registryName = "item.oxygenConcentrator",
        meta = 0,
    ),

    // Blocks

    TileArclamp(
        registryName = "tile.arclamp",
        meta = 0,
    ),
    TileOxygenPipe(
        registryName = "tile.oxygenPipe",
        meta = 0,
    );

    public override val modId: String = "GalacticraftCore"
}
