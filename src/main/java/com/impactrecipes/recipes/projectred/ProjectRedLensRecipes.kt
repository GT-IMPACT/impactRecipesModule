package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.recipes.ore.ILensRecipes
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.asNonConsumable
import net.minecraft.item.ItemStack

internal class ProjectRedLensRecipes : ILensRecipes {

    public override fun red(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = ProjectRedItems.Silicon.get(),
            lens = stack.asNonConsumable(),
            output = ProjectRedItems.RedSilicon.get(),
            ticks = 500,
            eu = 30,
            cleanroom = false,
        )
    }
}
