package com.impactrecipes.recipes.vanilla

import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class VanillaMechanismCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.RedstoneLamp.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GGG",
                "GBG",
                "GRG",
                'R',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'B',
                VanillaItems.Glowstone.get(),
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.TripwireHook.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "RSR",
                "ISI",
                " I ",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'I',
                VanillaItems.String.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.Anvil.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BBB",
                "SBS",
                "PBP",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'B',
                OrePrefixes.block.get(Materials.Iron),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.DaylightDetector.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GGG",
                "QQQ",
                "SRS",
                'R',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'Q',
                OrePrefixes.plate.get(Materials.NetherQuartz),
                'S',
                "slabWood",
                'G',
                VanillaItems.GlassPane.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.WoodenDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Iron),
                'R',
                OrePrefixes.ring.get(Materials.Iron),
                'P',
                VanillaItems.Planks.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.WoodenDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Copper),
                'R',
                OrePrefixes.ring.get(Materials.Copper),
                'P',
                VanillaItems.Planks.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = VanillaItems.IronDoor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPP",
                "RPP",
                "dPP",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                OrePrefixes.ring.get(Materials.Steel),
                'P',
                OrePrefixes.plate.get(Materials.Iron),
            ),
        )
    }
}
