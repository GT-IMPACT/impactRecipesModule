package com.impactrecipes.items

public enum class AE2FCItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    MEFluidImportBus(
        registryName = "part_fluid_import",
        meta = 0,
    ),
    Item1kMEFluidStorageCell(
        registryName = "fluid_storage1",
        meta = 0,
    ),
    Item4kMEFluidStorageCell(
        registryName = "fluid_storage4",
        meta = 0,
    ),
    Item16kMEFluidStorageCell(
        registryName = "fluid_storage16",
        meta = 0,
    ),
    Item64kMEFluidStorageCell(
        registryName = "fluid_storage64",
        meta = 0,
    ),
    Item256kMEFluidStorageCell(
        registryName = "fluid_storage256",
        meta = 0,
    ),
    Item1024kMEFluidStorageCell(
        registryName = "fluid_storage1024",
        meta = 0,
    ),
    Item4096kMEFluidStorageCell(
        registryName = "fluid_storage4096",
        meta = 0,
    ),
    Item16384kMEFluidStorageCell(
        registryName = "fluid_storage16384",
        meta = 0,
    ),
    Item1kMEMultiFluidStorageCell(
        registryName = "multi_fluid_storage1",
        meta = 0,
    ),
    Item4kMEMultiFluidStorageCell(
        registryName = "multi_fluid_storage4",
        meta = 0,
    ),
    Item16kMEMultiFluidStorageCell(
        registryName = "multi_fluid_storage16",
        meta = 0,
    ),
    Item64kMEMultiFluidStorageCell(
        registryName = "multi_fluid_storage64",
        meta = 0,
    ),
    Item256kMEMultiFluidStorageCell(
        registryName = "multi_fluid_storage256",
        meta = 0,
    ),
    Item1024kMEMultiFluidStorageCell(
        registryName = "multi_fluid_storage1024",
        meta = 0,
    ),
    Item4096kMEMultiFluidStorageCell(
        registryName = "multi_fluid_storage4096",
        meta = 0,
    ),
    Item16384kMEMultiFluidStorageCell(
        registryName = "multi_fluid_storage16384",
        meta = 0,
    ),
    Item4kMEFluidStorageComponent(
        registryName = "fluid_part",
        meta = 1,
    ),
    Item16kMEFluidStorageComponent(
        registryName = "fluid_part",
        meta = 2,
    ),
    Item64kMEFluidStorageComponent(
        registryName = "fluid_part",
        meta = 3,
    ),
    Item256kMEFluidStorageComponent(
        registryName = "fluid_part",
        meta = 4,
    ),
    Item1024kMEFluidStorageComponent(
        registryName = "fluid_part",
        meta = 5,
    ),
    Item4096kMEFluidStorageComponent(
        registryName = "fluid_part",
        meta = 6,
    ),
    Item16384kMEFluidStorageComponent(
        registryName = "fluid_part",
        meta = 7,
    ),
    PortableFluidCell(
        registryName = "portable_fluid_cell",
        meta = 0,
    ),
    MEAdvancedFluidStorageHousing(
        registryName = "fluid_storage_housing",
        meta = 1,
    ),
    MEMultiFluidStorageHousing(
        registryName = "fluid_storage_housing",
        meta = 2,
    ),
    MEAdvancedMultiFluidStorageHousing(
        registryName = "fluid_storage_housing",
        meta = 3,
    ),
    MEFluidQuantumStorageCell(
        registryName = "fluid_storage.quantum",
        meta = 0,
    ),
    WirelessPatternTerminal(
        registryName = "wireless_fluid_pattern_terminal",
        meta = 0,
    ),
    WirelessInterfaceTerminal(
        registryName = "wireless_interface_terminal",
        meta = 0,
    ),
    WirelessLevelTerminal(
        registryName = "wireless_level_terminal",
        meta = 0,
    ),
    MEDualInterfaceMeta0(
        registryName = "part_fluid_interface",
        meta = 0,
    ),
    EnergyCard(registryName = "energy_card"),
    InfinityWaterStorageCell(registryName = "fluid_storage.infinity.water"),
    FluidStorageBus(registryName = "part_fluid_storage_bus"),
    FluidExportBus(registryName = "part_fluid_export"),
    FluidStorageComponent1k(registryName = "fluid_part"),
    LevelTerminal(registryName = "part_level_terminal"),
    FluidVoidCell(registryName = "fluid_storage.void"),
    FluidStorageHousing(registryName = "fluid_storage_housing"),
    UniverseFluidStorageCell(registryName = "fluid_storage.Universe"),
    SingularityFluidStorageCell(registryName = "fluid_storage.singularity"),

    // Blocks

    FluidPatternEncoder(
        registryName = "fluid_pattern_encoder",
        meta = 0,
    ),
    MEFluidPacketDecoder(
        registryName = "fluid_packet_decoder",
        meta = 0,
    ),
    IngredientBuffer(
        registryName = "ingredient_buffer",
        meta = 0,
    ),
    LargeIngredientBuffer(
        registryName = "large_ingredient_buffer",
        meta = 0,
    ),
    MEFluidBuffer(
        registryName = "fluid_buffer",
        meta = 0,
    ),
    OCPatternEditor(
        registryName = "oc_pattern_editor",
        meta = 0,
    ),
    MELevelMaintainer(
        registryName = "level_maintainer",
        meta = 0,
    ),
    CertusQuartzTank(
        registryName = "certus_quartz_tank",
        meta = 0,
    ),
    SuperStockReplenisher(registryName = "super_stock_replenisher"),
    DualInterface(registryName = "fluid_interface"),
    FluidAutoFiller(registryName = "fluid_auto_filler");

    public override val modId: String = "ae2fc"
}
