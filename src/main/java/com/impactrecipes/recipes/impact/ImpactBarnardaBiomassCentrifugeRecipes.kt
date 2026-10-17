package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactBarnardaBiomassCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.centrifuge(
            input = GalaxySpaceItems.Barnardacblocks.get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = ImpactItems.BarnardaCBall.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Neutronium,
                count = 1,
            ),
            output3 = VanillaItems.Sand.get(),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                2500,
                100,
                5000,
            ),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.centrifuge(
            input = GalaxySpaceItems.Barnardaclog.get(),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Radon.getGas(60),
            output = ImpactItems.BarnardaCBall.get(),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Carbon,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Wood,
                count = 1,
            ),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                3750,
                2500,
                2500,
            ),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.centrifuge(
            input = GalaxySpaceItems.BarnardaCdandelion3.get(amount = 64),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Biomass.getGas(1000),
            output = IC2Items.PlantBall.get(amount = 64),
            secondaryOutput = ImpactItems.BarnardaCBall.get(amount = 16),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.AlienOrganic,
                count = 4,
            ),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
                10000,
            ),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.centrifuge(
            input = GalaxySpaceItems.BarnardaCreed.get(amount = 64),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Biomass.getGas(1000),
            output = IC2Items.PlantBall.get(amount = 64),
            secondaryOutput = ImpactItems.BarnardaCBall.get(amount = 16),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.AlienOrganic,
                count = 4,
            ),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
                10000,
            ),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.centrifuge(
            input = GalaxySpaceItems.BarnardaCdandelions.get(amount = 64),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Biomass.getGas(1000),
            output = IC2Items.PlantBall.get(amount = 64),
            secondaryOutput = ImpactItems.BarnardaCBall.get(amount = 16),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.AlienOrganic,
                count = 4,
            ),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
                10000,
            ),
            ticks = 400,
            eu = 8,
        )

        MachineRecipes.centrifuge(
            input = GalaxySpaceItems.Barnardacdandelions1.get(amount = 64),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Biomass.getGas(1000),
            output = IC2Items.PlantBall.get(amount = 64),
            secondaryOutput = ImpactItems.BarnardaCBall.get(amount = 16),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.AlienOrganic,
                count = 4,
            ),
            output4 = GT_Values.NI,
            output5 = GT_Values.NI,
            output6 = GT_Values.NI,
            chances = intArrayOf(
                10000,
                10000,
                10000,
            ),
            ticks = 400,
            eu = 8,
        )
    }
}
