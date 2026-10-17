package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.items.WirelessRedstoneAddonsItems
import com.impactrecipes.items.WirelessRedstoneCoreItems
import com.impactrecipes.items.WirelessRedstoneLogicItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ProjectRedWirelessCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = WirelessRedstoneCoreItems.StoneBowl.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "P P",
                "PhP",
                "PPP",
                'P',
                "stone",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = WirelessRedstoneAddonsItems.Remote.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTf",
                "CMC",
                "PSP",
                'P',
                OrePrefixes.itemCasing.get(Materials.Birmabright),
                'S',
                OrePrefixes.screw.get(Materials.Birmabright),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'T',
                WirelessRedstoneCoreItems.WirelessTransceiver.get(),
                'M',
                GregTechItems.CoverScreen.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = WirelessRedstoneAddonsItems.Sniffer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DTD",
                "PSP",
                "RRR",
                'P',
                OrePrefixes.itemCasing.get(Materials.Birmabright),
                'S',
                OrePrefixes.stick.get(Materials.Birmabright),
                'D',
                WirelessRedstoneCoreItems.RecieverDish.get(),
                'T',
                WirelessRedstoneCoreItems.WirelessTransceiver.get(),
                'R',
                ProjectRedItems.ProjectredCorePart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = WirelessRedstoneAddonsItems.Psniffer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "DTD",
                "PSP",
                "RRR",
                'P',
                OrePrefixes.itemCasing.get(Materials.Birmabright),
                'S',
                OrePrefixes.stick.get(Materials.Birmabright),
                'D',
                WirelessRedstoneCoreItems.BlazeRecieverDish.get(),
                'T',
                WirelessRedstoneCoreItems.BlazeTransceiver.get(),
                'R',
                ProjectRedItems.ProjectredCorePart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = WirelessRedstoneLogicItems.WirelessLogic.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTS",
                "WWI",
                "RRR",
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'I',
                OrePrefixes.stick.get(Materials.Birmabright),
                'T',
                WirelessRedstoneCoreItems.WirelessTransceiver.get(),
                'R',
                ProjectRedItems.ProjectredCorePart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = WirelessRedstoneLogicItems.WirelessLogic1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTS",
                "WWI",
                "RRR",
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'I',
                OrePrefixes.stick.get(Materials.Birmabright),
                'T',
                WirelessRedstoneCoreItems.RecieverDish.get(),
                'R',
                ProjectRedItems.ProjectredCorePart.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = WirelessRedstoneLogicItems.WirelessLogic2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "dTS",
                "WWI",
                "RRR",
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'I',
                OrePrefixes.stick.get(Materials.Birmabright),
                'T',
                WirelessRedstoneCoreItems.BlazeTransceiver.get(),
                'R',
                ProjectRedItems.ProjectredCorePart.get(),
            ),
        )
    }
}
