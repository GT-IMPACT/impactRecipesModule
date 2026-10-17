package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class GalacticraftRecyclingRecipes {

    internal fun register() {
        MachineRecipes.arcFurnace(
            input = GalacticraftCoreItems.ItemSpaceship.get(),
            outputs = arrayOf(
                GregTechItems.IngotHeavy1.get(amount = 21),
                ImpactItems.RawSDHCAlloy.get(amount = 3),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Steel,
                    count = 12,
                ),
            ),
            chances = null,
            ticks = 1200,
            eu = 384,
        )

        MachineRecipes.arcFurnace(
            input = GalacticraftMarsItems.ItemSpaceshipTier2.get(),
            outputs = arrayOf(
                GregTechItems.IngotHeavy2.get(amount = 32),
                GregTechItems.IngotHeavy1.get(amount = 26),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Steel,
                    count = 18,
                ),
            ),
            chances = null,
            ticks = 1400,
            eu = 1536,
        )

        MachineRecipes.arcFurnace(
            input = GalacticraftMarsItems.ItemItemTier3Rocket.get(),
            outputs = arrayOf(
                GregTechItems.IngotHeavy3.get(amount = 25),
                GregTechItems.IngotHeavy2.get(amount = 36),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Titanium,
                    count = 12,
                ),
            ),
            chances = null,
            ticks = 1600,
            eu = 6144,
        )

        MachineRecipes.arcFurnace(
            input = ModItemVariant(
                item = GalacticraftCoreItems.ItemOxygenTankLightFull,
                meta = GT_Values.W.toInt(),
            ).get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Aluminium,
                    count = 21,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Steel,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 600,
            eu = 60,
        )

        MachineRecipes.arcFurnace(
            input = ModItemVariant(
                item = GalacticraftCoreItems.ItemOxygenTankMedFull,
                meta = GT_Values.W.toInt(),
            ).get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.MeteoricIron,
                    count = 21,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Aluminium,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 600,
            eu = 120,
        )

        MachineRecipes.arcFurnace(
            input = ModItemVariant(
                item = GalacticraftCoreItems.ItemOxygenTankHeavyFull,
                meta = GT_Values.W.toInt(),
            ).get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Desh,
                    count = 21,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.StainlessSteel,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 700,
            eu = 250,
        )

        MachineRecipes.arcFurnace(
            input = ModItemVariant(
                item = GalacticraftCoreItems.ItemOxygenTankt4,
                meta = GT_Values.W.toInt(),
            ).get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Naquadah,
                    count = 21,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Titanium,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 800,
            eu = 480,
        )

        MachineRecipes.arcFurnace(
            input = ModItemVariant(
                item = GalacticraftCoreItems.ItemOxygenTankt5,
                meta = GT_Values.W.toInt(),
            ).get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.Trinium,
                    count = 21,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.ingot,
                    material = Materials.TungstenSteel,
                    count = 9,
                ),
            ),
            chances = null,
            ticks = 900,
            eu = 1024,
        )
    }
}
