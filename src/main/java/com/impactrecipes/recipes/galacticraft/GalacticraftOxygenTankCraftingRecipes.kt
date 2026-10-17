package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GalacticraftMarsItems
import com.impactrecipes.items.GalaxySpaceItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalacticraftOxygenTankCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileArclamp.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PRP",
                "CEL",
                "PRP",
                'P',
                OrePrefixes.plate.get(Materials.BlackSteel),
                'R',
                OrePrefixes.ring.get(Materials.BlackSteel),
                'C',
                OrePrefixes.circuit.get(Materials.Good),
                'L',
                OrePrefixes.lens.get(Materials.Glass),
                'E',
                GregTechItems.EmitterMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemOxygenTankLightFull1800.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PCP",
                "PPP",
                'P',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'C',
                GregTechItems.LargeFluidCellSteel.get(),
                'T',
                GalacticraftCoreItems.TileOxygenPipe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemOxygenTankMedFull3600.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PCP",
                "PPP",
                'P',
                GalacticraftCoreItems.ItemMeteoricIronIngot1.get(),
                'C',
                GregTechItems.LargeFluidCellAluminium.get(),
                'T',
                GalacticraftCoreItems.TileOxygenPipe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemOxygenTankHeavyFull5400.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PCP",
                "PPP",
                'P',
                GalacticraftMarsItems.ItemNull5.get(),
                'C',
                GregTechItems.LargeFluidCellStainlessSteel.get(),
                'T',
                GalacticraftCoreItems.TileOxygenPipe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemOxygenTankt47200.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PCP",
                "PPP",
                'P',
                ImpactItems.NaquadahCompressedPlate.get(),
                'C',
                GregTechItems.LargeFluidCellTitanium.get(),
                'T',
                GalacticraftCoreItems.TileOxygenPipe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemOxygenTankt59000.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PTP",
                "PCP",
                "PPP",
                'P',
                OrePrefixes.plateTriple.get(Materials.Trinium),
                'C',
                GregTechItems.LargeFluidCellTungstenSteel.get(),
                'T',
                GalacticraftCoreItems.TileOxygenPipe.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemRocketFins.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "HPH",
                "HCH",
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'P',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'H',
                GalacticraftCoreItems.ItemHeavyPlating.get(),
                'C',
                GalaxySpaceItems.ItemCompressedPlates4.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftMarsItems.ItemItemBasicAsteroids2.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SPS",
                "HPH",
                "HPH",
                'S',
                OrePrefixes.screw.get(Materials.TungstenSteel),
                'P',
                GalacticraftMarsItems.ItemNull3.get(),
                'H',
                GalacticraftMarsItems.ItemItemBasicAsteroids.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileLandingPad.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "III",
                "PPP",
                "BBB",
                'B',
                OrePrefixes.frameGt.get(Materials.StainlessSteel),
                'P',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'I',
                IC2Items.AdvancedAlloy.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileLandingPad1.get(amount = 3),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "III",
                "PPP",
                "BBB",
                'B',
                OrePrefixes.block.get(Materials.Steel),
                'P',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'I',
                IC2Items.AdvancedAlloy.get(),
            ),
        )
    }
}
