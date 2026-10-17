package com.impactrecipes.items

public enum class OpenComputersItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    APUTier3(
        registryName = "item",
        meta = 102,
    ),
    MicrochipTier1(
        registryName = "item",
        meta = 24,
    ),
    MicrochipTier2(
        registryName = "item",
        meta = 25,
    ),
    MicrochipTier3(
        registryName = "item",
        meta = 26,
    ),

    // Blocks

    HologramProjectorTier2(
        registryName = "hologram2",
        meta = 0,
    ),
    Charger(
        registryName = "charger",
        meta = 0,
    ),
    Cable(
        registryName = "cable",
        meta = 0,
    ),
    Item19(
        registryName = "item",
        meta = 19,
    ),
    Keyboard(
        registryName = "keyboard",
        meta = 0,
    ),
    CaseTier3(registryName = "case3");

    public override val modId: String = "OpenComputers"
}
