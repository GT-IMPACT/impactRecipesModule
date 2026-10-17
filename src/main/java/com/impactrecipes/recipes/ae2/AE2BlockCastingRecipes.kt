package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2BlockCastingRecipes {

    internal fun register() {
        MachineRecipes.fluidSolidifier(
            mold = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.Quartzite,
                count = 1,
            ),
            fluidInput = Materials.BorosilicateGlass.getMolten(18),
            output = AE2Items.QuartzFiber.get(),
            ticks = 60,
            eu = 120,
        )

        MachineRecipes.fluidSolidifier(
            mold = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            fluidInput = Materials.BorosilicateGlass.getMolten(36),
            output = AE2Items.QuartzFiber.get(amount = 2),
            ticks = 80,
            eu = 120,
        )

        MachineRecipes.fluidSolidifier(
            mold = RecipeItems.ore(
                prefix = OrePrefixes.stick,
                material = Materials.CertusQuartz,
                count = 1,
            ),
            fluidInput = Materials.BorosilicateGlass.getMolten(72),
            output = AE2Items.QuartzFiber.get(amount = 4),
            ticks = 100,
            eu = 120,
        )

        MachineRecipes.fluidSolidifier(
            mold = ImpactItems.ChargedQuartzRod.get(),
            fluidInput = Materials.BorosilicateGlass.getMolten(144),
            output = AE2Items.QuartzFiber.get(amount = 8),
            ticks = 120,
            eu = 120,
        )
    }
}
