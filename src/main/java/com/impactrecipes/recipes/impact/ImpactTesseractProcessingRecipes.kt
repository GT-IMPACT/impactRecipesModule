package com.impactrecipes.recipes.impact

import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactTesseractProcessingRecipes {

    internal fun register() {
        MachineRecipes.tesseract(
            input = GT_Values.NI,
            fluidInput = Materials.HyperFuelI.getFluid(1000),
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.Opal,
                count = 64,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.gemFlawless,
                material = Materials.Ruby,
                count = 64,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.MysteriousCrystal,
                count = 51,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Desh,
                count = 47,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Quantium,
                count = 25,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.AlienOrganic,
                count = 16,
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 500,
            eu = 8000000,
        )

        MachineRecipes.tesseract(
            input = GT_Values.NI,
            fluidInput = Materials.HyperFuelII.getFluid(1000),
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.GarnetYellow,
                count = 64,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.gemFlawless,
                material = Materials.Amethyst,
                count = 64,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Naquadah,
                count = 57,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Draconium,
                count = 49,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Adamantium,
                count = 36,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.NetherStar,
                count = 20,
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 400,
            eu = 8000000,
        )

        MachineRecipes.tesseract(
            input = GT_Values.NI,
            fluidInput = Materials.HyperFuelIII.getFluid(1000),
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.GarnetRed,
                count = 64,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.gemFlawless,
                material = Materials.MysteriousCrystal,
                count = 64,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Oriharukon,
                count = 61,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Naquadria,
                count = 53,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BlackPlutonium,
                count = 47,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Americium,
                count = 39,
            ),
            chances = intArrayOf(
                10000,
                10000,
                10000,
                10000,
                10000,
                10000,
            ),
            ticks = 300,
            eu = 8000000,
        )
    }
}
