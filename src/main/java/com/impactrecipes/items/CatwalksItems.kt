package com.impactrecipes.items

public enum class CatwalksItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    RopeLight(
        registryName = "ropeLight",
        meta = 0,
    ),
    Steelgrate(
        registryName = "steelgrate",
        meta = 0,
    ),
    Blowtorch(
        registryName = "blowtorch",
        meta = 0,
    ),

    // Blocks

    SupportColumn(
        registryName = "support_column",
        meta = 0,
    ),
    SturdyRailPowered(
        registryName = "sturdy_rail_powered",
        meta = 0,
    ),
    CagedLadder(
        registryName = "cagedLadder_north_unlit",
        meta = 0,
    ),
    Scaffold(
        registryName = "scaffold",
        meta = 0,
    ),
    SturdyRailDetector(
        registryName = "sturdy_rail_detector",
        meta = 0,
    ),
    Catwalk(
        registryName = "catwalk_unlit",
        meta = 0,
    ),
    SturdyRail(
        registryName = "sturdy_rail",
        meta = 0,
    ),
    SturdyRailActivator(
        registryName = "sturdy_rail_activator",
        meta = 0,
    ),
    ScaffoldVariant1(
        registryName = "scaffold",
        meta = 1,
    );

    public override val modId: String = "catwalks"
}
