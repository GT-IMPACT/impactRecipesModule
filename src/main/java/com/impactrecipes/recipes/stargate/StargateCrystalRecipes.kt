package com.impactrecipes.recipes.stargate

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.StargateItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class StargateCrystalRecipes {

    internal fun register() {
        MachineRecipes.spaceAutoclave(
            input = ImpactItems.StargateCrystalDust.get(amount = 64),
            fluid = Materials.Silver.getPlasma(8000),
            output = StargateItems.CoreCrystal.get(),
            chance = 10000,
            ticks = 3600,
            eu = 131000,
            cleanroom = true,
        )

        MachineRecipes.spaceAutoclave(
            input = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.DraconiumAwakened,
                count = 64,
            ),
            fluid = Materials.Silver.getPlasma(8000),
            output = StargateItems.ControllerCrystal.get(),
            chance = 10000,
            ticks = 3600,
            eu = 131000,
            cleanroom = true,
        )
    }
}
