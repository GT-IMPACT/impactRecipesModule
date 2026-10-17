package com.impactrecipes.recipes.gravisuite

import com.impactrecipes.items.GraviSuiteItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.IC2Items
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GraviSuiteCoreRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.EngineBooster.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PCP",
                "PMP",
                "SVS",
                'V',
                ModItemVariant(
                    item = IC2Items.AdvancedHeatVent,
                    meta = 1,
                ).get(),
                'M',
                IC2Items.OverclockerUpgrade.get(),
                'P',
                OrePrefixes.plate.get(Materials.StainlessSteel),
                'S',
                OrePrefixes.screw.get(Materials.StainlessSteel),
                'C',
                OrePrefixes.circuit.get(Materials.Advanced),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.GravitationEngine.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ESE",
                "COC",
                "ESE",
                'S',
                GraviSuiteItems.Superconductor.get(),
                'C',
                GraviSuiteItems.CoolingCore.get(),
                'E',
                GregTechItems.EmitterIV.get(),
                'O',
                GregTechItems.EnergyLapotronicOrb.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.Magnetron.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "MCM",
                "PSP",
                "MCM",
                'M',
                OrePrefixes.plateDense.get(Materials.NeodymiumMagnetic),
                'P',
                OrePrefixes.plateDense.get(Materials.Copper),
                'S',
                GraviSuiteItems.Superconductor.get(),
                'C',
                GregTechItems.IVCoil.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.VajraCore.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SwS",
                "IMI",
                "STS",
                'I',
                IC2Items.IridiumPlate.get(),
                'M',
                GraviSuiteItems.Magnetron.get(),
                'S',
                GraviSuiteItems.Superconductor.get(),
                'T',
                GregTechItems.TransformerLuVIV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.AdvancedGravitationEngine.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ESE",
                "COC",
                "ESE",
                'S',
                OrePrefixes.wireGt04.get(Materials.SuperconductorLuV),
                'C',
                GraviSuiteItems.GravitationEngine.get(),
                'E',
                GregTechItems.EmitterLuV.get(),
                'O',
                GregTechItems.EnergyLapotronicOrb2.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.CoolingCore.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "IHI",
                "RCR",
                "PHP",
                'P',
                OrePrefixes.plateDouble.get(Materials.Inconel792),
                'I',
                IC2Items.IridiumPlate.get(),
                'H',
                ModItemVariant(
                    item = IC2Items.AdvancedHeatExchanger,
                    meta = 1,
                ).get(),
                'R',
                IC2Items.HeatCapacityReactorPlating.get(),
                'C',
                GregTechItems.ReactorCoolantHe6.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GraviSuiteItems.CoolingCore.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "PHP",
                "RCR",
                "IHI",
                'P',
                OrePrefixes.plateDouble.get(Materials.Inconel792),
                'I',
                IC2Items.IridiumPlate.get(),
                'H',
                ModItemVariant(
                    item = IC2Items.AdvancedHeatExchanger,
                    meta = 1,
                ).get(),
                'R',
                IC2Items.HeatCapacityReactorPlating.get(),
                'C',
                GregTechItems.ReactorCoolantHe6.get(),
            ),
        )
    }
}
