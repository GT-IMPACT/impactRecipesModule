package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftRailBendingRecipes {

    internal fun register() {
        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Aluminium,
                count = 12,
            ),
            output = RailcraftItems.Rebar.get(amount = 4),
            ticks = 200,
            eu = 15,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Iron,
                count = 12,
            ),
            output = RailcraftItems.Rebar.get(amount = 8),
            ticks = 400,
            eu = 15,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.WroughtIron,
                count = 12,
            ),
            output = RailcraftItems.Rebar.get(amount = 10),
            ticks = 400,
            eu = 15,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Bronze,
                count = 12,
            ),
            output = RailcraftItems.Rebar.get(amount = 8),
            ticks = 400,
            eu = 15,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Steel,
                count = 12,
            ),
            output = RailcraftItems.Rebar.get(amount = 16),
            ticks = 800,
            eu = 15,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.StainlessSteel,
                count = 12,
            ),
            output = RailcraftItems.Rebar.get(amount = 24),
            ticks = 1200,
            eu = 15,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Titanium,
                count = 12,
            ),
            output = RailcraftItems.Rebar.get(amount = 32),
            ticks = 1600,
            eu = 15,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.TungstenSteel,
                count = 12,
            ),
            output = RailcraftItems.Rebar.get(amount = 48),
            ticks = 2400,
            eu = 15,
        )

        MachineRecipes.bender(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Iridium,
                count = 8,
            ),
            output = RailcraftItems.Rebar.get(amount = 64),
            ticks = 2400,
            eu = 15,
        )
    }
}
