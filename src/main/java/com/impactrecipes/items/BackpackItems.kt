package com.impactrecipes.items

public enum class BackpackItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    TannedLeather(registryName = "tannedLeather"),
    BoundLeather(registryName = "boundLeather"),
    SmallBackpack(registryName = "backpack"),
    MediumBackpack(
        registryName = "backpack",
        meta = 100,
    ),
    LargeBackpack(
        registryName = "backpack",
        meta = 200,
    ),
    WorkbenchBackpack(
        registryName = "workbenchbackpack",
        meta = 17,
    ),
    LargeWorkbenchBackpack(
        registryName = "workbenchbackpack",
        meta = 217,
    );

    public override val modId: String = "Backpack"
}
