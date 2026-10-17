package com.impactrecipes.recipes.gravisuite

import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GraviSuiteArmorRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.AdvNanoChestPlate27.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "AJA",
                "ANA",
                "WCW",
                'A',
                "plateAlloyAdvanced",
                'W',
                OrePrefixes.wireGt04.get(Materials.Platinum),
                'C',
                OrePrefixes.circuit.get(Materials.Elite),
                'J',
                ModItemVariant(
                    item = GraviSuiteItems.AdvJetpack,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'N',
                ModItemVariant(
                    item = IC2Items.NanoChestplate,
                    meta = GT_Values.W.toInt(),
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.AdvJetpack27.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "AJA",
                "ELE",
                "WCW",
                'A',
                "plateAlloyAdvanced",
                'W',
                OrePrefixes.wireGt04.get(Materials.Platinum),
                'C',
                OrePrefixes.circuit.get(Materials.Data),
                'J',
                ModItemVariant(
                    item = IC2Items.ElectricJetpack,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'L',
                ModItemVariant(
                    item = GraviSuiteItems.AdvLappack,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'E',
                GraviSuiteItems.EngineBooster.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.UltimateLappack27.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PIP",
                "LAL",
                "CSC",
                'P',
                OrePrefixes.itemCasing.get(Materials.TungstenSteel),
                'C',
                OrePrefixes.circuit.get(Materials.Elite),
                'I',
                IC2Items.IridiumPlate.get(),
                'L',
                GregTechItems.LapotronCrystal.get(),
                'A',
                ModItemVariant(
                    item = GraviSuiteItems.AdvLappack,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'S',
                GraviSuiteItems.Superconductor.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.AdvLappack27.get(),
            flags = 0L,
            recipe = arrayOf<Any?>(
                "CEC",
                "EJE",
                "WPW",
                'C',
                OrePrefixes.plateAlloy.get(Materials.Carbon),
                'J',
                ModItemVariant(
                    item = IC2Items.EnergyPack,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'E',
                GregTechItems.EnergyCrystal.get(),
                'W',
                OrePrefixes.wireGt04.get(Materials.Platinum),
                'P',
                OrePrefixes.circuit.get(Materials.Data),
            ),
        )
    }
}
