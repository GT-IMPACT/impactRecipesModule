package com.impactrecipes.recipes.impact

import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactInnerPlanetAndSaturnCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustVenus",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.CarbonDioxide.getGas(500),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Carbon,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Scheelite,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Mithril,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Amethyst,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.GarnetRed,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Mytryl,
                count = 1,
            ),
            chances = intArrayOf(
                1200,
                600,
                300,
                80,
                50,
                20,
            ),
            ticks = 1000,
            eu = 250,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustMercuryP",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Helium_3.getGas(50),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Vanadium,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tungstate,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Mithril,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Titanium,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ruby,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Diamond,
                count = 1,
            ),
            chances = intArrayOf(
                1200,
                600,
                300,
                80,
                50,
                20,
            ),
            ticks = 1000,
            eu = 250,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustIceEnceladus",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Oxygen.getGas(150),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.MysteriousCrystal,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Chrome,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iridium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ledox,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Trinium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Naquadah,
                count = 1,
            ),
            chances = intArrayOf(
                1200,
                600,
                300,
                80,
                50,
                20,
            ),
            ticks = 1200,
            eu = 480,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustEnceladus",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Nitrogen.getGas(150),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Chrome,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iridium,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Osmium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Opal,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Trinium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Naquadah,
                count = 1,
            ),
            chances = intArrayOf(
                1200,
                600,
                300,
                80,
                50,
                20,
            ),
            ticks = 1200,
            eu = 480,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustTitan",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Methane.getGas(100),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Nickel,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iridium,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Osmium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Emerald,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gallium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Trinium,
                count = 1,
            ),
            chances = intArrayOf(
                1200,
                600,
                300,
                80,
                50,
                20,
            ),
            ticks = 1200,
            eu = 480,
        )
    }
}
