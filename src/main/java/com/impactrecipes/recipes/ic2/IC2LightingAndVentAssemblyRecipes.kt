package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_Utility

internal class IC2LightingAndVentAssemblyRecipes {

    internal fun register() {
        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.cell,
                material = Materials.Mercury,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.wireGt01,
                material = Materials.Copper,
                count = 8,
            ),
            fluidInput = Materials.Glass.getMolten(1152),
            output = IC2Items.Luminator.get(amount = 8),
            ticks = 600,
            eu = 30,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.cell,
                material = Materials.Helium,
                count = 1,
            ),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.wireGt01,
                material = Materials.Copper,
                count = 16,
            ),
            fluidInput = Materials.Glass.getMolten(1152),
            output = IC2Items.Luminator.get(amount = 16),
            ticks = 400,
            eu = 60,
        )

        MachineRecipes.assembler(
            input = VanillaItems.Furnace.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Iron,
                count = 5,
            ),
            output = IC2Items.IronFurnace.get(),
            ticks = 400,
            eu = 12,
        )

        MachineRecipes.assembler(
            input = RecipeItems.ore(
                prefix = OrePrefixes.stickLong,
                material = Materials.Wood,
                count = 8,
            ),
            secondaryInput = GT_Utility.getIntegratedCircuit(2),
            output = IC2Items.Crop.get(amount = 16),
            ticks = 150,
            eu = 24,
        )

        MachineRecipes.assembler(
            inputs = arrayOf(
                VanillaItems.IronBars.get(amount = 4),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Aluminium,
                    count = 4,
                ),
                GT_Utility.getIntegratedCircuit(4),
            ),
            fluid = null,
            output = ModItemVariant(
                item = IC2Items.ReactorVent,
                meta = 1,
            ).get(),
            ticks = 50,
            eu = 12,
        )
    }
}
