package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactGalacticModuleItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactMaterialCrushingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.PhobosGround.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustPhobos",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.BandedIron,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
            ),
            ticks = 400,
            eu = 64,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.PhobosSubground.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustPhobos",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.BandedIron,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
            ),
            ticks = 400,
            eu = 64,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.DeimosGround.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustDeimos",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Magnesite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
            ),
            ticks = 400,
            eu = 64,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.DeimosSubground.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustDeimos",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Magnesite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
            ),
            ticks = 400,
            eu = 64,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.OberonGround.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustOberon",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Osmium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadah,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                500,
                250,
                210,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.OberonSubground.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustOberon",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Osmium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadah,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                500,
                250,
                210,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.OberonStone.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustOberon",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Iridium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Osmium,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadah,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                500,
                250,
                210,
            ),
            ticks = 400,
            eu = 480,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.ProteusGround.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustProteus",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uraninite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Draconium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                250,
            ),
            ticks = 400,
            eu = 1024,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.ProteusSubground.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustProteus",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uraninite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Draconium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                250,
            ),
            ticks = 400,
            eu = 1024,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.ProteusStone.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustProteus",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Copper,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Uraninite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Draconium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                1200,
                600,
                250,
            ),
            ticks = 400,
            eu = 1024,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.MakemakeGround.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustMakeMake",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.GarnetRed,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.GarnetYellow,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.BlackPlutonium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                600,
                600,
                250,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.MakemakeSubground.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustMakeMake",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.GarnetRed,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.GarnetYellow,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.BlackPlutonium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                600,
                600,
                250,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.pulverizer(
            input = ImpactGalacticModuleItems.HaumeaGround.get(),
            outputs = arrayOf(
                GregTech_API.getStackofAmountFromOreDict(
                    "dustHaumea",
                    1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Gold,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Naquadah,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Draconium,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                500,
                250,
                210,
            ),
            ticks = 400,
            eu = 1920,
        )

        MachineRecipes.pulverizer(
            input = GregTech_API.getStackofAmountFromOreDict(
                "ingotCokeOvenBrick",
                1,
            ),
            outputs = arrayOf(
                ImpactItems.CokeOvenBrickDust.get(),
            ),
            chances = intArrayOf(
                10000,
            ),
            ticks = 300,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = GregTechItems.CasingBronzePlatedBricks.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Bronze,
                    count = 4,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Stone,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                10000,
            ),
            ticks = 300,
            eu = 2,
        )
    }
}
