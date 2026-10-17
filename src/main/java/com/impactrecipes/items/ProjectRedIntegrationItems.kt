package com.impactrecipes.items

public enum class ProjectRedIntegrationItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    Repeater(
        registryName = "projectred.integration.gate",
        meta = 10,
    ),
    ProjectredIntegrationGate26(
        registryName = "projectred.integration.gate",
        meta = 26,
    );

    public override val modId: String = "ProjRed|Integration"
}
