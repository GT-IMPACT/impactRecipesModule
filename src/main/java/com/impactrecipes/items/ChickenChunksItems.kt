package com.impactrecipes.items

public enum class ChickenChunksItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Blocks

    ChunkLoader(registryName = "chickenChunkLoader"),
    SpotLoader(
        registryName = "chickenChunkLoader",
        meta = 1,
    );

    public override val modId: String = "ChickenChunks"
}
