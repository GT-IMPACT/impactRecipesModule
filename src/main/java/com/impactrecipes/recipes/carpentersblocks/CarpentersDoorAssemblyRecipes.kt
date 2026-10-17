package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class CarpentersDoorAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = VanillaItems.WoodenDoor.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Door.get(),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.ItemDoorAcacia.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Door.get(),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.ItemDoorBirch.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Door.get(),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.ItemDoorDarkOak.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Door.get(),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.ItemDoorJungle.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Door.get(),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.ItemDoorSpruce.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Door.get(),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(amount = 2),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.spring,
                material = Materials.Iron,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.PressurePlate.get(amount = 2),
            ticks = 100,
            eu = 8,
        )
    }
}
