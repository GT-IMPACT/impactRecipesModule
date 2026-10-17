package com.impactrecipes.recipes.impact

import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.util.CraftingRecipes.shapedWithFlags
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class ImpactHandProspectorCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.DISMANTLEABLE or
        GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS or
        GT_ModHandler.RecipeBits.BUFFERED

    internal fun register() {
        shapedWithFlags(
            output = ImpactItems.HandProspectorEV.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "EHR",
                "CSC",
                "PBP",
                'S',
                GregTechItems.CoverScreen.get(),
                'R',
                GregTechItems.SensorEV.get(),
                'H',
                GregTechItems.FieldGeneratorEV.get(),
                'E',
                GregTechItems.EmitterEV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'P',
                OrePrefixes.plate.get(Materials.BT6),
                'B',
                GregTechItems.BatteryHullEVFull.get(),
            ),
        )

        shapedWithFlags(
            output = ImpactItems.HandProspectorIV.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "EHR",
                "CSC",
                "PBP",
                'S',
                GregTechItems.CoverScreen.get(),
                'R',
                GregTechItems.SensorIV.get(),
                'H',
                GregTechItems.FieldGeneratorIV.get(),
                'E',
                GregTechItems.EmitterIV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Elite),
                'P',
                OrePrefixes.plate.get(Materials.HastelloyC276),
                'B',
                GregTechItems.BatteryHullIVFull.get(),
            ),
        )

        shapedWithFlags(
            output = ImpactItems.HandProspectorLuV.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "EHR",
                "CSC",
                "PBP",
                'S',
                GregTechItems.CoverScreen.get(),
                'R',
                GregTechItems.SensorLuV.get(),
                'H',
                GregTechItems.FieldGeneratorLuV.get(),
                'E',
                GregTechItems.EmitterLuV.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Master),
                'P',
                OrePrefixes.plate.get(Materials.HastelloyN),
                'B',
                GregTechItems.BatteryHullLuVFull.get(),
            ),
        )

        shapedWithFlags(
            output = ImpactItems.HandProspectorZPM.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "EHR",
                "CSC",
                "PBP",
                'S',
                GregTechItems.CoverScreen.get(),
                'R',
                GregTechItems.SensorZPM.get(),
                'H',
                GregTechItems.FieldGeneratorZPM.get(),
                'E',
                GregTechItems.EmitterZPM.get(),
                'C',
                OrePrefixes.circuit.get(Materials.Ultimate),
                'P',
                OrePrefixes.plate.get(Materials.Lafium),
                'B',
                GregTechItems.BatteryHullZPMFull.get(),
            ),
        )
    }
}
