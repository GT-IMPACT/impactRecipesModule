package com.impactrecipes.items

public enum class GregsLightingItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    GlowstoneBulb(
        registryName = "glowstoneBulb",
        meta = 0,
    );

    public override val modId: String = "GregsLighting"
}
