package com.impactrecipes.recipes.malisisdoors

import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class MalisisMetalHatchAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.Trapdoor.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = MalisisDoorsItems.IronTrapdoor.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.TrapdoorAcacia.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = MalisisDoorsItems.IronTrapdoor.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.TrapdoorSpruce.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = MalisisDoorsItems.IronTrapdoor.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.TrapdoorBirch.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = MalisisDoorsItems.IronTrapdoor.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.TrapdoorJungle.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = MalisisDoorsItems.IronTrapdoor.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.TrapdoorDarkOak.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 4,
            ),
            output = MalisisDoorsItems.IronTrapdoor.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = MalisisDoorsItems.IronTrapdoor.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Steel,
                count = 2,
            ),
            output = MalisisDoorsItems.SlidingTrapdoor.get(),
            ticks = 150,
            eu = 16,
        )
    }
}
