package com.impactrecipes.recipes.logisticspipes

import com.impactrecipes.items.EnderIOItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.LogisticsPipesItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import com.impactrecipes.util.RecipeItems
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class LogisticsControlCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemPipeItemsBasicTransport.get(amount = 8),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SfS",
                "SGS",
                "SsS",
                'S',
                OrePrefixes.stick.get(Materials.Birmabright),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemPipeBlockRequestTable.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IMI",
                "RCR",
                "IOI",
                'I',
                OrePrefixes.circuit.get(Materials.Good),
                'M',
                EnderIOItems.BlockInventoryPanel.get(),
                'R',
                GregTechItems.RobotArmMV.get(),
                'O',
                GregTechItems.ConveyorModuleMV.get(),
                'C',
                LogisticsPipesItems.LogisticsSolidBlock3.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemLogisticsHUDGlasses.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ISI",
                "RTR",
                "GdG",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'R',
                OrePrefixes.ring.get(Materials.Aluminium),
                'I',
                LogisticsPipesItems.ItemLogisticsParts.get(),
                'T',
                LogisticsPipesItems.ItemLogisticsParts2.get(),
                'G',
                LogisticsPipesItems.ItemLogisticsParts1.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemLogisticsParts1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SRS",
                "dLh",
                'S',
                OrePrefixes.screw.get(Materials.Aluminium),
                'R',
                OrePrefixes.ring.get(Materials.Aluminium),
                'L',
                RecipeItems.ore(
                    prefix = OrePrefixes.lens,
                    material = Materials.ReinforcedGlass,
                    count = 1,
                ),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemLogisticsParts.get(amount = 2),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSB",
                "  f",
                'S',
                OrePrefixes.stick.get(Materials.Aluminium),
                'B',
                OrePrefixes.bolt.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemLogisticsParts2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " P ",
                "BhB",
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'B',
                OrePrefixes.bolt.get(Materials.Aluminium),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemPipeController.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "  S",
                "CMC",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'C',
                OrePrefixes.circuit.get(Materials.Basic),
                'W',
                OrePrefixes.cableGt01.get(Materials.Tin),
                'S',
                GregTechItems.SensorLV.get(),
                'M',
                GregTechItems.CoverScreen.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = LogisticsPipesItems.ItemRemoteOrdererItem.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "  S",
                "CMC",
                "PWP",
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'W',
                OrePrefixes.cableGt01.get(Materials.Copper),
                'S',
                GregTechItems.SensorMV.get(),
                'M',
                EnderIOItems.BlockInventoryPanel.get(),
            ),
        )
    }
}
