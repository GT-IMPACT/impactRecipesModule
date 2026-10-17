package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.MachineRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials

internal class ImpactWoodFarmRecipes {

    internal fun register() {
        MachineRecipes.farm(
            input = ImpactItems.OakScheme.get(amount = 0),
            secondaryInput = IC2Items.Fertilizer.get(),
            input3 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            outputs = arrayOf(
                VanillaItems.OakWood.get(amount = 40),
                VanillaItems.OakWood.get(amount = 10),
                VanillaItems.OakSapling.get(amount = 8),
                VanillaItems.OakSapling.get(amount = 4),
                VanillaItems.Apple.get(amount = 3),
                VanillaItems.OakLeaves.get(amount = 40),
            ),
            chances = intArrayOf(
                10000,
                7000,
                10000,
                7500,
                10000,
                10000,
            ),
            ticks = 300,
            eu = 120,
        )

        MachineRecipes.farm(
            input = ImpactItems.SpruceScheme.get(amount = 0),
            secondaryInput = IC2Items.Fertilizer.get(),
            input3 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            outputs = arrayOf(
                VanillaItems.SpruceWood.get(amount = 60),
                VanillaItems.SpruceWood.get(amount = 20),
                VanillaItems.SpruceSapling.get(amount = 10),
                VanillaItems.SpruceSapling.get(amount = 4),
                VanillaItems.Mushroom.get(),
                VanillaItems.SpruceLeaves.get(amount = 50),
            ),
            chances = intArrayOf(
                10000,
                8000,
                10000,
                3000,
                750,
                10000,
            ),
            ticks = 480,
            eu = 120,
        )

        MachineRecipes.farm(
            input = ImpactItems.BirchScheme.get(amount = 0),
            secondaryInput = IC2Items.Fertilizer.get(),
            input3 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            outputs = arrayOf(
                VanillaItems.BirchWood.get(amount = 30),
                VanillaItems.BirchWood.get(amount = 8),
                VanillaItems.BirchSapling.get(amount = 6),
                VanillaItems.BirchSapling.get(amount = 4),
                VanillaItems.Sugar.get(amount = 2),
                VanillaItems.BirchLeaves.get(amount = 48),
            ),
            chances = intArrayOf(
                10000,
                7000,
                10000,
                6000,
                500,
                10000,
            ),
            ticks = 240,
            eu = 120,
        )

        MachineRecipes.farm(
            input = ImpactItems.JungleScheme.get(amount = 0),
            secondaryInput = IC2Items.Fertilizer.get(),
            input3 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            outputs = arrayOf(
                VanillaItems.JungleWood.get(amount = 50),
                VanillaItems.JungleWood.get(amount = 10),
                VanillaItems.JungleSapling.get(amount = 10),
                VanillaItems.CocoaBeans.get(amount = 6),
                VanillaItems.Vine.get(amount = 10),
                VanillaItems.JungleLeaves.get(amount = 30),
            ),
            chances = intArrayOf(
                10000,
                6000,
                10000,
                2000,
                10000,
                10000,
            ),
            ticks = 360,
            eu = 120,
        )

        MachineRecipes.farm(
            input = ImpactItems.AcaciaScheme.get(amount = 0),
            secondaryInput = IC2Items.Fertilizer.get(),
            input3 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            outputs = arrayOf(
                VanillaItems.AcaciaWood.get(amount = 30),
                VanillaItems.AcaciaWood.get(amount = 10),
                VanillaItems.AcaciaSapling.get(amount = 6),
                VanillaItems.AcaciaSapling.get(amount = 4),
                VanillaItems.DeadBush.get(amount = 2),
                VanillaItems.AcaciaLeaves.get(amount = 40),
            ),
            chances = intArrayOf(
                10000,
                6000,
                10000,
                4000,
                4000,
                10000,
            ),
            ticks = 420,
            eu = 120,
        )

        MachineRecipes.farm(
            input = ImpactItems.DarkOakScheme.get(amount = 0),
            secondaryInput = IC2Items.Fertilizer.get(),
            input3 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            outputs = arrayOf(
                VanillaItems.DarkOakWood.get(amount = 40),
                VanillaItems.DarkOakWood.get(amount = 12),
                VanillaItems.DarkOakSapling.get(amount = 8),
                VanillaItems.DarkOakSapling.get(amount = 4),
                VanillaItems.Apple.get(amount = 3),
                VanillaItems.DarkOakLeaves.get(amount = 50),
            ),
            chances = intArrayOf(
                10000,
                7000,
                10000,
                6000,
                10000,
                10000,
            ),
            ticks = 360,
            eu = 120,
        )

        MachineRecipes.farm(
            input = ImpactItems.RubberScheme.get(amount = 0),
            secondaryInput = IC2Items.Fertilizer.get(),
            input3 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            outputs = arrayOf(
                IC2Items.RubberWood.get(amount = 20),
                IC2Items.RubberWood.get(amount = 5),
                IC2Items.RubberSapling.get(amount = 6),
                IC2Items.RubberSapling.get(amount = 4),
                IC2Items.Resin.get(amount = 3),
                IC2Items.RubberLeaves.get(amount = 40),
            ),
            chances = intArrayOf(
                10000,
                5000,
                10000,
                5000,
                10000,
                10000,
            ),
            ticks = 510,
            eu = 120,
        )

        MachineRecipes.farm(
            input = ImpactItems.BarnardaCScheme.get(amount = 0),
            secondaryInput = IC2Items.Fertilizer.get(),
            input3 = null,
            fluidInput = Materials.Water.getFluid(1000),
            fluidOutput = GT_Values.NF,
            outputs = arrayOf(
                GalaxySpaceItems.Barnardaclog.get(amount = 50),
                GalaxySpaceItems.Barnardaclog.get(amount = 5),
                VanillaItems.JungleSapling.get(amount = 5),
                GalaxySpaceItems.Barnardacdandelions1.get(amount = 5),
                GalaxySpaceItems.Barnardacleaves.get(amount = 30),
            ),
            chances = intArrayOf(
                10000,
                4000,
                10000,
                10000,
                10000,
            ),
            ticks = 400,
            eu = 120,
        )
    }
}
