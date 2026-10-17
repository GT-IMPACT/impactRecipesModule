package com.impactrecipes.items

public enum class ExtraUtilitiesItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    ChestFull(
        registryName = "chestFull",
        meta = 0,
    ),
    DecorativeBlock27(
        registryName = "decorativeBlock2",
        meta = 7,
    ),
    BlockUpdateDetector(
        registryName = "budoff",
        meta = 3,
    ),
    TrashCan(registryName = "trashcan");

    public override val modId: String = "ExtraUtilities"
}
