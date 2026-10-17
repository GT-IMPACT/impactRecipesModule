package com.impactrecipes.recipes.architecturecraft

import com.impactrecipes.items.IRegistryModItem

public enum class ArchitectureCraftItems(
    public override val registryName: String,
) : IRegistryModItem {

    SawBench(registryName = "sawbench"),
    SawBlade(registryName = "sawblade"),
    LargePulley(registryName = "largePulley"),
    Hammer(registryName = "hammer"),
    Chisel(registryName = "chisel");

    public override val modId: String = "ArchitectureCraft"
    public override val meta: Int = 0
}
