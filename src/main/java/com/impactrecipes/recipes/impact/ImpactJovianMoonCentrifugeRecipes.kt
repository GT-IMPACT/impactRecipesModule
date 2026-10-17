package com.impactrecipes.recipes.impact

import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactJovianMoonCentrifugeRecipes {

    internal fun register() {
        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustPhobos",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BandedIron,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Bauxite,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Molybdenite,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Desh,
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
            ticks = 600,
            eu = 60,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustDeimos",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.SulfuricAcid.getFluid(50),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Magnesite,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lapis,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Pitchblende,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Cooperite,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Neodymium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tungstate,
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
            ticks = 600,
            eu = 60,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustCeres",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.MeteoricIron,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Beryllium,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Platinum,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Titanium,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tungsten,
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
            ticks = 800,
            eu = 120,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustIceEuropa",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Oxygen.getGas(50),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ledox,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lapis,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lazurite,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Mithril,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Barium,
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
            ticks = 800,
            eu = 120,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustEuropa",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.Nitrogen.getGas(100),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.SiliconDioxide,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iron,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ledox,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Sodalite,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Barium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Uranium,
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
            ticks = 800,
            eu = 120,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustGanymed",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Titanium,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Chromite,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Galena,
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
                material = Materials.Palladium,
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
            ticks = 800,
            eu = 120,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustCallisto",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = GT_Values.NF,
            output = GregTech_API.getStackofAmountFromOreDict(
                "dustIceCallisto",
                1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Galena,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Topaz,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.BlueTopaz,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Lithium,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tungsten,
                count = 1,
            ),
            chances = intArrayOf(
                1500,
                600,
                300,
                80,
                50,
                20,
            ),
            ticks = 800,
            eu = 120,
        )

        MachineRecipes.centrifuge(
            input = GregTech_API.getStackofAmountFromOreDict(
                "dustIo",
                1,
            ),
            secondaryInput = GT_Values.NI,
            fluidInput = GT_Values.NF,
            fluidOutput = Materials.SulfuricGas.getGas(100),
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Sulfur,
                count = 1,
            ),
            secondaryOutput = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tantalite,
                count = 1,
            ),
            output3 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Tungsten,
                count = 1,
            ),
            output4 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Ruby,
                count = 1,
            ),
            output5 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Gold,
                count = 1,
            ),
            output6 = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Iridium,
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
    }
}
