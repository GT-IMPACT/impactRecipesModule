package com.impactrecipes.recipes.gravisuite

import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ImpactItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GraviSuiteToolRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.EpicLappack27.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "PUP",
                "SOS",
                'P',
                OrePrefixes.itemCasing.get(Materials.HSSG),
                'C',
                OrePrefixes.circuit.get(Materials.Superconductor),
                'S',
                OrePrefixes.wireGt12.get(Materials.SuperconductorZPM),
                'U',
                ModItemVariant(
                    item = GraviSuiteItems.UltimateLappack,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'O',
                GregTechItems.EnergyLapotronicOrb2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.Vajra27.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "HVL",
                "CIC",
                "SOS",
                'S',
                OrePrefixes.stick.get(Materials.Trinium),
                'C',
                OrePrefixes.circuit.get(Materials.Elite),
                'L',
                OrePrefixes.lens.get(Materials.ReinforcedGlass),
                'V',
                GraviSuiteItems.Magnetron.get(),
                'I',
                GraviSuiteItems.VajraCore.get(),
                'H',
                ImpactItems.EngravedEnergyChip.get(),
                'O',
                ImpactItems.QuantumCrystal.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.GraviTool.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "AHA",
                "RBR",
                "WCT",
                'A',
                "plateAlloyCarbon",
                'B',
                ImpactItems.NanoCrystal.get(),
                'R',
                "plateAlloyAdvanced",
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
                'H',
                ModItemVariant(
                    item = IC2Items.ElectricHoe,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'W',
                ModItemVariant(
                    item = IC2Items.ElectricWrench,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'T',
                ModItemVariant(
                    item = IC2Items.ElectricTreetap,
                    meta = GT_Values.W.toInt(),
                ).get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.AdvChainsaw.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SBd",
                "GMG",
                "PIP",
                'P',
                OrePrefixes.plate.get(Materials.HSSG),
                'G',
                OrePrefixes.gearGtSmall.get(Materials.HSSG),
                'D',
                OrePrefixes.toolHeadChainsaw.get(Materials.TungstenSteel),
                'S',
                OrePrefixes.screw.get(Materials.HSSG),
                'I',
                ModItemVariant(
                    item = IC2Items.LapotronChargingCrystal,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'M',
                GregTechItems.ElectricMotorEV.get(),
            ),
        )
    }
}
