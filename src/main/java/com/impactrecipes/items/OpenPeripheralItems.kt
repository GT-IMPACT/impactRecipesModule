package com.impactrecipes.items

public enum class OpenPeripheralItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    WirelessKeyboard(
        registryName = "keyboard",
        meta = 0,
    ),
    TerminalGlasses(
        registryName = "glasses",
        meta = 0,
    ),

    // Blocks

    TerminalGlassesBridge(
        registryName = "glassesbridge",
        meta = 0,
    ),
    Sensor(
        registryName = "sensor",
        meta = 0,
    ),
    PIM(
        registryName = "pim",
        meta = 0,
    ),
    ItemSelector(
        registryName = "selector",
        meta = 0,
    );

    public override val modId: String = "OpenPeripheral"
}
