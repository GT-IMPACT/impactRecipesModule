package com.impactrecipes.recipes.extrautilities

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ExtraUtilitiesUtilityAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = VanillaItems.Chest.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Wood,
                count = 2,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.ChestFull.get(),
            ticks = 100,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.round,
                material = Materials.Rubber,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 10,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.TrashCan.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.round,
                material = Materials.StyreneButadieneRubber,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 10,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.TrashCan.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.round,
                material = Materials.Silicone,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 10,
            ),
            fluidInput = null,
            output = ExtraUtilitiesItems.TrashCan.get(),
            ticks = 400,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = GregTechItems.GtMetaitem0132731.get(),
            secondaryInput = VanillaItems.StickyPiston.get(),
            fluidInput = null,
            output = ExtraUtilitiesItems.BasicBlockUpdateDetector.get(),
            ticks = 200,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = ExtraUtilitiesItems.BasicBlockUpdateDetector.get(),
            secondaryInput = VanillaItems.RedstoneBlock.get(amount = 4),
            fluidInput = null,
            output = ExtraUtilitiesItems.BlockUpdateDetector.get(),
            ticks = 200,
            eu = 120,
        )
    }
}
