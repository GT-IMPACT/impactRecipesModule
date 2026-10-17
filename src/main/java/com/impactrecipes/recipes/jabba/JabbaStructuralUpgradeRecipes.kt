package com.impactrecipes.recipes.jabba

import com.impactrecipes.items.JabbaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class JabbaStructuralUpgradeRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'P',
                OrePrefixes.plate.get(Materials.Wood),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Bronze),
                'P',
                OrePrefixes.plate.get(Materials.Bronze),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk3.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.WroughtIron),
                'P',
                OrePrefixes.plate.get(Materials.WroughtIron),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Cobalt),
                'P',
                OrePrefixes.plate.get(Materials.Cobalt),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk5.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk6.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Obsidian),
                'P',
                OrePrefixes.plate.get(Materials.Obsidian),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk7.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Diamond),
                'P',
                OrePrefixes.plate.get(Materials.Diamond),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk8.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Aluminium),
                'P',
                OrePrefixes.plate.get(Materials.Aluminium),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk9.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Titanium),
                'P',
                OrePrefixes.plate.get(Materials.Titanium),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk10.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.TungstenSteel),
                'P',
                OrePrefixes.plate.get(Materials.TungstenSteel),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = JabbaItems.StructuralUpgradeMk11.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "PDP",
                "SPS",
                'S',
                OrePrefixes.stick.get(Materials.Iridium),
                'P',
                OrePrefixes.plate.get(Materials.Iridium),
                'D',
                JabbaItems.Barrel.get(),
            ),
        )
    }
}
