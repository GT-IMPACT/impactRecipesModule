package com.impactrecipes.recipes.galacticraft

import com.impactrecipes.items.GalacticraftCoreItems
import com.impactrecipes.items.GregTechItems
import com.impactrecipes.items.ModItemVariant
import com.impactrecipes.items.VanillaItems
import com.impactrecipes.util.CraftingRecipes
import gregtech.api.enums.GT_Values
import gregtech.api.enums.Materials
import gregtech.api.enums.OrePrefixes
import gregtech.api.util.GT_ModHandler

internal class GalacticraftOxygenMachineCraftingRecipes {

    private val craftingFlags = GT_ModHandler.RecipeBits.BUFFERED or GT_ModHandler.RecipeBits.NOT_REMOVABLE

    internal fun register() {
        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileOxygenCollector.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ACA",
                "VFM",
                "SWS",
                'W',
                OrePrefixes.cableGt02.get(Materials.Aluminium),
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'C',
                GalacticraftCoreItems.ItemOxygenConcentrator.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
                'F',
                GalacticraftCoreItems.ItemAirFan.get(),
                'M',
                GregTechItems.ElectricMotorHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileOxygenCompressor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ACA",
                "PEM",
                "SBS",
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'B',
                GalacticraftCoreItems.ItemBasicItem10.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'C',
                GalacticraftCoreItems.ItemOxygenConcentrator.get(),
                'E',
                ModItemVariant(
                    item = GalacticraftCoreItems.ItemOilCanisterPartial,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'M',
                GregTechItems.ElectricMotorHV.get(),
                'P',
                GregTechItems.ElectricPistonHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileOxygenCompressor4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "ACA",
                "MEF",
                "SBS",
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'B',
                GalacticraftCoreItems.ItemBasicItem10.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'C',
                GalacticraftCoreItems.ItemOxygenConcentrator.get(),
                'E',
                ModItemVariant(
                    item = GalacticraftCoreItems.ItemOilCanisterPartial,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'M',
                GregTechItems.ElectricMotorHV.get(),
                'F',
                GalacticraftCoreItems.ItemAirFan.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileMachine28.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "STS",
                "TCT",
                "STS",
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'T',
                ModItemVariant(
                    item = GalacticraftCoreItems.ItemOxygenTankHeavyFull,
                    meta = GT_Values.W.toInt(),
                ).get(),
                'C',
                GregTechItems.CasingSolidSteel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileDistributor.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "AFA",
                "VMV",
                "SFS",
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
                'F',
                GalacticraftCoreItems.ItemAirFan.get(),
                'M',
                GregTechItems.ElectricMotorHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileSealer.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "AVA",
                "VBV",
                "SDS",
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
                'B',
                GalacticraftCoreItems.TileDistributor.get(),
                'D',
                GalacticraftCoreItems.TileOxygenDetector.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileOxygenDetector.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SSS",
                "VEV",
                "AWA",
                'W',
                OrePrefixes.wireGt01.get(Materials.RedAlloy),
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'V',
                GalacticraftCoreItems.ItemAirVent.get(),
                'E',
                GregTechItems.SensorHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileFuelLoader.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "SWS",
                "PTM",
                "AIA",
                'I',
                OrePrefixes.pipeMedium.get(Materials.Steel),
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'W',
                OrePrefixes.circuit.get(Materials.Advanced),
                'M',
                GregTechItems.ElectricMotorHV.get(),
                'P',
                GregTechItems.ElectricPumpHV.get(),
                'T',
                GregTechItems.LargeFluidCellSteel.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileCargo.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "AHA",
                "CBC",
                "SPS",
                'P',
                OrePrefixes.pipeMedium.get(Materials.Brass),
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'H',
                VanillaItems.Hopper.get(),
                'C',
                GregTechItems.ConveyorModuleHV.get(),
                'B',
                GregTechItems.AutomationChestBufferHV.get(),
            ),
        )

        CraftingRecipes.shapedWithFlags(
            output = GalacticraftCoreItems.TileCargo4.get(),
            flags = craftingFlags,
            recipe = arrayOf<Any?>(
                "APA",
                "CBC",
                "SHS",
                'P',
                OrePrefixes.pipeMedium.get(Materials.Brass),
                'A',
                GalacticraftCoreItems.ItemBasicItem8.get(),
                'S',
                GalacticraftCoreItems.ItemBasicItem9.get(),
                'H',
                VanillaItems.Hopper.get(),
                'C',
                GregTechItems.ConveyorModuleHV.get(),
                'B',
                GregTechItems.AutomationChestBufferHV.get(),
            ),
        )
    }
}
