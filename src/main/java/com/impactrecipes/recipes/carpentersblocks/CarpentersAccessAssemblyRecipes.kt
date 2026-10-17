package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class CarpentersAccessAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.ring,
                material = Materials.Iron,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.GarageDoor.get(amount = 2),
            ticks = 150,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.ring,
                material = Materials.Steel,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.GarageDoor.get(amount = 4),
            ticks = 300,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = VanillaItems.FenceGate.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Gate.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.AcaciaFenceGate.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Gate.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.BirchFenceGate.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Gate.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.DarkOakFenceGate.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Gate.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.JungleFenceGate.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Gate.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.SpruceFenceGate.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Gate.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = VanillaItems.Trapdoor.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Hatch.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.TrapdoorAcacia.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Hatch.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.TrapdoorSpruce.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Hatch.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.TrapdoorBirch.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Hatch.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.TrapdoorJungle.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Hatch.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = MalisisDoorsItems.TrapdoorDarkOak.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Hatch.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = VanillaItems.Ladder.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Ladder.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = VanillaItems.Lever.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Lever.get(),
            ticks = 50,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CollapsibleBlock.get(amount = 3),
            secondaryInput = IC2Items.PersonalSafe.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Safe.get(),
            ticks = 300,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = VanillaItems.Torch.get(amount = 10),
            fluidInput = null,
            output = CarpentersBlocksItems.Torch.get(amount = 10),
            ticks = 100,
            eu = 16,
        )
    }
}
