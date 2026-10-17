package com.impactrecipes.items

public enum class ChiselItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    Chisel(
        registryName = "chisel",
        meta = 0,
    ),
    DiamondChisel(
        registryName = "diamondChisel",
        meta = 0,
    ),
    ObsidianChisel(
        registryName = "obsidianChisel",
        meta = 0,
    ),
    Upgrade(
        registryName = "upgrade",
        meta = 0,
    ),
    Upgrade1(
        registryName = "upgrade",
        meta = 1,
    ),
    Upgrade2(
        registryName = "upgrade",
        meta = 2,
    ),

    // Blocks

    Glowstone(registryName = "glowstone"),
    Cobblestone(registryName = "cobblestone"),
    Glass(registryName = "glass"),
    Glass2(registryName = "glass2"),
    Valentines(
        registryName = "valentines",
        meta = 0,
    ),
    Cloudinabottle(
        registryName = "cloudinabottle",
        meta = 0,
    ),
    Smashingrock(
        registryName = "smashingrock",
        meta = 0,
    ),
    AutoChisel(
        registryName = "autoChisel",
        meta = 0,
    ),
    Factoryblock(
        registryName = "factoryblock",
        meta = 0,
    ),
    Fantasyblock(
        registryName = "fantasyblock",
        meta = 0,
    ),
    Tyrian(
        registryName = "tyrian",
        meta = 0,
    ),
    RoadLine(
        registryName = "road_line",
        meta = 0,
    ),
    Technical(
        registryName = "technical",
        meta = 0,
    ),
    HexPlating(
        registryName = "hexPlating",
        meta = 0,
    ),
    Holystone(
        registryName = "holystone",
        meta = 0,
    ),
    Laboratoryblock(
        registryName = "laboratoryblock",
        meta = 0,
    ),
    Rebel(
        registryName = "rebel",
        meta = 0,
    ),
    Voidstone(
        registryName = "voidstone",
        meta = 0,
    ),
    PaperwallBlock(
        registryName = "paperwall_block",
        meta = 0,
    ),
    WarningSign(
        registryName = "warningSign",
        meta = 0,
    ),
    Paperwall(
        registryName = "paperwall",
        meta = 0,
    ),
    AntiBlock15(
        registryName = "antiBlock",
        meta = 15,
    ),
    Futura(
        registryName = "futura",
        meta = 0,
    ),
    Grimstone(
        registryName = "grimstone",
        meta = 0,
    ),
    Templeblock(
        registryName = "templeblock",
        meta = 0,
    ),
    CarpetBlock(
        registryName = "carpet_block",
        meta = 0,
    ),
    Lavastone(
        registryName = "lavastone",
        meta = 0,
    ),
    Waterstone(
        registryName = "waterstone",
        meta = 0,
    ),
    Concrete(
        registryName = "concrete",
        meta = 0,
    );

    public override val modId: String = "chisel"
}
