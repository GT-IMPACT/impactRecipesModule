package com.impactrecipes.items

public enum class ExtraCellsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    PartBase(
        registryName = "part.base",
        meta = 0,
    ),
    PartBase1(
        registryName = "part.base",
        meta = 1,
    ),
    PartBase2(
        registryName = "part.base",
        meta = 2,
    ),
    StorageComponent(
        registryName = "storage.component",
        meta = 0,
    ),
    StorageGas(
        registryName = "storage.gas",
        meta = 0,
    ),
    StorageCasing(
        registryName = "storage.casing",
        meta = 0,
    ),
    StorageFluid(
        registryName = "storage.fluid",
        meta = 0,
    ),
    StoragePhysical(
        registryName = "storage.physical",
        meta = 0,
    ),
    PatternFluid(
        registryName = "pattern.fluid",
        meta = 0,
    ),
    PatternBase(
        registryName = "pattern.base",
        meta = 0,
    ),
    Craftingstorage(
        registryName = "craftingstorage",
        meta = 0,
    ),
    TerminalFluidWireless(
        registryName = "terminal.fluid.wireless",
        meta = 0,
    ),
    StorageFluidPortable(
        registryName = "storage.fluid.portable",
        meta = 0,
    ),
    PartBase9(
        registryName = "part.base",
        meta = 9,
    ),
    StorageComponent4(
        registryName = "storage.component",
        meta = 4,
    ),
    StorageComponent5(
        registryName = "storage.component",
        meta = 5,
    ),
    StorageComponent6(
        registryName = "storage.component",
        meta = 6,
    ),
    StorageComponent7(
        registryName = "storage.component",
        meta = 7,
    ),
    StorageComponent8(
        registryName = "storage.component",
        meta = 8,
    ),
    StorageComponent9(
        registryName = "storage.component",
        meta = 9,
    ),
    StorageComponent10(
        registryName = "storage.component",
        meta = 10,
    ),
    PartBase5(
        registryName = "part.base",
        meta = 5,
    ),
    PartBase6(
        registryName = "part.base",
        meta = 6,
    ),
    PartBase7(
        registryName = "part.base",
        meta = 7,
    ),
    PartBase8(
        registryName = "part.base",
        meta = 8,
    ),

    // Blocks

    Certustank(
        registryName = "certustank",
        meta = 0,
    ),
    Ecbaseblock(
        registryName = "ecbaseblock",
        meta = 0,
    ),
    Ecbaseblock1(
        registryName = "ecbaseblock",
        meta = 1,
    ),
    Vibrantchamberfluid(
        registryName = "vibrantchamberfluid",
        meta = 0,
    );

    public override val modId: String = "extracells"
}
