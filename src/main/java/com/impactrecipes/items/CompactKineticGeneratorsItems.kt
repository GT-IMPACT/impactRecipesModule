package com.impactrecipes.items

public enum class CompactKineticGeneratorsItems(
    public override val registryName: String,
    public override val meta: Int = 0,
) : IRegistryModItem {

    // Items

    IridiumRotor(
        registryName = "IridiumRotor",
        meta = 0,
    ),
    IridiumBlade(
        registryName = "IridiumBlade",
        meta = 0,
    ),

    // Blocks

    BlockCkg(
        registryName = "BlockCkg",
        meta = 0,
    ),
    BlockCkg1(
        registryName = "BlockCkg",
        meta = 1,
    ),
    BlockCkg2(
        registryName = "BlockCkg",
        meta = 2,
    ),
    BlockCkg3(
        registryName = "BlockCkg",
        meta = 3,
    ),
    BlockCkg4(
        registryName = "BlockCkg",
        meta = 4,
    ),
    BlockCkg5(
        registryName = "BlockCkg",
        meta = 5,
    ),
    BlockCkg6(
        registryName = "BlockCkg",
        meta = 6,
    ),
    BlockCkg7(
        registryName = "BlockCkg",
        meta = 7,
    ),
    BlockCkg8(
        registryName = "BlockCkg",
        meta = 8,
    ),
    BlockCkg9(
        registryName = "BlockCkg",
        meta = 9,
    ),
    BlockCkg10(
        registryName = "BlockCkg",
        meta = 10,
    ),
    BlockCkg11(
        registryName = "BlockCkg",
        meta = 11,
    );

    public override val modId: String = "compactkineticgenerators"
}
