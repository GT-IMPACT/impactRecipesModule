package com.impactrecipes.recipes.galaxyspace

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalaxySpaceRocketRecyclingRecipes {

    internal fun register() {
        MachineRecipes.arcFurnace(
            input = GalaxySpaceItems.ItemTier4Rocket.get(),
            outputs = arrayOf(
                ImpactItems.HeavyDutyAlloyIngotT4.get(amount = 64),
                ImpactItems.HeavyDutyAlloyIngotT4.get(amount = 3),
                GregTechItems.IngotHeavy3.get(amount = 28),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HastelloyN,
                    count = 24,
                ),
            ),
            chances = null,
            ticks = 1800,
            eu = 24576,
        )

        MachineRecipes.arcFurnace(
            input = GalaxySpaceItems.ItemTier5Rocket.get(),
            outputs = arrayOf(
                ImpactItems.HeavyDutyAlloyIngotT5.get(amount = 64),
                ImpactItems.HeavyDutyAlloyIngotT5.get(amount = 17),
                ImpactItems.HeavyDutyAlloyIngotT4.get(amount = 30),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Europium,
                    count = 30,
                ),
            ),
            chances = null,
            ticks = 2000,
            eu = 98304,
        )

        MachineRecipes.arcFurnace(
            input = GalaxySpaceItems.ItemTier6Rocket.get(),
            outputs = arrayOf(
                ImpactItems.HeavyDutyAlloyIngotT6.get(amount = 64),
                ImpactItems.HeavyDutyAlloyIngotT6.get(amount = 43),
                ImpactItems.HeavyDutyAlloyIngotT5.get(amount = 40),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Americium,
                    count = 40,
                ),
            ),
            chances = null,
            ticks = 2200,
            eu = 393216,
        )

        MachineRecipes.arcFurnace(
            input = GalaxySpaceItems.ItemTier7Rocket.get(),
            outputs = arrayOf(
                ImpactItems.HeavyDutyAlloyIngotT7.get(amount = 64),
                ImpactItems.HeavyDutyAlloyIngotT7.get(amount = 64),
                ImpactItems.HeavyDutyAlloyIngotT6.get(amount = 50),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Neutronium,
                    count = 54,
                ),
            ),
            chances = null,
            ticks = 2400,
            eu = 1572864,
        )

        MachineRecipes.arcFurnace(
            input = GalaxySpaceItems.ItemTier8Rocket.get(),
            outputs = arrayOf(
                ImpactItems.HeavyDutyAlloyIngotT8.get(amount = 64),
                ImpactItems.HeavyDutyAlloyIngotT8.get(amount = 64),
                ImpactItems.HeavyDutyAlloyIngotT7.get(amount = 60),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Phoenixite,
                    count = 64,
                ),
            ),
            chances = null,
            ticks = 2800,
            eu = 6291456,
        )
    }
}
