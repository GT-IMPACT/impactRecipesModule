package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ExtraUtilitiesUtilityCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.WateringCan.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "hRd",
                "PPI",
                "PPS",
                'I',
                OrePrefixes.stick.get(Materials.Steel),
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.RedstoneClock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PGP",
                "GCG",
                "PGP",
                'G',
                OrePrefixes.gearGt.get(Materials.Wood),
                'C',
                VanillaItems.Clock.get(),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.AngelBlock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FPF",
                "FOF",
                "FPF",
                'O',
                OrePrefixes.stone.get(Materials.Obsidian),
                'F',
                VanillaItems.Feather.get(),
                'P',
                OrePrefixes.plate.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.GoldenBag.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "FDF",
                "PBP",
                "hPf",
                'F',
                OrePrefixes.foil.get(Materials.Gold),
                'D',
                OrePrefixes.gemExquisite.get(Materials.Diamond),
                'B',
                BackpackItems.SmallBackpack.get(),
                'P',
                OrePrefixes.plate.get(Materials.Gold),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ExtraUtilitiesItems.Drum.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "PCP",
                "PRP",
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'C',
                GregTechItems.CasingTank0.get(),
                'P',
                OrePrefixes.plateDouble.get(Materials.Steel),
            ),
        )
    }
}
