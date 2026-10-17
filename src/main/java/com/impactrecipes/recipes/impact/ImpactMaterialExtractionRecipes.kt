package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes

internal class ImpactMaterialExtractionRecipes {

    internal fun register() {
        MachineRecipes.extractor(
            input = ImpactItems.BarnardaCBall.get(amount = 64),
            output = ImpactItems.BarnardaCBiomass.get(),
            ticks = 400,
            eu = 262144,
        )

        MachineRecipes.extractor(
            input = GregTechItems.CasingCokeOvenBrick.get(),
            output = ImpactItems.CokeOvenBrick.get(amount = 4),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.extractor(
            input = ImpactItems.MudBall.get(),
            output = VanillaItems.ClayBall.get(),
            ticks = 200,
            eu = 2,
        )
    }
}
