package com.impactrecipes.recipes.catwalks

import com.impactrecipes.items.CatwalksItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import com.impactrecipes.util.asNonConsumable
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class CatwalksGratingRecipes {

    internal fun register() {
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Steel,
                count = 2,
            ),
            lens = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.Glass,
                count = 1,
            )?.asNonConsumable(),
            output = CatwalksItems.Steelgrate.get(amount = 5),
            ticks = 80,
            eu = 16,
            cleanroom = false,
        )

        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Birmabright,
                count = 2,
            ),
            lens = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.Glass,
                count = 1,
            )?.asNonConsumable(),
            output = CatwalksItems.Steelgrate.get(amount = 10),
            ticks = 100,
            eu = 24,
            cleanroom = false,
        )

        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.StainlessSteel,
                count = 2,
            ),
            lens = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.Glass,
                count = 1,
            )?.asNonConsumable(),
            output = CatwalksItems.Steelgrate.get(amount = 20),
            ticks = 120,
            eu = 48,
            cleanroom = false,
        )

        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.HSLA,
                count = 2,
            ),
            lens = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.Glass,
                count = 1,
            )?.asNonConsumable(),
            output = CatwalksItems.Steelgrate.get(amount = 40),
            ticks = 140,
            eu = 96,
            cleanroom = false,
        )

        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.MaragingSteel300,
                count = 2,
            ),
            lens = RecipeItems.ore(
                prefix = OrePrefixes.lens,
                material = Materials.Glass,
                count = 1,
            )?.asNonConsumable(),
            output = CatwalksItems.Steelgrate.get(amount = 60),
            ticks = 160,
            eu = 120,
            cleanroom = false,
        )
    }
}
