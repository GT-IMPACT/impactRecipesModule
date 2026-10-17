package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class IC2ChargepadCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = IC2Items.ChargepadbatBox.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SHS",
                "COC",
                "PdP",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'H',
                VanillaItems.WoodenPressurePlate.get(),
                'O',
                IC2Items.BatBox.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.ChargepadcesuUnit.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SHS",
                "COC",
                "PdP",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'P',
                OrePrefixes.itemCasing.get(Materials.Aluminium),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'H',
                VanillaItems.StonePressurePlate.get(),
                'O',
                IC2Items.CesuUnit.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.ChargepadmfeUnit.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SHS",
                "COC",
                "PdP",
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'P',
                OrePrefixes.itemCasing.get(Materials.StainlessSteel),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'H',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'O',
                IC2Items.MfeUnit.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.ChargepadmfsUnit.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SHS",
                "COC",
                "PdP",
                'S',
                OrePrefixes.screw.get(Materials.Titanium),
                'P',
                OrePrefixes.itemCasing.get(Materials.Titanium),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'H',
                VanillaItems.LightWeightedPressurePlate.get(),
                'O',
                IC2Items.MfsUnit.get(),
            ),
        )
    }
}
