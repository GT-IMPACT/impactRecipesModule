package com.impactrecipes.items

public enum class MalisisDoorsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ItemRustyHandle(
        registryName = "item.rustyHandle",
        meta = 0,
    ),
    ItemWoodSlidingDoor(
        registryName = "item.wood_sliding_door",
        meta = 0,
    ),
    ItemIronSlidingDoor(
        registryName = "item.iron_sliding_door",
        meta = 0,
    ),
    ItemJailDoor(
        registryName = "item.jail_door",
        meta = 0,
    ),
    ItemLaboratoryDoor(
        registryName = "item.laboratory_door",
        meta = 0,
    ),
    ItemFactoryDoor(
        registryName = "item.factory_door",
        meta = 0,
    ),
    ItemShojiDoor(
        registryName = "item.shoji_door",
        meta = 0,
    ),
    ItemCurtainPurple(
        registryName = "item.curtain_purple",
        meta = 0,
    ),
    ItemCurtainYellow(
        registryName = "item.curtain_yellow",
        meta = 0,
    ),
    ItemCurtainMagenta(
        registryName = "item.curtain_magenta",
        meta = 0,
    ),
    ItemCurtainPink(
        registryName = "item.curtain_pink",
        meta = 0,
    ),
    ItemCurtainWhite(
        registryName = "item.curtain_white",
        meta = 0,
    ),
    ItemCurtainBlue(
        registryName = "item.curtain_blue",
        meta = 0,
    ),
    ItemCurtainGray(
        registryName = "item.curtain_gray",
        meta = 0,
    ),
    ItemCurtainCyan(
        registryName = "item.curtain_cyan",
        meta = 0,
    ),
    ItemCurtainRed(
        registryName = "item.curtain_red",
        meta = 0,
    ),
    ItemCurtainBrown(
        registryName = "item.curtain_brown",
        meta = 0,
    ),
    ItemCurtainLime(
        registryName = "item.curtain_lime",
        meta = 0,
    ),
    ItemCurtainOrange(
        registryName = "item.curtain_orange",
        meta = 0,
    ),
    ItemCurtainSilver(
        registryName = "item.curtain_silver",
        meta = 0,
    ),
    ItemCurtainGreen(
        registryName = "item.curtain_green",
        meta = 0,
    ),
    ItemCurtainLightBlue(
        registryName = "item.curtain_light_blue",
        meta = 0,
    ),
    ItemCurtainBlack(
        registryName = "item.curtain_black",
        meta = 0,
    ),
    ItemSaloon(
        registryName = "item.saloon",
        meta = 0,
    ),
    ItemForcefieldItem(
        registryName = "item.forcefieldItem",
        meta = 0,
    ),
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

    PlayerSensor(
        registryName = "player_sensor",
        meta = 0,
    ),
    IronTrapdoor(
        registryName = "iron_trapdoor",
        meta = 0,
    ),
    SlidingTrapdoor(
        registryName = "sliding_trapdoor",
        meta = 0,
    ),
    VanishingBlock(
        registryName = "vanishing_block",
        meta = 0,
    ),
    VanishingBlock1(
        registryName = "vanishing_block",
        meta = 1,
    ),
    VanishingBlock2(
        registryName = "vanishing_block",
        meta = 2,
    ),
    VanishingBlock3(
        registryName = "vanishing_block",
        meta = 3,
    ),
    BlockMixer(
        registryName = "block_mixer",
        meta = 0,
    ),
    DoorFactory(
        registryName = "door_factory",
        meta = 0,
    ),
    RustyHatch(
        registryName = "rustyHatch",
        meta = 0,
    ),
    GarageDoor(
        registryName = "garage_door",
        meta = 0,
    ),
    RustyLadder(
        registryName = "rustyLadder",
        meta = 0,
    ),
    CarriageDoor(
        registryName = "carriage_door",
        meta = 0,
    ),
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
