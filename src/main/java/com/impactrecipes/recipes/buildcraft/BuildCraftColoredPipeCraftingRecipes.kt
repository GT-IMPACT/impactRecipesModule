package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.BuildCraftTransportItems
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BuildCraftColoredPipeCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        for (i in 0 until 16) {
            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemswood,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    " f ",
                    "SGS",
                    " s ",
                    'S',
                    OrePrefixes.stick.get(Materials.Wood),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    " f ",
                    "SGS",
                    " s ",
                    'S',
                    ImpactItems.CobblestoneRod.get(),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsstone,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    " f ",
                    "SGS",
                    " s ",
                    'S',
                    OrePrefixes.stick.get(Materials.Stone),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsquartz,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    " f ",
                    "SGS",
                    " s ",
                    'S',
                    OrePrefixes.stick.get(Materials.NetherQuartz),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    " f ",
                    "SGS",
                    " s ",
                    'S',
                    ImpactItems.SandstoneRod.get(),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsclay,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "CPG",
                    'C',
                    OrePrefixes.dust.get(Materials.Calcite),
                    'P',
                    ModItemVariant(
                        item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone,
                        meta = i + 1,
                    ).get(),
                    'G',
                    OrePrefixes.dust.get(Materials.Gypsum),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsclay,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "GPC",
                    'C',
                    OrePrefixes.dust.get(Materials.Calcite),
                    'P',
                    ModItemVariant(
                        item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone,
                        meta = i + 1,
                    ).get(),
                    'G',
                    OrePrefixes.dust.get(Materials.Gypsum),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsiron,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    " f ",
                    "SGS",
                    " s ",
                    'S',
                    OrePrefixes.stick.get(Materials.Iron),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsgold,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    " f ",
                    "SGS",
                    " s ",
                    'S',
                    OrePrefixes.stick.get(Materials.Gold),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsvoid,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "SGS",
                    "GOG",
                    "SGS",
                    'S',
                    OrePrefixes.stick.get(Materials.Obsidian),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    'O',
                    ExtraUtilitiesItems.TrashCan.get(),
                ),
            )

            CraftingRecipes.shapedWithFlags(
                output = ModItemVariant(
                    item = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsvoid,
                    meta = i + 1,
                ).get(),
                flags = craftingFlags,
                recipe = arrayOf<Any?>(
                    "SGS",
                    "GOG",
                    "SGS",
                    'S',
                    OrePrefixes.stick.get(Materials.Rubber),
                    'G',
                    ModItemVariant(
                        item = VanillaItems.StainedGlassPane,
                        meta = i,
                    ).get(),
                    'O',
                    ExtraUtilitiesItems.TrashCan.get(),
                ),
            )

            CraftingRecipes.shapelessWithFlags(
                output = BuildCraftTransportItems.ItemBuildcraftPipePipestructurecobblestone.get(),
                flags = craftingFlags,
                ingredients = arrayOf<Any?>(
                    ModItemVariant(
                        item = BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone,
                        meta = i + 1,
                    ).get(),
                    "cobblestone",
                ),
            )
        }
    }
}
