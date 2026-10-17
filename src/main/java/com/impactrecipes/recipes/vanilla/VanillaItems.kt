package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.IRegistryModItem

public enum class VanillaItems(
    public override val registryName: String,
) : IRegistryModItem {

    HeavyWeightedPressurePlate(registryName = "heavy_weighted_pressure_plate"),
    Fence(registryName = "fence");

    public override val modId: String = "minecraft"
    public override val meta: Int = 0
}
