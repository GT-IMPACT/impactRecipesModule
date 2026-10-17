package com.impactrecipes.recipes.impact

import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactOuterPlanetCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustOberon",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Argon.getGas(50),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iridium,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Osmium,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Naquadah,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Uranium235,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Plutonium241,
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

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustMiranda",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Argon.getGas(50),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tin,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tetrahedrite,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iridium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Desh,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Chrome,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Osmium,
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
                "dustTriton",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gold,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Neodymium,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.RareEarth,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Niobium,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Yttrium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gallium,
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
            ticks = 1400,
            eu = 1024,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustProteus",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Radon.getGas(10),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Copper,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Uraninite,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Draconium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Diamond,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Uranium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Plutonium,
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
            ticks = 1400,
            eu = 1024,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustIcePluto",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Thorium,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Uranium,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Plutonium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BlackPlutonium,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ledox,
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
                70,
                60,
            ),
            ticks = 1600,
            eu = 1920,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustPluto",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Thorium,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Uranium,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BlackPlutonium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.GarnetRed,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.GarnetYellow,
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
                70,
                60,
            ),
            ticks = 1600,
            eu = 1920,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustMakeMake",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.GarnetRed,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.GarnetYellow,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BlackPlutonium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gallium,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Yttrium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Niobium,
                count = 1,
            ),
            chances = intArrayOf(
                1200,
                600,
                300,
                80,
                70,
                60,
            ),
            ticks = 1600,
            eu = 1920,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustHaumea",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gold,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Naquadah,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Draconium,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lanthanum,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Caesium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Cerium,
                count = 1,
            ),
            chances = intArrayOf(
                1200,
                600,
                300,
                80,
                70,
                50,
            ),
            ticks = 1600,
            eu = 1920,
        )
    }
}
