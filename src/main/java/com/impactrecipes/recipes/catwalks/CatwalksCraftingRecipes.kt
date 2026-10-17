package com.impactrecipes.recipes.catwalks

import com.impactrecipes.items.CatwalksItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class CatwalksCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.Catwalk.get(amount = 6),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CIC",
                "SCS",
                "dIw",
                'C',
                CatwalksItems.Steelgrate.get(),
                'I',
                OrePrefixes.stick.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.CagedLadder.get(amount = 6),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CLC",
                "SCS",
                "dIw",
                'C',
                CatwalksItems.Steelgrate.get(),
                'I',
                OrePrefixes.stick.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'L',
                VanillaItems.Ladder.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.Scaffold.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "IdI",
                'C',
                CatwalksItems.Steelgrate.get(),
                'I',
                OrePrefixes.stick.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = CatwalksItems.Scaffold.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                CatwalksItems.ScaffoldVariant1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.SupportColumn.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SCS",
                "SCS",
                "SCS",
                'C',
                CatwalksItems.Steelgrate.get(),
                'S',
                OrePrefixes.stick.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.Steelgrate.get(amount = 5),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ISI",
                "SIS",
                "IdI",
                'I',
                OrePrefixes.stick.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.Steelgrate.get(amount = 10),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ISI",
                "SIS",
                "IdI",
                'I',
                OrePrefixes.stick.get(Materials.Birmabright),
                'S',
                OrePrefixes.screw.get(Materials.Birmabright),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.Steelgrate.get(amount = 20),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ISI",
                "SIS",
                "IdI",
                'I',
                OrePrefixes.stick.get(Materials.StainlessSteel),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.Steelgrate.get(amount = 40),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ISI",
                "SIS",
                "IdI",
                'I',
                OrePrefixes.stick.get(Materials.HSLA),
                'S',
                OrePrefixes.screw.get(Materials.HSLA),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.Steelgrate.get(amount = 60),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ISI",
                "SIS",
                "IdI",
                'I',
                OrePrefixes.stick.get(Materials.MaragingSteel300),
                'S',
                OrePrefixes.screw.get(Materials.MaragingSteel300),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = CatwalksItems.Blowtorch.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " SF",
                "dIS",
                "Iw ",
                'F',
                VanillaItems.FlintAndSteel.get(),
                'I',
                OrePrefixes.stick.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )
    }
}
