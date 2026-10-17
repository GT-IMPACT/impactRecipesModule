package com.impactrecipes.items

public enum class BuildCraftBuildersItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    BlueprintItem(
        registryName = "blueprintItem",
        meta = 0,
    ),
    TemplateItem(
        registryName = "templateItem",
        meta = 0,
    ),

    // Blocks

    ConstructionMarkerBlock(
        registryName = "constructionMarkerBlock",
        meta = 0,
    ),
    FillerBlock(
        registryName = "fillerBlock",
        meta = 0,
    ),
    BuilderBlock(
        registryName = "builderBlock",
        meta = 0,
    ),
    ArchitectBlock(
        registryName = "architectBlock",
        meta = 0,
    ),
    LibraryBlock(
        registryName = "libraryBlock",
        meta = 0,
    ),
    MachineBlock(
        registryName = "machineBlock",
        meta = 0,
    );

    public override val modId: String = "BuildCraft|Builders"
}
