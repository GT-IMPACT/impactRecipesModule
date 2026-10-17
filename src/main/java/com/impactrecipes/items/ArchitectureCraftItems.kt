package com.impactrecipes.items

public enum class ArchitectureCraftItems(
    public override val registryName: String,
) : IRegistryModItem {

    // Items

    SawBlade(registryName = "sawblade"),
    LargePulley(registryName = "largePulley"),
    Hammer(registryName = "hammer"),
    Chisel(registryName = "chisel"),

    // Blocks

    SawBench(registryName = "sawbench");

    public override val modId: String = "ArchitectureCraft"
    public override val meta: Int = 0
}
