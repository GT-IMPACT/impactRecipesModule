package com.impactrecipes.items

public enum class ProjectRedFabricationItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ProjectredFabricationIcchip(
        registryName = "projectred.fabrication.icchip",
        meta = 0,
    ),
    ProjectredIntegrationIcblock(
        registryName = "projectred.integration.icblock",
        meta = 0,
    ),
    ProjectredIntegrationIcblock1(
        registryName = "projectred.integration.icblock",
        meta = 1,
    );

    public override val modId: String = "ProjRed|Fabrication"
}
