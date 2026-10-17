package com.impactrecipes.items

public enum class GraviSuiteItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    Superconductor(
        registryName = "itemSimpleItem",
        meta = 1,
    );

    public override val modId: String = "GraviSuite"
}
