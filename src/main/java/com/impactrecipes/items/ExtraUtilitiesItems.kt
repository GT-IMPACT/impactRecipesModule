package com.impactrecipes.items

public enum class ExtraUtilitiesItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    WateringCan(
        registryName = "watering_can",
        meta = 1,
    ),
    GoldenBag(
        registryName = "golden_bag",
        meta = 0,
    ),

    // Blocks

    EnderQuarry(
        registryName = "enderQuarry",
        meta = 0,
    ),
    Marker(
        registryName = "endMarker",
        meta = 0,
    ),
    DarkPortal2(
        registryName = "dark_portal",
        meta = 2,
    ),
    DarkPortal(
        registryName = "dark_portal",
        meta = 0,
    ),
    ThermionicPump(
        registryName = "enderThermicPump",
        meta = 0,
    ),
    MiniChest(
        registryName = "chestMini",
        meta = 0,
    ),
    RedstoneClock(
        registryName = "timer",
        meta = 0,
    ),
    AngelBlock(
        registryName = "angelBlock",
        meta = 0,
    ),
    ThickenedGlass(
        registryName = "decorativeBlock2",
        meta = 0,
    ),
    GoldenEdgeGlass(
        registryName = "decorativeBlock2",
        meta = 4,
    ),
    ObsidainGlass(
        registryName = "decorativeBlock2",
        meta = 5,
    ),
    CarvedGlass(
        registryName = "decorativeBlock2",
        meta = 3,
    ),
    HeartGlass(
        registryName = "decorativeBlock2",
        meta = 8,
    ),
    EtchedGlass(
        registryName = "decorativeBlock2",
        meta = 1,
    ),
    GlassBricks(
        registryName = "decorativeBlock2",
        meta = 2,
    ),
    SwirlingGlass(
        registryName = "decorativeBlock2",
        meta = 6,
    ),
    SquaredGlass(
        registryName = "decorativeBlock2",
        meta = 9,
    ),
    DarkGlass(
        registryName = "decorativeBlock2",
        meta = 10,
    ),
    ReinforcedDarkGlass(
        registryName = "decorativeBlock2",
        meta = 11,
    ),
    EdgedStoneBricks(
        registryName = "decorativeBlock1",
        meta = 0,
    ),
    SandyGlass(
        registryName = "decorativeBlock1",
        meta = 9,
    ),
    BorderStone(
        registryName = "decorativeBlock1",
        meta = 4,
    ),
    BorderStoneAlternate(
        registryName = "decorativeBlock1",
        meta = 7,
    ),
    GravelBricks(
        registryName = "decorativeBlock1",
        meta = 6,
    ),
    FrostedStone(
        registryName = "decorativeBlock1",
        meta = 3,
    ),
    GravelRoad(
        registryName = "decorativeBlock1",
        meta = 10,
    ),
    EnderSandAlloy(
        registryName = "decorativeBlock1",
        meta = 13,
    ),
    DecorativeBlock18(
        registryName = "decorativeBlock1",
        meta = 8,
    ),
    Greenscreen(
        registryName = "greenscreen",
        meta = 0,
    ),
    FilingCabinet(
        registryName = "filing",
        meta = 0,
    ),
    AdvancedFilingCabinet(
        registryName = "filing",
        meta = 1,
    ),
    Drum(
        registryName = "drum",
        meta = 0,
    ),
    QuarryUpgrade(
        registryName = "enderQuarryUpgrade",
        meta = 0,
    ),
    HoleUpgrade(
        registryName = "enderQuarryUpgrade",
        meta = 1,
    ),
    SilkUpgrade(
        registryName = "enderQuarryUpgrade",
        meta = 2,
    ),
    Fortune1Upgrade(
        registryName = "enderQuarryUpgrade",
        meta = 3,
    ),
    Fortune2Upgrade(
        registryName = "enderQuarryUpgrade",
        meta = 4,
    ),
    Fortune3Upgrade(
        registryName = "enderQuarryUpgrade",
        meta = 5,
    ),
    Speed1Upgrade(
        registryName = "enderQuarryUpgrade",
        meta = 6,
    ),
    Speed2Upgrade(
        registryName = "enderQuarryUpgrade",
        meta = 7,
    ),
    Speed3Upgrade(
        registryName = "enderQuarryUpgrade",
        meta = 8,
    ),
    PumpUpgrade(
        registryName = "enderQuarryUpgrade",
        meta = 9,
    ),
    BasicBlockUpdateDetector(
        registryName = "budoff",
        meta = 0,
    ),
    EtherealGlass(
        registryName = "etherealglass",
        meta = 0,
    ),
    IneffableGlass(
        registryName = "etherealglass",
        meta = 1,
    ),
    EtherealGlassInverted(
        registryName = "etherealglass",
        meta = 3,
    ),
    IneffableGlassInverted(
        registryName = "etherealglass",
        meta = 4,
    ),
    DarkEtherealGlass(
        registryName = "etherealglass",
        meta = 2,
    ),
    DarkEtherealGlassInverted(
        registryName = "etherealglass",
        meta = 5,
    ),
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
