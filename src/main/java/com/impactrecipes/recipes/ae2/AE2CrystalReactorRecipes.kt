package com.impactrecipes.recipes.ae2

import com.impactrecipes.items.AE2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class AE2CrystalReactorRecipes {

    internal fun register() {
        MachineRecipes.chemicalReactor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.CertusQuartz,
                count = 1,
            ),
            secondaryInput = VanillaItems.Sand.get(),
            fluidInput = null,
            fluidOutput = null,
            output = AE2Items.CertusQuartzSeed.get(amount = 2),
            ticks = 100,
        )

        MachineRecipes.chemicalReactor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.CertusQuartz,
                count = 1,
            ),
            secondaryInput = VanillaItems.RedSand.get(),
            fluidInput = null,
            fluidOutput = null,
            output = AE2Items.CertusQuartzSeed.get(amount = 2),
            ticks = 100,
        )

        MachineRecipes.chemicalReactor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            secondaryInput = VanillaItems.Sand.get(),
            fluidInput = null,
            fluidOutput = null,
            output = AE2Items.NetherQuartzSeed.get(amount = 2),
            ticks = 100,
        )

        MachineRecipes.chemicalReactor(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NetherQuartz,
                count = 1,
            ),
            secondaryInput = VanillaItems.RedSand.get(),
            fluidInput = null,
            fluidOutput = null,
            output = AE2Items.NetherQuartzSeed.get(amount = 2),
            ticks = 100,
        )

        MachineRecipes.chemicalReactor(
            input = AE2Items.FluixDust.get(),
            secondaryInput = VanillaItems.Sand.get(),
            fluidInput = null,
            fluidOutput = null,
            output = AE2Items.FluixSeed.get(amount = 2),
            ticks = 100,
        )

        MachineRecipes.chemicalReactor(
            input = AE2Items.FluixDust.get(),
            secondaryInput = VanillaItems.RedSand.get(),
            fluidInput = null,
            fluidOutput = null,
            output = AE2Items.FluixSeed.get(amount = 2),
            ticks = 100,
        )

        MachineRecipes.chemicalReactor(
            input = ImpactItems.ChargedQuartzDust.get(amount = 3),
            secondaryInput = Materials.Sodium.getDust(1),
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = null,
            output = AE2Items.ChargedCertusQuartzCrystal.get(amount = 3),
            ticks = 500,
        )
    }
}
