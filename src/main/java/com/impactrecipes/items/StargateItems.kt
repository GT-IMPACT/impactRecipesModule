package com.impactrecipes.items

public enum class StargateItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ControllerCrystal(registryName = "sgControllerCrystal"),
    CoreCrystal(registryName = "sgCoreCrystal"),
    ChevronUpgrade(registryName = "sgChevronUpgrade"),
    IrisUpgrade(registryName = "sgIrisUpgrade"),
    IrisBlade(registryName = "sgIrisBlade"),
    IC2Capacitor(registryName = "ic2Capacitor"),

    // Blocks

    Ring(registryName = "stargateRing"),
    Chevron(
        registryName = "stargateRing",
        meta = 1,
    ),
    Base(registryName = "stargateBase"),
    Controller(registryName = "stargateController"),
    IC2PowerUnit(registryName = "ic2PowerUnit"),
    OpenComputersInterface(registryName = "ocInterface");

    public override val modId: String = "SGCraft"
}
