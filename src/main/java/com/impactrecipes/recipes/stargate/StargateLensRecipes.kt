package com.impactrecipes.recipes.stargate

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.StargateItems
import com.impactrecipes.recipes.ore.ILensRecipes
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.asNonConsumable
import net.minecraft.item.ItemStack

internal class StargateLensRecipes : ILensRecipes {

    public override fun red(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = StargateItems.ControllerCrystal.get(),
            lens = stack.asNonConsumable(),
            output = GregTechItems.CircuitPartsSGController.get(amount = 3),
            ticks = 1000,
            eu = 30000000,
            cleanroom = true,
        )
    }
}
