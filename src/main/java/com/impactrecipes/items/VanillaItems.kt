package com.impactrecipes.items

public enum class VanillaItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    Book(
        registryName = "book",
        meta = 0,
    ),
    Diamond(
        registryName = "diamond",
        meta = 0,
    ),
    Clock(
        registryName = "clock",
        meta = 0,
    ),
    Stick(
        registryName = "stick",
        meta = 0,
    ),
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

    WoodenSlab(
        registryName = "wooden_slab",
        meta = 0,
    ),
    Planks(
        registryName = "planks",
        meta = 0,
    ),
    WoodenSlab1(
        registryName = "wooden_slab",
        meta = 1,
    ),
    Planks1(
        registryName = "planks",
        meta = 1,
    ),
    WoodenSlab2(
        registryName = "wooden_slab",
        meta = 2,
    ),
    Planks2(
        registryName = "planks",
        meta = 2,
    ),
    WoodenSlab3(
        registryName = "wooden_slab",
        meta = 3,
    ),
    Planks3(
        registryName = "planks",
        meta = 3,
    ),
    WoodenSlab4(
        registryName = "wooden_slab",
        meta = 4,
    ),
    Planks4(
        registryName = "planks",
        meta = 4,
    ),
    WoodenSlab5(
        registryName = "wooden_slab",
        meta = 5,
    ),
    Planks5(
        registryName = "planks",
        meta = 5,
    ),
    GlassPane(
        registryName = "glass_pane",
        meta = 0,
    ),
    Torch(
        registryName = "torch",
        meta = 0,
    ),
    StonePressurePlate(
        registryName = "stone_pressure_plate",
        meta = 0,
    ),
    Compass(
        registryName = "compass",
        meta = 0,
    ),
    Paper(
        registryName = "paper",
        meta = 0,
    ),
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
