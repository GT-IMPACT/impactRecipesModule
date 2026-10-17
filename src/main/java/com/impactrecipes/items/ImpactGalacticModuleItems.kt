package com.impactrecipes.items

public enum class ImpactGalacticModuleItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    PhobosGround(
        registryName = "phobosblocks",
        meta = 0,
    ),
    PhobosSubground(
        registryName = "phobosblocks",
        meta = 1,
    ),
    DeimosGround(
        registryName = "deimosblocks",
        meta = 0,
    ),
    DeimosSubground(
        registryName = "deimosblocks",
        meta = 1,
    ),
    OberonGround(
        registryName = "oberonblocks",
        meta = 0,
    ),
    OberonSubground(
        registryName = "oberonblocks",
        meta = 1,
    ),
    OberonStone(
        registryName = "oberonblocks",
        meta = 2,
    ),
    ProteusGround(
        registryName = "proteusblocks",
        meta = 0,
    ),
    ProteusSubground(
        registryName = "proteusblocks",
        meta = 1,
    ),
    ProteusStone(
        registryName = "proteusblocks",
        meta = 2,
    ),
    MakemakeGround(
        registryName = "makemakeblocks",
        meta = 0,
    ),
    MakemakeSubground(
        registryName = "makemakeblocks",
        meta = 1,
    ),
    HaumeaGround(
        registryName = "haumeablocks",
        meta = 0,
    );

    public override val modId: String = "Impact|GalacticModule"
}
