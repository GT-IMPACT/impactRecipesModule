package com.impactrecipes.recipes.ic2

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class IC2ComponentExtrusionRecipes {

    internal fun register() {
        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.block,
                material = Materials.Iron,
                count = 1,
            ),
            mold = GregTechItems.ShapeExtruderShaft.get(amount = 0),
            output = ModItemVariant(
                item = IC2Items.ItemRecipePart,
                meta = 11,
            ).get(),
            ticks = 2000,
            eu = 120,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.block,
                material = Materials.Steel,
                count = 1,
            ),
            mold = GregTechItems.ShapeExtruderShaft.get(amount = 0),
            output = ModItemVariant(
                item = IC2Items.ItemRecipePart,
                meta = 12,
            ).get(),
            ticks = 2000,
            eu = 480,
        )

        MachineRecipes.extruder(
            input = RecipeItems.ore(
                prefix = OrePrefixes.ingot,
                material = Materials.Zirconium,
                count = 1,
            ),
            mold = GregTechItems.ShapeExtruderCell.get(amount = 0),
            output = IC2Items.FuelRod.get(),
            ticks = 200,
            eu = 120,
        )
    }
}
