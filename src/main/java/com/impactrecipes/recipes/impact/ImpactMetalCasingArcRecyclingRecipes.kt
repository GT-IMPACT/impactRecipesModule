package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactMetalCasingArcRecyclingRecipes {

    internal fun register() {
        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingHeatProof.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Invar,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingSolidSteel.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Steel,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingFrostProof.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Aluminium,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingPipeBronze.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Bronze,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 360,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingPipeSteel.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Steel,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 360,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingPipeTitanium.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Titanium,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 360,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingPipeTungstenSteel.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TungstenSteel,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 360,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingRadiationProof.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Lead,
                    count = 27,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TungstenCarbide,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Stone,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 360,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingFireboxBronze.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Bronze,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingFireboxSteel.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Steel,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingFireboxTitanium.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Titanium,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingFireboxTungstenSteel.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingRobustTungstenSteel.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TungstenSteel,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingCleanStainlessSteel.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.StainlessSteel,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingStableTitanium.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Titanium,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )
    }
}
