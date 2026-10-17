package com.impactrecipes.recipes.gravisuite

import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GraviSuiteConductorRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.Superconductor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GGG",
                "SPS",
                "GGG",
                'G',
                GraviSuiteItems.SuperconductorCover.get(),
                'S',
                OrePrefixes.wireGt02.get(Materials.SuperconductorLuV),
                'P',
                OrePrefixes.plateTriple.get(Materials.Platinum),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.Superconductor.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GGG",
                "SPS",
                "GGG",
                'G',
                GraviSuiteItems.SuperconductorCover.get(),
                'S',
                OrePrefixes.wireGt04.get(Materials.SuperconductorZPM),
                'P',
                OrePrefixes.plateQuadruple.get(Materials.YttriumBariumCuprate),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.SuperconductorCover.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "III",
                "PPP",
                'I',
                IC2Items.IridiumPlate.get(),
                'P',
                OrePrefixes.plate.get(Materials.NiobiumTitanium),
            ),
        )
    }
}
