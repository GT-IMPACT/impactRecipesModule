package com.impactrecipes.items

public enum class AE2Items(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IModItem {

    LogicProcessor(
        registryName = "item.ItemMultiMaterial",
        meta = 22,
    ),
    CalculationProcessor(
        registryName = "item.ItemMultiMaterial",
        meta = 23,
    ),
    EngineeringProcessor(
        registryName = "item.ItemMultiMaterial",
        meta = 24,
    ),
    CapacityCard(
        registryName = "item.ItemMultiMaterial",
        meta = 27,
    ),
    AdvancedCard(
        registryName = "item.ItemMultiMaterial",
        meta = 28,
    ),
    AccelerationCard(
        registryName = "item.ItemMultiMaterial",
        meta = 30,
    ),
    SpatialComponent128(
        registryName = "item.ItemMultiMaterial",
        meta = 34,
    ),
    WirelessReceiver(
        registryName = "item.ItemMultiMaterial",
        meta = 41,
    ),
    BlankPattern(
        registryName = "item.ItemMultiMaterial",
        meta = 52,
    ),
    HyperAccelerationCard(
        registryName = "item.ItemMultiMaterial",
        meta = 56,
    ),
    StorageComponent16384k(
        registryName = "item.ItemMultiMaterial",
        meta = 60,
    ),
    LockingCard(
        registryName = "item.ItemMultiMaterial",
        meta = 65,
    ),
    FakeCraftingCard(
        registryName = "item.ItemMultiMaterial",
        meta = 66,
    ),
    SuperluminalAccelerationCard(
        registryName = "item.ItemMultiMaterial",
        meta = 67,
    ),
    EqualDistributionCard(
        registryName = "item.ItemMultiMaterial",
        meta = 69,
    ),
    IlluminatedPanel(
        registryName = "item.ItemMultiPart",
        meta = 180,
    ),
    StorageBus(
        registryName = "item.ItemMultiPart",
        meta = 220,
    ),
    ExportBus(
        registryName = "item.ItemMultiPart",
        meta = 260,
    ),
    LevelEmitter(
        registryName = "item.ItemMultiPart",
        meta = 280,
    ),
    AdvancedLevelEmitter(
        registryName = "item.ItemMultiPart",
        meta = 281,
    ),
    StorageMonitor(
        registryName = "item.ItemMultiPart",
        meta = 400,
    ),
    ThroughputMonitor(
        registryName = "item.ItemMultiPart",
        meta = 410,
    ),
    InterfacePart(
        registryName = "item.ItemMultiPart",
        meta = 440,
    ),
    P2PTunnelME(
        registryName = "item.ItemMultiPart",
        meta = 460,
    ),
    P2PTunnelMEInterface(
        registryName = "item.ItemMultiPart",
        meta = 471,
    ),
    PatternRepeater(
        registryName = "item.ItemMultiPart",
        meta = 473,
    ),
    WirelessConnector(registryName = "tile.BlockWirelessConnector"),
    WirelessHub(registryName = "tile.BlockWirelessHub"),
    PatternOptimizationMatrix(registryName = "tile.BlockPatternOptimizationMatrix"),
    StorageReshuffle(registryName = "tile.BlockStorageReshuffle"),
    CraftingUnit(registryName = "tile.BlockCraftingUnit"),
    IOPort(registryName = "tile.BlockIOPort"),
    AdvancedCraftingUnit(
        registryName = "tile.BlockAdvancedCraftingUnit",
        meta = 1,
    ),
    SpatialLinkChamber(registryName = "tile.BlockSpatialLinkChamber"),
    QuantumLinkChamber(registryName = "tile.BlockQuantumLinkChamber"),
    SpatialIOPort(registryName = "tile.BlockSpatialIOPort"),
    SpatialNetworkRelay(registryName = "tile.BlockSpatialNetworkRelay"),
    SpatialPylon(registryName = "tile.BlockSpatialPylon"),
    Controller(registryName = "tile.BlockController"),
    Chest(registryName = "tile.BlockChest"),
    SuperMEReplenisher(registryName = "tile.BlockSuperMEReplenisher"),
    InterfaceBlock(registryName = "tile.BlockInterface"),
    Colorizer(registryName = "item.ToolColorizer"),
    WirelessKit(registryName = "item.ToolWirelessKit"),
    NetworkVisualiser(registryName = "item.ToolNetworkVisualiser"),
    UniverseStorageCell(registryName = "item.ItemExtremeStorageCell.Universe"),
    SingularityStorageCell(registryName = "item.ItemExtremeStorageCell.Singularity");

    public override val modId: String = "appliedenergistics2"
}
