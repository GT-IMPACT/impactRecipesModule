package com.impactrecipes.items

public enum class OpenBlocksItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    DevNull(registryName = "devnull"),
    HangGlider(registryName = "hangglider"),
    GliderWing(registryName = "generic"),

    // Blocks

    Elevator(registryName = "elevator"),
    RotatingElevator(registryName = "elevator_rotating"),
    BuildingGuide(registryName = "guide"),
    EnhancedBuildingGuide(registryName = "builder_guide");

    public override val modId: String = "OpenBlocks"
}
