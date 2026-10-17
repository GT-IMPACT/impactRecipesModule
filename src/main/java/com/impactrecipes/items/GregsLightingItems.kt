package com.impactrecipes.items

public enum class GregsLightingItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    BonemealAndCharcoal(registryName = "bonemealAndCharcoal"),
    Ic2FilamentAssembly(registryName = "ic2FilamentAssembly"),
    GlowstoneBulb(registryName = "glowstoneBulb"),
    GlowingIngot(registryName = "glowingIngot"),
    GasNozzle(registryName = "gasNozzle"),

    // Blocks

    Ic2ElectricFloodlight(registryName = "ic2ElectricFloodlight"),
    Floodlight(registryName = "floodlight"),
    CarbideFloodlight(registryName = "carbideFloodlight");

    public override val modId: String = "GregsLighting"
}
