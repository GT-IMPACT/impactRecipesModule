package com.impactrecipes.recipes.gendustry

import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GendustryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ProjectRedIlluminationItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GendustryApiaryUpgradeRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade17.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'P',
                GendustryItems.EnvProcessor.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Grass.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade11.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HSH",
                "SUS",
                "GSG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'S',
                ExtraUtilitiesItems.DecorativeBlock27.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HRH",
                "YUY",
                "GRG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'R',
                VanillaItems.RedFlower.get(),
                'Y',
                VanillaItems.YellowFlower.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade20.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'P',
                GendustryItems.EnvProcessor.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Ice.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade5.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GOG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Sand.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GOG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Cactus.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade13.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'P',
                GendustryItems.EnvProcessor.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Netherrack.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade16.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'P',
                GendustryItems.EnvProcessor.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Sandstone.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade18.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'P',
                GendustryItems.EnvProcessor.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Vine.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade21.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'P',
                GendustryItems.EnvProcessor.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.WaterBucket.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade7.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GOG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                GendustryItems.ClimateModule.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Snowball.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade14.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HCH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'C',
                OrePrefixes.gearGt.get(Materials.BT6),
                'P',
                GregTechItems.ElectricPistonEV.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.RedstoneTorch.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade22.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                ImpactItems.SteelBars.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                OrePrefixes.rotor.get(Materials.Titanium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                VanillaItems.FlowerPot.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Clock.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade10.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                OrePrefixes.plate.get(Materials.Rubber),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                "itemBeeswax",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade19.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                GendustryItems.GeneticsProcessor.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                OrePrefixes.plate.get(Materials.RedAlloy),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade3.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                OrePrefixes.plate.get(Materials.Diamond),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade12.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GOG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                ProjectRedIlluminationItems.ProjectredIlluminationLamp27.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                "paneGlass",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade6.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GOG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                GendustryItems.ClimateModule.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                VanillaItems.Netherrack.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade15.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                ForestryItems.CraftingMaterial3.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                ImpactItems.SteelBars.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GendustryItems.ApiaryUpgrade.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HPH",
                "OUO",
                "GPG",
                'H',
                OrePrefixes.gearGtSmall.get(Materials.HastelloyC276),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.Osmium),
                'P',
                VanillaItems.Sugar.get(),
                'U',
                GendustryItems.UpgradeFrame.get(),
                'O',
                ForestryItems.RoyalJelly.get(),
            ),
        )
    }
}
