package com.impactrecipes.items

public enum class AE2FCItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    EnergyCard(registryName = "energy_card"),
    InfinityWaterStorageCell(registryName = "fluid_storage.infinity.water"),
    DualInterface(registryName = "fluid_interface"),
    FluidStorageBus(registryName = "part_fluid_storage_bus"),
    FluidExportBus(registryName = "part_fluid_export"),
    SuperStockReplenisher(registryName = "super_stock_replenisher"),
    FluidStorageComponent1k(registryName = "fluid_part"),
    FluidAutoFiller(registryName = "fluid_auto_filler"),
    LevelTerminal(registryName = "part_level_terminal"),
    FluidVoidCell(registryName = "fluid_storage.void"),
    FluidStorageHousing(registryName = "fluid_storage_housing"),
    UniverseFluidStorageCell(registryName = "fluid_storage.Universe"),
    SingularityFluidStorageCell(registryName = "fluid_storage.singularity");

    public override val modId: String = "ae2fc"
}
