package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2QuartzSmeltingRecipes {

    internal fun register() {
        MachineRecipes.alloySmelter(
            input = VanillaItems.Glass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.CertusQuartz,
                count = 1,
            ),
            output = AE2Items.QuartzGlass.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Glass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            output = AE2Items.QuartzGlass.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.alloySmelter(
            input = VanillaItems.Glass.get(),
            secondaryInput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Quartzite,
                count = 1,
            ),
            output = AE2Items.QuartzGlass.get(),
            ticks = 100,
            eu = 16,
        )

        MachineRecipes.alloySmelter(
            input = AE2Items.QuartzGlass.get(amount = 8),
            secondaryInput = GregTechItems.ShapeMoldBlock.get(amount = 0),
            output = AE2FCItems.CertusQuartzTank.get(),
            ticks = 800,
            eu = 30,
        )
    }
}
