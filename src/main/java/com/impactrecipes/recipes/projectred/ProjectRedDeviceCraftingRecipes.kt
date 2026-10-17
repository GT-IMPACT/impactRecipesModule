package com.impactrecipes.recipes.projectred

import com.impactrecipes.items.ForestryItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ProjectRedFabricationItems
import com.impactrecipes.items.ProjectRedItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ProjectRedDeviceCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ProjectRedFabricationItems.ProjectredIntegrationIcblock.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "WFW",
                "WWW",
                'P',
                OrePrefixes.plate.get(Materials.Iron),
                'W',
                OrePrefixes.plate.get(Materials.Wood),
                'F',
                ForestryItems.Factory22.get(),
                'C',
                GregTechItems.CoverCrafting.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ProjectRedFabricationItems.ProjectredIntegrationIcblock1.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "EME",
                "LAL",
                "PFP",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'L',
                "craftingLensRed",
                'F',
                ForestryItems.Factory22.get(),
                'M',
                GregTechItems.CoverScreen.get(),
                'E',
                GregTechItems.EmitterLV.get(),
                'A',
                GregTechItems.MachineLVAssembler.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ProjectRedItems.ProjectredCoreScrewdriver.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " fI",
                "BIh",
                "RB ",
                'I',
                OrePrefixes.stick.get(Materials.Iron),
                'R',
                OrePrefixes.stick.get(Materials.Rubber),
                'B',
                "dyeBlue",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ProjectRedItems.ProjectredCoreWiredebugger.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "WSW",
                "PGP",
                "RdR",
                'S',
                OrePrefixes.stick.get(Materials.SteelMagnetic),
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'P',
                OrePrefixes.itemCasing.get(Materials.Steel),
                'G',
                OrePrefixes.plate.get(Materials.Glowstone),
                'R',
                OrePrefixes.screw.get(Materials.Steel),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ProjectRedItems.ProjectredCorePart.get(),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                OrePrefixes.plate.get(Materials.Concrete),
            ),
        )
    }
}
