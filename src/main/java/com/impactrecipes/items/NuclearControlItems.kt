package com.impactrecipes.items

public enum class NuclearControlItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    RemoteSensorKit(registryName = "ItemRemoteSensorKit"),
    SensorLocationCard(registryName = "ItemSensorLocationCard"),
    EnergySensorKit(registryName = "ItemEnergySensorKit"),
    EnergySensorLocationCard(registryName = "ItemEnergySensorLocationCard"),
    CounterSensorKit(registryName = "ItemMultipleSensorKit"),
    CounterSensorLocationCard(registryName = "ItemMultipleSensorLocationCard"),
    LiquidSensorKit(
        registryName = "ItemMultipleSensorKit",
        meta = 1,
    ),
    LiquidSensorLocationCard(
        registryName = "ItemMultipleSensorLocationCard",
        meta = 1,
    ),
    GeneratorSensorKit(
        registryName = "ItemMultipleSensorKit",
        meta = 2,
    ),
    GeneratorSensorLocationCard(
        registryName = "ItemMultipleSensorLocationCard",
        meta = 2,
    ),
    AppliedEnergisticsSensorKit(registryName = "KitAppeng"),
    AppliedEnergisticsSensorCard(registryName = "CardAppeng"),
    RangeUpgrade(registryName = "ItemUpgrade"),
    ColorUpgrade(
        registryName = "ItemUpgrade",
        meta = 1,
    ),

    // Blocks

    WhiteLamp(
        registryName = "blockNuclearControlLight",
        meta = 0,
    ),
    IndustrialInformationPanel(
        registryName = "blockNuclearControlMain",
        meta = 4,
    ),
    InformationPanelExtender(
        registryName = "blockNuclearControlMain",
        meta = 5,
    ),
    AdvancedInformationPanel(
        registryName = "blockNuclearControlMain",
        meta = 9,
    ),
    AdvancedPanelExtender(
        registryName = "blockNuclearControlMain",
        meta = 10,
    );

    public override val modId: String = "IC2NuclearControl"
}
