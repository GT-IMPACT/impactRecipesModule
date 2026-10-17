package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactDiode2ACraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2AULV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.WroughtIron),
                'W',
                OrePrefixes.cableGt02.get(Materials.Lead),
                'S',
                OrePrefixes.wireFine.get(Materials.Lead),
                'C',
                GregTechItems.CasingULV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2ALV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'W',
                OrePrefixes.cableGt02.get(Materials.Tin),
                'S',
                OrePrefixes.wireFine.get(Materials.Tin),
                'C',
                GregTechItems.CasingLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2AMV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'W',
                OrePrefixes.cableGt02.get(Materials.Copper),
                'S',
                OrePrefixes.wireFine.get(Materials.Copper),
                'C',
                GregTechItems.CasingMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2AHV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'W',
                OrePrefixes.cableGt02.get(Materials.Electrum),
                'S',
                OrePrefixes.wireFine.get(Materials.Electrum),
                'C',
                GregTechItems.CasingHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2AEV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.BT6),
                'W',
                OrePrefixes.cableGt02.get(Materials.Aluminium),
                'S',
                OrePrefixes.wireFine.get(Materials.Aluminium),
                'C',
                GregTechItems.CasingEV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2AIV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.HastelloyC276),
                'W',
                OrePrefixes.cableGt02.get(Materials.TungstenSteel),
                'S',
                OrePrefixes.wireFine.get(Materials.TungstenSteel),
                'C',
                GregTechItems.CasingIV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2ALuV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.HastelloyN),
                'W',
                OrePrefixes.cableGt02.get(Materials.YttriumBariumCuprate),
                'S',
                OrePrefixes.wireFine.get(Materials.YttriumBariumCuprate),
                'C',
                GregTechItems.CasingLuV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2AZPM.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Lafium),
                'W',
                OrePrefixes.cableGt02.get(Materials.Naquadah),
                'S',
                OrePrefixes.wireFine.get(Materials.Naquadah),
                'C',
                GregTechItems.CasingZPM.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode2AUV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.CinobiteA243),
                'W',
                OrePrefixes.cableGt02.get(Materials.ElectrumFlux),
                'S',
                OrePrefixes.wireFine.get(Materials.ElectrumFlux),
                'C',
                GregTechItems.CasingUV.get(),
            ),
        )
    }
}
