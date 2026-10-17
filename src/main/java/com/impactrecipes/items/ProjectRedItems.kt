package com.impactrecipes.items

public enum class ProjectRedItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    ProjectredCorePart42(
        registryName = "projectred.core.part",
        meta = 42,
    ),
    ProjectredCorePart43(
        registryName = "projectred.core.part",
        meta = 43,
    ),
    ProjectredCoreScrewdriver(
        registryName = "projectred.core.screwdriver",
        meta = 0,
    ),
    ProjectredCoreWiredebugger(
        registryName = "projectred.core.wiredebugger",
        meta = 0,
    ),
    ProjectredCorePart(
        registryName = "projectred.core.part",
        meta = 0,
    ),
    ProjectredCorePart13(
        registryName = "projectred.core.part",
        meta = 13,
    ),
    ProjectredCorePart7(
        registryName = "projectred.core.part",
        meta = 7,
    ),
    ProjectredCorePart14(
        registryName = "projectred.core.part",
        meta = 14,
    ),
    ProjectredCorePart8(
        registryName = "projectred.core.part",
        meta = 8,
    ),
    ProjectredCorePart1(
        registryName = "projectred.core.part",
        meta = 1,
    ),
    ProjectredCorePart2(
        registryName = "projectred.core.part",
        meta = 2,
    ),
    ProjectredCorePart4(
        registryName = "projectred.core.part",
        meta = 4,
    ),
    ProjectredCorePart9(
        registryName = "projectred.core.part",
        meta = 9,
    ),
    ProjectredCorePart3(
        registryName = "projectred.core.part",
        meta = 3,
    ),
    Silicon(
        registryName = "projectred.core.part",
        meta = 5,
    ),
    RedSilicon(
        registryName = "projectred.core.part",
        meta = 6,
    );

    public override val modId: String = "ProjRed|Core"
}
