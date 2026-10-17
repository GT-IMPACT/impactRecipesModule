package com.impactrecipes.recipes.betterbuilderswands

import com.impactrecipes.items.BetterBuildersWandsItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class BetterBuildersWandsCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shaped(
            output = BetterBuildersWandsItems.StoneWand.get(),
            recipe = arrayOf(
                "SRP",
                " TR",
                "T D",
                'S',
                "craftingToolSaw",
                'R',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Stone),
                'T',
                OrePrefixes.stick.get(Materials.Wood),
                'D',
                "craftingToolScrewdriver",
            ),
        )

        CraftingRecipes.shaped(
            output = BetterBuildersWandsItems.IronWand.get(),
            recipe = arrayOf(
                "SRP",
                " TR",
                "T D",
                'S',
                "craftingToolSaw",
                'R',
                OrePrefixes.screw.get(Materials.Steel),
                'P',
                OrePrefixes.plateDouble.get(Materials.Iron),
                'T',
                OrePrefixes.stickLong.get(Materials.Iron),
                'D',
                "craftingToolScrewdriver",
            ),
        )
    }
}
