package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactCasingDisassemblyRecipes {

    internal fun register() {
        MachineRecipes.disassembler(
            input = ImpactItems.PBECasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.GumMetal,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Titaniolum,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.EngraverCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Zamak,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Duraluminium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.AssemblerCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Inconel690,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Nitinol,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.CentrifugeCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Inconel792,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.TiBetaC,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ElectrolyzerCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.HastelloyC276,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Zamak,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.WireFactoryCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Titaniolum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Inconel690,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.SupplyProductionCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.MaragingSteel250,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Inconel792,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.UtilityMachineCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Nitinol,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.HastelloyC276,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.BrewmenterCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Talonite,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Grisium,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ElectromagneticCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Nitinol,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Inconel690,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ArcCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Nitinol60,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Kovar,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.ExtradificationCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.TiBetaC,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Talonite,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MixingCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.Titaniolum,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.MaragingSteel250,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.MacerationCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.HastelloyC276,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Mangalloy,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )

        MachineRecipes.disassembler(
            input = ImpactItems.CuttingCasing.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.stick,
                    material = Materials.MaragingSteel300,
                    count = 2,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.plate,
                    material = Materials.Stellite,
                    count = 3,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.bolt,
                    material = Materials.HSSG,
                    count = 8,
                ),
            ),
            ticks = 1000,
            eu = 1920,
        )
    }
}
