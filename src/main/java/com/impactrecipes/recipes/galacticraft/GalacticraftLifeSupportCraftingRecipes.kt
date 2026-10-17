package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.BackpackItems
import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalacticraftLifeSupportCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemCanvas.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "LWS",
                "WSW",
                "SWL",
                'S',
                OrePrefixes.stick.get(Materials.Wood),
                'W',
                "blockWool",
                'L',
                BackpackItems.TannedLeather.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemOxygenGear.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PPP",
                "ECE",
                "PIP",
                'P',
                GalacticraftCoreItems.TileOxygenPipe.get(),
                'C',
                GalacticraftCoreItems.ItemOxygenConcentrator.get(),
                'E',
                GregTechItems.ElectricPumpHV.get(),
                'I',
                GregTechItems.ElectricPistonHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemSensorGlasses.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "CSC",
                "RBR",
                "LdL",
                'L',
                GalacticraftCoreItems.ItemSensorLens.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'S',
                OrePrefixes.screw.get(Materials.MeteoricIron),
                'R',
                OrePrefixes.ring.get(Materials.Desh),
                'B',
                OrePrefixes.bolt.get(Materials.Desh),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemAirVent.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "BPB",
                "PSP",
                "BPB",
                'P',
                GalacticraftCoreItems.ItemBasicItem7.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'B',
                ImpactItems.SteelBars.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemAirFan.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SdS",
                "RIR",
                "SwS",
                'S',
                OrePrefixes.screw.get(Materials.Steel),
                'R',
                OrePrefixes.rotor.get(Materials.Steel),
                'I',
                OrePrefixes.stickLong.get(Materials.StainlessSteel),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.ItemOxygenConcentrator.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SVS",
                "SFS",
                "CPC",
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
                'F',
                GalacticraftCoreItems.ItemAirFan.get(),
                'C',
                GalacticraftCoreItems.ItemCanister.get(),
                'P',
                GregTechItems.ElectricPumpHV.get(),
            ),
        )
    }
}
