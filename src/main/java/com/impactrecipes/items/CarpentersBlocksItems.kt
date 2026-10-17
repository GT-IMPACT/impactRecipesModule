package com.impactrecipes.items

public enum class CarpentersBlocksItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    Chisel(
        registryName = "itemCarpentersChisel",
        meta = 0,
    ),
    Hammer(
        registryName = "itemCarpentersHammer",
        meta = 0,
    ),
    Bed(
        registryName = "itemCarpentersBed",
        meta = 0,
    ),
    Tile(
        registryName = "itemCarpentersTile",
        meta = 0,
    ),
    Door(
        registryName = "itemCarpentersDoor",
        meta = 0,
    ),

    // Blocks

    CarpentersBlock(
        registryName = "blockCarpentersBlock",
        meta = 0,
    ),
    CollapsibleBlock(
        registryName = "blockCarpentersCollapsibleBlock",
        meta = 0,
    ),
    Safe(
        registryName = "blockCarpentersSafe",
        meta = 0,
    ),
    DaylightSensor(
        registryName = "blockCarpentersDaylightSensor",
        meta = 0,
    ),
    Torch(
        registryName = "blockCarpentersTorch",
        meta = 0,
    ),
    GarageDoor(
        registryName = "blockCarpentersGarageDoor",
        meta = 0,
    ),
    Ladder(
        registryName = "blockCarpentersLadder",
        meta = 0,
    ),
    Barrier(
        registryName = "blockCarpentersBarrier",
        meta = 0,
    ),
    PressurePlate(
        registryName = "blockCarpentersPressurePlate",
        meta = 0,
    ),
    Button(
        registryName = "blockCarpentersButton",
        meta = 0,
    ),
    FlowerPot(
        registryName = "blockCarpentersFlowerPot",
        meta = 0,
    ),
    Gate(
        registryName = "blockCarpentersGate",
        meta = 0,
    ),
    Hatch(
        registryName = "blockCarpentersHatch",
        meta = 0,
    ),
    Lever(
        registryName = "blockCarpentersLever",
        meta = 0,
    ),
    Slope(
        registryName = "blockCarpentersSlope",
        meta = 0,
    ),
    Stairs(
        registryName = "blockCarpentersStairs",
        meta = 0,
    );

    public override val modId: String = "CarpentersBlocks"
}
