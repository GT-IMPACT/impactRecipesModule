package com.impactrecipes.items

public enum class BetterBuildersWandsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    StoneWand(registryName = "wandStone"),
    IronWand(registryName = "wandIron"),
    DiamondWand(registryName = "wandDiamond"),
    UnbreakableWandIII(
        registryName = "wandUnbreakable",
        meta = 12,
    ),
    UnbreakableWandIV(
        registryName = "wandUnbreakable",
        meta = 13,
    ),
    UnbreakableWandV(
        registryName = "wandUnbreakable",
        meta = 14,
    );

    public override val modId: String = "betterbuilderswands"
}
