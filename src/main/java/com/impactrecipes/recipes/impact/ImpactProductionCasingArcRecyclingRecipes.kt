package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactProductionCasingArcRecyclingRecipes {

    internal fun register() {
        MachineRecipes.arcFurnace(
            input = ImpactItems.ParallelHatchRack.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.MaragingSteel300,
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
            input = ImpactItems.PBECasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Titaniolum,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.GumMetal,
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
            input = ImpactItems.EngraverCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Duraluminium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Zamak,
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
            input = ImpactItems.AssemblerCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Nitinol,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Inconel690,
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
            input = ImpactItems.CentrifugeCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TiBetaC,
                    count = 3,
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
            input = ImpactItems.ElectrolyzerCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Zamak,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HastelloyC276,
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
            input = ImpactItems.WireFactoryCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Inconel690,
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
            input = ImpactItems.SupplyProductionCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Inconel792,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.MaragingSteel250,
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
            input = ImpactItems.UtilityMachineCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HastelloyC276,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Nitinol,
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
            input = ImpactItems.BrewmenterCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Grisium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Talonite,
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
            input = ImpactItems.ArcCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Kovar,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Talonite,
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
            input = ImpactItems.ArcCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Stellite,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.MaragingSteel300,
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
            input = ImpactItems.MixingCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.MaragingSteel250,
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
            input = ImpactItems.ElectromagneticCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Inconel690,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Nitinol,
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
            input = ImpactItems.ExtradificationCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Talonite,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TiBetaC,
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
            input = ImpactItems.MacerationCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Mangalloy,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.HastelloyC276,
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
    }
}
