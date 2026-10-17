package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactSpaceCasingArcRecyclingRecipes {

    internal fun register() {
        MachineRecipes.arcFurnace(
            input = ImpactItems.DDDPrinterCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.VanadiumSteel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = ImpactItems.CycloneCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.MaragingSteel300,
                    count = 6,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Inconel792,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HSSG,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HSSE,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 240,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = ImpactItems.SpaceElevatorCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Vanadium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HSLA,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = ImpactItems.HugeCasingTurbine.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TiBetaC,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Titaniolum,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HSSG,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HSSE,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 240,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = ImpactItems.SpaceSatelliteCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HSLA,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = ImpactItems.TowerCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Ultimet,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.StainlessSteel,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )

        MachineRecipes.arcFurnace(
            input = ImpactItems.LabSafeLGCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.BlueSteel,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Zirconium,
                    count = 1,
                ),
            ),
            chances = null,
            ticks = 160,
            eu = 96,
        )
    }
}
