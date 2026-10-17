package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class CarpentersToolAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.Chisel.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.toolHeadHammer,
                material = Materials.Iron,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.Hammer.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.PressurePlate.get(),
            secondaryInput = VanillaItems.ClayBall.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Tile.get(amount = 2),
            ticks = 50,
            eu = 16,
        )
    }
}
