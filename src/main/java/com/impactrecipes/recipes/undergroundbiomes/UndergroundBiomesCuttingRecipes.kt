package com.impactrecipes.recipes.undergroundbiomes

import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.UndergroundBiomesItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values

internal class UndergroundBiomesCuttingRecipes {

    internal fun register() {
        for (i in 0 until 8) {
            MachineRecipes.cutter(
                input = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousStoneBrick,
                    meta = i,
                ).get(),
                output = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousStoneBrickHalfSlab,
                    meta = i,
                ).get(amount = 2),
                secondaryOutput = GT_Values.NI,
                ticks = 25,
                eu = 8,
            )

            MachineRecipes.cutter(
                input = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicStoneBrick,
                    meta = i,
                ).get(),
                output = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicStoneBrickHalfSlab,
                    meta = i,
                ).get(amount = 2),
                secondaryOutput = GT_Values.NI,
                ticks = 25,
                eu = 8,
            )

            MachineRecipes.cutter(
                input = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousStone,
                    meta = i,
                ).get(),
                output = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousStoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                secondaryOutput = GT_Values.NI,
                ticks = 25,
                eu = 8,
            )

            MachineRecipes.cutter(
                input = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicStone,
                    meta = i,
                ).get(),
                output = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicStoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                secondaryOutput = GT_Values.NI,
                ticks = 25,
                eu = 8,
            )

            MachineRecipes.cutter(
                input = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousCobblestone,
                    meta = i,
                ).get(),
                output = ModItemVariant(
                    item = UndergroundBiomesItems.IgneousCobblestoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                secondaryOutput = GT_Values.NI,
                ticks = 25,
                eu = 8,
            )

            MachineRecipes.cutter(
                input = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicCobblestone,
                    meta = i,
                ).get(),
                output = ModItemVariant(
                    item = UndergroundBiomesItems.MetamorphicCobblestoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                secondaryOutput = GT_Values.NI,
                ticks = 25,
                eu = 8,
            )

            MachineRecipes.cutter(
                input = ModItemVariant(
                    item = UndergroundBiomesItems.SedimentaryStone,
                    meta = i,
                ).get(),
                output = ModItemVariant(
                    item = UndergroundBiomesItems.SedimentaryStoneHalfSlab,
                    meta = i,
                ).get(amount = 2),
                secondaryOutput = GT_Values.NI,
                ticks = 25,
                eu = 8,
            )

            for (j in 0 until 8) {
                MachineRecipes.cutter(
                    input = ModItemVariant(
                        item = UndergroundBiomesItems.MetamorphicStoneHalfSlab,
                        meta = i,
                    ).get(),
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    secondaryOutput = GT_Values.NI,
                    ticks = 12,
                    eu = 8,
                )
            }

            for (j in 8 until 16) {
                MachineRecipes.cutter(
                    input = ModItemVariant(
                        item = UndergroundBiomesItems.MetamorphicCobblestoneHalfSlab,
                        meta = i,
                    ).get(),
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    secondaryOutput = GT_Values.NI,
                    ticks = 12,
                    eu = 8,
                )
            }

            for (j in 24 until 32) {
                MachineRecipes.cutter(
                    input = ModItemVariant(
                        item = UndergroundBiomesItems.IgneousStoneHalfSlab,
                        meta = i,
                    ).get(),
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    secondaryOutput = GT_Values.NI,
                    ticks = 12,
                    eu = 8,
                )
            }

            for (j in 32 until 40) {
                MachineRecipes.cutter(
                    input = ModItemVariant(
                        item = UndergroundBiomesItems.IgneousCobblestoneHalfSlab,
                        meta = i,
                    ).get(),
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    secondaryOutput = GT_Values.NI,
                    ticks = 12,
                    eu = 8,
                )
            }

            for (j in 48 until 56) {
                MachineRecipes.cutter(
                    input = ModItemVariant(
                        item = UndergroundBiomesItems.SedimentaryStoneHalfSlab,
                        meta = i,
                    ).get(),
                    output = ModItemVariant(
                        item = UndergroundBiomesItems.Button,
                        meta = j,
                    ).get(amount = 8),
                    secondaryOutput = GT_Values.NI,
                    ticks = 12,
                    eu = 8,
                )
            }
        }
    }
}
