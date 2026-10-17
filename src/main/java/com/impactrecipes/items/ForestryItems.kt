package com.impactrecipes.items

public enum class ForestryItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    CraftingMaterial3(
        registryName = "craftingMaterial",
        meta = 3,
    ),
    RoyalJelly(
        registryName = "royalJelly",
        meta = 0,
    ),
    Grafter(
        registryName = "grafter",
        meta = 0,
    ),
    Apiculture(
        registryName = "apiculture",
        meta = 0,
    ),
    Alveary2(
        registryName = "alveary",
        meta = 2,
    ),
    Alveary3(
        registryName = "alveary",
        meta = 3,
    ),
    Alveary4(
        registryName = "alveary",
        meta = 4,
    ),
    Alveary5(
        registryName = "alveary",
        meta = 5,
    ),
    Alveary6(
        registryName = "alveary",
        meta = 6,
    ),
    Alveary7(
        registryName = "alveary",
        meta = 7,
    ),
    Alveary(
        registryName = "alveary",
        meta = 0,
    );

    public override val modId: String = "Forestry"
}
