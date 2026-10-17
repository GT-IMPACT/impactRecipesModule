package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.enums.ToolDictNames
import gregtech.api.util.GT_ModHandler

internal class ImpactProspectingAndAerostatCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.OreAndOilProspector.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "CHC",
                "SOS",
                'H',
                GregTechItems.HullLV.get(),
                'S',
                GregTechItems.SensorLV.get(),
                'P',
                "plateDoubleSteel",
                'C',
                "circuitBasic",
                'O',
                "cableGt02Tin",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.OreAndOilProspectorMeta14752.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "CHC",
                "SOS",
                'H',
                GregTechItems.HullMV.get(),
                'S',
                GregTechItems.SensorMV.get(),
                'P',
                "plateDoubleBlackSteel",
                'C',
                "circuitGood",
                'O',
                "cableGt02Copper",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.OreAndOilProspectorMeta14753.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "CHC",
                "SOS",
                'H',
                GregTechItems.HullHV.get(),
                'S',
                GregTechItems.SensorHV.get(),
                'P',
                "plateTripleStainlessSteel",
                'C',
                "circuitAdvanced",
                'O',
                "cableGt04Gold",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.OreAndOilProspectorMeta14754.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "CHC",
                "SOS",
                'H',
                GregTechItems.HullEV.get(),
                'S',
                GregTechItems.SensorEV.get(),
                'P',
                "plateQuadrupleVanadiumSteel",
                'C',
                "circuitData",
                'O',
                "cableGt04Aluminium",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.OreAndOilProspectorMeta14755.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "CHC",
                "SOS",
                'H',
                GregTechItems.HullIV.get(),
                'S',
                GregTechItems.SensorIV.get(),
                'P',
                "plateQuintupleTungstenSteel",
                'C',
                "circuitElite",
                'O',
                "cableGt08Platinum",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.OreSamplingTool.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "F  ",
                " B ",
                "  S",
                'F',
                "itemFlint",
                'B',
                "boltIron",
                'S',
                "stickLongWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.MaskLLASERTECHNOLOGY.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                " D ",
                "PGP",
                "PSP",
                'D',
                "dyeLightBlue",
                'P',
                "plateRubber",
                'S',
                ImpactItems.SteelBars.get(),
                'G',
                IC2Items.ReinforcedGlass.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.Aerostat.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "GGG",
                "GAG",
                "SBS",
                'S',
                "wireFineSteel",
                'A',
                ToolDictNames.craftingToolWireCutter,
                'B',
                VanillaItems.Boat.get(),
                'G',
                GalacticraftCoreItems.ItemCanvas.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.AerostatePlatformCasing.get(amount = 4),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "PBP",
                "PsP",
                'S',
                "slabWood",
                'B',
                "frameGtWood",
                'P',
                "plankWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GregTechItems.AerostatePlatform.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "sSP",
                "RFR",
                "WWW",
                'S',
                "slabWood",
                'P',
                "pipeSmallSteel",
                'F',
                "frameGtWood",
                'R',
                "plateRubber",
                'W',
                "plankWood",
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.MachineDataReader.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BdB",
                "GES",
                "PwP",
                'B',
                OrePrefixes.screw.get(Materials.Iridium),
                'P',
                OrePrefixes.plate.get(Materials.Iridium),
                'G',
                GregTechItems.CoverScreen.get(),
                'S',
                OrePrefixes.circuit.get(Materials.Elite),
                'E',
                GregTechItems.HullIV.get(),
            ),
        )

        CraftingRecipes.shapelessWithFlags(
            output = ImpactItems.MudBall.get(amount = 2),
            flags = craftingFlags,
            ingredients = arrayOf<Any?>(
                VanillaItems.Dirt.get(),
                VanillaItems.WaterBucket.get(),
            ),
        )
    }
}
