package com.impactrecipes.items

public enum class VanillaItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    FlintAndSteel(
        registryName = "flint_and_steel",
        meta = 0,
    ),
    BoneMeal(
        registryName = "dye",
        meta = 15,
    ),
    Leather(
        registryName = "leather",
        meta = 0,
    ),
    String(
        registryName = "string",
        meta = 0,
    ),

    // Blocks

    Ladder(
        registryName = "ladder",
        meta = 0,
    ),
    Cobblestone(
        registryName = "cobblestone",
        meta = 0,
    ),
    Chest(registryName = "chest"),
    Hopper(registryName = "hopper"),
    BrickBlock(
        registryName = "brick_block",
        meta = 0,
    ),
    CraftingTable(
        registryName = "crafting_table",
        meta = 0,
    ),
    Fence(
        registryName = "fence",
        meta = 0,
    ),
    Glass(
        registryName = "glass",
        meta = 0,
    ),
    HardenedClay(
        registryName = "hardened_clay",
        meta = 0,
    ),
    HeavyWeightedPressurePlate(
        registryName = "heavy_weighted_pressure_plate",
        meta = 0,
    ),
    IronBars(
        registryName = "iron_bars",
        meta = 0,
    ),
    Piston(
        registryName = "piston",
        meta = 0,
    ),
    StainedGlass(
        registryName = "stained_glass",
        meta = 0,
    ),
    LimeStainedGlassPane(
        registryName = "stained_glass_pane",
        meta = 5,
    ),
    StoneButton(registryName = "stone_button"),
    StainedHardenedClay(
        registryName = "stained_hardened_clay",
        meta = 0,
    ),
    StickyPiston(
        registryName = "sticky_piston",
        meta = 0,
    ),
    Wool(
        registryName = "wool",
        meta = 0,
    );

    public override val modId: String = "minecraft"
}
