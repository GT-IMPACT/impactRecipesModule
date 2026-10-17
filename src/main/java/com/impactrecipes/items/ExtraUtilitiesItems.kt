package com.impactrecipes.items

public enum class ExtraUtilitiesItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    BlockUpdateDetector(
        registryName = "budoff",
        meta = 3,
    ),
    TrashCan(registryName = "trashcan");

    public override val modId: String = "ExtraUtilities"
}
