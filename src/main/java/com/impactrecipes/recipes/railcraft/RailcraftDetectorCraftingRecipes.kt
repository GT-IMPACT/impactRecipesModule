package com.impactrecipes.recipes.railcraft

import com.impactrecipes.items.AE2FCItems
import com.impactrecipes.items.MalisisDoorsItems
import com.impactrecipes.items.ProjectRedIntegrationItems
import com.impactrecipes.items.RailcraftItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class RailcraftDetectorCraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorItem.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                OrePrefixes.log.get(Materials.Wood),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                VanillaItems.Rail.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorAny.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "stone",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorEmpty.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "L L",
                "PIP",
                "LPL",
                'L',
                "stoneBricks",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorPowered.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "stoneCobble",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                ProjectRedIntegrationItems.ProjectredIntegrationGate26.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorPlayer.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "slabStoneBrick",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                MalisisDoorsItems.PlayerSensor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorExplosive.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "slabWood",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                VanillaItems.Tnt.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorAnimal.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "logWood",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                VanillaItems.Leather.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorTank.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                VanillaItems.BrickBlock.get(),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                AE2FCItems.CertusQuartzTank.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorAdvanced.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "logWood",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                RailcraftItems.DetectorAny.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorEnergy.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                OrePrefixes.plate.get(Materials.Tin),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                OrePrefixes.cableGt01.get(Materials.Tin),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorAge.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "logWood",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                "cropWheat",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorTrain.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                VanillaItems.BrickBlock.get(),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorSheep.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "blockWool",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                VanillaItems.Shears.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorVillager.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                VanillaItems.Leather.get(),
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                OrePrefixes.plate.get(Materials.Emerald),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorLocomotive.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "stoneBricks",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                VanillaItems.Minecart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = RailcraftItems.DetectorRouting.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "LTL",
                "PIP",
                "LPL",
                'L',
                "marble",
                'P',
                OrePrefixes.plate.get(Materials.RedAlloy),
                'I',
                VanillaItems.HeavyWeightedPressurePlate.get(),
                'T',
                RailcraftItems.SignalSwitchLever.get(),
            ),
        )
    }
}
