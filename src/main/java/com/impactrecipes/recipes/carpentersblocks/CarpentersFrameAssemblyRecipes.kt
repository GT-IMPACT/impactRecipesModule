package com.impactrecipes.recipes.carpentersblocks

import com.impactrecipes.items.CarpentersBlocksItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class CarpentersFrameAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Wood,
                count = 2,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.screw,
                material = Materials.Wood,
                count = 2,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 4),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Wood,
                count = 3,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.screw,
                material = Materials.Iron,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 8),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Wood,
                count = 3,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.screw,
                material = Materials.Steel,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 12),
            ticks = 100,
            eu = 48,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Wood,
                count = 3,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.screw,
                material = Materials.Aluminium,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 16),
            ticks = 100,
            eu = 64,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Wood,
                count = 3,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.screw,
                material = Materials.StainlessSteel,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 20),
            ticks = 100,
            eu = 64,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Wood,
                count = 3,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.screw,
                material = Materials.Titanium,
                count = 1,
            ),
            fluidInput = null,
            output = CarpentersBlocksItems.CarpentersBlock.get(amount = 24),
            ticks = 100,
            eu = 64,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = VanillaItems.Fence.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.Barrier.get(amount = 2),
            ticks = 200,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = GregTechItems.PlankOak.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = GregTechItems.PlankSpruce.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = GregTechItems.PlankBirch.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = GregTechItems.PlankJungle.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = GregTechItems.PlankAcacia.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = GregTechItems.PlankDarkOak.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.CollapsibleBlock.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.assembler(
            input = CarpentersBlocksItems.CarpentersBlock.get(),
            secondaryInput = VanillaItems.FlowerPot.get(),
            fluidInput = null,
            output = CarpentersBlocksItems.FlowerPot.get(),
            ticks = 100,
            eu = 16,
        )
    }
}
