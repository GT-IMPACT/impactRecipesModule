package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.recipes.ore.ILensRecipes
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.asNonConsumable
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import net.minecraft.item.ItemStack

internal class ImpactLensRecipes : ILensRecipes {

    public override fun red(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Redstone,
                count = 1,
            ),
            lens = stack.asNonConsumable(),
            output = ImpactItems.RedstoneRedChipset.get(),
            ticks = 50,
            eu = 120,
            cleanroom = false,
        )
        MachineRecipes.laserEngraver(
            input = GregTechItems.EnergyCrystal.get(),
            lens = stack.asNonConsumable(),
            output = ImpactItems.EngravedEnergyChip.get(),
            ticks = 600,
            eu = 4100,
            cleanroom = true,
        )
    }

    public override fun green(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = GregTechItems.LapotronCrystal.get(),
            lens = stack.asNonConsumable(),
            output = ImpactItems.QuantumCrystal.get(),
            ticks = 600,
            eu = 480,
            cleanroom = true,
        )
        MachineRecipes.laserEngraver(
            input = GregTechItems.EnergyCrystal.get(),
            lens = stack.asNonConsumable(),
            output = ImpactItems.NanoCrystal.get(),
            ticks = 300,
            eu = 120,
            cleanroom = false,
        )
    }

    public override fun white(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Diamond,
                count = 4,
            ),
            lens = stack.asNonConsumable(),
            output = ImpactItems.EngravedDiamondCrystalChip.get(),
            ticks = 400,
            eu = 1920,
            cleanroom = true,
        )
    }

    public override fun yellow(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.GarnetYellow,
                count = 1,
            ),
            lens = stack.asNonConsumable(),
            output = ImpactItems.EngravedQuantumChip.get(),
            ticks = 1200,
            eu = 30720,
            cleanroom = true,
        )
        MachineRecipes.laserEngraver(
            input = RecipeItems.ore(
                prefix = OrePrefixes.plate,
                material = Materials.Gold,
                count = 4,
            ),
            lens = stack.asNonConsumable(),
            output = ImpactItems.EngravedGoldChip.get(),
            ticks = 300,
            eu = 480,
            cleanroom = false,
        )
    }

    public override fun purple(stack: ItemStack) {
        MachineRecipes.laserEngraver(
            input = ImpactItems.FlawedFluixCrystal.get(amount = 3),
            lens = stack.asNonConsumable(),
            output = ImpactItems.FlawlessFluixCrystal.get(),
            ticks = 1200,
            eu = 480,
            cleanroom = false,
        )
    }
}
