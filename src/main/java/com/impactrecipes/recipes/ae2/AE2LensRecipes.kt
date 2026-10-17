package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.recipes.ore.ILensRecipes
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.asNonConsumable
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class AE2LensRecipes : ILensRecipes {

    public override fun green(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateDense,
                material = Materials.Steel,
                count = 1,
            ),
            lens = stack.asNonConsumable(),
            output = AE2Items.PrintedLogicCircuit.get(),
            ticks = 6000,
            eu = 480,
            cleanroom = false,
        )
    }

    public override fun white(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateDense,
                material = Materials.Steel,
                count = 1,
            ),
            lens = stack.asNonConsumable(),
            output = AE2Items.PrintedSilicon.get(),
            ticks = 6000,
            eu = 480,
            cleanroom = false,
        )
    }

    public override fun yellow(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateDense,
                material = Materials.Steel,
                count = 1,
            ),
            lens = stack.asNonConsumable(),
            output = AE2Items.PrintedEngineeringCircuit.get(),
            ticks = 6000,
            eu = 480,
            cleanroom = false,
        )
    }

    public override fun blue(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plateDense,
                material = Materials.Steel,
                count = 1,
            ),
            lens = stack.asNonConsumable(),
            output = AE2Items.PrintedCalculationCircuit.get(),
            ticks = 6000,
            eu = 480,
            cleanroom = false,
        )
    }
}
