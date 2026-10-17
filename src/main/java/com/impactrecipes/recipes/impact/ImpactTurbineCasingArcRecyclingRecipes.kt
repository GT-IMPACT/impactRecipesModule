package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactTurbineCasingArcRecyclingRecipes {

    internal fun register() {
        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingTurbine.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Magnalium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.BlueSteel,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingTurbine1.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.StainlessSteel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Magnalium,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingTurbine2.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Titanium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Magnalium,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingTurbine3.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TungstenSteel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Magnalium,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingMiningOsmiridium.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Osmiridium,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingRobustNaquadahAlloy.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.NaquadahAlloy,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingHSLA.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HSLA,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = GregTechItems.CasingRobustNeutronium.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Neutronium,
                    count = 4,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )
    }
}
