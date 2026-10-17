package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactDiode4ACraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4AULV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.WroughtIron),
                'W',
                OrePrefixes.cableGt04.get(Materials.Lead),
                'S',
                OrePrefixes.springSmall.get(Materials.Lead),
                'C',
                GregTechItems.CasingULV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4ALV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'W',
                OrePrefixes.cableGt04.get(Materials.Tin),
                'S',
                OrePrefixes.springSmall.get(Materials.Tin),
                'C',
                GregTechItems.CasingLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4AMV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'W',
                OrePrefixes.cableGt04.get(Materials.Copper),
                'S',
                OrePrefixes.springSmall.get(Materials.Copper),
                'C',
                GregTechItems.CasingMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4AHV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'W',
                OrePrefixes.cableGt04.get(Materials.Electrum),
                'S',
                OrePrefixes.springSmall.get(Materials.Electrum),
                'C',
                GregTechItems.CasingHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4AEV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.BT6),
                'W',
                OrePrefixes.cableGt04.get(Materials.Aluminium),
                'S',
                OrePrefixes.springSmall.get(Materials.Aluminium),
                'C',
                GregTechItems.CasingEV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4AIV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.HastelloyC276),
                'W',
                OrePrefixes.cableGt04.get(Materials.TungstenSteel),
                'S',
                OrePrefixes.springSmall.get(Materials.TungstenSteel),
                'C',
                GregTechItems.CasingIV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4ALuV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.HastelloyN),
                'W',
                OrePrefixes.cableGt04.get(Materials.YttriumBariumCuprate),
                'S',
                OrePrefixes.springSmall.get(Materials.YttriumBariumCuprate),
                'C',
                GregTechItems.CasingLuV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4AZPM.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Lafium),
                'W',
                OrePrefixes.cableGt04.get(Materials.Naquadah),
                'S',
                OrePrefixes.springSmall.get(Materials.Naquadah),
                'C',
                GregTechItems.CasingZPM.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode4AUV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.CinobiteA243),
                'W',
                OrePrefixes.cableGt04.get(Materials.ElectrumFlux),
                'S',
                OrePrefixes.springSmall.get(Materials.ElectrumFlux),
                'C',
                GregTechItems.CasingUV.get(),
            ),
        )
    }
}
