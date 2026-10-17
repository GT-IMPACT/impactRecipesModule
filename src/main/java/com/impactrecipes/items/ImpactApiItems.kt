package com.impactrecipes.items

public enum class ImpactApiItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    MultiblockStructureHologramProjector(
        registryName = "item.impactapi.constructableTrigger",
        meta = 0,
    );

    public override val modId: String = "impactapi"
}
