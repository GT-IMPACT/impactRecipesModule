package com.impactrecipes.items

public enum class MalisisDoorsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ItemDoorAcacia(
        registryName = "item.door_acacia",
        meta = 0,
    ),
    ItemDoorBirch(
        registryName = "item.door_birch",
        meta = 0,
    ),
    ItemDoorDarkOak(
        registryName = "item.door_dark_oak",
        meta = 0,
    ),
    ItemDoorJungle(
        registryName = "item.door_jungle",
        meta = 0,
    ),
    ItemDoorSpruce(
        registryName = "item.door_spruce",
        meta = 0,
    ),

    // Blocks

    AcaciaFenceGate(
        registryName = "acaciaFenceGate",
        meta = 0,
    ),
    BirchFenceGate(
        registryName = "birchFenceGate",
        meta = 0,
    ),
    DarkOakFenceGate(
        registryName = "darkOakFenceGate",
        meta = 0,
    ),
    JungleFenceGate(
        registryName = "jungleFenceGate",
        meta = 0,
    ),
    SpruceFenceGate(
        registryName = "spruceFenceGate",
        meta = 0,
    ),
    TrapdoorAcacia(
        registryName = "trapdoor_acacia",
        meta = 0,
    ),
    TrapdoorSpruce(
        registryName = "trapdoor_spruce",
        meta = 0,
    ),
    TrapdoorBirch(
        registryName = "trapdoor_birch",
        meta = 0,
    ),
    TrapdoorJungle(
        registryName = "trapdoor_jungle",
        meta = 0,
    ),
    TrapdoorDarkOak(
        registryName = "trapdoor_dark_oak",
        meta = 0,
    );

    public override val modId: String = "malisisdoors"
}
