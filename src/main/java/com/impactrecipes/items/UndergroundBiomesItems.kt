package com.impactrecipes.items

public enum class UndergroundBiomesItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    FossilPiece(
        registryName = "fossilPiece",
        meta = 0,
    ),

    // Blocks

    IgneousStoneBrickHalfSlab(
        registryName = "igneousStoneBrickHalfSlab",
        meta = 0,
    ),
    MetamorphicStoneBrickHalfSlab(
        registryName = "metamorphicStoneBrickHalfSlab",
        meta = 0,
    ),
    IgneousStoneHalfSlab(
        registryName = "igneousStoneHalfSlab",
        meta = 0,
    ),
    MetamorphicStoneHalfSlab(
        registryName = "metamorphicStoneHalfSlab",
        meta = 0,
    ),
    IgneousCobblestoneHalfSlab(
        registryName = "igneousCobblestoneHalfSlab",
        meta = 0,
    ),
    MetamorphicCobblestoneHalfSlab(
        registryName = "metamorphicCobblestoneHalfSlab",
        meta = 0,
    ),
    SedimentaryStoneHalfSlab(
        registryName = "sedimentaryStoneHalfSlab",
        meta = 0,
    ),
    Button(
        registryName = "button",
        meta = 0,
    ),
    IgneousStoneBrick(
        registryName = "igneousStoneBrick",
        meta = 0,
    ),
    MetamorphicStoneBrick(
        registryName = "metamorphicStoneBrick",
        meta = 0,
    ),
    IgneousStone(
        registryName = "igneousStone",
        meta = 0,
    ),
    MetamorphicStone(
        registryName = "metamorphicStone",
        meta = 0,
    ),
    IgneousCobblestone(
        registryName = "igneousCobblestone",
        meta = 0,
    ),
    MetamorphicCobblestone(
        registryName = "metamorphicCobblestone",
        meta = 0,
    ),
    SedimentaryStone(
        registryName = "sedimentaryStone",
        meta = 0,
    ),
    Chalk(
        registryName = "sedimentaryStone",
        meta = 1,
    ),
    Shale(
        registryName = "sedimentaryStone",
        meta = 2,
    ),
    Siltstone(
        registryName = "sedimentaryStone",
        meta = 3,
    ),
    Dolomite(
        registryName = "sedimentaryStone",
        meta = 5,
    ),
    Greywacke(
        registryName = "sedimentaryStone",
        meta = 6,
    ),
    Chert(
        registryName = "sedimentaryStone",
        meta = 7,
    );

    public override val modId: String = "UndergroundBiomes"
}
