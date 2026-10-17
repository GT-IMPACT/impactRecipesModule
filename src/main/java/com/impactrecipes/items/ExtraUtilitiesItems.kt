package com.impactrecipes.items

public enum class ExtraUtilitiesItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    TrashCan(registryName = "trashcan");

    public override val modId: String = "ExtraUtilities"
}
