package com.impactrecipes.recipes.buildcraft

import com.impactrecipes.items.BuildCraftTransportItems
import com.impactrecipes.items.ExtraUtilitiesItems
import com.impactrecipes.items.ForgeMicroblockItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class BuildCraftPipeCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemswood.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " f ",
                "SGS",
                " s ",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " f ",
                "SGS",
                " s ",
                'S',
                ImpactItems.CobblestoneRod.get(),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsstone.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " f ",
                "SGS",
                " s ",
                'S',
                ForgeMicroblockItems.StoneRod.get(),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsquartz.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " f ",
                "SGS",
                " s ",
                'S',
                OrePrefixes.stick.get(Materials.NetherQuartz),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " f ",
                "SGS",
                " s ",
                'S',
                ImpactItems.SandstoneRod.get(),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsiron.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " f ",
                "SGS",
                " s ",
                'S',
                OrePrefixes.stick.get(Materials.Iron),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsgold.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " f ",
                "SGS",
                " s ",
                'S',
                OrePrefixes.stick.get(Materials.Gold),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsclay.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CPG",
                'C',
                OrePrefixes.dust.get(Materials.Calcite),
                'P',
                BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone.get(),
                'G',
                OrePrefixes.dust.get(Materials.Gypsum),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsclay.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GPC",
                'C',
                OrePrefixes.dust.get(Materials.Calcite),
                'P',
                BuildCraftTransportItems.ItemBuildcraftPipePipeitemssandstone.get(),
                'G',
                OrePrefixes.dust.get(Materials.Gypsum),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipeitemsvoid.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SGS",
                "GOG",
                "SGS",
                'S',
                OrePrefixes.stick.get(Materials.Obsidian),
                'G',
                VanillaItems.GlassPane.get(),
                'O',
                ExtraUtilitiesItems.TrashCan.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipefluidsvoid.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SGS",
                "GOG",
                "SGS",
                'S',
                OrePrefixes.stick.get(Materials.Rubber),
                'G',
                VanillaItems.GlassPane.get(),
                'O',
                ExtraUtilitiesItems.TrashCan.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = BuildCraftTransportItems.ItemBuildcraftPipePipestructurecobblestone.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                BuildCraftTransportItems.ItemBuildcraftPipePipeitemscobblestone.get(),
                "cobblestone",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = BuildCraftTransportItems.PipePlug.get(amount = 4),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "TB",
                'T',
                "craftingToolSaw",
                'B',
                BuildCraftTransportItems.ItemBuildcraftPipePipestructurecobblestone.get(),
            ),
        )
    }
}
