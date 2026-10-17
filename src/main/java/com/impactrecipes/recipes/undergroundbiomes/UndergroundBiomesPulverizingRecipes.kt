package com.impactrecipes.recipes.undergroundbiomes

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.UndergroundBiomesItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class UndergroundBiomesPulverizingRecipes {

    internal fun register() {
        MachineRecipes.pulverizer(
            input = UndergroundBiomesItems.SedimentaryStone.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dustImpure,
                    material = Materials.Calcite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Quartzite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                100,
            ),
            ticks = 400,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = UndergroundBiomesItems.Chalk.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dustImpure,
                    material = Materials.Calcite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Siltstone,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                100,
            ),
            ticks = 400,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = UndergroundBiomesItems.Shale.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dustImpure,
                    material = Materials.Calcite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.VanadiumMagnetite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                100,
            ),
            ticks = 400,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = UndergroundBiomesItems.Siltstone.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Siltstone,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Clay,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                100,
            ),
            ticks = 400,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = UndergroundBiomesItems.Dolomite.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Dolomite,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Pyrolusite,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                100,
            ),
            ticks = 400,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = UndergroundBiomesItems.Greywacke.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.Greywacke,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.NetherQuartz,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                10000,
                100,
            ),
            ticks = 400,
            eu = 2,
        )

        MachineRecipes.pulverizer(
            input = UndergroundBiomesItems.Chert.get(),
            outputs = arrayOf(
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.SiliconDioxide,
                    count = 1,
                ),
                RecipeItems.ore(
                    prefix = OrePrefixes.dust,
                    material = Materials.DarkAsh,
                    count = 1,
                ),
            ),
            chances = intArrayOf(
                5000,
                100,
            ),
            ticks = 400,
            eu = 2,
        )

        for (i in 0 until 8) {
            MachineRecipes.pulverizer(
                input = ModItemVariant(
                    item = UndergroundBiomesItems.FossilPiece,
                    meta = i,
                ).get(),
                outputs = arrayOf(
                    VanillaItems.BoneMeal.get(amount = 4),
                ),
                chances = intArrayOf(
                    10000,
                ),
                ticks = 300,
                eu = 2,
            )
        }
    }
}
