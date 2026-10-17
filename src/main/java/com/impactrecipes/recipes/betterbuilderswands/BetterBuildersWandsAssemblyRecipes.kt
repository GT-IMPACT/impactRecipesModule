package com.impactrecipes.recipes.betterbuilderswands

import com.impactrecipes.items.BetterBuildersWandsItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class BetterBuildersWandsAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stickLong,
                material = Materials.Iron,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plateDouble,
                material = Materials.Iron,
                count = 1,
            ),
            output = BetterBuildersWandsItems.IronWand.get(),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stickLong,
                material = Materials.Steel,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Diamond,
                count = 1,
            ),
            output = BetterBuildersWandsItems.DiamondWand.get(),
            ticks = 600,
            eu = 64,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stickLong,
                material = Materials.Titanium,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plateDouble,
                material = Materials.Titanium,
                count = 1,
            ),
            output = BetterBuildersWandsItems.UnbreakableWandIII.get(),
            ticks = 600,
            eu = 480,
        )

        MachineRecipes.assembler(
            input = BetterBuildersWandsItems.UnbreakableWandIII.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plateDouble,
                material = Materials.Titanium,
                count = 4,
            ),
            output = BetterBuildersWandsItems.UnbreakableWandIV.get(),
            ticks = 800,
            eu = 1024,
        )

        MachineRecipes.assembler(
            input = BetterBuildersWandsItems.UnbreakableWandIV.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plateDouble,
                material = Materials.Titanium,
                count = 8,
            ),
            output = BetterBuildersWandsItems.UnbreakableWandV.get(),
            ticks = 1000,
            eu = 1920,
        )
    }
}
