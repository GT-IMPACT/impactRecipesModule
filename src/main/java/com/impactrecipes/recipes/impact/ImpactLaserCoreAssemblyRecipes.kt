package com.impactrecipes.recipes.impact

import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.GregTech_API
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactLaserCoreAssemblyRecipes {

    internal fun register() {
        val laserCore1 = arrayOf(
            RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.Diamond,
                count = 1,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.TungstenSteel,
                count = 1,
            ),
            GregTech_API.getStackofAmountFromOreDict(
                "plateYSZ",
                4,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.Silver,
                count = 16,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.bolt,
                material = Materials.HastelloyC276,
                count = 16,
            ),
        )

        MachineRecipes.assembler(
            inputs = laserCore1,
            fluid = null,
            output = ImpactItems.LaserCore1.get(),
            ticks = 20 * 20,
            eu = 7680,
        )

        val laserCore2 = arrayOf(
            RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.Ruby,
                count = 1,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.Osmiridium,
                count = 1,
            ),
            GregTech_API.getStackofAmountFromOreDict(
                "plateGDC",
                4,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.Trinium,
                count = 16,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.bolt,
                material = Materials.Lafium,
                count = 16,
            ),
        )

        MachineRecipes.assembler(
            inputs = laserCore2,
            fluid = null,
            output = ImpactItems.LaserCore2.get(),
            ticks = 20 * 30,
            eu = 122800,
        )

        val laserCore3 = arrayOf(
            RecipeItems.ore(
                prefix = OrePrefixes.gemExquisite,
                material = Materials.MysteriousCrystal,
                count = 1,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.frameGt,
                material = Materials.NaquadahAlloy,
                count = 1,
            ),
            GregTech_API.getStackofAmountFromOreDict(
                "plateLSCF",
                4,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.foil,
                material = Materials.Adamantium,
                count = 16,
            ),
            RecipeItems.ore(
                prefix = OrePrefixes.bolt,
                material = Materials.Quantum,
                count = 16,
            ),
        )

        MachineRecipes.assembler(
            inputs = laserCore3,
            fluid = null,
            output = ImpactItems.LaserCore3.get(),
            ticks = 20 * 40,
            eu = 2000000,
        )
    }
}
