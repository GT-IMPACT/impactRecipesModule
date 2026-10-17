package com.impactrecipes.items

public enum class ProjectRedIlluminationItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    ProjectredIlluminationLamp27(
        registryName = "projectred.illumination.lamp",
        meta = 27,
    ),
    ProjectredIlluminationLamp16(
        registryName = "projectred.illumination.lamp",
        meta = 16,
    ),
    ProjectredIlluminationLamp24(
        registryName = "projectred.illumination.lamp",
        meta = 24,
    ),
    ProjectredIlluminationLamp23(
        registryName = "projectred.illumination.lamp",
        meta = 23,
    );

    public override val modId: String = "ProjRed|Illumination"
}
