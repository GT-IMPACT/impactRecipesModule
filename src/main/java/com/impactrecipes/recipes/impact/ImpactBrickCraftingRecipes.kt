package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler
import net.minecraftforge.oredict.OreDictionary

internal class ImpactBrickCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.UnfiredClayBrick.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "CFC",
                "CCC",
                'C',
                VanillaItems.ClayBall.get(),
                'F',
                ModItemVariant(
                    item = ImpactItems.WoodBrickForm,
                    meta = GT_Values.W.toInt(),
                ).get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ImpactItems.UnfiredClayBrick.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                VanillaItems.ClayBall.get(),
                ModItemVariant(
                    item = ImpactItems.WoodBrickForm,
                    meta = GT_Values.W.toInt(),
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.UnfiredCokeOvenBrick.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "SFS",
                "SSS",
                'C',
                VanillaItems.ClayBall.get(),
                'S',
                VanillaItems.Sand.get(),
                'F',
                ModItemVariant(
                    item = ImpactItems.WoodBrickForm,
                    meta = GT_Values.W.toInt(),
                ).get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ImpactItems.UnfiredCokeOvenBrick.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                VanillaItems.ClayBall.get(),
                VanillaItems.Sand.get(),
                OrePrefixes.block.get(Materials.Sand),
                ModItemVariant(
                    item = ImpactItems.WoodBrickForm,
                    meta = GT_Values.W.toInt(),
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.SteelBars.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " h ",
                "SSS",
                "SSS",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.CasingFarm.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ThT",
                "TFT",
                "TwT",
                'T',
                ImpactItems.SteelBars.get(),
                'F',
                OrePrefixes.frameGt.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.DustSmallFertilizer.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " D",
                "  ",
                'D',
                IC2Items.Fertilizer.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.DustTinyFertilizer.get(amount = 9),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "D ",
                "  ",
                'D',
                IC2Items.Fertilizer.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Fertilizer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DD",
                "DD",
                'D',
                ImpactItems.DustSmallFertilizer.get(amount = 4),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = IC2Items.Fertilizer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DDD",
                "DDD",
                "DDD",
                'D',
                ImpactItems.DustTinyFertilizer.get(amount = 9),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.CompressedFireclay.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CCC",
                "TFT",
                "CCC",
                'C',
                OrePrefixes.dust.get(Materials.Clay),
                'T',
                ImpactItems.ConcreteDust.get(),
                'F',
                ModItemVariant(
                    item = ImpactItems.WoodBrickForm,
                    meta = OreDictionary.WILDCARD_VALUE,
                ).get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ImpactItems.ConcreteDust.get(amount = 4),
            flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
            ingredients = arrayOf<Any?>(
                OrePrefixes.dust.get(Materials.Stone),
                OrePrefixes.dust.get(Materials.Stone),
                OrePrefixes.dust.get(Materials.Gypsum),
                OrePrefixes.dust.get(Materials.Calcite),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ImpactItems.ConcreteDust.get(amount = 4),
            flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
            ingredients = arrayOf<Any?>(
                OrePrefixes.dust.get(Materials.Stone),
                OrePrefixes.dust.get(Materials.Stone),
                OrePrefixes.dust.get(Materials.Gypsum),
                OrePrefixes.dust.get(Materials.Marble),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = RecipeItems.ore(
                prefix = OrePrefixes.dust,
                material = Materials.Fireclay,
                count = 4,
            ),
            flags = GT_ModHandler.RecipeBits.NOT_REMOVABLE,
            ingredients = arrayOf<Any?>(
                OrePrefixes.dust.get(Materials.Clay),
                OrePrefixes.dust.get(Materials.Clay),
                OrePrefixes.dust.get(Materials.Clay),
                ImpactItems.ConcreteDust.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AdvancedCoolingCore.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "ICI",
                "PMP",
                'P',
                ImpactItems.NaquadahCompressedPlate.get(),
                'R',
                OrePrefixes.rotor.get(Materials.Iridium),
                'M',
                GregTechItems.ElectricMotorZPM.get(),
                'I',
                GregTechItems.NeutronReflector.get(),
                'C',
                GregTechItems.ReactorCoolantLe3.get(),
            ),
        )
    }
}
