package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes

internal class ImpactDiode16ACraftingRecipes {

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16AULV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.WroughtIron),
                'W',
                OrePrefixes.cableGt16.get(Materials.Lead),
                'S',
                OrePrefixes.spring.get(Materials.Lead),
                'C',
                GregTechItems.CasingULV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16ALV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Steel),
                'W',
                OrePrefixes.cableGt16.get(Materials.Tin),
                'S',
                OrePrefixes.spring.get(Materials.Tin),
                'C',
                GregTechItems.CasingLV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16AMV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Birmabright),
                'W',
                OrePrefixes.cableGt16.get(Materials.Copper),
                'S',
                OrePrefixes.spring.get(Materials.Copper),
                'C',
                GregTechItems.CasingMV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16AHV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'W',
                OrePrefixes.cableGt16.get(Materials.Electrum),
                'S',
                OrePrefixes.spring.get(Materials.Electrum),
                'C',
                GregTechItems.CasingHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16AEV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.BT6),
                'W',
                OrePrefixes.cableGt16.get(Materials.Aluminium),
                'S',
                OrePrefixes.spring.get(Materials.Aluminium),
                'C',
                GregTechItems.CasingEV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16AIV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.HastelloyC276),
                'W',
                OrePrefixes.cableGt16.get(Materials.TungstenSteel),
                'S',
                OrePrefixes.spring.get(Materials.TungstenSteel),
                'C',
                GregTechItems.CasingIV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16ALuV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.HastelloyN),
                'W',
                OrePrefixes.cableGt16.get(Materials.YttriumBariumCuprate),
                'S',
                OrePrefixes.spring.get(Materials.YttriumBariumCuprate),
                'C',
                GregTechItems.CasingLuV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16AZPM.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.Lafium),
                'W',
                OrePrefixes.cableGt16.get(Materials.Naquadah),
                'S',
                OrePrefixes.spring.get(Materials.Naquadah),
                'C',
                GregTechItems.CasingZPM.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = ImpactItems.Diode16AUV.get(),
            flags = 0,
            recipe = arrayOf<Any?>(
                "PSP",
                "WCW",
                'P',
                OrePrefixes.plate.get(Materials.CinobiteA243),
                'W',
                OrePrefixes.cableGt16.get(Materials.ElectrumFlux),
                'S',
                OrePrefixes.spring.get(Materials.ElectrumFlux),
                'C',
                GregTechItems.CasingUV.get(),
            ),
        )
    }
}
