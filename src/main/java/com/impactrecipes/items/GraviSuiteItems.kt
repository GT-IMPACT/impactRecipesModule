package com.impactrecipes.items

public enum class GraviSuiteItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    SuperconductorCover(
        registryName = "itemSimpleItem",
        meta = 0,
    ),
    EngineBooster(
        registryName = "itemSimpleItem",
        meta = 6,
    ),
    GravitationEngine(
        registryName = "itemSimpleItem",
        meta = 3,
    ),
    CoolingCore(
        registryName = "itemSimpleItem",
        meta = 2,
    ),
    Magnetron(
        registryName = "itemSimpleItem",
        meta = 4,
    ),
    VajraCore(
        registryName = "itemSimpleItem",
        meta = 5,
    ),
    AdvancedGravitationEngine(
        registryName = "itemSimpleItem",
        meta = 7,
    ),
    EpicLappack27(
        registryName = "epicLappack",
        meta = 27,
    ),
    UltimateLappack(
        registryName = "ultimateLappack",
        meta = 0,
    ),
    Vajra27(
        registryName = "vajra",
        meta = 27,
    ),
    GraviTool(
        registryName = "graviTool",
        meta = 0,
    ),
    AdvChainsaw(
        registryName = "advChainsaw",
        meta = 0,
    ),
    AdvNanoChestPlate27(
        registryName = "advNanoChestPlate",
        meta = 27,
    ),
    AdvJetpack(
        registryName = "advJetpack",
        meta = 0,
    ),
    AdvJetpack27(
        registryName = "advJetpack",
        meta = 27,
    ),
    AdvLappack(
        registryName = "advLappack",
        meta = 0,
    ),
    UltimateLappack27(
        registryName = "ultimateLappack",
        meta = 27,
    ),
    AdvLappack27(
        registryName = "advLappack",
        meta = 27,
    ),
    GraviChestPlate27(
        registryName = "graviChestPlate",
        meta = 27,
    ),
    GraviChestPlate(
        registryName = "graviChestPlate",
        meta = 0,
    ),
    EpicLappack(
        registryName = "epicLappack",
        meta = 0,
    ),
    KpChestPlate27(
        registryName = "kpChestPlate",
        meta = 27,
    ),
    Relocator26(
        registryName = "relocator",
        meta = 26,
    ),
    Superconductor(
        registryName = "itemSimpleItem",
        meta = 1,
    ),
    AdvNanoChestPlate(
        registryName = "advNanoChestPlate",
        meta = 0,
    );

    public override val modId: String = "GraviSuite"
}
