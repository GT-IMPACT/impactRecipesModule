package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2CondensatorCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shaped(
            output = ModItemVariant(
                item = IC2Items.ReactorCondensator,
                meta = 1,
            ).get(),
            recipe = arrayOf(
                "PSP",
                "PVP",
                "PSP",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'S',
                IC2Items.ReactorHeatSwitchCore.get(),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorVentCore,
                    meta = 1,
                ).get(),
            ),
        )

        CraftingRecipes.shapelessWithFixedOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorCondensator,
                meta = 1,
            ).get(),
            ingredients = arrayOf(
                ModItemVariant(
                    item = IC2Items.ReactorCondensator,
                    meta = 9998,
                ).get(),
                OrePrefixes.plate.get(Materials.RedAlloy),
                OrePrefixes.plate.get(Materials.RedAlloy),
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shaped(
            output = ModItemVariant(
                item = IC2Items.ReactorCondensatorLap,
                meta = 1,
            ).get(),
            recipe = arrayOf(
                "PVP",
                "CPC",
                "PSP",
                'P',
                OrePrefixes.plate.get(Materials.Lapis),
                'V',
                ModItemVariant(
                    item = IC2Items.ReactorVentGold,
                    meta = 1,
                ).get(),
                'C',
                ModItemVariant(
                    item = IC2Items.ReactorCondensator,
                    meta = 1,
                ).get(),
                'S',
                IC2Items.ReactorHeatSwitchSpread.get(),
            ),
        )

        CraftingRecipes.shapelessWithFixedOutput(
            output = ModItemVariant(
                item = IC2Items.ReactorCondensatorLap,
                meta = 1,
            ).get(),
            ingredients = arrayOf(
                ModItemVariant(
                    item = IC2Items.ReactorCondensatorLap,
                    meta = 9998,
                ).get(),
                OrePrefixes.plate.get(Materials.Lapis),
                OrePrefixes.plate.get(Materials.Lapis),
                OrePrefixes.plate.get(Materials.Lapis),
            ),
        )
    }
}
