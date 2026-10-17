package com.impactrecipes.recipes.opencomputers

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.OpenComputersItems
import com.impactrecipes.recipes.ore.ILensRecipes
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.asNonConsumable
import net.minecraft.item.ItemStack

internal class OpenComputersLensRecipes : ILensRecipes {

    public override fun red(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = ImpactItems.MicrochipBoard1.get(),
            lens = stack.asNonConsumable(),
            output = OpenComputersItems.MicrochipTier1.get(amount = 16),
            ticks = 600,
            eu = 120,
            cleanroom = false,
        )
    }

    public override fun green(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = ImpactItems.MicrochipBoard2.get(),
            lens = stack.asNonConsumable(),
            output = OpenComputersItems.MicrochipTier2.get(amount = 9),
            ticks = 600,
            eu = 250,
            cleanroom = false,
        )
    }

    public override fun yellow(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = ImpactItems.MicrochipBoard3.get(),
            lens = stack.asNonConsumable(),
            output = OpenComputersItems.MicrochipTier3.get(amount = 6),
            ticks = 600,
            eu = 480,
            cleanroom = true,
        )
    }
}
