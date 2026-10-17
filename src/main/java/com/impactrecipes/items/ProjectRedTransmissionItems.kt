package com.impactrecipes.items

public enum class ProjectRedTransmissionItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    RedAlloyWire(
        registryName = "projectred.transmission.wire",
        meta = 0,
    );

    public override val modId: String = "ProjRed|Transmission"
}
