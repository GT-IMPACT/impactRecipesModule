package com.impactrecipes.items

public enum class ChestUpItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    WroughtIronChest(
        registryName = "Blockchestup",
        meta = 0,
    ),
    SteelChest(
        registryName = "Blockchestup",
        meta = 1,
    ),
    AluminiumChest(
        registryName = "Blockchestup",
        meta = 2,
    ),
    HSLAChest(
        registryName = "Blockchestup",
        meta = 3,
    ),
    TitaniumChest(
        registryName = "Blockchestup",
        meta = 4,
    ),
    TungstenSteelChest(
        registryName = "Blockchestup",
        meta = 5,
    ),
    ChromeChest(
        registryName = "Blockchestup",
        meta = 6,
    ),
    IridiumChest(
        registryName = "Blockchestup",
        meta = 7,
    ),
    OsmiumChest(
        registryName = "Blockchestup",
        meta = 8,
    ),
    NeutroniumChest(
        registryName = "Blockchestup",
        meta = 9,
    );

    public override val modId: String = "chestup"
}
