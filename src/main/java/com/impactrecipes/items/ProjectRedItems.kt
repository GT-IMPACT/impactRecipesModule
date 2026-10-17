package com.impactrecipes.items

public enum class ProjectRedItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    Silicon(
        registryName = "projectred.core.part",
        meta = 5,
    ),
    RedSilicon(
        registryName = "projectred.core.part",
        meta = 6,
    );

    public override val modId: String = "ProjRed|Core"
}
