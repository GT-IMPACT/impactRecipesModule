package com.impactrecipes.items

public enum class OpenGlassesItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ARGlasses(
        registryName = "openglasses",
        meta = 0,
    ),

    // Blocks

    GlassesTerminal(
        registryName = "openglassesterminal",
        meta = 0,
    );

    public override val modId: String = "openglasses"
}
